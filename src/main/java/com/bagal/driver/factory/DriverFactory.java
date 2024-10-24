package com.bagal.driver.factory;

import com.bagal.driver.*;
import com.bagal.entities.MobileDriverData;
import com.bagal.entities.WebDriverData;
import com.bagal.enums.ExecutionMode;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {
    private DriverFactory() {
    }
    private static final Map<ExecutionMode, Supplier<IWebDriver>> WEB_DRIVER = new EnumMap<>(ExecutionMode.class);
    private static final Map<ExecutionMode, Supplier<IMobileDriver>> MOBILE_DRIVER = new EnumMap<>(ExecutionMode.class);

static {
    WEB_DRIVER.put(ExecutionMode.LOCAL,LocalWebDriverImpl::new);
    WEB_DRIVER.put(ExecutionMode.REMOTE,RemoteWebDriverImpl::new);
    MOBILE_DRIVER.put(ExecutionMode.REMOTE,RemoteMobileDriverImpl::new);
    MOBILE_DRIVER.put(ExecutionMode.LOCAL,LocalMobileDriverImpl::new);
}
    public static WebDriver getWebDriver(WebDriverData webDriverData) {
    return WEB_DRIVER.get(webDriverData.getExecutionMode()).get().getDriver(webDriverData);
        /*return webDriverData.getExecutionMode() == ExecutionMode.LOCAL
                ? new LocalWebDriverImpl().getDriver(webDriverData)
                : new RemoteWebDriverImpl().getDriver(webDriverData);*/
    }



    public static WebDriver getMobileDriver(MobileDriverData mobileDriverData) {
    return MOBILE_DRIVER.get(mobileDriverData.getExecutionMode()).get().getDriver(mobileDriverData);
        /*return mobileDriverData.getExecutionMode() == ExecutionMode.LOCAL
                ? new LocalMobileDriverImpl().getDriver(mobileDriverData)
                : new RemoteMobileDriverImpl().getDriver(mobileDriverData);*/
    }
}
