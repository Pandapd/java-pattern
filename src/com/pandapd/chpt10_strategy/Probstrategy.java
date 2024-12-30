package com.pandapd.chpt10_strategy;

import java.util.Random;

public class Probstrategy extends Strategy{
    private Random random;

    public Probstrategy(int seed) {
        random = new Random(seed);
    }

    // 假设之前两局都是出的石头（0）
    private int prevHandValue = 1;
    private int currHandValue = 1;
    // 前一局和现在这局总共有3x3种可能，每个元素的值表示赢的次数
    private int[][] history = {{1,1,1},{1,1,1},{1,1,1}};

    public int[][] getHistory() {
        return history;
    }

    /**
     * 更新胜利场数
     * @param win
     */
    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currHandValue]++;
        } else {
            // 如果输了，表示出另外两种手势可能会赢，这里都给他加一
            history[prevHandValue][(currHandValue+1) % 3]++;
            history[prevHandValue][(currHandValue+2) % 3]++;
        }
    }

    @Override
    public Hand nextHand() {
        // 选出随机数
        // getSum表示当前出0，那么就选择"历史上出这个0时候下一局出什么"所有的值的和作为边界[0][0],[0][1],[0][2];
        int bet = random.nextInt(getSum(currHandValue));
        // 这把要出啥
        int handValue;
        // 随机数在按比例分配后哪个范围区间，就选哪个出手。
        // 比如，[0][0]=3,[0][1]=5,[0][2]=7，就在[0-15)之间选数字，落在【0-3）就出石头
        if (bet < history[currHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currHandValue][0] + history[currHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }

        // 更新一下当前的出手
        prevHandValue = currHandValue;
        currHandValue = handValue;

        return Hand.getHand(handValue);
    }

    /**
     * 计算之前第一次出currHandValue总共赢了多少次
     * @param currHandValue
     * @return
     */
    private int getSum(int currHandValue) {
        int sum = 0;
        for (int i = 0; i < history.length; i++) {
            sum += history[currHandValue][i];
        }
        return sum;
    }


}
