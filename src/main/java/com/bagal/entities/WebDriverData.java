package com.bagal.entities;

import com.bagal.enums.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WebDriverData {
    WebBrowser webBrowser;
    ExecutionMode executionMode;
    ExecutionPlatform executionPlatform;
    RemoteService remoteService;
}
