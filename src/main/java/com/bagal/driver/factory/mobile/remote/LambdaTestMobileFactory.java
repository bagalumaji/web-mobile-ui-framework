package com.bagal.driver.factory.mobile.remote;

import com.bagal.driver.manager.mobile.remote.lambdatest.LambdaTestAndroidManager;
import com.bagal.driver.manager.mobile.remote.lambdatest.LambdaTestIosManager;
import com.bagal.enums.MobilePlatform;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LambdaTestMobileFactory {
    private static final Map<MobilePlatform, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatform.class);
    static {
        MAP.put(MobilePlatform.ANDROID, LambdaTestAndroidManager::getDriver);
        MAP.put(MobilePlatform.IOS, LambdaTestIosManager::getDriver);
    }
    public static WebDriver getDriver(MobilePlatform mobilePlatform) {
        return MAP.get(mobilePlatform).get();
    }
}
