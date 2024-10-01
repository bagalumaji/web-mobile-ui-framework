package com.bagal.factories;

import com.bagal.configs.ConfigReader;
import com.bagal.driver.brwoseroptions.ChromeBrowserOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class WebDriverFactory {
    private WebDriverFactory() {}
    public static WebDriver getWebDriver() {
        WebDriver driver;
        if (ConfigReader.getConfig().browser().equalsIgnoreCase("firefox")) {
            driver= new FirefoxDriver();
        }else{
            driver= new ChromeDriver(ChromeBrowserOptions.getChromeBrowserOptions());
        }
        return driver;
    }
}
