package com.bagal.driver.capability.remote;

import com.bagal.configs.ConfigReader;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

import static com.bagal.configs.BrowserStackConfigReader.getConfig;

public final class BrowserStackOptions {
    private BrowserStackOptions() {
    }

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        HashMap<String, Object> bstackOptions = new HashMap<>();
        capabilities.setCapability("browserName", String.valueOf(ConfigReader.getConfig().webBrowser()));
        bstackOptions.put("os", getConfig().os());
        bstackOptions.put("osVersion", getConfig().osVersion());
        bstackOptions.put("userName",getConfig().userName());
        bstackOptions.put("accessKey",getConfig().accessKey());
        bstackOptions.put("browserVersion", getConfig().browserVersion());
        bstackOptions.put("consoleLogs", getConfig().consoleLogs());
        bstackOptions.put("seleniumVersion", getConfig().seleniumVersion());
        bstackOptions.put("projectName", getConfig().projectName());
        bstackOptions.put("buildName", getConfig().buildName());
        capabilities.setCapability("bstack:options", bstackOptions);
        return capabilities;
    }
}
