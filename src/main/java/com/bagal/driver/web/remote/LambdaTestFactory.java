package com.bagal.driver.web.remote;

import com.bagal.driver.manager.web.remote.lambdatest.LambdaTestChromeManager;
import com.bagal.driver.manager.web.remote.lambdatest.LambdaTestFirefoxManager;
import com.bagal.enums.WebBrowser;
import org.openqa.selenium.WebDriver;

public final class LambdaTestFactory {
    private LambdaTestFactory() {}
    public static WebDriver getDriver(WebBrowser webBrowser) {
        return webBrowser == WebBrowser.CHROME? LambdaTestChromeManager.getDriver(): LambdaTestFirefoxManager.getDriver();
    }
}
