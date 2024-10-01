package com.bagal.driver.manager;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager() {
    }

    private final static ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        return WEB_DRIVER_THREAD_LOCAL.get();
    }

    public static void setWebDriver(WebDriver driver) {
        WEB_DRIVER_THREAD_LOCAL.set(driver);
    }

    public static void unload() {
        WEB_DRIVER_THREAD_LOCAL.remove();
    }
}
