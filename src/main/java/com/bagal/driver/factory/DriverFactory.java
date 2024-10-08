package com.bagal.driver.factory;

import com.bagal.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.bagal.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.bagal.driver.factory.web.local.LocalDriverFactory;
import com.bagal.driver.factory.web.remote.RemoteDriverFactory;
import com.bagal.entity.DriverData;
import com.bagal.enums.ExecutionMode;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private DriverFactory() {
    }

    public static WebDriver getWebDriver(DriverData driverData) {
        if(driverData.getExecutionMode()== ExecutionMode.LOCAL){
            return LocalDriverFactory.getWebDriver(driverData.getWebBrowser());
        }else{
            return RemoteDriverFactory.getDriver(driverData.getRemoteService(),driverData.getWebBrowser());
        }
    }
    public static WebDriver getMobileDriver(DriverData driverData) {
        if(driverData.getExecutionMode()== ExecutionMode.LOCAL){
            return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatform());
        }else{
            return RemoteMobileDriverFactory.getDriver(driverData.getRemoteService(),driverData.getMobilePlatform());
        }
    }
}
