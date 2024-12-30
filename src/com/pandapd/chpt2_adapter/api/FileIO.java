package com.pandapd.chpt2_adapter.api;

import java.io.IOException;

/**
 * 作为适配器模式中的Target
 */
public interface FileIO {
    // 读取文件
    void readFromFile(String fileName) throws IOException;
    // 写入文件
    void writeToFile(String fileName) throws IOException;
    // 设置键值对
    void setValue(String key, String value);
    // 读取键值对
    String getValue(String key);
}

