package com.pandapd.chpt12_decorator;

/**
 * 只左右包边，所以行数不变，列数+2
 */
public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }


    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return this.borderChar + display.getRowText(row) + this.borderChar;
    }
}
