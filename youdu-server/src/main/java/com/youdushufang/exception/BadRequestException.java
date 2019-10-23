package com.youdushufang.exception;

import com.youdushufang.common.model.CommonError;
import org.springframework.http.HttpStatus;

public class BadRequestException extends BaseException {

    public BadRequestException(int code, String message) {
        super(new CommonError(HttpStatus.BAD_REQUEST, code, message));
    }
}
