package com.pandapd.chpt13_visitor.entry;

public class FileOperateException extends RuntimeException {
    public FileOperateException() {
    }

    public FileOperateException(String message) {
        super(message);
    }
}
