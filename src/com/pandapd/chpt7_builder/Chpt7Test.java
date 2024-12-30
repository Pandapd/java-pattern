package com.pandapd.chpt7_builder;

public class Chpt7Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new TextBuilder());
        director.construct();

        director.setBuilder(new HTMLBuilder());
        director.construct();
    }
}
