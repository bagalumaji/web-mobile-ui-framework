package com.bagal.driver;

import com.bagal.entities.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverData mobileDriverData);
}
