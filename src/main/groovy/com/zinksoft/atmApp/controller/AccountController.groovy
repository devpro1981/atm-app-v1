package com.zinksoft.atmApp.controller

import com.zinksoft.atmApp.domain.db.account.Account
import com.zinksoft.atmApp.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/accounts')
class AccountController {

    @Autowired
    AccountService accountService

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity getAccount(@RequestParam String accountNumber, @RequestParam  String accountPin) {
        Account userAccount = accountService.retrieveAccount(accountNumber)
        if(!userAccount) {
            return new ResponseEntity<>("Account number $accountNumber not found", HttpStatus.NOT_FOUND)
        }
        new ResponseEntity<>(accountService.calculateAvailableBalance(userAccount), HttpStatus.OK)
    }

}
