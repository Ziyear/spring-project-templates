package com.ziyear.common;

import java.util.Date;

public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    public static final String YMDHMS = "yyyy-MM-dd HH:mm:ss";

    public static Date getNow() {
        return new Date();
    }


}
