package com.zinksoft.atmApp.controller

import com.zinksoft.atmApp.domain.db.tellermachine.CashStore
import com.zinksoft.atmApp.domain.dto.CashRefillOperation
import com.zinksoft.atmApp.service.TellerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path='/teller', produces = MediaType.APPLICATION_JSON_VALUE)
class TellerController {

    @Autowired
    TellerService tellerService

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity addCash(@RequestBody CashRefillOperation cashRefillOperation) {
        Integer addedCashAmount = tellerService.addCashToTeller(cashRefillOperation?.denomination, cashRefillOperation?.quantity)
        if(!addedCashAmount) {
            return new ResponseEntity<>('Error adding cash.', HttpStatus.INTERNAL_SERVER_ERROR)
        }
        new ResponseEntity<>(addedCashAmount, HttpStatus.CREATED)
    }

    @GetMapping
    ResponseEntity retrieveStoredCashValue(){

        new ResponseEntity(tellerService.retrieveTellerTotalCash(), HttpStatus.OK)
    }

}
