package com.wkx.common.utils;
import java.nio.charset.Charset;

import org.apache.tomcat.util.codec.binary.Base64;


/**
 * Title: Base64Util
 * Description: Base64Util工具类 --- 加密和解密
 * Created by Administrator on 2018/11/24.
 */
public class Base64Util {

    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    /**
     * 解密
     *
     * @param str
     * @return
     */
    public static String decodeStr(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        return new String(Base64.decodeBase64(new String(str).getBytes(DEFAULT_CHARSET)), DEFAULT_CHARSET).trim();
    }

    /**
     * 加密
     *
     * @param str
     * @return
     */
    public static String encodeStr(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        return new String(Base64.encodeBase64Chunked(str.getBytes(DEFAULT_CHARSET)), DEFAULT_CHARSET).trim();
    }

}
