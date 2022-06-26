package com.zinksoft.atmApp.repository

import com.zinksoft.atmApp.domain.db.account.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountNumber(String accountNumber)

}