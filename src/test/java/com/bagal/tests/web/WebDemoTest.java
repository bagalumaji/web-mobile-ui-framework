package com.bagal.tests.web;

import com.bagal.configs.BrowserStackConfigReader;
import com.bagal.configs.ConfigReader;
import com.bagal.driver.manager.DriverManager;
import com.bagal.testsetup.WebTestSetup;
import org.testng.annotations.Test;

public class WebDemoTest extends WebTestSetup {
    public static void main(String[] args) {
        System.out.println("ConfigReader.getConfig().executionMode() = " + ConfigReader.getConfig().executionMode());
        System.out.println("ConfigReader.getConfig().executionPlatform() = " + ConfigReader.getConfig().executionPlatform());
        System.out.println("ConfigReader.getConfig().remoteService() = " + ConfigReader.getConfig().remoteService());
        System.out.println("ConfigReader.getConfig().browser() = " + ConfigReader.getConfig().webBrowser());
        System.out.println("ConfigReader.getConfig().mobilePlatform() = " + ConfigReader.getConfig().mobilePlatform());

        System.out.println("BrowserStackConfigReader.getConfig().browserStackUrl() = " + BrowserStackConfigReader.getConfig().browserStackUrl());
    }
    @Test
    public void demoTest(){
        DriverManager.getWebDriver().get("https://the-internet.herokuapp.com/login");
        String title = DriverManager.getWebDriver().getTitle();
        System.out.println("title = " + title);
        String currentUrl = DriverManager.getWebDriver().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
    }
}
