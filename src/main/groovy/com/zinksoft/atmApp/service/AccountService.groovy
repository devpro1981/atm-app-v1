package com.zinksoft.atmApp.service

import com.zinksoft.atmApp.domain.db.account.Account
import com.zinksoft.atmApp.domain.db.account.AccountBalances
import com.zinksoft.atmApp.domain.dto.AccountAvailableBalance
import com.zinksoft.atmApp.repository.AccountBalanceRepository
import com.zinksoft.atmApp.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.transaction.Transactional

@Service
class AccountService {

    @Autowired
    AccountRepository accountRepository
    @Autowired
    AccountBalanceRepository accountBalanceRepository

    Account retrieveAccount(String accountNumber) {
        accountRepository.findByAccountNumber(accountNumber)
    }

    Account debitAccount(Account userAccount, Integer amount) {

        if (amount < userAccount.accountBalances.currentBalance) {
            userAccount.accountBalances.currentBalance -= amount
        } else {
            amount -= userAccount.accountBalances.currentBalance
            userAccount.accountBalances.currentBalance = 0
            userAccount.accountBalances.overdraft -= amount
        }
        accountBalanceRepository.save(userAccount.accountBalances)
        userAccount

    }

    AccountAvailableBalance calculateAvailableBalance(Account userAccount) {
        int maxAvailableBalance = userAccount?.accountBalances?.currentBalance + userAccount?.accountBalances?.overdraft
        new AccountAvailableBalance(accountNumber: userAccount?.accountNumber, maxAvailableBalance: maxAvailableBalance)
    }

    Account createAccount(String accountNumber, String accountPin, Integer openingBalance, Integer overdraft) {
        Account createdAccount = accountRepository.save(new Account(accountNumber: accountNumber, securityPin: accountPin))
        AccountBalances newAccountBalance = accountBalanceRepository.save(new AccountBalances(openingBalance: openingBalance, overdraft: overdraft
                                                , currentBalance: openingBalance, account: createdAccount))
        createdAccount.accountBalances = newAccountBalance
        accountRepository.save(createdAccount)
    }
}
