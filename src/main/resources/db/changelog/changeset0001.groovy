databaseChangeLog {
  changeSet(id: '1595175557116-1', author: 'msalima (generated)') {
    createTable(tableName: 'ITEM') {
      column(name: 'ID', type: 'BIGINT') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'ITEM_pkey')
      }
      column(name: 'VERSION', type: 'BIGINT') {
        constraints(nullable: false)
      }
      column(name: 'ITEM_NAME', type: 'VARCHAR(255)')
      column(name: 'ORDER_ID', type: 'BIGINT')
//      column(name: 'ITEM_LIST_IDX', type: 'BIGINT')
    }
  }

  changeSet(id: '1595175557116-2', author: 'msalima (generated)') {
    createTable(tableName: 'ORDERS') {
      column(name: 'ID', type: 'BIGINT') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'ORDER_pkey')
      }
      column(name: 'VERSION', type: 'BIGINT') {
        constraints(nullable: false)
      }
      column(name: 'DATE_CREATED', type: '${timestamp.type}')
      column(name: 'LAST_UPDATED', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1595175557116-3', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'ORDER_ID', baseTableName: 'ITEM', constraintName: 'ITEM_ORDERS_FK', deferrable: false, initiallyDeferred: false, onDelete: 'NO ACTION', onUpdate: 'NO ACTION', referencedColumnNames: 'ID', referencedTableName: 'ORDERS', validate: true)
  }
  changeSet(id: '1595175557116-3', author: 'msalima '/*, objectQuotingStrategy: "QUOTE_ALL_OBJECTS"*/) {
    createTable(tableName: 'ORDER_ITEM') {
      column(name: 'ORDER_ID', type: 'BIGINT') {
        constraints(nullable: false/*, primaryKey: true, primaryKeyName: 'ITEM_pkey'*/)
      }
      column(name: 'ITEM_ID', type: 'BIGINT') {
        constraints(nullable: false)
      }
      column(name: 'ITEM_LIST_INDEX', type: 'INT')
    }
  }
  changeSet(author: 'msalima', id: '1595175557116-4') {
    addColumn(tableName: 'ORDERS') {
      column(name: 'ORDER_NAME', type: 'VARCHAR2(255)')
    }
  }

//  changeSet(id: '1595175557116-4', author: 'msalima (generated)') {
//    createSequence(cacheSize: 20, cycle: false, dataType: 'bigint', incrementBy: 1, maxValue: 99999999999999, minValue: 1, sequenceName: 'hibernate_sequence', startValue: 1)
//  }

}
