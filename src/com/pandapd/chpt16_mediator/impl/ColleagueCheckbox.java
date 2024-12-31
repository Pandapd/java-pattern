package com.pandapd.chpt16_mediator.impl;

import com.pandapd.chpt16_mediator.Colleague;
import com.pandapd.chpt16_mediator.Mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {

    private Mediator mediator;

    public ColleagueCheckbox(String label, boolean state, CheckboxGroup group) {
        super(label, state, group);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
