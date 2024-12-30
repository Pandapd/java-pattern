package com.pandapd.chpt4_factory;

/**
 * id卡产品
 */
public class IDCardProduct extends Product{

    private String IDCardStr;

    IDCardProduct(String idCardStr) {
        IDCardStr = idCardStr;
    }

    @Override
    public void use() {
        System.out.println(this.IDCardStr+" use IDCardProduct");
    }
}
