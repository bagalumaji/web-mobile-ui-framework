package com.bagal.configs;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file://${user.dir}/src/test/resources/configs/config.properties"
})
public interface IConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String browser();
}
