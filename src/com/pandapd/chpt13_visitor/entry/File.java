package com.pandapd.chpt13_visitor.entry;

import com.pandapd.chpt13_visitor.visitor.Visitor;

public class File extends Entry {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
