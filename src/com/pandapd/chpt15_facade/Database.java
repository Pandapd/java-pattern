package com.pandapd.chpt15_facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 从文件中读取键值对信息
 *
 * db.txt
 * ===============================
 * hyuki@qq.com=Hyuki
 * hanako@qq.com=Hanako
 * tomura@qq.com=Tomura
 * mamoru@qq.com=Mamoru
 *
 * ===============================
 *
 */
public class Database {
    private Database() {}
    public static Properties getData(String dbFileName) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(dbFileName));
        } catch (IOException e) {
            System.out.println("File" + dbFileName + " is not found.");
        }
        return properties;
    }
}
