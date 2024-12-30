package com.pandapd.chpt12_decorator;

/**
 * 上下左右都被'-'包裹
 */
public class FullBorder extends Border {
    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (0 == row || row == display.getRows()+1) {
            return borderLine();
        }
        // 因为中间的行数都增加了1，所以需要把row-1来获取“核心”对应的行，比如包裹后的第1行
        // 对应的是包裹前的第1-1=0行
        return "|" +  display.getRowText(row-1) + "|";
    }

    private String borderLine() {
        StringBuffer sb = new StringBuffer();
        sb.append('+');
        for (int i = 0; i <  display.getColumns(); i++) {
            sb.append('-');
        }
        sb.append('+');
        return sb.toString();
    }
}
