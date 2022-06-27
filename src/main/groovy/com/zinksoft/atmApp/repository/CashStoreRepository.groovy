package com.zinksoft.atmApp.repository

import com.zinksoft.atmApp.domain.db.tellermachine.CashStore
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CashStoreRepository extends JpaRepository<CashStore, Long> {
    CashStore findByDenomination(Integer denomination)

    @Query('select c.denomination from CashStore c')
    List<Integer> findBillCategories()
}