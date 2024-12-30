package com.pandapd.chpt11_composite;

/**
 * 条目类
 */
public abstract class Entry {

    protected Entry parent;
    public abstract int getSize();
    public abstract String getName();
    // 获取完整路径
    public String getPath() {
        Entry e = this;
        StringBuffer sb = new StringBuffer();
        while (null != e) {
            sb.insert(0, e.getName()).insert(0, "/");
            e = e.parent;
        }
        return sb.toString();
    }

    protected abstract void showList(String prefix);

    protected Entry add(Entry entry) throws RuntimeException{
        throw new RuntimeException("添加条目失败");
    }
    protected void showList() {
        showList("");
    }

    @Override
    public String toString() {
        return this.getName() + "[" + this.getSize() + "]";
    }
}
