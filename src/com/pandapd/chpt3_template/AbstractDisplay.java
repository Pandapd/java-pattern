package com.pandapd.chpt3_template;

public abstract class AbstractDisplay {
    public abstract void start();
    public abstract void print();
    public abstract void close();

    /**
     * 流程
     * start -  print5次 - close
     */
    public final void display(){
        this.start();
        for (int i = 0; i < 5; i++) {
            this.print();
        }
        this.close();
    }
}
