package com.lunchbox.lunchboxdonation.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException {

    private final java.lang.Error error;

    @Override
    public String getMessage() {
        return error.getMessage();
    }
}