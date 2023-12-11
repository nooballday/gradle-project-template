package com.template.service

import spock.lang.Specification

class HandlerSpec extends Specification {

    void setup() {
        println("running the test i guess")
    }

    void "just regular test"() {
        TestHandler handler = TestHandler.getInstance()
        expect: // its mandatory to add atleast one assertion keyword from spock for a method to be recognized as test
        handler.getProps() == "it works!!"
    }
}