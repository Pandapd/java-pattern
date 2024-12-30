package com.pandapd.chpt8_abstrct_factory.factory;

import com.pandapd.chpt8_abstrct_factory.item.Link;
import com.pandapd.chpt8_abstrct_factory.item.Page;
import com.pandapd.chpt8_abstrct_factory.item.Tray;

public abstract class Factory {
    public abstract Link createLink(String name, String url);
    public abstract Tray createTray(String name);
    public abstract Page createPage(String title, String author);
}
