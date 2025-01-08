package com.pandapd.chpt20_flyweight;

/**
 * 共享实例的使用者
 */
public class BigString {
    private BigChar[] bigCharList;

    public BigString(String str) {
        int length = str.length();
        bigCharList = new BigChar[length];
        for (int i = 0; i < length; i++) {
            bigCharList[i] = BigCharFactory.getInstance().getBigChar(str.charAt(i));
        }
    }

    /**
     * 打印BigString
     */
    public void print() {
        for (BigChar b : bigCharList) {
            b.print();
        }
    }
}
