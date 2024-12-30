package com.pandapd.chpt13_visitor.entry;

import com.pandapd.chpt13_visitor.visitor.SizeVisitor;
import com.pandapd.chpt13_visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private int size;
    private List<Entry> dir;

    public Directory(String name) {
        this.name = name;
        dir = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public long getSize() {
        SizeVisitor v = new SizeVisitor();
        accept(v);
        return v.getSize();
    }

    @Override
    public void add(Entry e) throws FileOperateException {
        this.dir.add(e);
    }

    @Override
    public Iterator<Entry> iterator() throws FileOperateException {
        return this.dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
