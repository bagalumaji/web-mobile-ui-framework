package com.bagal.convertors;

import com.bagal.RunModeTypes;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public final class StringToRunModeTypeConvertor implements Converter<RunModeTypes> {
    @Override
    public RunModeTypes convert(Method method, String s) {
        return RunModeTypes.valueOf(s.toLowerCase());
    }
}
