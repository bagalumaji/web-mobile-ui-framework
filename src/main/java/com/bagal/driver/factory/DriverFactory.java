package com.bagal.driver.factory;

import com.bagal.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.bagal.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.bagal.driver.factory.web.local.LocalDriverFactory;
import com.bagal.driver.factory.web.remote.RemoteDriverFactory;
import com.bagal.entity.DriverData;
import com.bagal.enums.ExecutionMode;
import com.bagal.enums.RemoteService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {
    private DriverFactory() {
    }

    //    private static final Map<ExecutionMode, Function<WebBrowser,WebDriver>> LOCAL_FACTORY = new EnumMap<>(ExecutionMode.class);
//    private static final Map<ExecutionMode, BiFunction<ExecutionPlatform, MobilePlatform, WebDriver>> REMOTE_FACTORY = new EnumMap<>(ExecutionMode.class);
//
//
//    static {
//       WEB_FACTORY.put(ExecutionMode.LOCAL,LocalDriverFactory::getWebDriver);
//       WEB_FACTORY.put(ExecutionMode.REMOTE, RemoteDriverFactory::getDriver);
//    }

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
