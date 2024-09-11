package com.bagal.tests.web;

import com.bagal.configs.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void demoTest(){
        if(ConfigReader.getConfig().browser().equalsIgnoreCase("chrome")) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");
            String title = driver.getTitle();
            System.out.println("title = " + title);
            String currentUrl = driver.getCurrentUrl();
            System.out.println("currentUrl = " + currentUrl);
            driver.quit();
        }else{
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");
            String title = driver.getTitle();
            System.out.println("title = " + title);
            String currentUrl = driver.getCurrentUrl();
            System.out.println("currentUrl = " + currentUrl);
            driver.quit();
        }
    }
}
