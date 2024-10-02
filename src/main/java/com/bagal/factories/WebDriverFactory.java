package com.bagal.factories;

import com.bagal.configs.ConfigReader;
import com.bagal.driver.brwoseroptions.ChromeBrowserOptions;
import com.bagal.exceptions.BrowserNotSupportedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class WebDriverFactory {
    private WebDriverFactory() {}
    public static WebDriver getWebDriver() {
        WebDriver driver;
        switch (ConfigReader.getConfig().browser()) {
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                driver = new ChromeDriver(ChromeBrowserOptions.getChromeBrowserOptions());
                break;
            default:
                throw new BrowserNotSupportedException(ConfigReader.getConfig().browser().name()+" browser is not supported");
        }
        return driver;
    }
}
