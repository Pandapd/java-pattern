package com.pandapd.chpt19_state.impl;

import com.pandapd.chpt19_state.Context;
import com.pandapd.chpt19_state.State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {

    private State state;
    // 时钟字符串
    private TextField clockText = new TextField(60);
    // 显示当前报警中心的操作
    private TextArea screenText = new TextArea(10, 60);
    private Button useButton = new Button("use vault");
    private Button alarmButton = new Button("PUSH ALARM");
    private Button callButton = new Button("phone call");
    private Button endButton = new Button("exit");

    /**
     * 绘制窗口
     * @param title 标题
     */
    public SafeFrame(String title) {
        super(title);
        state = DayState.getInstance();
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());
        add(clockText, BorderLayout.NORTH);
        clockText.setEditable(false);
        add(screenText, BorderLayout.CENTER);
        screenText.setEditable(false);
        Panel panel = new Panel();
        panel.add(useButton);
        panel.add(alarmButton);
        panel.add(callButton);
        panel.add(endButton);
        add(panel, BorderLayout.SOUTH);
        //显示
        pack();
        setVisible(true);

        useButton.addActionListener(this);
        alarmButton.addActionListener(this);
        callButton.addActionListener(this);
        endButton.addActionListener(this);
    }

    @Override
    public void setClock(int hour) {
        StringBuffer sb = new StringBuffer("现在的时间是 ");
        sb.append(hour<10 ? "0"+hour+":00" : hour+":00");
        clockText.setText(sb.toString());
        changeState(hour);
    }

    @Override
    public void changeState(int hour) {
        StateEnum stateEnum = getStateByTime(hour);
        State state = stateEnum.getState();
        if (state != this.state) {
            System.out.println("状态改变：" + this.state + "->" + state);
            this.state = state;
        }
    }

    private StateEnum getStateByTime(int hour) {
        if (hour >= 12 && hour < 13) {
            return StateEnum.NOON;
        } else if (hour >= 17 || hour < 9) {
            return StateEnum.NIGHT;
        } else {
            return StateEnum.DAY;
        }
    }

    @Override
    public void callSecurityCenter(String msg) {
        screenText.append("call!" + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        screenText.append("recording.." + msg + "\n");
    }

    /**
     * 按下按钮的监听动作
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == useButton) {
            state.doUse(this);
        } else if (e.getSource() == alarmButton) {
            state.doAlarm(this);
        } else if (e.getSource() == callButton) {
            state.doPhone(this);
        } else if (e.getSource() == endButton) {
            System.exit(0);
        } else {
            System.out.println("未识别的操作");
        }
    }
}
