package com.bagal.driver.factory.web;

public interface IDriver {
    default void intiDriver(){};
    default void closeDriver(){};
}
