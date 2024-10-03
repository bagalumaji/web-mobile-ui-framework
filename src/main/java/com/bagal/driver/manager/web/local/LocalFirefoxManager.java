package com.bagal.driver.manager.web.local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalFirefoxManager {
    private LocalFirefoxManager() {}
    public static WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
