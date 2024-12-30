package com.pandapd.chpt11_composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private int size;
    private String name;
    // 目录嵌套
    private List<Entry> childs = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        // 目录的size创建对象时就为0
        int total = 0;
        total = childs.stream().mapToInt(Entry::getSize).sum();
        return total;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    // 添加后返回自己。这是一种比较好的代码书写格式
    protected Entry add(Entry entry) throws RuntimeException {
        childs.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    protected void showList(String prefix) {
        // 先打印自己 /xxx[200]
        System.out.println(prefix + "/" + this);
        // 再迭代打印，每次都把前缀加上"/当前文件夹名字"
        childs.stream().forEach(item -> item.showList(prefix+"/"+this.name));
    }

}
