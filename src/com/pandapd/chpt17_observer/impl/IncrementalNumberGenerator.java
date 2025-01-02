package com.pandapd.chpt17_observer.impl;

import com.pandapd.chpt17_observer.NumberGenerator;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;
    private int start;
    private int end;
    private int length;

    public IncrementalNumberGenerator(int start, int end, int length) {
        this.length = length;
        this.start = start;
        this.end = end;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void generate() {
        for (int i = start; i < end; i+=length) {
            number = i;
            notifyObservers();
        }
    }
}
