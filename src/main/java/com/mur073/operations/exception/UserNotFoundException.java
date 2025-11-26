package com.mur073.operations.exception;

import lombok.Getter;

@Getter
public class UserNotFoundException extends RuntimeException {
    final private String message;

    public UserNotFoundException(String message) {
        this.message = message;
    }
}
