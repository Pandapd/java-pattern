package com.pandapd.chpt16_mediator.impl;

import com.pandapd.chpt16_mediator.Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 登录框，也作为仲裁者Mediator的实现类
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {

    // 登录框的Colleague组件
    private ColleagueCheckbox guestCheck;
    private ColleagueCheckbox loginCheck;
    private ColleagueTextField userText;
    private ColleagueTextField passwordText;
    private ColleagueButton okButton;
    private ColleagueButton cancelButton;

    public LoginFrame(String title) {
        /* 设置登录框各个组件布局 */
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(4, 100));
        // 生成Colleagues
        createColleagues();
        add(guestCheck);
        add(loginCheck);
        add(userText);
        add(passwordText);
        add(okButton);
        add(cancelButton);
        // 设置初始启用/停止状态
        colleagueChanged();
        // 显示
        pack();
        setVisible(true);

    }

    @Override
    public void createColleagues() {
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        guestCheck = new ColleagueCheckbox("Guest", true, checkboxGroup);
        loginCheck = new ColleagueCheckbox("Login", false, checkboxGroup);
        userText = new ColleagueTextField("", 10);
        passwordText = new ColleagueTextField("", 10);
        passwordText.setEchoChar('*');
        okButton = new ColleagueButton("OK");
        cancelButton = new ColleagueButton("Cancel");

        guestCheck.setMediator(this);
        loginCheck.setMediator(this);
        userText.setMediator(this);
        passwordText.setMediator(this);
        okButton.setMediator(this);
        cancelButton.setMediator(this);

        guestCheck.addItemListener(guestCheck);
        loginCheck.addItemListener(loginCheck);
        userText.addTextListener(userText);
        passwordText.addTextListener(passwordText);

        // 一按按钮就退出
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    /**
     * 接受各个Colleague状态改变的通知然后进行启用/禁用
     */
    @Override
    public void colleagueChanged() {
        if (guestCheck.getState()) {
            userText.setColleagueEnabled(true);
            passwordText.setColleagueEnabled(false);
            okButton.setColleagueEnabled(userText.getText().length() >= 4);
        } else {
            passwordText.setColleagueEnabled(false);
            userPassChanged();
        }

    }

    /**
     * 根据文本变化下达状态启用/禁用通知
     */
    private void userPassChanged() {
        int nameLength = userText.getText().length();
        if (nameLength > 0) {
            // 输入长度大于等于1才可以输入密码
            passwordText.setColleagueEnabled(true);
            // 用户名和密码长度都大于4， OK按钮才可以使用
            okButton.setColleagueEnabled(nameLength >= 4 && passwordText.getText().length() >= 4);
        } else {
            passwordText.setColleagueEnabled(false);
            okButton.setColleagueEnabled(false);
        }
    }


    /**
     * 点击的结果
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
