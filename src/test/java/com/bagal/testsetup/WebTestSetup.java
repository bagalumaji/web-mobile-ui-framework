package com.bagal.testsetup;

import com.bagal.driver.web.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebTestSetup {
    @BeforeMethod
    public void setup(){
        WebDriver.initDriver();
    }
    @AfterMethod
    public void teardown(){
        WebDriver.closeDriver();
    }
}
