package com.bagal.tests.mobile;

import com.bagal.driver.Driver;
import com.bagal.utils.WaitForTimeout;
import org.testng.annotations.Test;

public final class MobileDemoTest {
    @Test
    public void demoTest() {
       Driver.initializeDriver();
        WaitForTimeout.waitForTimeout(10);
       Driver.closeDriver();
    }
}

