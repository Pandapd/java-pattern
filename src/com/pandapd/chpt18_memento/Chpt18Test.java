package com.pandapd.chpt18_memento;

import com.pandapd.chpt18_memento.game.Gamer;
import com.pandapd.chpt18_memento.game.Memento;

import java.io.*;

/**
 *
 */
public class Chpt18Test {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null) {
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新游戏");
            memento = gamer.createMemento();
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("--------第" + i + "次投掷----------");
            System.out.println("当前Gamer状态: "+gamer);

            gamer.bet();

            /**
             * 钱多了存储快照，钱少了回档
             */
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("存档");
                memento = gamer.createMemento();
                saveMemento(memento); // 文件存档
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("回档中...");
                gamer.restoreMemento(memento);
            }
        }

    }

    private static void saveMemento(Memento memento) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("game.dat"));
            oos.writeObject(memento);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Memento loadMemento() {
        ObjectInputStream ois;
        Memento o = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("game.dat"));
            o = (Memento)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }
}
