package com.template.service

import groovy.transform.CompileStatic

@CompileStatic
class TestHandler {

    static TestHandler getInstance() {
        loadConfig()
        return new TestHandler()
    }

    static String getProps() {
        return System.getProperty("test.properties")
    }

    static void loadConfig() {
        System.properties.load(TestHandler.class.getResourceAsStream("application.properties"))
    }

}