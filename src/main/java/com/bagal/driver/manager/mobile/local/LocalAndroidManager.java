package com.bagal.driver.manager.mobile.local;

import com.bagal.configs.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;

public final class LocalAndroidManager {
    private LocalAndroidManager() {}
    public static WebDriver getDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setApp(System.getProperty("user.dir")+"/src/test/resources/apps/mda-2.1.0-24.apk");
        return new AndroidDriver(ConfigReader.getConfig().localAppiumServerUrl(), options);
    }
}
