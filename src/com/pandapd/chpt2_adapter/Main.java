package com.pandapd.chpt2_adapter;

import com.pandapd.chpt2_adapter.api.FileIO;
import com.pandapd.chpt2_adapter.impl.FileProperties;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        FileIO fio = new FileProperties(new Properties());
        try {
            // 使用FileProperties这个**适配器**进行对key,value这样的文件中键值对的设置
            fio.readFromFile("E:\\MyCode\\Java\\java_mode\\src\\com\\xh\\chpt2\\file.properties");
            fio.setValue("day", "21");
            fio.setValue("month", "9");
            fio.setValue("year", "2024");
            fio.writeToFile("E:\\MyCode\\Java\\java_mode\\src\\com\\xh\\chpt2\\new_file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
