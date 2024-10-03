package com.bagal.driver.manager.web.remote.lambdatest;

import com.bagal.configs.ConfigReader;
import com.bagal.enums.WebBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaTestChromeManager {
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(WebBrowser.CHROME));
        return new RemoteWebDriver(ConfigReader.getConfig().lambdaTestUrl(), capabilities);
    }
}
