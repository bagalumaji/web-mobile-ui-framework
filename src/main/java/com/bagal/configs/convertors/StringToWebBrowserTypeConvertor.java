package com.bagal.configs.convertors;

import com.bagal.enums.WebBrowser;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToWebBrowserTypeConvertor implements Converter<WebBrowser> {
    @Override
    public WebBrowser convert(Method method, String browser) {
        Map<String,WebBrowser> map=Map.of("CHROME",WebBrowser.CHROME,"FIREFOX",WebBrowser.FIREFOX);
        return map.getOrDefault(browser.toUpperCase(),WebBrowser.CHROME);
    }
}
