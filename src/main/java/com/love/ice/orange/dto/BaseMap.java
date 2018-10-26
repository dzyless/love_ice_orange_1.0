package com.love.ice.orange.dto;

import java.util.HashMap;

/**
 * @author zhyu.d
 * @description
 * @date 2018/10/26 23:27
 */

public class BaseMap<K, V> extends HashMap {

    public BaseMap() {
        put("pageNum", 1);
        put("pageSize", 10);
    }
}
