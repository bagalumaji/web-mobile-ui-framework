package com.bagal.configs.convertors;

import com.bagal.enums.RemoteService;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public final class StringToRemoteServiceTypeConvertor implements Converter<RemoteService> {
    @Override
    public RemoteService convert(Method method, String s) {
        return RemoteService.valueOf(s.toUpperCase());
    }
}
