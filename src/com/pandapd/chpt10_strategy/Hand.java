package com.pandapd.chpt10_strategy;

public enum Hand {
    ROCK(0, "石头"),
    PAPER(1, "布"),
    SCISSORS(2, "剪刀");
    private int id;
    private String desc;

    public String getDesc() {
        return desc;
    }

    Hand(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static Hand getHand(int id) {
        return Hand.values()[id];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this.id == h.id) {
            return 0;
        } else if (this.id > h.id) {
            return 1;
        } else {
            return -1;
        }
    }
}
