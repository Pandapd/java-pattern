package com.pandapd.chpt6_prototype;

/**
 * 接口（原型）
 */
public abstract class Product implements Cloneable {
    // 产品功能
    public abstract void use(String str);

    /**
     * 这里是原型的clone方法
     * @return 原型的对象clone
     */
    public final Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
