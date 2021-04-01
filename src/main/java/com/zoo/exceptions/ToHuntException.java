package com.zoo.exceptions;

public class ToHuntException extends RuntimeException {
    public ToHuntException() {
    }

    public ToHuntException(String message) {
        super(message);
    }

    public ToHuntException(String message, Throwable cause) {
        super(message, cause);
    }

    public ToHuntException(Throwable cause) {
        super(cause);
    }

    public ToHuntException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
