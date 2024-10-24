package com.bagal.driver;

import com.bagal.driver.factory.web.local.LocalDriverFactory;
import com.bagal.entities.WebDriverData;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver{
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return LocalDriverFactory.geDriver(webDriverData.getWebBrowser());
    }
}
