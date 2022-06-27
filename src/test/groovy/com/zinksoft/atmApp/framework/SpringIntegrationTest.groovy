package com.zinksoft.atmApp.framework

import com.zinksoft.atmApp.AtmAppApplication
import groovy.transform.AnnotationCollector
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = [AtmAppApplication])
@ActiveProfiles(['integrationTest'])
@AnnotationCollector
@interface SpringIntegrationTest {

}