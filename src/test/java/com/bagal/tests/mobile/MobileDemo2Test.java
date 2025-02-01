package com.bagal.tests.mobile;

import com.bagal.driver.Driver;
import org.testng.annotations.Test;

public final class MobileDemo2Test {
    @Test
    public void demoTest() throws InterruptedException {
       Driver.initializeDriver();
       Thread.sleep(10000);
       Driver.closeDriver();
    }
}
