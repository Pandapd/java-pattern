package com.pandapd.chpt9_bridge;

public class CharacterDisplayImpl extends DisplayImpl{
    private char openChar;
    private char closeChar;
    private char printChar;

    public CharacterDisplayImpl(char openChar, char closeChar, char printChar) {
        this.openChar = openChar;
        this.closeChar = closeChar;
        this.printChar = printChar;
    }

    @Override
    public void open() {
        System.out.print(openChar);
    }

    @Override
    public void print() {
        System.out.print(printChar);
    }

    @Override
    public void close() {
        System.out.println(closeChar);
    }
}
