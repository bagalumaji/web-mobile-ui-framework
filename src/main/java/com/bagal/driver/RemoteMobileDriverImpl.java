package com.bagal.driver;

import com.bagal.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.bagal.entities.MobileDriverData;
import org.openqa.selenium.WebDriver;

public final class RemoteMobileDriverImpl implements IMobileDriver{
    @Override
    public WebDriver getDriver(final MobileDriverData mobileDriverData) {
        return RemoteMobileDriverFactory.getDriver(mobileDriverData.getRemoteService(),mobileDriverData.getMobilePlatform());
    }
}
