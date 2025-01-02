package com.pandapd.chpt17_observer;

import com.pandapd.chpt17_observer.impl.DigitalObserver;
import com.pandapd.chpt17_observer.impl.GraphicObserver;
import com.pandapd.chpt17_observer.impl.IncrementalNumberGenerator;
import com.pandapd.chpt17_observer.impl.RandomNumberGenerator;

public class Chpt17Test {
    public static void main(String[] args) {
        Observer o1 = new DigitalObserver();
        Observer o2 = new GraphicObserver();

        NumberGenerator generator1 = new RandomNumberGenerator();
        generator1.addObserver(o1);
        generator1.addObserver(o2);
        generator1.generate();

        IncrementalNumberGenerator generator2 = new IncrementalNumberGenerator(10, 50, 5);
        generator2.addObserver(o1);
        generator2.addObserver(o2);
        generator2.generate();
    }
}
