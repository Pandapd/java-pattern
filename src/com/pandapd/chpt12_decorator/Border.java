package com.pandapd.chpt12_decorator;

/**
 * 装饰器Board继承了被装饰的Display。他也是Display的一种
 */
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
