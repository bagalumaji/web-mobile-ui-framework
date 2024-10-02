package com.bagal.exceptions;

public class BrowserNotSupportedException extends RuntimeException {
    public BrowserNotSupportedException(String message) {
        super(message);
    }
}
