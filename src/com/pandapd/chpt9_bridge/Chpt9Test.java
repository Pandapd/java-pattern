package com.pandapd.chpt9_bridge;

public class Chpt9Test {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("AAA"));
        Display d2 = new Display(new StringDisplayImpl("BBB"));
        MutiDisplay d3 = new MutiDisplay(new StringDisplayImpl("CCC"));
        d1.display();
        System.out.println("======================");
        d2.display();
        System.out.println("======================");
        d3.display();
        System.out.println("======================");
        d3.mutiDisplay(5);

        LineMutiDisplay d4 = new LineMutiDisplay(new CharacterDisplayImpl('|', '-', '#'));
        System.out.println("======================");
        d4.display();
        System.out.println("======================");
        d4.mutiDisplay(5);
        System.out.println("======================");
        d4.lineMutiDisplay(6);
    }
}
