package com.bagal.entities;

import com.bagal.enums.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DriverData {
   private ExecutionMode executionMode;
   private ExecutionPlatform executionPlatform;
   private RemoteService remoteService;
   private WebBrowser webBrowser;
   private MobilePlatform mobilePlatform;
}
