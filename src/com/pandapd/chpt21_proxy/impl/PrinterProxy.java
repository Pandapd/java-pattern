package com.pandapd.chpt21_proxy.impl;

import com.pandapd.chpt21_proxy.Printable;

public class PrinterProxy implements Printable {

    private String name;
    private Printable real;

    public PrinterProxy(String name, String realName) {
        this.name = name;
    }

    @Override
    public synchronized void setName(String name) {
        if (null != real) {
            real.setName(name);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public synchronized void print(String msg) {
        if (null == real) {
                    real = new Printer();
                    real.setName(name);
                    real.print(msg);
        }else {
            real.print(msg);
        }
    }
}
