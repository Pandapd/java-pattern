package com.pandapd.chpt5_singleton;

public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();
    // 无法使用构造函数创建对象
    private Singleton1(){
        System.out.println("生成了一个实例。");
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
