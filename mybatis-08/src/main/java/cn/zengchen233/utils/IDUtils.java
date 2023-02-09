package cn.zengchen233.utils;

import java.util.UUID;

/**
 * @author zengchen
 * @title IDUtils
 * @description
 * @create 2023/2/9
 */
public class IDUtils {

    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
