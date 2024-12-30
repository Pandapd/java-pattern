package com.pandapd.chpt14_chain_of_responsibility.handler;

import com.pandapd.chpt14_chain_of_responsibility.Trouble;

public abstract class Support {
    // 下一个处理者
    private Support next;
    private String name;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "['" + name + "\']";
    }

    public final void handle(Trouble t) {

        Support s = this;
        for (; s != null; s = s.next) {
            if (s.isSupport(t)) {
                s.resolve(t);
                System.out.println(s.toString() + " resolved " + t.toString());
                break;
            }
        }
        if (null == s) {
            System.out.println(t.toString() + " can not be resolved!!!");
        }
    }

    protected abstract void resolve(Trouble t);

    protected abstract boolean isSupport(Trouble t);
}
