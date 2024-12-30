package com.pandapd.chpt7_builder;

import java.util.List;

/**
 * HTML生成Builder
 */
public class HTMLBuilder implements Builder{
    @Override
    public void makeTitle(String title) {
        System.out.println("<html><head><title>"+title+"</title></head><body>");
    }

    @Override
    public void makeString(String str) {
        System.out.println("<h1>"+str+"</h1>");

    }

    @Override
    public void makeContent(List<String> contentList) {
        System.out.println("<ul>");
        contentList.forEach(item -> {
            System.out.println("<li>"+item+"</li>");
        });
        System.out.println("</ul>");
    }

    @Override
    public void close() {
        System.out.println("</body></html>");
    }
}
