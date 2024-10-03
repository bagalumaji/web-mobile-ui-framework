package com.bagal.configs.convertors;

import com.bagal.enums.MobilePlatform;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public final class StringToMobilePlatformTypeConvertor implements Converter<MobilePlatform> {
    @Override
    public MobilePlatform convert(Method method, String s) {
        return MobilePlatform.valueOf(s.toUpperCase());
    }
}
