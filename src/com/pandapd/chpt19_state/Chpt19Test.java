package com.pandapd.chpt19_state;

import com.pandapd.chpt19_state.impl.SafeFrame;

public class Chpt19Test {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("简易警报");
        while (true) {
            for (int i = 0; i < 24; i++) {
                frame.setClock(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
