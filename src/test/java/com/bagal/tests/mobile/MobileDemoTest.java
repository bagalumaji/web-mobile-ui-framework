package com.bagal.tests.mobile;

import com.bagal.driver.Driver;
import com.bagal.driver.manager.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public final class MobileDemoTest {

    @Test
    void launchAndroidTest() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("emulator-5554");
            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            options.setApp(System.getProperty("user.dir") + "/src/test/resources/apps/mda-2.1.0-24.apk");
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            System.out.println("driver.getDeviceTime() = " + driver.getDeviceTime());
            System.out.println("driver.getContext() = " + driver.getContext());
            System.out.println("driver.getCapabilities().asMap() = " + driver.getCapabilities().asMap());
            driver.quit();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    @Test
    void launchIosTest() throws MalformedURLException, InterruptedException {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 16");
        options.setApp(System.getProperty("user.dir") + "/src/test/resources/apps/SauceLabs-Demo-App.Simulator.XCUITest.zip");
        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
        Thread.sleep(10000);
        driver.quit();
    }
    @Test
    public void demoTest(){
        Driver.intializeWebDriver();
        DriverManager.getWebDriver().get("https://www.google.com");
        Driver.closeDriver();
    }
}
