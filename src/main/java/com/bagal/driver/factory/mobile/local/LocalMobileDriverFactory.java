package com.bagal.driver.factory.mobile.local;

import com.bagal.driver.manager.mobile.local.LocalAndroidManager;
import com.bagal.driver.manager.mobile.local.LocalIosManager;
import com.bagal.enums.MobilePlatform;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public final class LocalMobileDriverFactory {
    private LocalMobileDriverFactory() {}

    private static final Map<MobilePlatform, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatform.class);

    static {
        MAP.put(MobilePlatform.ANDROID, LocalAndroidManager::getDriver);
        MAP.put(MobilePlatform.IOS, LocalIosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatform platform) {
        return Optional.ofNullable(MAP.get(platform))
                .orElseThrow(() -> new IllegalArgumentException("No driver found for platform: " + platform))
                .get();
    }
}