package com.bagal.driver;

import com.bagal.driver.factory.web.remote.RemoteDriverFactory;
import com.bagal.entities.WebDriverData;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver{
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return RemoteDriverFactory.getDriver(webDriverData.getRemoteService(),webDriverData.getWebBrowser());
    }
}
