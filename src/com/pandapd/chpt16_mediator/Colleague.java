package com.pandapd.chpt16_mediator;

/**
 * 同事接口，是在一个系统中需要相互协作的组件
 */
public interface Colleague {
    // 设置共同的裁决者
    void setMediator(Mediator mediator);
    // 设置*由仲裁者*下达的指示
    void setColleagueEnabled(boolean enabled);
}
