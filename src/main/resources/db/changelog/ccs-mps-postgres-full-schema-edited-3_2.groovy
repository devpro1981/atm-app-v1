databaseChangeLog {
  changeSet(id: '1', author: 'msalima') {
    dropNotNullConstraint(columnDataType: '${bigint.type}', columnName: 'asset_deployments_idx', tableName: 'asset_deployment')
  }
  changeSet(author: 'msalima', id: '2') {
    tagDatabase (tag: 'ccs-mps-2-0-asset-api')
    update(tableName: 'ASSET') {
      column(name: 'CLASS', value: 'SiebelPrinterAsset')
    }
    rollback {
      update(tableName: 'ASSET') {
        column(name: 'CLASS', value: 'com.lexmark.ccs.domain.mps.SiebelPrinterAsset')
      }
    }
  }

}
