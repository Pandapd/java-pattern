package com.pandapd.chpt16_mediator.impl;

import com.pandapd.chpt16_mediator.Colleague;
import com.pandapd.chpt16_mediator.Mediator;
import com.pandapd.chpt16_mediator.Colleague;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * 文本框Colleague
 */
public class ColleagueTextField extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setBackground(enabled ? Color.PINK : Color.YELLOW);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
