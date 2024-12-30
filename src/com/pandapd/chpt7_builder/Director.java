package com.pandapd.chpt7_builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 监工类/调用者类
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 调用Builder的流程方法
     */
    public void construct(){
        builder.makeTitle("This is A Title");
        builder.makeString("今日头条");
        List<String> contentList = new ArrayList<>();
        contentList.add("Apple");
        contentList.add("Banana");
        builder.makeContent(contentList);
        builder.close();
    }
}
