package com.pandapd.chpt8_abstrct_factory.item;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> contentList;

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
        contentList = new ArrayList<>();
    }

    public void add(Item item) {
        contentList.add(item);
    }

    public void writeOnDisk() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(title + ".html");
            fileWriter.write(this.makeHTML());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("close failed!!");
                }
            }
        }
        System.out.println("生成Page文件成功.");
    }

    protected abstract String makeHTML();
}
