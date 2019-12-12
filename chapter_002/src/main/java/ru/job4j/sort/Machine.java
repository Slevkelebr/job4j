package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - price;
        int indexCoins = 0;
        for ( ; cash != 0; size++) {
            if (cash < coins[indexCoins]) {
                indexCoins++;
            }
            cash -= coins[indexCoins];
            rsl[size] = coins[indexCoins];
        }
        return Arrays.copyOf(rsl, size);
    }
}
