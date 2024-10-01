package com.bagal.factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebDriverFactory {
    private WebDriverFactory() {}
    public static WebDriver getWebDriver() {
        return new ChromeDriver();
    }
}
