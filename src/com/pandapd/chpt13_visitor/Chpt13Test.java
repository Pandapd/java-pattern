package com.pandapd.chpt13_visitor;

import com.pandapd.chpt13_visitor.entry.Directory;
import com.pandapd.chpt13_visitor.entry.File;
import com.pandapd.chpt13_visitor.visitor.ListVisitor;
import com.pandapd.chpt13_visitor.visitor.Visitor;

public class Chpt13Test {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory usrDir = new Directory("usr");
        Directory tmpDir = new Directory("tmp");
        rootDir.add(usrDir);
        rootDir.add(tmpDir);

        File f1 = new File("1.txt", 5);
        File f2 = new File("graduation.mp3", 3000);
        usrDir.add(f1);
        usrDir.add(f2);

        Visitor v = new ListVisitor();
        rootDir.accept(v);
    }

}
