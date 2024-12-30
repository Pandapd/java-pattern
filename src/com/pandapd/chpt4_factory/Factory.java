package com.pandapd.chpt4_factory;

public abstract class Factory {
    public Product create(String productIDStr){
        Product p = createProduct(productIDStr);
        registerProduct(p);
        return p;
    }

    public abstract void registerProduct(Product p);

    public abstract Product createProduct(String productIdStr);
}
