package com.pandapd.chpt12_decorator;

import java.util.ArrayList;
import java.util.List;

public class MutiStringDisplay extends Display {
    private List<String> strList = new ArrayList<>();
    private int columns;

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public boolean addToList(String str) {
        int newColumns = str.getBytes().length;
        boolean success = strList.add(str);
        if (success && this.columns != newColumns) {
            // 更新字符串（增加空白填充符号）
            updateListStr(newColumns);
        }
        return success;
    }

    /**
     * 更新List中的字符串为等长
     * @param newColumns
     */
    private void updateListStr(int newColumns) {
        // 更新columns
        if (newColumns > columns) {
            this.columns = newColumns;
        }


        // 补充空白字符
        for (int i = 0; i < strList.size(); i++) {
            String s = strList.get(i);
            int fills = columns - s.getBytes().length;
            if (fills > 0) {
                String newStr = s + fillSpace(fills);
                strList.set(i, newStr);
            }
        }
    }

    /**
     * 返回空白填充字符
     * @param fills 空白字符的个数
     * @return 空白字符串
     */
    private String fillSpace(int fills) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < fills; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    @Override
    public int getColumns() {
        // 找到最长的字符串
        return this.columns;
    }



    @Override
    public int getRows() {
        return strList.size();
    }

    @Override
    public String getRowText(int row) {
        return strList.get(row);
    }
}
