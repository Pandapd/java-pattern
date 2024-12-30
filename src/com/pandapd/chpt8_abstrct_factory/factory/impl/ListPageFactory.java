package com.pandapd.chpt8_abstrct_factory.factory.impl;

import com.pandapd.chpt8_abstrct_factory.factory.Factory;
import com.pandapd.chpt8_abstrct_factory.item.Link;
import com.pandapd.chpt8_abstrct_factory.item.Page;
import com.pandapd.chpt8_abstrct_factory.item.Tray;
import com.pandapd.chpt8_abstrct_factory.item.impl.ListLink;
import com.pandapd.chpt8_abstrct_factory.item.impl.ListPage;
import com.pandapd.chpt8_abstrct_factory.item.impl.ListTray;

public class ListPageFactory extends Factory {

    @Override
    public Link createLink(String name, String url) {
        return new ListLink(name, url);
    }

    @Override
    public Tray createTray(String name) {
        return new ListTray(name);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
