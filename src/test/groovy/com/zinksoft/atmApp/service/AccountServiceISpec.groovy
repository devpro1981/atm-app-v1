package com.zinksoft.atmApp.service

import com.zinksoft.atmApp.domain.db.account.Account
import com.zinksoft.atmApp.framework.BaseIntegrationSpec
import com.zinksoft.atmApp.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired

import javax.persistence.EntityManager
import javax.transaction.Transactional

class AccountServiceISpec extends BaseIntegrationSpec {
    @Autowired
    AccountService accountService
    @Autowired
    AccountRepository accountRepository
    @Autowired
    EntityManager entityManager

    Account userAccount

    def setup() {
        userAccount = accountService.createAccount('12345', '6543', 1500, 500)
        entityManager.flush()
    }

    def cleanup () {
        accountRepository.deleteAll()
    }

    @Transactional
    def 'Account retrieval'() {

        when:
        Account queriedAccount = accountService.retrieveAccount('12345')

        then:
        queriedAccount.accountNumber == userAccount.accountNumber
        queriedAccount.securityPin == userAccount.securityPin
        accountService.calculateAvailableBalance(queriedAccount).maxAvailableBalance
                == userAccount.accountBalances.currentBalance + userAccount.accountBalances.overdraft

    }

    @Transactional
    def 'Account balance handling'() {

        when: 'withdrawal amount is less than current balance'
        Account queriedAccount = accountService.retrieveAccount('12345')
        Account updatedAccount = accountService.debitAccount(queriedAccount, 100)
        entityManager.flush()

        then: 'overdraft amount is left untouched'
        updatedAccount.accountBalances.currentBalance == queriedAccount.accountBalances.openingBalance - 100
        updatedAccount.accountBalances.overdraft == queriedAccount.accountBalances.overdraft

        when: 'withdrawal amount is more than current balance'
        queriedAccount = accountService.retrieveAccount('12345')
        Integer overdraftBeforeDebit = queriedAccount.accountBalances.overdraft
        updatedAccount = accountService.debitAccount(queriedAccount, 1600)
        entityManager.flush()

        then: 'overdraft amount is reduced'
        updatedAccount.accountBalances.currentBalance == 0
        updatedAccount.accountBalances.overdraft == overdraftBeforeDebit - 200
    }
}
