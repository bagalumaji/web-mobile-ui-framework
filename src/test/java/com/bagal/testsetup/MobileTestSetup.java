package com.bagal.testsetup;

import com.bagal.driver.mobile.MobileDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MobileTestSetup {
   @BeforeMethod
    public void setup(){
       MobileDriver.initDriver();
   }
   @AfterMethod
    public void teardown(){
       MobileDriver.closeDriver();
   }
}
