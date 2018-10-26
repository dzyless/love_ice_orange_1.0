package com.love.ice.orange.constants;

public enum ResponseCodes {

    SUCCESS(01, "SUCCESS"),
    ERROR(02, "ERROR");

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ResponseCodes(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
