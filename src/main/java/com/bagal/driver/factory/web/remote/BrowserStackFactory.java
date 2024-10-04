package com.bagal.driver.factory.web.remote;

import com.bagal.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.bagal.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.bagal.enums.WebBrowser;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {
    private BrowserStackFactory() {}
    public static WebDriver getDriver(WebBrowser browser) {
        return browser==WebBrowser.CHROME? BrowserStackChromeManager.getDriver(): BrowserStackFirefoxManager.getDriver();
    }
}
