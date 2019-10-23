package com.youdushufang.exception;

import com.youdushufang.common.model.CommonError;

public class BaseException extends RuntimeException {

    private CommonError commonError;

    BaseException(CommonError commonError) {
        this.commonError = commonError;
    }

    public CommonError getCommonError() {
        return this.commonError;
    }
}
