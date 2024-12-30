package com.pandapd.chpt9_bridge;

public class StringDisplayImpl extends DisplayImpl{

    public StringDisplayImpl(String str) {
        this.str = str;
    }

    private String str;

    @Override
    protected void open() {
        this.printDashLine();
    }

    @Override
    protected void print() {
        System.out.println(str);
    }

    @Override
    protected void close() {
        this.printDashLine();
    }

    private void printDashLine() {
        StringBuffer sb = new StringBuffer();
        int width = str.getBytes().length;
        for (int i = 0; i < width; i++) {
            sb.append("-");
        }
        System.out.println(sb);
    }
}
