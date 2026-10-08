package cn.pokemmo.battle.stage;

import f.tc_1;

/**
 * 对战场景阶段 Switch 跳转合成映射表
 */
public abstract class BattleStageSwitchTable {
    public static final int[] aux = new int[11];

    static {
        try {
            aux[tc_1.dX.wx0] = 1;
        } catch (NoSuchFieldError ignored) {
        }

        try {
            aux[tc_1.cD0.wx0] = 2;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
