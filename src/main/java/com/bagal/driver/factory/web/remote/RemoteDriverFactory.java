package com.bagal.driver.factory.web.remote;

import com.bagal.enums.RemoteService;
import com.bagal.enums.WebBrowser;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {
    private RemoteDriverFactory() {}

    private static final Map<RemoteService, Function<WebBrowser,WebDriver>> MAP= new EnumMap<>(RemoteService.class);
    static {
        MAP.put(RemoteService.BROWSER_STACK,BrowserStackFactory::getDriver);
        MAP.put(RemoteService.LAMBDA_TEST,LambdaTestFactory::getDriver);
    }
    public static WebDriver getDriver(RemoteService remoteService, WebBrowser webBrowser) {
        return MAP.get(remoteService).apply(webBrowser);
    }
}
