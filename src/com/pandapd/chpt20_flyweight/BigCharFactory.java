package com.pandapd.chpt20_flyweight;

import java.util.HashMap;

public class BigCharFactory {
    private HashMap<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory singleton = new BigCharFactory();
    private BigCharFactory(){}
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // 生成共享实例pool
    public synchronized BigChar getBigChar(char name) {
        BigChar bigChar = pool.getOrDefault("" + name, null);
        if (null == bigChar) {
            bigChar = new BigChar(name);
            pool.put(""+name, bigChar);
        }
        return bigChar;
    }
}
