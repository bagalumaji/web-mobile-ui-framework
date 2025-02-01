package com.bagal.driver.manager;

import com.bagal.enums.ExecutionPlatform;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

public final class DriverManager {
    private DriverManager() {}

    private static final ThreadLocal<Map<ExecutionPlatform, WebDriver>> DRIVER_MAP = ThreadLocal.withInitial(() -> new EnumMap<>(ExecutionPlatform.class));
    private static final ThreadLocal<ExecutionPlatform> CONTEXT = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return DRIVER_MAP.get().get(CONTEXT.get());
    }

    public static void setDriver(WebDriver driver) {
        ExecutionPlatform platform = isMobileDriver(driver) ? ExecutionPlatform.MOBILE : ExecutionPlatform.WEB;
        DRIVER_MAP.get().put(platform, driver);
        CONTEXT.set(platform);
    }

    private static boolean isMobileDriver(WebDriver driver) {
        return driver instanceof AndroidDriver || driver instanceof IOSDriver;
    }

    public static void unload() {
        DRIVER_MAP.get().clear();
        CONTEXT.remove();
    }
}

//public final class DriverManager {
//    private DriverManager() {
//    }
//
//    private final static ThreadLocal<WebDriver> WEB_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
//    private final static ThreadLocal<WebDriver> MOBILE_DRIVER_THREAD_LOCAL = new ThreadLocal<>();
//    private final static ThreadLocal<ExecutionPlatform> CONTEXT = new ThreadLocal<>();
//    private final static Map<ExecutionPlatform,ThreadLocal<WebDriver>> EXECUTION_PLATFORM_THREAD_LOCAL = new EnumMap<>(ExecutionPlatform.class);
//
//
//    public static WebDriver getDriver() {
//        return CONTEXT.get()==ExecutionPlatform.WEB?WEB_DRIVER_THREAD_LOCAL.get():MOBILE_DRIVER_THREAD_LOCAL.get();
//    }
//
//    public static void setDriver(WebDriver driver) {
//        if (isMobileDriver(driver)) {
//            MOBILE_DRIVER_THREAD_LOCAL.set(driver);
//            EXECUTION_PLATFORM_THREAD_LOCAL.put(ExecutionPlatform.MOBILE,MOBILE_DRIVER_THREAD_LOCAL);
//            CONTEXT.set(ExecutionPlatform.MOBILE);
//        } else {
//            WEB_DRIVER_THREAD_LOCAL.set(driver);
//            EXECUTION_PLATFORM_THREAD_LOCAL.put(ExecutionPlatform.WEB,WEB_DRIVER_THREAD_LOCAL);
//            CONTEXT.set(ExecutionPlatform.WEB);
//        }
//    }
//
//    private static boolean isMobileDriver(WebDriver driver) {
//        return driver instanceof AndroidDriver || driver instanceof IOSDriver;
//    }
//    public static void unload() {
//        WEB_DRIVER_THREAD_LOCAL.remove();
//        MOBILE_DRIVER_THREAD_LOCAL.remove();
//        CONTEXT.remove();
//    }
//}
