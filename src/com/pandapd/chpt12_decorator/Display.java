package com.pandapd.chpt12_decorator;


/**
 * 显示的核心抽象类。也就是“蛋糕”
 */
public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();

    public abstract String getRowText(int row);

    public void display() {
        int rows = getRows();
        for (int i = 0; i < rows; i++) {
            System.out.println(getRowText(i));
        }
    }
}
