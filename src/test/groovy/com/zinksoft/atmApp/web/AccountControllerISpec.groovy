package com.zinksoft.atmApp.web

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

import com.zinksoft.atmApp.domain.db.account.Account
import com.zinksoft.atmApp.framework.BaseIntegrationSpec
import com.zinksoft.atmApp.service.AccountService
import com.zinksoft.atmApp.service.TellerService
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

import javax.persistence.EntityManager
import javax.servlet.http.HttpServletResponse
import javax.transaction.Transactional

class AccountControllerISpec extends BaseIntegrationSpec {
    @Autowired
    WebApplicationContext wac

    @Autowired
    AccountService accountService
    @Autowired
    TellerService tellerService

    @Autowired
    EntityManager entityManager

    MockMvc mockMvc

    Account userAccount

    def setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build()
        userAccount = accountService.createAccount('12345', '6543', 500, 100)
        entityManager.flush()
    }

    @Transactional
    def 'account details retrieval'() {
        when: 'valid account details are provided'
        MvcResult result = this.mockMvc.perform(get('/accounts')
                .param('accountNumber', '12345')
                .param('accountPin', '6543'))
                .andExpect(status().isOk()).andReturn()

        then: 'account balance is displayed'
        def resultingJson = new JsonSlurper().parseText(result.response.contentAsString)
        resultingJson?.accountNumber == '12345'
        resultingJson?.maxAvailableBalance == 600

        when: 'non existent account provided'
        result = this.mockMvc.perform(get('/accounts')
                .param('accountNumber', '123456')
                .param('accountPin', '6543'))
                .andExpect(status().isNotFound()).andReturn()

        then: 'account not found in system'
        result.response.status == HttpServletResponse.SC_NOT_FOUND

        when: 'incorrect PIN is provided'
        result = this.mockMvc.perform(get('/accounts')
                .param('accountNumber', '12345')
                .param('accountPin', '6544'))
                .andExpect(status().isForbidden()).andReturn()

        then: 'account balance retrieval is forbidden'
        result.response.status == HttpServletResponse.SC_FORBIDDEN
    }

    @Transactional
    def 'account cash withdrawal'() {
        setup:
        tellerService.addCashToTeller(50, 10)
        + tellerService.addCashToTeller(20, 30)
        + tellerService.addCashToTeller(10, 30)
        + tellerService.addCashToTeller(5, 20)

        Account userAccount2 = accountService.createAccount('6789', '9876', 1500, 100)
        entityManager.flush()
        Integer tellerInitialCashBalance = tellerService.retrieveTellerTotalCash()
        Integer tellerRunningCashBalance = tellerInitialCashBalance



        when: 'withdrawal amount is serviceable'
        MvcResult result = this.mockMvc.perform(put('/accounts')
                .param('accountNumber', '12345')
                .param('accountPin', '6543')
                .param('withdrawalAmount', '150'))
                .andExpect(status().isOk()).andReturn()
        tellerRunningCashBalance = tellerService.retrieveTellerTotalCash()
        Integer currentAccountBalance = accountService.calculateAvailableBalance(userAccount).maxAvailableBalance

        then: 'remaining account balance is displayed'
        def resultingJson = new JsonSlurper().parseText(result.response.contentAsString)

        resultingJson?.remainingBalance == currentAccountBalance
        tellerRunningCashBalance == tellerInitialCashBalance - 150

        when: 'withdrawal amount is more than balance in account'
        result = this.mockMvc.perform(put('/accounts')
                .param('accountNumber', '12345')
                .param('accountPin', '6543')
                .param('withdrawalAmount', "${currentAccountBalance + 5}"))
                .andExpect(status().isBadRequest()).andReturn()

        then: 'Bad request is served and Account and Teller balances are untouched'
        result.response.status == HttpServletResponse.SC_BAD_REQUEST
        tellerRunningCashBalance == tellerService.retrieveTellerTotalCash()
        currentAccountBalance == accountService.calculateAvailableBalance(userAccount).maxAvailableBalance

        when: 'withdrawal amount is more than cash balance in teller'
        Integer account2CurrentBalance = accountService.calculateAvailableBalance(userAccount2).maxAvailableBalance
        result = this.mockMvc.perform(put('/accounts')
                .param('accountNumber', '6789')
                .param('accountPin', '9876')
                .param('withdrawalAmount', "${tellerRunningCashBalance + 10}"))
                .andExpect(status().isBadRequest()).andReturn()

        then: 'Bad request is served and Account and Teller balances are untouched'
        result.response.status == HttpServletResponse.SC_BAD_REQUEST
        tellerRunningCashBalance == tellerService.retrieveTellerTotalCash()
        account2CurrentBalance == accountService.calculateAvailableBalance(userAccount2).maxAvailableBalance

    }
}
