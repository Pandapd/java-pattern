package com.pandapd.chpt19_state;

import com.pandapd.chpt19_state.impl.StateEnum;

/**
 * Context接口负责
 * 1.设置时间，切换状态
 * 2.联系警报中心
 * 3.在警报中心记录日志
 */
public interface Context {
    void setClock(int hour);
    void changeState(int hour);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
