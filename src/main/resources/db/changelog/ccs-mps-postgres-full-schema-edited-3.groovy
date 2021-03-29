databaseChangeLog {
  changeSet(id: '1597066259231-1', author: 'msalima (generated)') {
    createTable(tableName: 'scheduled_job_history') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'scheduled_job_history_id_pk')
      }
      column(name: 'scheduled_job_details_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'event_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'event_detail', type: 'VARCHAR(255)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-2', author: 'msalima (generated)') {
    createTable(tableName: 'service_request_address') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'service_request_address_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'store_front_name', type: 'VARCHAR(100)')
      column(name: 'address1', type: 'VARCHAR(200)')
      column(name: 'house_number', type: 'VARCHAR(100)')
      column(name: 'address2', type: 'VARCHAR(100)')
      column(name: 'city', type: 'VARCHAR(50)')
      column(name: 'county', type: 'VARCHAR(50)')
      column(name: 'state', type: 'VARCHAR(100)')
      column(name: 'zip', type: 'VARCHAR(30)')
      column(name: 'country', type: 'VARCHAR(100)')
      column(name: 'service_request_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-3', author: 'msalima (generated)') {
    createTable(tableName: 'asset_debrief_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'asset_debrief_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'physical_location1bldg', type: 'VARCHAR(255)')
      column(name: 'physical_location2floor', type: 'VARCHAR(255)')
      column(name: 'physical_location3room', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_first_name', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_last_name', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_phone', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_email', type: 'VARCHAR(255)')
      column(name: 'technician_comments', type: 'VARCHAR(1024)')
      column(name: 'host_name', type: 'VARCHAR(255)')
      column(name: 'asset_tag', type: 'VARCHAR(255)')
      column(name: 'color_page_count', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'mono_page_count', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'serial_number', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'ip_address', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'mac_address', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'archived', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'domain_name', type: 'VARCHAR(255)')
      column(name: 'ip_sub_mask', type: 'VARCHAR(255)')
      column(name: 'technician_name', type: 'VARCHAR(1024)')
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-4', author: 'msalima (generated)') {
    createTable(tableName: 'account_aggregate') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'account_agg_id_pk')
      }
      column(name: 'account_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_aggregate_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'messaging_aggregate_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'verification_aggregate_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-5', author: 'msalima (generated)') {
    createTable(tableName: 'configuration_component') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'base_component_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'component_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'component_name', type: 'VARCHAR(255)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-6', author: 'msalima (generated)') {
    createTable(tableName: 'settings_component') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'settings_component_pk')
      }
      column(name: 'component_sub_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'device_identifier_type', type: 'VARCHAR(255)')
      column(name: 'file_sha1', type: 'VARCHAR(255)')
      column(name: 'file_name', type: 'VARCHAR(255)')
    }
  }

  changeSet(id: '1597066259231-7', author: 'msalima (generated)') {
    createTable(tableName: 'activity_item_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_item_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(50)') {
        constraints(nullable: false)
      }
      column(name: 'serial_number', type: 'VARCHAR(255)')
      column(name: 'model_name', type: 'VARCHAR(50)')
      column(name: 'ip_address', type: 'VARCHAR(40)')
      column(name: 'siebelhwproduct_id', type: 'VARCHAR(30)')
      column(name: 'mac_address', type: 'VARCHAR(100)')
      column(name: 'brand', type: 'VARCHAR(100)')
      column(name: 'working_condition', type: 'VARCHAR(150)')
      column(name: 'activity_comments', type: 'VARCHAR(150)')
      column(name: 'install_date', type: 'VARCHAR(16)')
      column(name: 'contact_first_name', type: 'VARCHAR(50)')
      column(name: 'contact_last_name', type: 'VARCHAR(50)')
      column(name: 'contact_email', type: 'VARCHAR(255)')
      column(name: 'contact_phone', type: 'VARCHAR(40)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'product_number', type: 'VARCHAR(255)')
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-8', author: 'msalima (generated)') {
    createTable(tableName: 'managed_asset_identifier') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'managed_asset_identifier_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'managed_asset_identifier_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-9', author: 'msalima (generated)') {
    createTable(tableName: 'settings_component_settings') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'settings_pk')
      }
      column(name: 'setting_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'value', type: 'VARCHAR(1024)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-10', author: 'msalima (generated)') {
    createTable(tableName: 'firmware_def_build_ids') {
      column(name: 'build_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'firmware_definition_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-11', author: 'msalima (generated)') {
    createTable(tableName: 'deinstall_debrief') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'deinstall_debrief_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'technician_comments', type: 'VARCHAR(1024)')
      column(name: 'deinstall_date', type: 'VARCHAR(1024)')
      column(name: 'serial_number', type: 'VARCHAR(1024)')
      column(name: 'ip_address', type: 'VARCHAR(1024)')
      column(name: 'host_name', type: 'VARCHAR(1024)')
      column(name: 'asset_tag', type: 'VARCHAR(1024)')
      column(name: 'brand', type: 'VARCHAR(1024)')
      column(name: 'model_name', type: 'VARCHAR(1024)')
      column(name: 'device_condition', type: 'VARCHAR(1024)')
      column(name: 'technician_name', type: 'VARCHAR(1024)')
      column(name: 'completed', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-12', author: 'msalima (generated)') {
    createTable(tableName: 'activity_recommended_part_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_recomm_parts_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'product_description', type: 'VARCHAR(100)') {
        constraints(nullable: false)
      }
      column(name: 'part_number', type: 'VARCHAR(100)') {
        constraints(nullable: false)
      }
      column(name: 'reqd_accessories_quantities', type: 'VARCHAR(8)') {
        constraints(nullable: false)
      }
      column(name: 'relation_type', type: 'VARCHAR(30)') {
        constraints(nullable: false)
      }
      column(name: 'activity_item_id', type: '${bigint.type}')
      column(name: 'is_printer', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-13', author: 'msalima (generated)') {
    createTable(tableName: 'remote_asset_operation') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'rao_item_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'remote_asset_identifier_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'job_id', type: '${bigint.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'external_id', type: 'VARCHAR(255)')
      column(name: 'creation_error', type: 'VARCHAR(256)')
    }
  }

  changeSet(id: '1597066259231-14', author: 'msalima (generated)') {
    createTable(tableName: 'data_coll_data_set_elem') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'data_coll_data_set_elem_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'data_collection_data_set_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-15', author: 'msalima (generated)') {
    createTable(tableName: 'customer_profile_entry') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'customer_profile_entry_pk')
      }
      column(name: 'siebel_name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'cdcl_setting_name', type: 'VARCHAR(255)')
      column(name: 'value', type: 'VARCHAR(1024)')
      column(name: 'identity_setting_mode', type: 'VARCHAR(40)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_item_id', type: '${bigint.type}', defaultValueNumeric: 0)
    }
  }

  changeSet(id: '1597066259231-16', author: 'msalima (generated)') {
    createTable(tableName: 'account_ldd_server') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'account_ldd_server_pk')
      }
    }
  }

  changeSet(id: '1597066259231-17', author: 'msalima (generated)') {
    createTable(tableName: 'ptask_based_config_component') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'ptask_config_comp_id_pk')
      }
      column(name: 'print_task', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-18', author: 'msalima (generated)') {
    createTable(tableName: 'scheduled_job_details') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'scheduled_job_details_id_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'last_run', type: '${timestamp.type}')
      column(name: 'corn_expression', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'schedule_job_type', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-19', author: 'msalima (generated)') {
    createTable(tableName: 'data_collection_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'data_collection_task_pk')
      }
    }
  }

  changeSet(id: '1597066259231-20', author: 'msalima (generated)') {
    createTable(tableName: 'service_request_address_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'service_request_addr_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'store_front_name', type: 'VARCHAR(100)')
      column(name: 'address1', type: 'VARCHAR(200)')
      column(name: 'house_number', type: 'VARCHAR(100)')
      column(name: 'address2', type: 'VARCHAR(100)')
      column(name: 'city', type: 'VARCHAR(50)')
      column(name: 'county', type: 'VARCHAR(50)')
      column(name: 'state', type: 'VARCHAR(100)')
      column(name: 'zip', type: 'VARCHAR(30)')
      column(name: 'country', type: 'VARCHAR(100)')
      column(name: 'service_request_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-21', author: 'msalima (generated)') {
    createTable(tableName: 'cloud_messaging_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'cloud_msg_task_pk')
      }
      column(name: 'remote_asset_op_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-22', author: 'msalima (generated)') {
    createTable(tableName: 'task_based_config_component') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'task_config_comp_id_pk')
      }
      column(name: 'task', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-23', author: 'msalima (generated)') {
    createTable(tableName: 'remote_deployment') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'remote_deployment_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'configuration_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'service_request_id', type: '${bigint.type}')
      column(name: 'reason', type: 'VARCHAR(256)')
      column(name: 'deployment_for_sr', type: 'VARCHAR(256)', defaultValue: 'NOT_APPLICABLE') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-24', author: 'msalima (generated)') {
    createTable(tableName: 'activity_recommended_part') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'recommended_parts_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'product_description', type: 'VARCHAR(100)') {
        constraints(nullable: false)
      }
      column(name: 'part_number', type: 'VARCHAR(100)') {
        constraints(nullable: false)
      }
      column(name: 'reqd_accessories_quantities', type: 'VARCHAR(8)') {
        constraints(nullable: false)
      }
      column(name: 'relation_type', type: 'VARCHAR(30)') {
        constraints(nullable: false)
      }
      column(name: 'activity_item_id', type: '${bigint.type}', defaultValueNumeric: 0)
      column(name: 'is_printer', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-25', author: 'msalima (generated)') {
    createTable(tableName: 'conformance_element') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'conformance_element_pk')
      }
      column(name: 'name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'value', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-26', author: 'msalima (generated)') {
    createTable(tableName: 'configuration_history') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'config_history_id_pk')
      }
      column(name: 'configuration_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'event_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'event_detail', type: 'VARCHAR(255)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-27', author: 'msalima (generated)') {
    createTable(tableName: 'update_job_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'update_job_task_pk')
      }
      column(name: 'version_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-28', author: 'msalima (generated)') {
    createTable(tableName: 'asset') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'asset_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'asset_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'class', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'managed_asset_identifier_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-29', author: 'msalima (generated)') {
    createTable(tableName: 'conform_task_element') {
      column(name: 'conformance_task_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'conformance_element_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-30', author: 'msalima (generated)') {
    createTable(tableName: 'activity_item') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_item_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(50)') {
        constraints(nullable: false)
      }
      column(name: 'serial_number', type: 'VARCHAR(255)')
      column(name: 'model_name', type: 'VARCHAR(50)')
      column(name: 'ip_address', type: 'VARCHAR(40)')
      column(name: 'siebelhwproduct_id', type: 'VARCHAR(30)')
      column(name: 'mac_address', type: 'VARCHAR(100)')
      column(name: 'brand', type: 'VARCHAR(100)')
      column(name: 'working_condition', type: 'VARCHAR(150)')
      column(name: 'activity_comments', type: 'VARCHAR(150)')
      column(name: 'install_date', type: 'VARCHAR(16)')
      column(name: 'contact_first_name', type: 'VARCHAR(50)')
      column(name: 'contact_last_name', type: 'VARCHAR(50)')
      column(name: 'contact_email', type: 'VARCHAR(255)')
      column(name: 'contact_phone', type: 'VARCHAR(40)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'product_number', type: 'VARCHAR(255)')
    }
  }

  changeSet(id: '1597066259231-31', author: 'msalima (generated)') {
    createTable(tableName: 'account_group') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'account_group_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'name', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'description', type: 'VARCHAR(256)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'firmware_catalog_id', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-32', author: 'msalima (generated)') {
    createTable(tableName: 'deinstall_debrief_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'deinstall_debrief_arch_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'technician_comments', type: 'VARCHAR(1024)')
      column(name: 'deinstall_date', type: 'VARCHAR(1024)')
      column(name: 'serial_number', type: 'VARCHAR(1024)')
      column(name: 'ip_address', type: 'VARCHAR(1024)')
      column(name: 'host_name', type: 'VARCHAR(1024)')
      column(name: 'asset_tag', type: 'VARCHAR(1024)')
      column(name: 'brand', type: 'VARCHAR(1024)')
      column(name: 'model_name', type: 'VARCHAR(1024)')
      column(name: 'device_condition', type: 'VARCHAR(1024)')
      column(name: 'technician_name', type: 'VARCHAR(1024)')
      column(name: 'completed', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-33', author: 'msalima (generated)') {
    createTable(tableName: 'service_request_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'service_request_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'service_request_number', type: 'VARCHAR(255)')
      column(name: 'language_code', type: 'VARCHAR(32)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'account_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'cma_identifier', type: 'VARCHAR(255)')
      column(name: 'incomplete_activities', type: 'BOOLEAN', defaultValueBoolean: true)
      column(name: 'account_ldd_server_id', type: '${bigint.type}')
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-34', author: 'msalima (generated)') {
    createTable(tableName: 'remote_conf_data_collect') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'remote_data_collect_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'serial_number', type: 'VARCHAR(256)')
      column(name: 'model_name', type: 'VARCHAR(256)')
      column(name: 'firmware_level', type: 'VARCHAR(256)')
      column(name: 'status', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'sub_status', type: 'VARCHAR(256)')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'npa_family_id', type: 'VARCHAR(256)')
    }
  }

  changeSet(id: '1597066259231-35', author: 'msalima (generated)') {
    createTable(tableName: 'ldd_server') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'ldd_server_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'protocol', type: 'VARCHAR(5)') {
        constraints(nullable: false)
      }
      column(name: 'hostname', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'port', type: '${bigint.type}')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-36', author: 'msalima (generated)') {
    createTable(tableName: 'asset_debrief_parts') {
      column(name: 'asset_debrief_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'debrief_part_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-37', author: 'msalima (generated)') {
    createTable(tableName: 'data_collection_data_set') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'data_collection_data_set_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'data_set_type', type: 'VARCHAR(80)') {
        constraints(nullable: false)
      }
      column(name: 'namespace', type: 'VARCHAR(80)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-38', author: 'msalima (generated)') {
    createTable(tableName: 'test_deployment') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'test_deployment_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'configuration_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-39', author: 'msalima (generated)') {
    createTable(tableName: 'activity_aggregate') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_agg_id_pk')
      }
      column(name: 'total_submitted', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_ready', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_installing', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_failed', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_debrief', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_complete', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_dispatched', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
      column(name: 'daily_generation', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-40', author: 'msalima (generated)') {
    createTable(tableName: 'settings_c_settings_c_settings') {
      column(name: 'settings_component_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'settings_component_settings_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-41', author: 'msalima (generated)') {
    createTable(tableName: 'activity_history') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_history_id_pk')
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'event_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'event_detail', type: 'VARCHAR(255)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-42', author: 'msalima (generated)') {
    createTable(tableName: 'firmware_catalog') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'firmware_catalog_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-43', author: 'msalima (generated)') {
    createTable(tableName: 'asset_deployment') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'asset_deployment_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'asset_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'asset_deployments_idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-44', author: 'msalima (generated)') {
    createTable(tableName: 'product_based_config_component') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'product_config_comp_id_pk')
      }
      column(name: 'deployable_part_number', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'deployable_part_revision', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'deployable_version', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-45', author: 'msalima (generated)') {
    createTable(tableName: 'verification_aggregate') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'verification_agg_id_pk')
      }
      column(name: 'total_discovered', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_failed', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
      column(name: 'daily_generation', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-46', author: 'msalima (generated)') {
    createTable(tableName: 'activity_verific_result') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'verification_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'serial_number', type: 'VARCHAR(256)')
      column(name: 'model_name', type: 'VARCHAR(256)')
      column(name: 'firmware_level', type: 'VARCHAR(256)')
      column(name: 'status', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'sub_status', type: 'VARCHAR(256)')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'npa_family_id', type: 'VARCHAR(256)')
    }
  }

  changeSet(id: '1597066259231-47', author: 'msalima (generated)') {
    createTable(tableName: 'account_group_aggregate') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'account_group_agg_id_pk')
      }
      column(name: 'account_group_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_aggregate_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'config_aggregate_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'messaging_aggregate_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'verification_aggregate_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-48', author: 'msalima (generated)') {
    createTable(tableName: 'asset_debrief') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'asset_debrief_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'physical_location1bldg', type: 'VARCHAR(255)')
      column(name: 'physical_location2floor', type: 'VARCHAR(255)')
      column(name: 'physical_location3room', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_first_name', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_last_name', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_phone', type: 'VARCHAR(255)')
      column(name: 'consumables_contact_email', type: 'VARCHAR(255)')
      column(name: 'technician_comments', type: 'VARCHAR(1024)')
      column(name: 'host_name', type: 'VARCHAR(255)')
      column(name: 'asset_tag', type: 'VARCHAR(255)')
      column(name: 'color_page_count', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'mono_page_count', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'serial_number', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'ip_address', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'mac_address', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'archived', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'domain_name', type: 'VARCHAR(255)')
      column(name: 'ip_sub_mask', type: 'VARCHAR(255)')
      column(name: 'technician_name', type: 'VARCHAR(1024)')
    }
  }

  changeSet(id: '1597066259231-49', author: 'msalima (generated)') {
    createTable(tableName: 'service_request') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'service_request_id_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'service_request_number', type: 'VARCHAR(255)')
      column(name: 'language_code', type: 'VARCHAR(32)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'account_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'cma_identifier', type: 'VARCHAR(255)')
      column(name: 'incomplete_activities', type: 'BOOLEAN', defaultValueBoolean: true)
      column(name: 'account_ldd_server_id', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-50', author: 'msalima (generated)') {
    createTable(tableName: 'configuration') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'configuration_id_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'printer_model_id', type: '${bigint.type}')
      column(name: 'name', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'description', type: 'VARCHAR(4000)')
      column(name: 'account_group_id', type: '${bigint.type}')
      column(name: 'authoring_state', type: 'VARCHAR(255)', defaultValue: 'EDITING') {
        constraints(nullable: false)
      }
      column(name: 'configuration_type', type: 'VARCHAR(40)', defaultValue: 'USER') {
        constraints(nullable: false)
      }
      column(name: 'asset_type', type: 'VARCHAR(40)', defaultValue: 'PRINTER') {
        constraints(nullable: false)
      }
      column(name: 'owner', type: 'VARCHAR(255)', defaultValue: 'ccs_support@lexmark.com') {
        constraints(nullable: false)
      }
      column(name: 'is_firmware_auto_install', type: 'BOOLEAN', defaultValueBoolean: true)
      column(name: 'firmware_definition_id', type: '${bigint.type}')
      column(name: 'deprecated', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'target', type: 'VARCHAR(255)', defaultValue: 'DEPLOYMENT') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-51', author: 'msalima (generated)') {
    createTable(tableName: 'agent') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'agent_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
//      column(name: 'version_id', type: '${bigint.type}') {
//        constraints(nullable: false)
//      }
//      column(name: 'version_string', type: 'VARCHAR(255)') {
//        constraints(nullable: false)
//      }
      column(name: 'identifier', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
//      column(name: 'password', type: 'VARCHAR(1024)')
//      column(name: 'enabled', type: 'BOOLEAN', defaultValueBoolean: true) {
//        constraints(nullable: false)
//      }
//      column(name: 'date_created', type: '${timestamp.type}')
//      column(name: 'last_updated', type: '${timestamp.type}')
//      column(name: 'polling_interval', type: '${bigint.type}')
//      column(name: 'polling_enabled', type: 'BOOLEAN', defaultValueBoolean: false)
//      column(name: 'remote_deploy_enabled', type: 'BOOLEAN', defaultValueBoolean: false) {
//        constraints(nullable: false)
//      }
    }
  }

  changeSet(id: '1597066259231-52', author: 'msalima (generated)') {
    createTable(tableName: 'messaging_aggregate') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'messaging_agg_id_pk')
      }
      column(name: 'total_complete', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_failed', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_accounts', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_accounts_active', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
      column(name: 'daily_generation', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'total_incomplete', type: '${bigint.type}', defaultValueNumeric: 0) {
        constraints(nullable: false)
      }
      column(name: 'total_expired', type: '${bigint.type}', defaultValueNumeric: 0) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-53', author: 'msalima (generated)') {
    createTable(tableName: 'remote_asset_operation_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'rmt_asst_op_task_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(100)')
      column(name: 'operation', type: 'VARCHAR(100)')
      column(name: 'message', type: 'TEXT')
      column(name: 'delete_id', type: 'VARCHAR(200)')
    }
  }

  changeSet(id: '1597066259231-54', author: 'msalima (generated)') {
    createTable(tableName: 'configuration_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'configuration_task_id_pk')
      }
      column(name: 'configuration_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-55', author: 'msalima (generated)') {
    createTable(tableName: 'firmware_catalog_entry') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'firmware_catalog_entry_pk')
      }
      column(name: 'firmware_catalog_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'npa_family_id', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'build_id', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-56', author: 'msalima (generated)') {
    createTable(tableName: 'job_history') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'job_history_id_pk')
      }
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'event_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'event_detail', type: 'VARCHAR(255)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
    }
  }

  changeSet(id: '1597066259231-57', author: 'msalima (generated)') {
    createTable(tableName: 'remote_asset_operation_tasks') {
      column(name: 'remote_asset_op_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'remote_asset_task_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-58', author: 'msalima (generated)') {
    createTable(tableName: 'service_requests') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'sys_c0021857')
      }
      column(name: 'cma_identifier', type: 'VARCHAR(255)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'incomplete_activities', type: 'BOOLEAN') {
        constraints(nullable: false)
      }
      column(name: 'language_code', type: 'VARCHAR(255)')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'service_request_number', type: 'VARCHAR(255)')
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-59', author: 'msalima (generated)') {
    createTable(tableName: 'activity_history_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_history_arch_pk')
      }
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'event_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'event_detail', type: 'VARCHAR(255)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-60', author: 'msalima (generated)') {
    createTable(tableName: 'siebel_managed_asset_ident') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'siebel_managed_asset_ident_pk')
      }
      column(name: 'siebel_account_id', type: 'VARCHAR(80)') {
        constraints(nullable: false)
      }
      column(name: 'siebel_hw_product_id', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'siebel_serial_number', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-61', author: 'msalima (generated)') {
    createTable(tableName: 'job_ldd_server') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'job_ldd_server_pk')
      }
    }
  }

  changeSet(id: '1597066259231-62', author: 'msalima (generated)') {
    createTable(tableName: 'log_collection_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'log_collection_task_pk')
      }
    }
  }

  changeSet(id: '1597066259231-63', author: 'msalima (generated)') {
    createTable(tableName: 'data_collection_task_data_sets') {
      column(name: 'data_collection_data_set_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'data_collection_task_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-64', author: 'msalima (generated)') {
    createTable(tableName: 'job_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'job_task_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'status', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'task_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-65', author: 'msalima (generated)') {
    createTable(tableName: 'account_to_acti_code') {
      column(name: 'account_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activation_code_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activation_codes_idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-66', author: 'msalima (generated)') {
    createTable(tableName: 'activity_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_number', type: 'VARCHAR(30)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'service_request_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'configuration_id', type: '${bigint.type}')
      column(name: 'siebel_status', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'state', type: 'VARCHAR(255)', defaultValue: 'SUBMITTED') {
        constraints(nullable: false)
      }
      column(name: 'job_id', type: '${bigint.type}')
      column(name: 'type', type: 'VARCHAR(255)', defaultValue: 'INSTALL') {
        constraints(nullable: false)
      }
      column(name: 'siebel_type', type: 'VARCHAR(255)', defaultValue: 'HW MADC Install') {
        constraints(nullable: false)
      }
      column(name: 'debrief_only', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-67', author: 'msalima (generated)') {
    createTable(tableName: 'service_request_contact') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'service_request_contact_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'first_name', type: 'VARCHAR(50)')
      column(name: 'last_name', type: 'VARCHAR(50)')
      column(name: 'email', type: 'VARCHAR(255)')
      column(name: 'phone', type: 'VARCHAR(40)')
      column(name: 'service_request_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-68', author: 'msalima (generated)') {
    createTable(tableName: 'config_component_assignment') {
      column(name: 'configuration_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'component_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}') {
        constraints(nullable: false)
      }
      column(name: 'last_updated', type: '${timestamp.type}') {
        constraints(nullable: false)
      }
      column(name: 'deployment_order_index', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-69', author: 'msalima (generated)') {
    createTable(tableName: 'firmware_definition') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'firmware_definition_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'is_combo', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-70', author: 'msalima (generated)') {
    createTable(tableName: 'account_activation_code') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'act_activation_code_pk')
      }
    }
  }

  changeSet(id: '1597066259231-71', author: 'msalima (generated)') {
    createTable(tableName: 'activation_code') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activation_code_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'code', type: 'VARCHAR(19)') {
        constraints(nullable: false)
      }
      column(name: 'sellable_part_number', type: 'VARCHAR(20)') {
        constraints(nullable: false)
      }
      column(name: 'part_description', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-72', author: 'msalima (generated)') {
    createTable(tableName: 'cloud_message_data_collect') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'cloud_data_collect_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'serial_number', type: 'VARCHAR(256)')
      column(name: 'model_name', type: 'VARCHAR(256)')
      column(name: 'firmware_level', type: 'VARCHAR(256)')
      column(name: 'status', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'sub_status', type: 'VARCHAR(256)')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'npa_family_id', type: 'VARCHAR(256)')
    }
  }

  changeSet(id: '1597066259231-73', author: 'msalima (generated)') {
    createTable(tableName: 'job_job_task') {
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'job_task_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'job_tasks_idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-74', author: 'msalima (generated)') {
    createTable(tableName: 'job_to_activation_code') {
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activation_code_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activation_codes_idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-75', author: 'msalima (generated)') {
    createTable(tableName: 'file_based_config_component') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'configuration_comp_id_pk')
      }
      column(name: 'file_sha1', type: 'VARCHAR(40)')
      column(name: 'file_name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'description', type: 'VARCHAR(256)')
      column(name: 'encrypted', type: 'BOOLEAN', defaultValueBoolean: false)
    }
  }

  changeSet(id: '1597066259231-76', author: 'msalima (generated)') {
    createTable(tableName: 'configuration_aggregate') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'configuration_agg_id_pk')
      }
      column(name: 'total_published', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'total_unpublished', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'version', type: '${bigint.type}')
      column(name: 'daily_generation', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-77', author: 'msalima (generated)') {
    createTable(tableName: 'archive_log') {
      column(name: 'archive_id', type: '${number.type}')
      column(name: 'archive_log_id', type: '${number.type}')
      column(name: 'archive_log_date', type: 'date')
      column(name: 'archive_log_msg', type: 'VARCHAR(200)')
    }
  }

  changeSet(id: '1597066259231-78', author: 'msalima (generated)') {
    createTable(tableName: 'job_activation_code') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'job_activation_code_pk')
      }
    }
  }

  changeSet(id: '1597066259231-79', author: 'msalima (generated)') {
    createTable(tableName: 'test_deploy_data_collect') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'test_data_collect_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'serial_number', type: 'VARCHAR(256)')
      column(name: 'model_name', type: 'VARCHAR(256)')
      column(name: 'firmware_level', type: 'VARCHAR(256)')
      column(name: 'status', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'sub_status', type: 'VARCHAR(256)')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'npa_family_id', type: 'VARCHAR(256)')
    }
  }

  changeSet(id: '1597066259231-80', author: 'msalima (generated)') {
    createTable(tableName: 'customer_profile_entry_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'customer_profile_ent_arch_pk')
      }
      column(name: 'siebel_name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'cdcl_setting_name', type: 'VARCHAR(255)')
      column(name: 'value', type: 'VARCHAR(1024)')
      column(name: 'identity_setting_mode', type: 'VARCHAR(40)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_item_id', type: '${bigint.type}')
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-81', author: 'msalima (generated)') {
    createTable(tableName: 'service_request_contact_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'service_request_cont_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'first_name', type: 'VARCHAR(50)')
      column(name: 'last_name', type: 'VARCHAR(50)')
      column(name: 'email', type: 'VARCHAR(255)')
      column(name: 'phone', type: 'VARCHAR(40)')
      column(name: 'service_request_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-82', author: 'msalima (generated)') {
    createTable(tableName: 'remote_deployment_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'remote_deployment_arch_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'configuration_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'service_request_id', type: '${bigint.type}')
      column(name: 'reason', type: 'VARCHAR(256)')
      column(name: 'deployment_for_sr', type: 'VARCHAR(256)', defaultValue: 'NOT_APPLICABLE') {
        constraints(nullable: false)
      }
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-83', author: 'msalima (generated)') {
    createTable(tableName: 'activity') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_id_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'activity_number', type: 'VARCHAR(30)')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'service_request_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'configuration_id', type: '${bigint.type}')
      column(name: 'siebel_status', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'state', type: 'VARCHAR(255)', defaultValue: 'SUBMITTED') {
        constraints(nullable: false)
      }
      column(name: 'job_id', type: '${bigint.type}')
      column(name: 'type', type: 'VARCHAR(255)', defaultValue: 'INSTALL') {
        constraints(nullable: false)
      }
      column(name: 'siebel_type', type: 'VARCHAR(255)', defaultValue: 'HW MADC Install') {
        constraints(nullable: false)
      }
      column(name: 'debrief_only', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-84', author: 'msalima (generated)') {
    createTable(tableName: 'report_details') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'report_status_pk')
      }
      column(name: 'file_path', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'status', type: 'VARCHAR(100)') {
        constraints(nullable: false)
      }
      column(name: 'type', type: 'VARCHAR(100)') {
        constraints(nullable: false)
      }
      column(name: 'format', type: 'VARCHAR(100)') {
        constraints(nullable: false)
      }
      column(name: 'total_rows', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'processed_rows', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
    }
  }

  changeSet(id: '1597066259231-85', author: 'msalima (generated)') {
    createTable(tableName: 'debrief_part') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'debrief_product_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'part_number', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'part_description', type: 'VARCHAR(1024)') {
        constraints(nullable: false)
      }
      column(name: 'used_quantity', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'doa_quantity', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'requested_quantity', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'relation_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'not_used_quantity', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'is_printer', type: 'BOOLEAN', defaultValueBoolean: false) {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-86', author: 'msalima (generated)') {
    createTable(tableName: 'job') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'job_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'status', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'asset_inet_address', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'agent_identifier', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'job_log_id', type: '${bigint.type}')
      column(name: 'target', type: 'VARCHAR(255)')
      column(name: 'job_ldd_server_id', type: '${bigint.type}')
      column(name: 'executor', type: 'VARCHAR(256)', defaultValue: 'ccs_support@lexmark.com') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-87', author: 'msalima (generated)') {
    createTable(tableName: 'account_to_ldd_server') {
      column(name: 'account_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'account_ldd_server_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'account_ldd_servers_idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-88', author: 'msalima (generated)') {
    createTable(tableName: 'account') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'account_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'siebel_account_id', type: 'VARCHAR(80)') {
        constraints(nullable: false)
      }
      column(name: 'name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'account_group_id', type: '${bigint.type}')
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'site_id', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'org_name', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-89', author: 'msalima (generated)') {
    createTable(tableName: 'remote_asset_identifier') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'name', type: 'VARCHAR(255)')
      column(name: 'site', type: 'VARCHAR(255)')
      column(name: 'organization', type: 'VARCHAR(255)')
      column(name: 'serial_number', type: 'VARCHAR(255)')
      column(name: 'siebel_account_id', type: 'VARCHAR(256)', defaultValue: 'NA') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-90', author: 'msalima (generated)') {
    createTable(tableName: 'activity_verific_result_arch') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'activity_verific_res_arch_pk')
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'activity_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'serial_number', type: 'VARCHAR(256)')
      column(name: 'model_name', type: 'VARCHAR(256)')
      column(name: 'firmware_level', type: 'VARCHAR(256)')
      column(name: 'status', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'sub_status', type: 'VARCHAR(256)')
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'npa_family_id', type: 'VARCHAR(256)')
      column(name: 'archive_id', type: '${number.type}')
    }
  }

  changeSet(id: '1597066259231-91', author: 'msalima (generated)') {
    createTable(tableName: 'ca_cert_config_component_files') {
      column(name: 'ca_comp_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'file_comp_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'ca_certificates_idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-92', author: 'msalima (generated)') {
    createTable(tableName: 'job_status_detail') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'job_task_detail_id_pk')
      }
      column(name: 'job_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'current_component_id', type: '${bigint.type}')
      column(name: 'completed_component_id', type: '${bigint.type}')
      column(name: 'sub_status', type: 'VARCHAR(256)')
      column(name: 'current_task_status', type: 'VARCHAR(256)')
      column(name: 'total_task_count', type: '${int.type}')
      column(name: 'current_task_idx', type: '${int.type}')
      column(name: 'current_task_name', type: 'VARCHAR(64)')
      column(name: 'current_task_summary', type: 'VARCHAR(64)')
    }
  }

  changeSet(id: '1597066259231-93', author: 'msalima (generated)') {
    createTable(tableName: 'ca_cert_config_component') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'ca_cert_config_component_pk')
      }
      column(name: 'ca_update_type', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-94', author: 'msalima (generated)') {
    createTable(tableName: 'job_log') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'job_log_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'agent_identifier', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'agent_version', type: 'VARCHAR(255)') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'file_sha1', type: 'VARCHAR(200)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-95', author: 'msalima (generated)') {
    createTable(tableName: 'application_settings') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'application_settings_pk')
      }
      column(name: 'version', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'date_created', type: '${timestamp.type}')
      column(name: 'last_updated', type: '${timestamp.type}')
      column(name: 'key', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
      column(name: 'value', type: 'VARCHAR(256)') {
        constraints(nullable: false)
      }
    }
  }

  changeSet(id: '1597066259231-96', author: 'msalima (generated)') {
    createTable(tableName: 'conformance_task') {
      column(name: 'id', type: '${bigint.type}') {
        constraints(nullable: false, primaryKey: true, primaryKeyName: 'conformance_task_pk')
      }
    }
  }

  changeSet(id: '1597066259231-97', author: 'msalima (generated)') {
    createIndex(indexName: 'service_request_address_idx1', tableName: 'service_request_address') {
      column(name: 'service_request_id')
    }
  }

  changeSet(id: '1597066259231-98', author: 'msalima (generated)') {
    createIndex(indexName: 'asset_debrief_arch_idx1', tableName: 'asset_debrief_arch') {
      column(name: 'archive_id')
    }
  }

  changeSet(id: '1597066259231-99', author: 'msalima (generated)') {
    createIndex(indexName: 'activity_item_arch_idx1', tableName: 'activity_item_arch') {
      column(name: 'archive_id')
    }
  }

  changeSet(id: '1597066259231-100', author: 'msalima (generated)') {
    createIndex(indexName: 'dt_idx', tableName: 'remote_asset_operation') {
      column(name: 'date_created')
    }
  }

  changeSet(id: '1597066259231-101', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'remote_asset_op_id', baseTableName: 'remote_asset_operation_tasks', constraintName: 'rao_tasks_op_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'remote_asset_operation', validate: true)
  }

  changeSet(id: '1597066259231-102', author: 'msalima (generated)') {
    createIndex(indexName: 'remote_asset_idt_idx', tableName: 'remote_asset_operation') {
      column(name: 'remote_asset_identifier_id')
    }
  }

  changeSet(id: '1597066259231-103', author: 'msalima (generated)') {
    createIndex(indexName: 'remote_asset_idx_on_jobid', tableName: 'remote_asset_operation') {
      column(name: 'job_id')
    }
  }

  changeSet(id: '1597066259231-104', author: 'msalima (generated)') {
    createIndex(indexName: 'customer_profile_entry_idx1', tableName: 'customer_profile_entry') {
      column(defaultValueNumeric: 0, name: 'activity_item_id')
    }
  }

  changeSet(id: '1597066259231-105', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'account_ldd_server_id', baseTableName: 'account_to_ldd_server', constraintName: 'ldd_account_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'account_ldd_server', validate: true)
  }

  changeSet(id: '1597066259231-106', author: 'msalima (generated)') {
    createIndex(indexName: 'schedule_job_type_unique', tableName: 'scheduled_job_details', unique: true) {
      column(name: 'schedule_job_type')
    }
  }

  changeSet(id: '1597066259231-107', author: 'msalima (generated)') {
    addUniqueConstraint(columnNames: 'schedule_job_type', constraintName: 'schedule_job_type_unique_cons', tableName: 'scheduled_job_details')
  }

  changeSet(id: '1597066259231-108', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'remote_asset_op_id', baseTableName: 'cloud_messaging_task', constraintName: 'cld_msg_remt_asst_op_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'remote_asset_operation', validate: true)
  }

  changeSet(id: '1597066259231-109', author: 'msalima (generated)') {
    createIndex(indexName: 'activity_recomm_part_idx1', tableName: 'activity_recommended_part') {
      column(defaultValueNumeric: 0, name: 'activity_item_id')
    }
  }

  changeSet(id: '1597066259231-110', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'managed_asset_identifier_id', baseTableName: 'asset', constraintName: 'managed_asset_identifier_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'managed_asset_identifier', validate: true)
  }

  changeSet(id: '1597066259231-111', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'conformance_element_id', baseTableName: 'conform_task_element', constraintName: 'conform_element_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'conformance_element', validate: true)
  }

  changeSet(id: '1597066259231-112', author: 'msalima (generated)') {
    createIndex(indexName: 'activity_item_idx1', tableName: 'activity_item') {
      column(name: 'activity_id')
    }
  }

  changeSet(id: '1597066259231-113', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'activity_item_id', baseTableName: 'activity_recommended_part', constraintName: 'activity_recommended_part_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'activity_item', validate: true)
  }

  changeSet(id: '1597066259231-114', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'activity_item_id', baseTableName: 'customer_profile_entry', constraintName: 'cust_prof_entry_activity_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'activity_item', validate: true)
  }

  changeSet(id: '1597066259231-115', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'account_group_id', baseTableName: 'configuration', constraintName: 'configuration_account_group_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'account_group', validate: true)
  }

  changeSet(id: '1597066259231-116', author: 'msalima (generated)') {
    createIndex(indexName: 'service_request_arch_idx1', tableName: 'service_request_arch') {
      column(name: 'archive_id')
    }
  }

  changeSet(id: '1597066259231-117', author: 'msalima (generated)') {
    addUniqueConstraint(columnNames: 'job_id', constraintName: 'rem_conf_job_id_unique_cons', tableName: 'remote_conf_data_collect')
  }

  changeSet(id: '1597066259231-118', author: 'msalima (generated)') {
    addUniqueConstraint(columnNames: 'name', constraintName: 'sys_c0021666_cons', tableName: 'data_collection_data_set')
  }

  changeSet(id: '1597066259231-119', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'settings_component_id', baseTableName: 'settings_c_settings_c_settings', constraintName: 'settings_comp_settings_comp_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'settings_component', validate: true)
  }

  changeSet(id: '1597066259231-120', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'settings_component_settings_id', baseTableName: 'settings_c_settings_c_settings', constraintName: 'settings_comp_settings_set_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'settings_component_settings', validate: true)
  }

  changeSet(id: '1597066259231-121', author: 'msalima (generated)') {
    createIndex(indexName: 'activity_history_idx1', tableName: 'activity_history') {
      column(name: 'activity_id')
    }
  }

  changeSet(id: '1597066259231-122', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'firmware_catalog_id', baseTableName: 'firmware_catalog_entry', constraintName: 'fw_catalog_id_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'firmware_catalog', validate: true)
  }

  changeSet(id: '1597066259231-123', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'asset_id', baseTableName: 'asset_deployment', constraintName: 'asset_deployment_asset_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'asset', validate: true)
  }

  changeSet(id: '1597066259231-124', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'asset_debrief_id', baseTableName: 'asset_debrief_parts', constraintName: 'debrief_parts_asset_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'asset_debrief', validate: true)
  }

  changeSet(id: '1597066259231-125', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'account_ldd_server_id', baseTableName: 'service_request', constraintName: 'account_ldd_serv_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'account_ldd_server', validate: true)
  }

  changeSet(id: '1597066259231-126', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'configuration_id', baseTableName: 'remote_deployment', constraintName: 'rem_deployment_config_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'configuration', validate: true)
  }

  changeSet(id: '1597066259231-127', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'configuration_id', baseTableName: 'test_deployment', constraintName: 'test_deployment_config_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'configuration', validate: true)
  }

  changeSet(id: '1597066259231-128', author: 'msalima (generated)') {
    createIndex(indexName: 'sys_c0021720', tableName: 'agent', unique: true) {
      column(name: 'identifier')
    }
  }

  changeSet(id: '1597066259231-129', author: 'msalima (generated)') {
    addUniqueConstraint(columnNames: 'identifier', constraintName: 'sys_c0021720_cons', tableName: 'agent')
  }

  changeSet(id: '1597066259231-130', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'remote_asset_task_id', baseTableName: 'remote_asset_operation_tasks', constraintName: 'rao_tasks_task_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'remote_asset_operation_task', validate: true)
  }

  changeSet(id: '1597066259231-131', author: 'msalima (generated)') {
    createIndex(indexName: 'rmt_asstoptsks_id_idx', tableName: 'remote_asset_operation_tasks') {
      column(name: 'remote_asset_task_id')
    }
  }

  changeSet(id: '1597066259231-132', author: 'msalima (generated)') {
    createIndex(indexName: 'rmt_asstoptsks_opid_idx', tableName: 'remote_asset_operation_tasks') {
      column(name: 'remote_asset_op_id')
    }
  }

  changeSet(id: '1597066259231-133', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'data_collection_data_set_id', baseTableName: 'data_collection_task_data_sets', constraintName: 'data_coll_task_data_set_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'data_collection_data_set', validate: true)
  }

  changeSet(id: '1597066259231-134', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'data_collection_task_id', baseTableName: 'data_collection_task_data_sets', constraintName: 'data_collection_task_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'data_collection_task', validate: true)
  }

  changeSet(id: '1597066259231-135', author: 'msalima (generated)') {
    createIndex(indexName: 'activity_arch_idx1', tableName: 'activity_arch') {
      column(name: 'archive_id')
    }
  }

  changeSet(id: '1597066259231-136', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'service_request_id', baseTableName: 'service_request_contact', constraintName: 'service_request_contact_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'service_request', validate: true)
  }

  changeSet(id: '1597066259231-137', author: 'msalima (generated)') {
    createIndex(indexName: 'service_request_contact_idx1', tableName: 'service_request_contact') {
      column(name: 'service_request_id')
    }
  }

  changeSet(id: '1597066259231-138', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'configuration_id', baseTableName: 'config_component_assignment', constraintName: 'conf_components_conf_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'configuration', validate: true)
  }

  changeSet(id: '1597066259231-139', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'firmware_definition_id', baseTableName: 'firmware_def_build_ids', constraintName: 'fw_def_build_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'firmware_definition', validate: true)
  }

  changeSet(id: '1597066259231-140', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'activation_code_id', baseTableName: 'account_to_acti_code', constraintName: 'activation_code_act_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'account_activation_code', validate: true)
  }

  changeSet(id: '1597066259231-141', author: 'msalima (generated)') {
    createIndex(indexName: 'job_id_unique', tableName: 'cloud_message_data_collect', unique: true) {
      column(name: 'job_id')
    }
  }

  changeSet(id: '1597066259231-142', author: 'msalima (generated)') {
    addUniqueConstraint(columnNames: 'job_id', constraintName: 'job_id_unique_cons', tableName: 'cloud_message_data_collect')
  }

  changeSet(id: '1597066259231-143', author: 'msalima (generated)') {
    createIndex(indexName: 'job_job_task_idx_on_jobid', tableName: 'job_job_task') {
      column(name: 'job_id')
    }
  }

  changeSet(id: '1597066259231-144', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_task_id', baseTableName: 'job_job_task', constraintName: 'job_job_task_job_task_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job_task', validate: true)
  }

  changeSet(id: '1597066259231-145', author: 'msalima (generated)') {
    createIndex(indexName: 'archive_log_idx1', tableName: 'archive_log') {
      column(name: 'archive_id')
      column(name: 'archive_log_id')
    }
  }

  changeSet(id: '1597066259231-146', author: 'msalima (generated)') {
    addUniqueConstraint(columnNames: 'job_id', constraintName: 'test_deploy_job_id_cons', tableName: 'test_deploy_data_collect')
  }

  changeSet(id: '1597066259231-147', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'configuration_id', baseTableName: 'activity', constraintName: 'activity_configuration_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'configuration', validate: true)
  }

  changeSet(id: '1597066259231-148', author: 'msalima (generated)') {
    createIndex(indexName: 'activity_idx1', tableName: 'activity') {
      column(name: 'service_request_id')
    }
  }

  changeSet(id: '1597066259231-149', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'service_request_id', baseTableName: 'activity', constraintName: 'activity_sr_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'service_request', validate: true)
  }

  changeSet(id: '1597066259231-150', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'activity_id', baseTableName: 'asset_debrief', constraintName: 'activity_to_debrief_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'activity', validate: true)
  }

  changeSet(id: '1597066259231-151', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'activity_id', baseTableName: 'deinstall_debrief', constraintName: 'activity_to_deinstall_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'activity', validate: true)
  }

  changeSet(id: '1597066259231-152', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'activity_id', baseTableName: 'activity_verific_result', constraintName: 'activity_to_ver_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'activity', validate: true)
  }

  changeSet(id: '1597066259231-153', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_ldd_server_id', baseTableName: 'job', constraintName: 'job_ldd_server_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job_ldd_server', validate: true)
  }

  changeSet(id: '1597066259231-154', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'job_status_detail', constraintName: 'job_status_detail_fk', deferrable: false, initiallyDeferred: false, onDelete: 'CASCADE', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-155', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'remote_conf_data_collect', constraintName: 'rem_data_coll_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-156', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'remote_deployment', constraintName: 'rem_deployment_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-157', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'test_deploy_data_collect', constraintName: 'test_data_coll_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-158', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'test_deployment', constraintName: 'test_deployment_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-159', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'activity_verific_result', constraintName: 'verification_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-160', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'account_id', baseTableName: 'service_request', constraintName: 'sr_account_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'account', validate: true)
  }

  changeSet(id: '1597066259231-161', author: 'msalima (generated)') {
    createIndex(indexName: 'rmt_assidentifier_id_idx', tableName: 'remote_asset_identifier') {
      column(name: 'id')
    }
  }

  changeSet(id: '1597066259231-162', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'file_comp_id', baseTableName: 'ca_cert_config_component_files', constraintName: 'ca_file_based_config_comp_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'file_based_config_component', validate: true)
  }

  changeSet(id: '1597066259231-163', author: 'msalima (generated)') {
    createIndex(indexName: 'job_status_detail_idx_jobid', tableName: 'job_status_detail') {
      column(name: 'job_id')
    }
  }

  changeSet(id: '1597066259231-164', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_log_id', baseTableName: 'job', constraintName: 'job_to_job_log_id_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job_log', validate: true)
  }

  changeSet(id: '1597066259231-165', author: 'msalima (generated)') {
    addUniqueConstraint(columnNames: 'key', constraintName: 'app_setting_key_id_cons', tableName: 'application_settings')
  }

  changeSet(id: '1597066259231-166', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'service_request_id', baseTableName: 'service_request_address', constraintName: 'service_request_address_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'service_request', validate: true)
  }

  changeSet(id: '1597066259231-167', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'data_collection_data_set_id', baseTableName: 'data_coll_data_set_elem', constraintName: 'data_collection_data_set_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'data_collection_data_set', validate: true)
  }

  changeSet(id: '1597066259231-168', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'service_request_id', baseTableName: 'remote_deployment', constraintName: 'rem_deployment_sr_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'service_request', validate: true)
  }

  changeSet(id: '1597066259231-169', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'conformance_task_id', baseTableName: 'conform_task_element', constraintName: 'conform_task_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'conformance_task', validate: true)
  }

  changeSet(id: '1597066259231-170', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'firmware_catalog_id', baseTableName: 'account_group', constraintName: 'account_g_fw_catalog_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'firmware_catalog', validate: true)
  }

  changeSet(id: '1597066259231-171', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'debrief_part_id', baseTableName: 'asset_debrief_parts', constraintName: 'debrief_parts_part_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'debrief_part', validate: true)
  }

  changeSet(id: '1597066259231-172', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'asset_deployment', constraintName: 'asset_deployment_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-173', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'firmware_definition_id', baseTableName: 'configuration', constraintName: 'config_fw_def', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'firmware_definition', validate: true)
  }

  changeSet(id: '1597066259231-174', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'account_id', baseTableName: 'account_to_acti_code', constraintName: 'account_act_id_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'account', validate: true)
  }

  changeSet(id: '1597066259231-175', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'cloud_message_data_collect', constraintName: 'cm_data_coll_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-176', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'job_job_task', constraintName: 'job_job_task_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-177', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'activation_code_id', baseTableName: 'job_to_activation_code', constraintName: 'activation_code_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job_activation_code', validate: true)
  }

  changeSet(id: '1597066259231-178', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'job_to_activation_code', constraintName: 'job_act_id_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-179', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'job_id', baseTableName: 'activity', constraintName: 'activity_job_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'job', validate: true)
  }

  changeSet(id: '1597066259231-180', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'account_id', baseTableName: 'account_to_ldd_server', constraintName: 'account_ldd_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'account', validate: true)
  }

  changeSet(id: '1597066259231-181', author: 'msalima (generated)') {
    addForeignKeyConstraint(baseColumnNames: 'ca_comp_id', baseTableName: 'ca_cert_config_component_files', constraintName: 'ca_cert_config_component_fk', deferrable: false, initiallyDeferred: false, onDelete: 'RESTRICT', onUpdate: 'RESTRICT', referencedColumnNames: 'id', referencedTableName: 'ca_cert_config_component', validate: true)
  }

  changeSet(id: '1597066259231-182', author: 'msalima (generated)', dbms: '!h2') {
    createSequence(cacheSize: 1, cycle: false, dataType: '${bigint.type}', incrementBy: 1, maxValue: 9223372036854775807, minValue: 50000, sequenceName: 'hibernate_sequence', startValue: 50000)
  }
  changeSet(author: 'msalima (generated)', id: '1597066259231-182-1', dbms: 'h2') {
    createSequence(sequenceName: 'HIBERNATE_SEQUENCE', startValue: '50000', incrementBy: '1')
  }

  changeSet(id: '1597066259231-183', author: 'msalima (generated)') {
    createTable(tableName: 'asset_debrief_parts_arch') {
      column(name: 'asset_debrief_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'debrief_part_id', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'idx', type: '${bigint.type}') {
        constraints(nullable: false)
      }
      column(name: 'archive_id', type: '${number.type}')
    }
  }

}
