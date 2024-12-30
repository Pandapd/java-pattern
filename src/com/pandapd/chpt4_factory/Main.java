package com.pandapd.chpt4_factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product id1 = factory.create("小王");
        Product id2 = factory.create("Joe");
        Product id3 = factory.create("Mark");

        id1.use();
        id2.use();
        id3.use();
    }
}
