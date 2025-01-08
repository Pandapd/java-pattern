package com.pandapd.chpt21_proxy;

import com.pandapd.chpt21_proxy.impl.PrinterProxy;

public class Chpt21Test {
    public static void main                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         (String[] args) {
        Printable p = new PrinterProxy("ACE", "Printer");
        System.out.println("当前的名字是:" + p.getName());
        p.print("Hello World!");
        p.setName("BOB");
        System.out.println("当前的名字是:" + p.getName());

    }
}
