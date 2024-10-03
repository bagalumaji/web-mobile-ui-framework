package com.bagal.configs.convertors;

import lombok.SneakyThrows;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.net.URL;

public final class StringToUrlConvertor implements Converter<URL> {
    @SneakyThrows
    @Override
    public URL convert(Method method, String s) {
        return new URL(s);
    }
}
