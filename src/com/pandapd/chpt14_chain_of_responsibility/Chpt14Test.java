package com.pandapd.chpt14_chain_of_responsibility;

import com.pandapd.chpt14_chain_of_responsibility.handler.*;

public class Chpt14Test {
    public static void main(String[] args) {
        Support s1 = new NoSupport("A");
        Support s2 = new LimitSupport("B",100);
        Support s3 = new OddSupport("C");
        Support s4 = new SpecialSupport("D", 132);

        s1.setNext(s2).setNext(s3).setNext(s4);
        // 提出一些编号请求
        for (int i = 0; i < 300; i+=33) {
            s1.handle(new Trouble(i));
        }
    }
}
