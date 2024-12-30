package com.pandapd.chpt8_abstrct_factory.item;

public abstract class Link extends Item{
    protected String url;

    public Link(String name, String url) {
        super(name);
        this.url = url;
    }
}
