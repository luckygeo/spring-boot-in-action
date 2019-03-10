package me.spirng.boot.exception;

import lombok.Getter;

public class HttpException extends Exception {
    @Getter
    private String message;
    public HttpException(String message) {
        this.message = message;
    }

}
