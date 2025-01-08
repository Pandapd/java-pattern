package com.pandapd.chpt19_state.impl;

import com.pandapd.chpt19_state.State;

public enum StateEnum {
    DAY(0, DayState.getInstance(),"白天"),
    NIGHT(1, NightState.getInstance(), "夜晚"),
    NOON(2, NoonState.getInstance(), "午餐时间");
    private int id;
    private State state;
    private String desc;

    StateEnum(int id, State state, String desc) {
        this.id = id;
        this.state = state;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public State getState() {
        return state;
    }
}
