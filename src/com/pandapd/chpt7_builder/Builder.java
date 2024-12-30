package com.pandapd.chpt7_builder;

import java.util.List;

public interface Builder {
    void makeTitle(String title);
    void makeString(String str);
    void makeContent(List<String> contentList);
    void close();
}
