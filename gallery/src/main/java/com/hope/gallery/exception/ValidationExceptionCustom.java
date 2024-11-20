package com.hope.gallery.exception;

public class ValidationExceptionCustom extends RuntimeException {
    public ValidationExceptionCustom(String message) {
        super(message);
    }
}
