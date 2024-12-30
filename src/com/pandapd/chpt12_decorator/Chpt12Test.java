package com.pandapd.chpt12_decorator;

public class Chpt12Test {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("HELLO WORLD");
        Display d2 = new SideBorder(d1, '*');
        Display d3 = new FullBorder(d2);
        d1.display();
        System.out.println("$$$$$$$$$$$$$$$$");
        d2.display();
        System.out.println("$$$$$$$$$$$$$$$$");
        d3.display();
        System.out.println("$$$$$$$$$$$$$$$$");
        Display d4 = new SideBorder(new FullBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("MAKE MORE!")
                                ), '*')
                )
        ), '/');
        d4.display();
        System.out.println("$$$$$$$$$$$$$$$$");
        Display d5 = new UpDownBorder(d1, '@');
        d5.display();
        System.out.println("$$$$$$$$$$$$$$$$");

        MutiStringDisplay d6 = new MutiStringDisplay();
        d6.addToList("zhangsan");
        d6.addToList("HELLO");
        d6.addToList("ni hao zhong guo bei jing");
        System.out.println("$$$$$$$$$$$$$$$$");
        Display d7 = new FullBorder(new UpDownBorder(d6, '&'));
        d7.display();
    }
}
