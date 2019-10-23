package com.youdushufang.common.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class CommonError {

    private HttpStatus httpStatus;

    private Integer code;

    private String message;

    public CommonError(HttpStatus httpStatus, Integer code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }
}
