package com.bagal.convertors;

import com.bagal.enums.BrowserTypes;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserTypeConvertor implements Converter<BrowserTypes> {
    @Override
    public BrowserTypes convert(Method method, String browser) {
        return BrowserTypes.valueOf(browser.toLowerCase().trim());
    }
}
