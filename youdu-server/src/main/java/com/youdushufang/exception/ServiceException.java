package com.youdushufang.exception;

import com.youdushufang.common.model.CommonError;
import org.springframework.http.HttpStatus;

public class ServiceException extends BaseException {

    public ServiceException(int code, String message) {
        super(new CommonError(HttpStatus.INTERNAL_SERVER_ERROR, code, message));
    }
}
