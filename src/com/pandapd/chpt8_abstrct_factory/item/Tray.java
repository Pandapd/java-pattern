package com.pandapd.chpt8_abstrct_factory.item;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item{
    private List<Item> trayList;

    public List<Item> getTrayList() {
        return trayList;
    }

    /**
     * 因为Tray这个托盘上可以不放东西只有name,所以有此处构造函数
     * @param name 零件名称
     */
    public Tray(String name) {
        super(name);
        this.trayList = new ArrayList<>();
    }

    public void add(Item item) {
        this.trayList.add(item);
    }
}
