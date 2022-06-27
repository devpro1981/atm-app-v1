package com.zinksoft.atmApp.controller

import com.zinksoft.atmApp.domain.db.account.Account
import com.zinksoft.atmApp.domain.dto.WithdrawalReceipt
import com.zinksoft.atmApp.service.AccountService
import com.zinksoft.atmApp.service.TellerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/accounts')
class AccountController {

    @Autowired
    AccountService accountService
    @Autowired
    TellerService tellerService

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity getAccount(@RequestParam String accountNumber, @RequestParam  String accountPin) {
        Account userAccount = accountService.retrieveAccount(accountNumber)
        if(!userAccount) {
            return new ResponseEntity<>("Account number $accountNumber not found", HttpStatus.NOT_FOUND)
        }
        if(userAccount.securityPin != accountPin) {
            return new ResponseEntity<>('Invalid PIN', HttpStatus.FORBIDDEN)
        }
        new ResponseEntity<>(accountService.calculateAvailableBalance(userAccount), HttpStatus.OK)
    }

    @PutMapping
    ResponseEntity withdrawAccountCash(@RequestParam String accountNumber
                                       , @RequestParam String accountPin
                                       , @RequestParam Integer withdrawalAmount) {
        Account userAccount = accountService.retrieveAccount(accountNumber)
        if(!userAccount) {
            return new ResponseEntity<>("Account number $accountNumber not found", HttpStatus.NOT_FOUND)
        }
        if(userAccount.securityPin != accountPin) {
            return new ResponseEntity<>('Invalid PIN', HttpStatus.FORBIDDEN)
        }
        if(accountService.calculateAvailableBalance(userAccount).maxAvailableBalance < withdrawalAmount) {
            return new ResponseEntity<>('Insufficient fund in account', HttpStatus.BAD_REQUEST)
        }
        if(!tellerService.isServiceableAmount(withdrawalAmount)) {
            return new ResponseEntity<>('Amount not a multiple of 5.', HttpStatus.BAD_REQUEST)
        }
        if(tellerService.retrieveTellerTotalCash() < withdrawalAmount) {
            return new ResponseEntity<>('Teller out of cash.', HttpStatus.BAD_REQUEST)
        }
        Map<Integer, Integer> userBillsMap = tellerService.prepareBillsList(withdrawalAmount)
        accountService.debitAccount(userAccount, withdrawalAmount)

        WithdrawalReceipt customerReceipt =
                new WithdrawalReceipt(remainingBalance: accountService.calculateAvailableBalance(userAccount).maxAvailableBalance
                                        , withdrawalBillsMap: userBillsMap)

        new ResponseEntity<>(customerReceipt, HttpStatus.OK)
    }

}
