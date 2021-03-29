package com.example.basicmsp.domain.db.agent

import com.example.basicmsp.domain.db.BaseEntity
import groovy.transform.ToString

import javax.persistence.Entity

@ToString (includeSuper = true)
@Entity
class Agent extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L

    String identifier
}
