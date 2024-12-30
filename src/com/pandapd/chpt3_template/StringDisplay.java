package com.pandapd.chpt3_template;

public class StringDisplay extends AbstractDisplay {
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void start() {
        System.out.println("***");
    }

    @Override
    public void print() {
        System.out.println(this.str);
    }

    @Override
    public void close() {
        System.out.println("***");
    }
}
