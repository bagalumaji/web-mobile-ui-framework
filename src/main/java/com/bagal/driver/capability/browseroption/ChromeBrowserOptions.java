package com.bagal.driver.capability.browseroption;

import org.openqa.selenium.chrome.ChromeOptions;

public final class ChromeBrowserOptions {
    private ChromeBrowserOptions() {
    }
    public static ChromeOptions getChromeBrowserOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        return options;
    }
}
