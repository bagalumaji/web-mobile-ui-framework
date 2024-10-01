package com.bagal.configs;

import com.bagal.convertors.StringToBrowserTypeConvertor;
import com.bagal.enums.BrowserTypes;
import com.bagal.enums.RunModeTypes;
import com.bagal.convertors.StringToRunModeTypeConvertor;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file://${user.dir}/src/test/resources/config.properties",
        "file://${user.dir}/src/test/resources/stag-config.properties"
})
public interface IConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    @ConverterClass(value = StringToBrowserTypeConvertor.class)
    BrowserTypes browser();

    @ConverterClass(value = StringToRunModeTypeConvertor.class)
    @DefaultValue(value = "web")
    RunModeTypes runMode();

    String executionMode();
}
