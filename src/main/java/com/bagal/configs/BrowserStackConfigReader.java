package com.bagal.configs;

import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigReader {
    private BrowserStackConfigReader() {}
    public static BrowserStackConfig getConfig() {
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
