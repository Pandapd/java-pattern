package com.pandapd.chpt13_visitor.visitor;

import com.pandapd.chpt13_visitor.entry.Directory;
import com.pandapd.chpt13_visitor.entry.Entry;
import com.pandapd.chpt13_visitor.entry.File;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private long size;
    @Override
    public void visit(File file) {
        this.size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            next.accept(this);
        }
    }

    public long getSize() {
        return this.size;
    }
}
