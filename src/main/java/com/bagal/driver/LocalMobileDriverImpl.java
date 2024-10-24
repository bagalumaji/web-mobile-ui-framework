package com.bagal.driver;

import com.bagal.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.bagal.entities.MobileDriverData;
import org.openqa.selenium.WebDriver;

public final class LocalMobileDriverImpl implements IMobileDriver{
    @Override
    public WebDriver getDriver(final MobileDriverData mobileDriverData) {
        return LocalMobileDriverFactory.getDriver(mobileDriverData.getMobilePlatform());
    }
}
