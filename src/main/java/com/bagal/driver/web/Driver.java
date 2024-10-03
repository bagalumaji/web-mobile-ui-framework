package com.bagal.driver.web;

import com.bagal.configs.ConfigReader;
import com.bagal.driver.manager.DriverManager;
import com.bagal.driver.web.local.LocalDriverFactory;

import java.util.Objects;

public final class Driver {
    private Driver() {}

    public static void initDriver() {
        if(Objects.isNull(DriverManager.getWebDriver())){
           DriverManager.setWebDriver(LocalDriverFactory.getWebDriver(ConfigReader.getConfig().webBrowser()));
        }
    }

    public static void closeDriver() {
        if(Objects.nonNull(DriverManager.getWebDriver())){
            DriverManager.getWebDriver().quit();
            DriverManager.unload();
        }
    }
}
