package com.pandapd.chpt17_observer.impl;

import com.pandapd.chpt17_observer.NumberGenerator;
import com.pandapd.chpt17_observer.Observer;

public class DigitalObserver implements Observer {
    @Override
    public void update(NumberGenerator ng) {
        System.out.println("DigitalObserver:" + ng.getNumber());
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("sleep failed");
        }
    }
}
