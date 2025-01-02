package com.pandapd.chpt16_mediator.impl;

import com.pandapd.chpt16_mediator.Colleague;
import com.pandapd.chpt16_mediator.Mediator;

import java.awt.*;

/**
 * 按钮Colleague
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    // 带显示字符串的初始化
    public ColleagueButton(String text) {
        super(text);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 设置仲裁者通知的状态
     * @param enabled 仲裁者是否启用的状态
     */
    @Override
    public void setColleagueEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }
}
