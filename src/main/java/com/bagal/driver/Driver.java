package com.bagal.driver;

import com.bagal.configs.ConfigReader;
import com.bagal.driver.factory.DriverFactory;
import com.bagal.driver.manager.DriverManager;
import com.bagal.entities.MobileDriverData;
import com.bagal.entities.WebDriverData;
import com.bagal.enums.ExecutionPlatform;
import org.openqa.selenium.WebDriver;
public final class Driver {
    private Driver() {}

    public static void closeDriver() {
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }

    public static void initializeDriver() {
        WebDriver driver;
        if (ConfigReader.getConfig().executionPlatform() == ExecutionPlatform.MOBILE) {
            MobileDriverData mobileDriverData = MobileDriverData.builder()
                    .executionMode(ConfigReader.getConfig().executionMode())
                    .executionPlatform(ConfigReader.getConfig().executionPlatform())
                    .remoteService(ConfigReader.getConfig().remoteService())
                    .mobilePlatform(ConfigReader.getConfig().mobilePlatform())
                    .build();
            driver = DriverFactory.getMobileDriver(mobileDriverData);
        } else {
            WebDriverData webDriverData = WebDriverData.builder()
                    .executionMode(ConfigReader.getConfig().executionMode())
                    .executionPlatform(ConfigReader.getConfig().executionPlatform())
                    .remoteService(ConfigReader.getConfig().remoteService())
                    .webBrowser(ConfigReader.getConfig().webBrowser())
                    .build();
            driver = DriverFactory.getWebDriver(webDriverData);
            driver.manage().window().maximize();
        }
        DriverManager.setDriver(driver);
    }
}
//public final class Driver {
//    private Driver() {
//    }
//
//    public static void closeDriver() {
//        DriverManager.getDriver().quit();
//        DriverManager.unload();
//    }
//
//    public static void intializeWebDriver() {
//        WebDriverData webDriverData = WebDriverData.builder()
//                .executionMode(ConfigReader.getConfig().executionMode())
//                .executionPlatform(ConfigReader.getConfig().executionPlatform())
//                .remoteService(ConfigReader.getConfig().remoteService())
//                .webBrowser(ConfigReader.getConfig().webBrowser())
//                .build();
//        WebDriver driver = DriverFactory.getWebDriver(webDriverData);
//        DriverManager.setDriver(driver);
//    }
//
//    public static void intializeMobileDriver() {
//        MobileDriverData mobileDriverData = MobileDriverData.builder()
//                .executionMode(ConfigReader.getConfig().executionMode())
//                .executionPlatform(ConfigReader.getConfig().executionPlatform())
//                .remoteService(ConfigReader.getConfig().remoteService())
//                .mobilePlatform(ConfigReader.getConfig().mobilePlatform())
//                .build();
//        WebDriver driver = DriverFactory.getMobileDriver(mobileDriverData);
//        DriverManager.setDriver(driver);
//    }
//}
