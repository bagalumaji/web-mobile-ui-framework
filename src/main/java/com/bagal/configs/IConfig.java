package com.bagal.configs;

import com.bagal.RunModeTypes;
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
    String browser();

    @ConverterClass(value = StringToRunModeTypeConvertor.class)
    @DefaultValue(value = "web")
    RunModeTypes runMode();

    String executionMode();
}
