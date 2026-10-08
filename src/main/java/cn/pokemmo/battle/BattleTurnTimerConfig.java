package cn.pokemmo.battle;

import f.uy_0;

public class BattleTurnTimerConfig {
    public static final BattleTurnTimerConfig vY;
    public static final int[] t2;
    public static final int[] Lf0;
    public final short[] L3;
    public final uy_0[] Yj;

    static {
        vY = new BattleTurnTimerConfig();
        t2 = new int[]{300, 30, 30, 30};
        Lf0 = new int[]{882, 70, 45, 45};
    }

    public BattleTurnTimerConfig() {
        this.L3 = new short[64];
        this.Yj = new uy_0[4];
    }

    public void t9(byte b) {
        if (b >= 0 && b < this.L3.length) {
            short s = this.L3[b];
        }
    }
}
