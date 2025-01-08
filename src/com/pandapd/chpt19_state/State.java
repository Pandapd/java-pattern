package com.pandapd.chpt19_state;

/**
 * State中是进行操作的方法集合，它依赖当前的状态
 */
public interface State {
    // 设置时间(使用context统一进行状态迁移)
    // void doClock(Context context, int hour);
    // 使用金库
    void doUse(Context context);
    // 按下警铃
    void doAlarm(Context context);
    // 正常通话
    void doPhone(Context context);
}
