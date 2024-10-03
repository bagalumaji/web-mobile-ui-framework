package com.bagal.driver.web.local;

import com.bagal.driver.manager.web.local.LocalChromeManager;
import com.bagal.driver.manager.web.local.LocalFirefoxManager;
import com.bagal.enums.WebBrowser;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {
    private LocalDriverFactory() {}

    private static final Map<WebBrowser, Supplier<WebDriver>> MAP = new EnumMap<>(WebBrowser.class);

    static {
        MAP.put(WebBrowser.CHROME, LocalChromeManager::getDriver);
        MAP.put(WebBrowser.FIREFOX, LocalFirefoxManager::getDriver);
    }

    public static WebDriver getWebDriver(WebBrowser webBrowser) {
       return MAP.get(webBrowser).get();
    }
}
