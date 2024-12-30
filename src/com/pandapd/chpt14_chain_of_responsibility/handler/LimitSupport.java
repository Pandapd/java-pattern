package com.pandapd.chpt14_chain_of_responsibility.handler;

import com.pandapd.chpt14_chain_of_responsibility.Trouble;

/**
 * 只能处理某个界限以下的请求的Support类
 */
public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected void resolve(Trouble t) {

    }

    @Override
    protected boolean isSupport(Trouble t) {
        return t.getNum() < limit;
    }
}
