package com.bagal.driver.manager.mobile.local;

import com.bagal.utils.PortUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public final class LocalAndroidManager {
    private LocalAndroidManager() {
    }

    public static WebDriver getDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        int port = PortUtils.getAvailablePort();
        if (port == 4723) {
            options.setUdid("emulator-5554");
        }
        if (port == 4724) {
            options.setUdid("emulator-5556");
        }
        options.setApp(System.getProperty("user.dir") + "/src/test/resources/apps/mda-2.1.0-24.apk");
        return new AndroidDriver(getUrl(port), options);
    }

    private static URL getUrl(int port) {
        try {
            return new URL("http://127.0.0.1:" + port);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
