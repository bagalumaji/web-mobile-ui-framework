package com.bagal.driver.mobile;

public final class MobileDriver {
    private MobileDriver() {}
    public static void initDriver() {
        System.out.println("mobile driver initialized");
    }
    public static void closeDriver() {
        System.out.println("mobile driver closed");
    }
}
