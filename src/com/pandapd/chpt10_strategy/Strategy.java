package com.pandapd.chpt10_strategy;

/**
 * 策略接口
 */
public abstract class Strategy {
    public abstract void study(boolean win);
    public abstract Hand nextHand();
}
