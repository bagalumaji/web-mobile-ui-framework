package com.bagal.driver.factory.mobile.remote;

import com.bagal.enums.MobilePlatform;
import com.bagal.enums.RemoteService;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory() {}
    private static final Map<RemoteService, Function<MobilePlatform, WebDriver>>MAP=new EnumMap<>(RemoteService.class);
    static {
        MAP.put(RemoteService.LAMBDA_TEST,LambdaTestMobileFactory::getDriver);
        MAP.put(RemoteService.BROWSER_STACK,BrowserStackMobileFactory::getDriver);
    }
    public static WebDriver getDriver(RemoteService remoteService,MobilePlatform platform) {
       return
               MAP.get(remoteService).apply(platform);
    }
}
