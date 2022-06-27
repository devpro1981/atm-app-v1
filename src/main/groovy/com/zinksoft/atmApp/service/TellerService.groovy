package com.zinksoft.atmApp.service

import com.zinksoft.atmApp.domain.db.tellermachine.CashStore
import com.zinksoft.atmApp.repository.CashStoreRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Slf4j
@Service
class TellerService {

    @Autowired
    CashStoreRepository cashStoreRepository

    Integer addCashToTeller(Integer denomination, Integer quantity) {
        CashStore billCategory = cashStoreRepository.findByDenomination(denomination)
        if(billCategory) {
            billCategory.quantity += quantity
            cashStoreRepository.save(billCategory)
            return denomination * quantity
        }
        cashStoreRepository.save(new CashStore(denomination: denomination, quantity: quantity))
        denomination * quantity
    }

    Integer retrieveBill(Integer denomination) {
        cashStoreRepository.findByDenomination(denomination)?.quantity
    }

    List<CashStore> retrieveAllBills() {
        cashStoreRepository.findAll()
    }

    Map<Integer, Integer> prepareBillsMap() {
        List<CashStore> availableBills = retrieveAllBills()
        Map<Integer, Integer> billsMap = [:]
        availableBills.each {billCategory -> billsMap.put(billCategory.denomination, billCategory.quantity)}
        billsMap
    }

    void updateTellerCashBalanceAfterWithdrawal(Map<Integer, Integer> currentBillsMap) {
        currentBillsMap.each {denomination, quantity ->
            CashStore billCategory = cashStoreRepository.findByDenomination(denomination)
            if(billCategory) {
                billCategory.quantity = quantity
                cashStoreRepository.save(billCategory)
            }
        }
    }

    Integer retrieveTellerTotalCash() {
        List<CashStore> allBills = retrieveAllBills()
        Integer sum = allBills.collect {bill-> bill.denomination * bill.quantity}.sum()
    }

    boolean isServiceableAmount(Integer amount) {
        amount % 5 == 0
    }

     Map<Integer, Integer> prepareBillsList(int amount){
        Map<Integer, Integer> fittingBills = [:]
        List<Integer> billDenominations = cashStoreRepository.findBillCategories()
         Map<Integer, Integer> billsMap = prepareBillsMap()
        int notesRequired = 0
        int moreNotesRequired = 0

        for(int billValue : billDenominations) {
            if (amount > 0) {
                if(billsMap.get(billValue) > 0) {

                    log.info ("billValue = $billValue")
                    int billsRemaining = billsMap[billValue]
                    log.info ("billsRemaining = $billsRemaining")
                    notesRequired = Math.floorDiv(amount, billValue)
                    log.info ("notesRequired = $notesRequired")
                    moreNotesRequired = amount % billValue
                    log.info ("moreNotesRequired = $moreNotesRequired")

                    if(notesRequired == 0 && moreNotesRequired > 0) continue

                    if(notesRequired <= billsRemaining) {
                        fittingBills[billValue] = notesRequired
                        log.info ("fittingBills[$billValue] = ${fittingBills[billValue]}")
                        billsMap[billValue] = billsRemaining - notesRequired
                        log.info ("billsMap[$billValue] = ${billsMap[billValue]}")

                        amount -= notesRequired * billValue

                        log.info ("amount = ${amount}")
                    } else {
                        fittingBills[billValue] = billsRemaining
                        log.info ("fittingBills[$billValue] = ${fittingBills[billValue]}")
                        billsMap[billValue] = 0
                        log.info ("billsMap[$billValue] = ${billsMap[billValue]}")
                        amount -= billsRemaining * billValue
                        log.info ("amount = ${amount}")
                    }
                }
            }
        }
        log.info ("amount = $amount")

        updateTellerCashBalanceAfterWithdrawal(billsMap)

        fittingBills
    }

}
