package com.bagal.driver;

import com.bagal.configs.ConfigReader;
import com.bagal.driver.factory.DriverFactory;
import com.bagal.entity.MobileDriverData;
import com.bagal.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public final class Driver {
    private Driver() {}

    public static void closeDriver() {
//        if(Objects.nonNull(DriverManager.getWebDriver())){
//            DriverManager.getWebDriver().quit();
//            DriverManager.unload();
//        }
    }

    public static void intializeWebDriver() {
        WebDriverData webDriverData = WebDriverData.builder()
                .executionMode(ConfigReader.getConfig().executionMode())
                .executionPlatform(ConfigReader.getConfig().executionPlatform())
                .remoteService(ConfigReader.getConfig().remoteService())
                .webBrowser(ConfigReader.getConfig().webBrowser())
                .build();
       WebDriver driver= DriverFactory.getWebDriver(webDriverData);

    }
    public static void intializeMobileDriver() {
        MobileDriverData mobileDriverData = MobileDriverData.builder()
                .executionMode(ConfigReader.getConfig().executionMode())
                .executionPlatform(ConfigReader.getConfig().executionPlatform())
                .remoteService(ConfigReader.getConfig().remoteService())
                .mobilePlatform(ConfigReader.getConfig().mobilePlatform())
                .build();
        WebDriver driver= DriverFactory.getMobileDriver(mobileDriverData);
    }
}
