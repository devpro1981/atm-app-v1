package com.example.basicmsp.domain.db

import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.Version

@MappedSuperclass
abstract class BaseEntity {
    @Id
    Long id
    @Version
    Long version
}
