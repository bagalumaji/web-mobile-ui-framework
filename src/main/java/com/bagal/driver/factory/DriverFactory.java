package com.bagal.driver.factory;

import com.bagal.driver.LocalMobileDriverImpl;
import com.bagal.driver.LocalWebDriverImpl;
import com.bagal.driver.RemoteMobileDriverImpl;
import com.bagal.driver.RemoteWebDriverImpl;
import com.bagal.entity.MobileDriverData;
import com.bagal.entity.WebDriverData;
import com.bagal.enums.ExecutionMode;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getWebDriver(WebDriverData webDriverData) {
        return webDriverData.getExecutionMode() == ExecutionMode.LOCAL
                ? new LocalWebDriverImpl().getDriver(webDriverData)
                : new RemoteWebDriverImpl().getDriver(webDriverData);
    }



    public static WebDriver getMobileDriver(MobileDriverData mobileDriverData) {
        return mobileDriverData.getExecutionMode() == ExecutionMode.LOCAL
                ? new LocalMobileDriverImpl().getDriver(mobileDriverData)
                : new RemoteMobileDriverImpl().getDriver(mobileDriverData);
    }
}
