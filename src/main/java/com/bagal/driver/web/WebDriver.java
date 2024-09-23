package com.bagal.driver.web;

public final class WebDriver{
    private WebDriver() {}

    public static void initDriver() {
        System.out.println("web driver initialized");
    }

    public static void closeDriver() {
        System.out.println("web driver closed");
    }
}
