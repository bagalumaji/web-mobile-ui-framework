package com.bagal.utils;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.TimeUnit;

import static com.bagal.utils.WaitForTimeout.waitForTimeout;

public final class PortUtils {
    private static final int PORT_1 = 4723;
    private static final int PORT_2 = 4724;


    private PortUtils() {}

    public static int getAvailablePort()  {
        int timeout=5;
        while (timeout<=300) {
            if (isPortFree(PORT_1)) {
                return PORT_1;
            } else if (isPortFree(PORT_2)) {
                return PORT_2;
            }
            waitForTimeout(5);
            timeout+=5;
        }

        throw new RuntimeException("No available ports found after waiting for " + timeout + " seconds.");
    }

    private static boolean isPortFree(int port) {
        try (ServerSocket ignored = new ServerSocket(port)) {
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
