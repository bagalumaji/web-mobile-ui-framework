package com.bagal.entity;

import com.bagal.enums.*;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MobileDriverData {
    ExecutionMode executionMode;
    ExecutionPlatform executionPlatform;
    MobilePlatform mobilePlatform;
    RemoteService remoteService;
}
