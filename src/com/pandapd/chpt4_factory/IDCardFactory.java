package com.pandapd.chpt4_factory;

import java.util.HashMap;
import java.util.Map;


public class IDCardFactory extends Factory {
    // 工厂中IDCard的Map,注册IDCard的集合
    Map<Integer, Product> IDCardMap = new HashMap<>();

    public Map<Integer, Product> getIDCardMap() {
        return IDCardMap;
    }

    @Override
    public void registerProduct(Product IDCardProduct) {
        int size = IDCardMap.size();
        IDCardMap.put(size, IDCardProduct);
    }

    @Override
    public Product createProduct(String productIdStr) {
        return new IDCardProduct(productIdStr);
    }
}
