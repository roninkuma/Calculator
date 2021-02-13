package com.exercise.calculator;

public class UnsupportedSyntaxException extends RuntimeException {
    public UnsupportedSyntaxException() {
        super();
    }

    public UnsupportedSyntaxException(String message) {
        super(message);
    }
}
