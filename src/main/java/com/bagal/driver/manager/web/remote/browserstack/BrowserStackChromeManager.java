package com.bagal.driver.manager.web.remote.browserstack;

import com.bagal.configs.BrowserStackConfigReader;
import com.bagal.driver.capability.remote.BrowserStackOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackChromeManager {
    public static WebDriver getDriver() {
        System.out.println("BrowserStackConfigReader.getConfig().browserStackUrl() = " + BrowserStackConfigReader.getConfig().browserStackUrl());
        return new RemoteWebDriver(BrowserStackConfigReader.getConfig().browserStackUrl(), BrowserStackOptions.getCapabilities());
    }
}
