package com.pandapd.chpt17_observer;

import com.pandapd.chpt17_observer.impl.DigitalObserver;
import com.pandapd.chpt17_observer.impl.GraphicObserver;
import com.pandapd.chpt17_observer.impl.RandomNumberGenerator;

public class Chpt17Test {
    public static void main(String[] args) {
        Observer o1 = new DigitalObserver();
        Observer o2 = new GraphicObserver();

        NumberGenerator ng = new RandomNumberGenerator();
        ng.addObserver(o1);
        ng.addObserver(o2);
        ng.generate();

    }
}
