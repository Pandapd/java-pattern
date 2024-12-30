package com.pandapd.chpt13_visitor.entry;

import com.pandapd.chpt13_visitor.visitor.Visitor;

/**
 * 被访问的元素
 *
 * 需要accept Visitor的访问
 */
public interface Element {
    public void accept(Visitor visitor);
}
