package com.zinksoft.atmApp.repository

import com.zinksoft.atmApp.domain.db.account.AccountBalances
import org.springframework.data.jpa.repository.JpaRepository

interface AccountBalanceRepository extends JpaRepository<AccountBalances, Long> {

}