package com.bagal.configs;

import org.aeonbits.owner.ConfigCache;

public class ConfigReader {
    public static IConfig getConfig() {
        return ConfigCache.getOrCreate(IConfig.class);
    }
}
