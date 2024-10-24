package com.bagal.testsetup;

import com.bagal.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebTestSetup {
    @BeforeMethod
    public void setup(){
       Driver.intializeWebDriver();
    }
    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }
}
