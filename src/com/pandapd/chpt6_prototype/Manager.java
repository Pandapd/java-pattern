package com.pandapd.chpt6_prototype;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> stylesPrototypeMap = new HashMap<>();

    public void register(String name, Product proto) {
        stylesPrototypeMap.put(name, proto);
    }

    /**
     * 管理器开始生成对象clone，注意调用的注册在Map中的原型类的克隆方法
     */
    public Product create(String name) {
        Product p = stylesPrototypeMap.get(name);
        return p.createClone();
    }
}
