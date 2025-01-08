package com.pandapd.chpt19_state.impl;

import com.pandapd.chpt19_state.Context;
import com.pandapd.chpt19_state.State;

public class NoonState implements State {
    // 唯一实例
    private static NoonState singleton = new NoonState();
    private NoonState() {}
    public static NoonState getInstance() {
        return singleton;
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter(this + "紧急！使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter(this + "按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog(this + "通话录音");
    }

    @Override
    public String toString() {
        return "[午餐时间]";
    }
}
