package com.ariat.runner;

import com.ariat.utils.GenericWrappers;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends GenericWrappers {

    /***
     * Embed a screenshot in test report if test is marked as failed
     * @param scenario
     * @throws Exception
     */
    @After
    public void afterClass(Scenario scenario) throws Exception {

        if(scenario.isFailed()) {
            System.out.println("Scenario Failed...Taking screenshot....");
            takeSnap(scenario);
            quitBrowser();
        }
        quitBrowser();
    }

    @Before
    public void before(){

        new GenericWrappers().invokeApp();
    }
}
