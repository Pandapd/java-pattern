package com.pandapd.chpt14_chain_of_responsibility.handler;

import com.pandapd.chpt14_chain_of_responsibility.Trouble;

/**
 * 处理特殊编号请求的Support类
 */
public class SpecialSupport extends Support {
    private int special_num;

    public int getSpecial_num() {
        return special_num;
    }

    public void setSpecial_num(int special_num) {
        this.special_num = special_num;
    }

    public SpecialSupport(String name, int special_num) {
        super(name);
        this.special_num = special_num;
    }

    @Override
    protected void resolve(Trouble t) {

    }

    @Override
    protected boolean isSupport(Trouble t) {
        return special_num == t.getNum();
    }
}
