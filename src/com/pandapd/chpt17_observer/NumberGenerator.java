package com.pandapd.chpt17_observer;

import java.util.Vector;

public abstract class NumberGenerator {

    Vector<Observer> obs;

    public NumberGenerator() {
        obs = new Vector<>();
    }

    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    public synchronized void notifyObservers() {
        obs.forEach(o -> o.update(this));
    }

    // 获取数字
    public abstract int getNumber();
    // 生成数字
    public abstract void generate();

}
