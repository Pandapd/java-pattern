package com.pandapd.chpt14_chain_of_responsibility.handler;

import com.pandapd.chpt14_chain_of_responsibility.Trouble;

/**
 * 所有请求都不能处理的Support类
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    /**
     * 因为这里没有具体的解决方法，所以暂时为空方法
     * @param t
     */
    @Override
    protected void resolve(Trouble t) {

    }

    @Override
    protected boolean isSupport(Trouble t) {
        return false;
    }
}
