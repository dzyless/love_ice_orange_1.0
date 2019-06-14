package com.love.ice.orange.constants;

import java.io.BufferedInputStream;

/**
 * @author zhyu.d
 * @description
 * @date 2018/11/11 20:50
 */

public class Client {

    public static void main(String[] args) {
        String str = "我很喜欢你！";
        byte[] by = str.getBytes();
        for(byte b: by){
            System.out.println(b);
        }
    }

}
