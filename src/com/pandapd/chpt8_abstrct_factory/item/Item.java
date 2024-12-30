package com.pandapd.chpt8_abstrct_factory.item;

/**
 * 带有name的抽象零件类
 */
public abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract String makeHTML();
}
