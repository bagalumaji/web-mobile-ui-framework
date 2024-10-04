package com.bagal.configs;

import com.bagal.configs.convertors.StringToUrlConvertor;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file://${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {
    String os();

    String osVersion();

    String browserVersion();

    String consoleLogs();

    String seleniumVersion();

    String projectName();

    String buildName();

    @Key("userName")
    String userName();

    @Key("accessKey")
    String accessKey();

    @ConverterClass(value = StringToUrlConvertor.class)
    @DefaultValue("https://${userName}:${accessKey}@hub-cloud.browserstack.com/wd/hub")
    URL browserStackUrl();
}
