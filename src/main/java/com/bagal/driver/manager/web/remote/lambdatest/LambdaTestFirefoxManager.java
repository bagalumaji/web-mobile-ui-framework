package com.bagal.driver.manager.web.remote.lambdatest;

import com.bagal.configs.ConfigReader;
import com.bagal.enums.WebBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class LambdaTestFirefoxManager {
    private LambdaTestFirefoxManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(WebBrowser.FIREFOX));
        return new RemoteWebDriver(ConfigReader.getConfig().lambdaTestUrl(), capabilities);
    }
}
