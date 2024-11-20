package com.hope.gallery.exception;

public class ErrorResponseCustom {
    private final String error;

    public ErrorResponseCustom(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
