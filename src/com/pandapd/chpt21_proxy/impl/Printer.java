package com.pandapd.chpt21_proxy.impl;

import com.pandapd.chpt21_proxy.Printable;

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printer实例生成中");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer实例【" + this.name + "】生成中");
    }

    /**
     * 表示本体的实例生成比较慢
     * @param msg
     */
    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("\n生成结束");
    }

    @Override
    public void print(String msg) {
        System.out.println("======" + "【" + name + "】" + msg + "======");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
