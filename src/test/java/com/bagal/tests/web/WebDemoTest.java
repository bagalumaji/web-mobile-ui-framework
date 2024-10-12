package com.bagal.tests.web;

import com.bagal.driver.manager.DriverManager;
import com.bagal.testsetup.WebTestSetup;
import org.testng.annotations.Test;

public class WebDemoTest extends WebTestSetup {
    @Test
    public void demoTest(){
        DriverManager.getDriver().get("https://the-internet.herokuapp.com/login");
        String title = DriverManager.getDriver().getTitle();
        System.out.println("title = " + title);
        String currentUrl = DriverManager.getDriver().getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
    }
}
