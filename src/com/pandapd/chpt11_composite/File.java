package com.pandapd.chpt11_composite;

public class File extends Entry {
    private int size;
    private String name;

    public File(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    protected void showList(String prefix) {
        System.out.println(prefix+"/"+this);
    }
}
