package com.zinksoft.atmApp.service

import com.zinksoft.atmApp.domain.db.account.Account
import com.zinksoft.atmApp.domain.dto.AccountAvailableBalance
import com.zinksoft.atmApp.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService {

    @Autowired
    AccountRepository accountRepository

    Account retrieveAccount(String accountNumber) {
        accountRepository.findByAccountNumber(accountNumber)
    }

    AccountAvailableBalance calculateAvailableBalance(Account userAccount) {
        int maxAvailableBalance = userAccount?.accountBalances?.currentBalance + userAccount?.accountBalances?.overdraft
        new AccountAvailableBalance(accountNumber: userAccount?.accountNumber, maxAvailableBalance: maxAvailableBalance)
    }
}
