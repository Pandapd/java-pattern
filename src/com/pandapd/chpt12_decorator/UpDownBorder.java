package com.pandapd.chpt12_decorator;

public class UpDownBorder extends Border {
    private char upDownChar;

    public UpDownBorder(Display display, char upDownChar) {
        super(display);
        this.upDownChar = upDownChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (0 == row || display.getRows()+1 == row) {
            return buildLine();
        }
        return display.getRowText(row-1);
    }

    private String buildLine() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < display.getColumns(); i++) {
            sb.append(upDownChar);
        }
        return sb.toString();
    }
}
