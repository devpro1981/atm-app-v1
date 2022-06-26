package com.zinksoft.atmApp.domain.db.account

import com.fasterxml.jackson.annotation.JsonBackReference
import com.zinksoft.atmApp.domain.db.BaseEntity
import groovy.transform.ToString

import javax.persistence.*

@ToString(excludes = ['account'])
@Entity
class AccountBalances extends BaseEntity {
    private static final long serialVersionUID = 1L

    Integer openingBalance
    Integer overdraft
    Integer currentBalance

    @JsonBackReference
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="account_id", nullable=false)
    Account account

}
