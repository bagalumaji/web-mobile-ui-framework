package com.bagal.utils;

public final class WaitForTimeout {
    private WaitForTimeout() {
    }

    public static void waitForTimeout(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
