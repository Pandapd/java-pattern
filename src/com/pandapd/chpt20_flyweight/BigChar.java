package com.pandapd.chpt20_flyweight;

import com.sun.org.apache.xpath.internal.objects.XNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取文本文件中的0-9
 */
public class BigChar {
    // 字符名称
    private char name;
    // 字符的表示
    private String font;

    public void setName(char name) {
        this.name = name;
    }

    /**
     * 从文件读取
     */
    public BigChar(char name) {
        this.name = name;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("big" + name + ".txt"));
            StringBuffer sb =  new StringBuffer();
            String line;
            while ((line=bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            font = sb.toString();
        } catch (IOException e) {
            this.font = name + "?";
        }
    }


    public void print() {
        System.out.println(font);
    }


}
