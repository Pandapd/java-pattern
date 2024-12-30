package com.pandapd.chpt9_bridge;

public class MutiDisplay extends Display{

    public MutiDisplay(DisplayImpl di) {
        super(di);
    }

    /**
     * 一种打印多次的流程Template
     * @param times 调用print()方法的次数
     */
    public final void mutiDisplay(int times) {
        this.open();
        for (int i = 0; i < times; i++) {
            this.print();
        }
        this.close();
    }
}
