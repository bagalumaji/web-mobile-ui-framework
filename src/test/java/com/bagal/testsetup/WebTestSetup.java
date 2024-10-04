package com.bagal.testsetup;

import com.bagal.driver.factory.web.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebTestSetup {
    @BeforeMethod
    public void setup(){
        Driver.initDriver();
    }
    @AfterMethod
    public void teardown(){
        Driver.closeDriver();
    }
}
