package com.pandapd.chpt17_observer.impl;

import com.pandapd.chpt17_observer.NumberGenerator;
import com.pandapd.chpt17_observer.Observer;

public class GraphicObserver implements Observer {
    @Override
    public void update(NumberGenerator ng) {
        int number = ng.getNumber();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < number; i++) {
            sb.append("*");
        }
        System.out.println("GraphicObserver: " +sb.toString());

        try {
            Thread.sleep(100);
        }  catch (Exception e) {
            System.out.println("sleep failed");
        }
    }
}
