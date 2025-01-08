package com.pandapd.chpt19_state.impl;

import com.pandapd.chpt19_state.Context;
import com.pandapd.chpt19_state.State;

/**
 * 表示白天的状态类
 */
public class DayState implements State {

    // 唯一实例
    private static DayState singleton = new DayState();
    private DayState() {}
    public static DayState getInstance() {
        return singleton;
    }

//    @Override
//    public void doClock(Context context, int hour) {
//        if (hour < 9 || hour >= 17) {
//            context.changeState(NightState.getInstance());
//        }
//    }

    @Override
    public void doUse(Context context) {
        context.recordLog(this.toString() + "使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter(this + "按下警铃");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter(this + "正常通话");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
