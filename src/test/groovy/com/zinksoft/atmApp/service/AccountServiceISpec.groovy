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

    def setup() {

    }

    def cleanup () {
        accountRepository.deleteAll()
    }

    @Transactional
    def 'Account retrieval'() {
        setup:
        Account userAccount = accountService.createAccount('12345', '6543', 1500, 500)
        entityManager.flush()

        when:
        Account queriedAccount = accountService.retrieveAccount('12345')

        then:
        queriedAccount.accountNumber == userAccount.accountNumber
        queriedAccount.securityPin == userAccount.securityPin
        accountService.calculateAvailableBalance(queriedAccount).maxAvailableBalance
                == userAccount.accountBalances.currentBalance + userAccount.accountBalances.overdraft

    }
}
