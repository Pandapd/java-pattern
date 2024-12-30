package com.pandapd.chpt14_chain_of_responsibility.handler;

import com.pandapd.chpt14_chain_of_responsibility.Trouble;

/**
 * 只能处理奇数的Support类
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected void resolve(Trouble t) {

    }

    @Override
    protected boolean isSupport(Trouble t) {
        return  1 == (t.getNum() % 2);
    }
}
