package com.pandapd.chpt8_abstrct_factory;

import com.pandapd.chpt8_abstrct_factory.factory.Factory;
import com.pandapd.chpt8_abstrct_factory.factory.impl.ListPageFactory;
import com.pandapd.chpt8_abstrct_factory.item.Link;
import com.pandapd.chpt8_abstrct_factory.item.Page;
import com.pandapd.chpt8_abstrct_factory.item.Tray;

import java.util.HashMap;
import java.util.Map;

public class Chpt8Test {
    public static void main(String[] args) {
        Map<String, Factory> factoryMap = new HashMap<>();
        factoryMap.put("LINK_FACTORY", new ListPageFactory());

        String fname = "LINK_FACTORY";
        Factory factory = factoryMap.getOrDefault(fname, null);
        if (null == factory) {
            System.out.println("未注册该工厂");
            return;
        }

        Link link1 = factory.createLink("taobao", "https://www.taobao.com");
        Link link2 = factory.createLink("baidu", "https://www.baidu.com");

        Tray aliTray = factory.createTray("Alibaba");
        aliTray.add(link1);
        aliTray.add(link2);

        Page page = factory.createPage("hao321", "bmo");
        page.add(aliTray);
        page.writeOnDisk();
    }
}
