package com.zinksoft.atmApp.domain.db

import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    Long id

    @Version
    Long version

}
