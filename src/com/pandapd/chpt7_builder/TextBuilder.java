package com.pandapd.chpt7_builder;

import java.util.List;
import java.util.stream.IntStream;

/**
 * 文本生成Builder
 */
public class TextBuilder implements Builder{

    @Override
    public void makeTitle(String title) {
        System.out.println(title);
    }

    @Override
    public void makeString(String str) {
        System.out.println(str);
    }

    @Override
    public void makeContent(List<String> contentList) {
        IntStream.range(0, contentList.size()).forEach(index -> {
            String item = contentList.get(index);
            int num = index+1;
            System.out.println(num+": " +item);
        });
    }

    @Override
    public void close() {
        System.out.println("-----------Text End-----------");
    }
}
