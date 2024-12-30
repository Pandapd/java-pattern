package com.pandapd.chpt8_abstrct_factory.item.impl;

import com.pandapd.chpt8_abstrct_factory.item.Link;

public class ListLink extends Link {
    public ListLink(String name, String url) {
        super(name, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + this.url+"\">" + this.name + "</a></li>\n";
    }
}
