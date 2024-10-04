package com.bagal.driver.manager.mobile.local;

import com.bagal.configs.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;

public final class LocalAndroidManager {
    private LocalAndroidManager() {}
    public static WebDriver getDriver() {
        return new AndroidDriver(ConfigReader.getConfig().localAppiumServerUrl(), new UiAutomator2Options());
    }
}
