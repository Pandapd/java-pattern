package com.pandapd.chpt13_visitor.visitor;

import com.pandapd.chpt13_visitor.entry.Directory;
import com.pandapd.chpt13_visitor.entry.File;

/**
 * 抽象的Visitor类
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
