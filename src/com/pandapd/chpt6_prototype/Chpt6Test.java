package com.pandapd.chpt6_prototype;

public class Chpt6Test {
    public static void main(String[] args) {

        String underlineStyleProtoName = "UNDERLINE";
        String boxStyleProtoName = "BOX";

        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('_');
        manager.register(underlineStyleProtoName, underlinePen);
        MessageBox messageBox = new MessageBox('*');
        manager.register(boxStyleProtoName, messageBox);


        Product clone_product1 = manager.create(underlineStyleProtoName);
        Product clone_product2 = manager.create(boxStyleProtoName);

        clone_product1.use("I am Underline");
        clone_product2.use("I IN BOX");

    }
}
