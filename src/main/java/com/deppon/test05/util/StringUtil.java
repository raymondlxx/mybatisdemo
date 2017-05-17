package com.deppon.test05.util;

import java.util.UUID;

/**
 * Created by lilei on 5/17/2017.
 */
public class StringUtil {

    public static String getUID(){
        String uid = UUID.randomUUID().toString().replace("-","");

        return uid.substring(0,Math.min(10,uid.length()-1));
    }
}
