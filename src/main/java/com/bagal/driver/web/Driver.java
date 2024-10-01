package com.bagal.driver.web;

import com.bagal.driver.manager.DriverManager;
import com.bagal.factories.WebDriverFactory;

import java.util.Objects;

public final class Driver {
    private Driver() {}

    public static void initDriver() {
        if(Objects.isNull(DriverManager.getWebDriver())){
            DriverManager.setWebDriver(WebDriverFactory.getWebDriver());
        }
    }

    public static void closeDriver() {
        if(Objects.nonNull(DriverManager.getWebDriver())){
            DriverManager.getWebDriver().quit();
            DriverManager.unload();
        }
    }
}
