package com.bagal.driver.factory;

import com.bagal.driver.LocalWebDriverImpl;
import com.bagal.driver.RemoteWebDriverImpl;
import com.bagal.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.bagal.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.bagal.entity.MobileDriverData;
import com.bagal.entity.WebDriverData;
import com.bagal.enums.ExecutionMode;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getWebDriver(WebDriverData webDriverData) {
//        if (webDriverData.getExecutionMode() == ExecutionMode.LOCAL) {
//            return LocalDriverFactory.getWebDriver(webDriverData.getWebBrowser());
//        } else {
//            return RemoteDriverFactory.getDriver(webDriverData.getRemoteService(), webDriverData.getWebBrowser());
//        }
        return webDriverData.getExecutionMode() == ExecutionMode.LOCAL
                ? new LocalWebDriverImpl().getDriver(webDriverData)
                : new RemoteWebDriverImpl().getDriver(webDriverData);


    }



    public static WebDriver getMobileDriver(MobileDriverData mobileDriverData) {
        if (mobileDriverData.getExecutionMode() == ExecutionMode.LOCAL) {
            return LocalMobileDriverFactory.getDriver(mobileDriverData.getMobilePlatform());
        } else {
            return RemoteMobileDriverFactory.getDriver(mobileDriverData.getRemoteService(), mobileDriverData.getMobilePlatform());
        }
    }
}
