package com.pandapd.chpt2_adapter.impl;

import com.pandapd.chpt2_adapter.api.FileIO;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties prop;

    public FileProperties(Properties prop) {
        this.prop = prop;
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        prop.load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        prop.store(new FileOutputStream(fileName), "");
    }

    @Override
    public void setValue(String key, String value) {
        prop.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return prop.getProperty(key, "");
    }
}
