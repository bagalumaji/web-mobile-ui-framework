package com.bagal.configs.convertors;

import com.bagal.enums.ExecutionPlatform;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public final class StringToExecutionPlatformTypeConvertor implements Converter<ExecutionPlatform> {
    @Override
    public ExecutionPlatform convert(Method method, String s) {
        return ExecutionPlatform.valueOf(s.toUpperCase());
    }
}
