package com.pandapd.chpt9_bridge;

public class LineMutiDisplay extends MutiDisplay{

    public LineMutiDisplay(DisplayImpl di) {
        super(di);
    }

    public final void lineMutiDisplay(int lines) {
        for (int i = 1; i <= lines; i++) {
            mutiDisplay(i);
        }
    }
}
