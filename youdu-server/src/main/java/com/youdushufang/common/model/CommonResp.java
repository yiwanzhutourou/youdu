package com.youdushufang.common.model;

import lombok.Data;

@Data
public class CommonResp<T> {

    private Integer code;

    private String message;

    private T data;

    private CommonResp() { }

    private CommonResp(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResp<T> success(T data) {
        return new CommonResp<>(0, "", data);
    }

    public static <T> CommonResp<T> error(int code, String message) {
        return new CommonResp<>(code, message, null);
    }
}
