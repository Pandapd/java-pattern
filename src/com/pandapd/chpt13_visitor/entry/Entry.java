package com.pandapd.chpt13_visitor.entry;

import java.util.Iterator;

/**
 * 文件系统的顶层父类，实现了Element接口
 */
public abstract class Entry implements Element {


    public abstract String getName();
    public abstract long getSize();

    @Override
    public String toString() {
        return getName()+"["+getSize()+"]";
    }

    /**
     * 这两个方法都是仅仅Directory使用，所以都是默认抛出异常
     * @throws FileOperateException 文件操作异常
     */
    public void add(Entry e) throws FileOperateException {
        throw new FileOperateException("无法进行add操作");
    }
    public Iterator<Entry> iterator() throws FileOperateException {
        throw new FileOperateException("无法进行iterator操作");
    }
}
