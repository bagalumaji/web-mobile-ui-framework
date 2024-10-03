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

    String username();
    String key();

    @ConverterClass(value = StringToUrlConvertor.class)
    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    URL browserStackUrl();
}
