package com.pandapd.chpt8_abstrct_factory.item.impl;

import com.pandapd.chpt8_abstrct_factory.item.Tray;

public class ListTray extends Tray {
    public ListTray(String name) {
        super(name);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<li>\n");
        stringBuffer.append(this.name).append("\n");
        stringBuffer.append("<ul>\n");
        this.getTrayList().forEach(item -> {
            stringBuffer.append(item.makeHTML());
        });
        stringBuffer.append("</ul>\n");
        stringBuffer.append("</li>\n");
        return stringBuffer.toString();
    }
}
