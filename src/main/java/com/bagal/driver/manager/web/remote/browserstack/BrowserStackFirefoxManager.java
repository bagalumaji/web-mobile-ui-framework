package com.bagal.driver.manager.web.remote.browserstack;

import com.bagal.configs.BrowserStackConfigReader;
import com.bagal.enums.WebBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackFirefoxManager {
    private BrowserStackFirefoxManager() {
    }

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(String.valueOf(WebBrowser.FIREFOX));
        return new RemoteWebDriver(BrowserStackConfigReader.getConfig().browserStackUrl(), capabilities);
    }
}
