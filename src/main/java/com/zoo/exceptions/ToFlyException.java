package com.zoo.exceptions;

public class ToFlyException extends RuntimeException {
    public ToFlyException() {
    }

    public ToFlyException(String message) {
        super(message);
    }

    public ToFlyException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToFlyException(Throwable cause) {
        super(cause);
    }

    public ToFlyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
