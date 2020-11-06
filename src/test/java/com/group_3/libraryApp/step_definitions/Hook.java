package com.group_3.libraryApp.step_definitions;

import com.group_3.libraryApp.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setUp(Scenario scenario){
        //System.out.println("scenario = " + scenario.getSourceTagNames());
        System.out.println(":::Starting Automation :::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
        System.out.println("(*___*)End of test execution(*___*)");
    }
}
