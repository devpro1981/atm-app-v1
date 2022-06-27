package com.zinksoft.atmApp.domain.db.tellermachine

import com.zinksoft.atmApp.domain.db.BaseEntity

import javax.persistence.Entity

@Entity
class CashStore extends BaseEntity {
    Integer denomination
    Integer quantity
}
