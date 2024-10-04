package com.bagal.driver.factory.mobile.remote;

import com.bagal.driver.manager.mobile.remote.browserstack.BrowserStackAndroidManager;
import com.bagal.driver.manager.mobile.remote.browserstack.BrowserStackIosManager;
import com.bagal.enums.MobilePlatform;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class BrowserStackMobileFactory {
    private BrowserStackMobileFactory() {}
    private static final Map<MobilePlatform, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatform.class);

    static {
        MAP.put(MobilePlatform.ANDROID, BrowserStackAndroidManager::getDriver);
        MAP.put(MobilePlatform.IOS, BrowserStackIosManager::getDriver);
    }
    public static WebDriver getDriver(MobilePlatform mobilePlatform) {
        return MAP.get(mobilePlatform).get();
    }
}
