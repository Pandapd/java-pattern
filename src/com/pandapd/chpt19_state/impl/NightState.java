package com.pandapd.chpt19_state.impl;

import com.pandapd.chpt19_state.Context;
import com.pandapd.chpt19_state.State;

/**
 * 表示白天的状态类
 */
public class NightState implements State {

    // 唯一实例
    private static NightState singleton = new NightState();
    private NightState() {}
    public static NightState getInstance() {
        return singleton;
    }

//    @Override
//    public void doClock(Context context, int hour) {
//        if (hour >= 9 && hour < 17) {
//            context.changeState(DayState.getInstance());
//        }
//    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter(this.toString() + "紧急情况！使用金库");
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
        return "[夜晚]";
    }
}
