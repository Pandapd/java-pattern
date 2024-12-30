package com.pandapd.chpt10_strategy;

/**
 * 参加猜拳的角色
 */
public class Player {
    private String name;

    /**
     * 用来看看历史记录的矩阵
     * @return
     */
    public Strategy getStrategy() {
        return strategy;
    }

    private Strategy strategy;

    public String getName() {
        return name;
    }

    // 统计相关属性
    /*胜场*/
    private int winCount;
    /*负场*/
    private int loseCount;
    /*平场*/
    private int evenCount;
    /*总场*/
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        evenCount++;
        gameCount++;
    }

    @Override
    public String
    toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", 采取策略为" + strategy.getClass().getSimpleName() +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", evenCount=" + evenCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
