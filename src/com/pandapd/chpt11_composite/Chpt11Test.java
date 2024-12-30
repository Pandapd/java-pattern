package com.pandapd.chpt11_composite;

public class Chpt11Test {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory usr = new Directory("usr");
        Directory tmp = new Directory("tmp");
        root.add(usr);
        root.add(tmp);
        File f1 = new File(20, "1.txt");
        usr.add(f1);
        File f2 = new File(350, "auto_run.java");
        usr.add(f2);
        root.showList();
        System.out.println("===================");
        System.out.println(root.getPath());
        System.out.println(usr.getPath());
        System.out.println(f2.getPath());
    }
}
