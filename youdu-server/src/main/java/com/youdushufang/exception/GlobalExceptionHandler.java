package com.youdushufang.exception;

import com.youdushufang.common.model.CommonError;
import com.youdushufang.common.model.CommonResp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<CommonResp> handleBaseException(BaseException e) {
        CommonError commonError = e.getCommonError();
        int code = commonError.getCode() == null ? -1 : commonError.getCode();
        String message = commonError.getMessage() == null ? "服务出错了" : commonError.getMessage();
        HttpStatus httpStatus = commonError.getHttpStatus() == null ? HttpStatus.INTERNAL_SERVER_ERROR : commonError.getHttpStatus();
        return new ResponseEntity<>(CommonResp.error(code, message), httpStatus);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResp> handleCommonException(Exception e) {
        e.printStackTrace();
        String message = e.getMessage() == null ? "服务出错了" : e.getMessage();
        return new ResponseEntity<>(CommonResp.error(-1, message), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
