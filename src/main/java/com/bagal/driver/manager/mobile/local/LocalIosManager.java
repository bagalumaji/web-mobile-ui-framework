package com.bagal.driver.manager.mobile.local;

import com.bagal.configs.ConfigReader;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.WebDriver;

public final class LocalIosManager {
    private LocalIosManager() {}
    public static WebDriver getDriver(){
        return new IOSDriver(ConfigReader.getConfig().localAppiumServerUrl(),new XCUITestOptions());
    }
}
