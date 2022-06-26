package com.zinksoft.atmApp.domain.db.account

import com.fasterxml.jackson.annotation.JsonManagedReference
import groovy.transform.ToString

import static javax.persistence.CascadeType.PERSIST
import static javax.persistence.CascadeType.REMOVE
import static javax.persistence.FetchType.LAZY

import com.zinksoft.atmApp.domain.db.BaseEntity
import javax.persistence.*


@ToString
@Entity
class Account extends BaseEntity {
    private static final long serialVersionUID = 1L

    String accountNumber
    String securityPin

    @JsonManagedReference
    @OneToOne(mappedBy="account", fetch = LAZY, cascade = [PERSIST, REMOVE], orphanRemoval = true)
    AccountBalances accountBalances

}
