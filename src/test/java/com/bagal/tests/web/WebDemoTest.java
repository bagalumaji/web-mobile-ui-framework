package com.bagal.tests.web;

import com.bagal.configs.BrowserStackConfigReader;
import com.bagal.configs.ConfigReader;
import com.bagal.driver.manager.DriverManager;
import com.bagal.testsetup.WebTestSetup;
import org.testng.annotations.Test;

public class WebDemoTest extends WebTestSetup {
    @Test
    public void demoTest(){
        DriverManager.getWebDriver().get("https://the-internet.herokuapp.com/login");
        String title = DriverManager.getWebDriver().getTitle();
        System.out.println("title = " + title);
        String currentUrl = DriverManager.getWebDriver().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
    }
}
