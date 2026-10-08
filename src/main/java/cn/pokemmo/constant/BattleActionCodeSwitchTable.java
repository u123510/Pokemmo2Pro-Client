package cn.pokemmo.constant;

import f.zq_2;

public abstract class BattleActionCodeSwitchTable {
    public static final int[] eK;

    static {
        zq_2[] values = zq_2.sc.clone();
        int maxId = 0;
        for (zq_2 value : values) {
            if (value.vp0 > maxId) {
                maxId = value.vp0;
            }
        }
        eK = new int[maxId + 1];
        try {
            eK[zq_2.qz.vp0] = 1;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            eK[zq_2.Z5.vp0] = 2;
        } catch (NoSuchFieldError ignored) {
        }
        try {
            eK[zq_2.J2.vp0] = 3;
        } catch (NoSuchFieldError ignored) {
        }
    }
}
