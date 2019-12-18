package com.ziyear.common;

import java.util.UUID;

public class StringUtils extends org.apache.commons.lang3.StringUtils {

    public static String randomString() {
        return UUID.randomUUID().toString();
    }
}
