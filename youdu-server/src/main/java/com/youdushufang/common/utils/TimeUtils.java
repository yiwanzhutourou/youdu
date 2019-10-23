package com.youdushufang.common.utils;

public class TimeUtils {

    private TimeUtils() { }

    public static int getCurrentTimeInSeconds() {
        return (int) (System.currentTimeMillis() / 1000);
    }
}
