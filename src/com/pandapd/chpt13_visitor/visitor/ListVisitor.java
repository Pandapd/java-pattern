package com.pandapd.chpt13_visitor.visitor;

import com.pandapd.chpt13_visitor.entry.Directory;
import com.pandapd.chpt13_visitor.entry.Entry;
import com.pandapd.chpt13_visitor.entry.File;
import com.pandapd.chpt13_visitor.entry.FileOperateException;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);

        // 路径上不需要带大小
        currentDir = currentDir + "/" + directory.getName();
        try {
            Iterator<Entry> iterator = directory.iterator();
            while (iterator.hasNext()) {
                Entry next = iterator.next();
                // 这里的this指的是当前的visitor对象
                next.accept(this);
            }
        } catch (FileOperateException e) {
            e.printStackTrace();
        }
    }
}
