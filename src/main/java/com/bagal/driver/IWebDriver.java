package com.bagal.driver;

import com.bagal.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData webDriverData);
}
