package com.pandapd.chpt9_bridge;

public class Display {
    private DisplayImpl di;

    public Display(DisplayImpl di) {
        this.di = di;
    }

    protected void open() {
        di.open();
    }


    protected void print() {
        di.print();
    }


    protected void close() {
        di.close();
    }

    /**
     * 这里是常见的Template设计模式
     */
    public final void display() {
        this.open();
        this.print();
        this.close();
    }
}
