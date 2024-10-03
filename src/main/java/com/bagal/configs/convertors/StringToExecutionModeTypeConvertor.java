package com.bagal.configs.convertors;

import com.bagal.enums.ExecutionMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public final class StringToExecutionModeTypeConvertor implements Converter<ExecutionMode> {
    @Override
    public ExecutionMode convert(Method method, String s) {
        return ExecutionMode.valueOf(s.toUpperCase());
    }
}
