package com.bagal.driver.factory.web;

import com.bagal.configs.ConfigReader;
import com.bagal.driver.manager.DriverManager;
import com.bagal.driver.factory.web.remote.RemoteDriverFactory;

import java.util.Objects;

public final class Driver {
    private Driver() {}

    public static void initDriver() {
        if(Objects.isNull(DriverManager.getWebDriver())){
           DriverManager.setWebDriver(RemoteDriverFactory.getDriver(ConfigReader.getConfig().remoteService(),ConfigReader.getConfig().webBrowser()));
        }
    }

    public static void closeDriver() {
        if(Objects.nonNull(DriverManager.getWebDriver())){
            DriverManager.getWebDriver().quit();
            DriverManager.unload();
        }
    }
}
