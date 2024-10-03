package com.bagal.configs;

import com.bagal.configs.convertors.*;
import com.bagal.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file://${user.dir}/src/test/resources/config.properties",
        "file://${user.dir}/src/test/resources/stag-config.properties"
})
public interface IConfig extends Config {
    @Key("web.browser")
    @DefaultValue("chrome")
    @ConverterClass(value = StringToWebBrowserTypeConvertor.class)
    WebBrowser webBrowser();

    @ConverterClass(value = StringToExecutionPlatformTypeConvertor.class)
    @DefaultValue(value = "web")
    @Key("execution.platform")
    ExecutionPlatform executionPlatform();

    @Key("execution.mode")
    @DefaultValue("local")
    @ConverterClass(value = StringToExecutionModeTypeConvertor.class)
    ExecutionMode executionMode();

    @Key("remote.service")
    @ConverterClass(value = StringToRemoteServiceTypeConvertor.class)
    RemoteService remoteService();

    @Key("mobile.platform")
    @DefaultValue("android")
    @ConverterClass(value = StringToMobilePlatformTypeConvertor.class)
    MobilePlatform mobilePlatform();

    @ConverterClass(value = StringToUrlConvertor.class)
    URL browserStackUrl();

    @ConverterClass(value = StringToUrlConvertor.class)
    URL lambdaTestUrl();
}
