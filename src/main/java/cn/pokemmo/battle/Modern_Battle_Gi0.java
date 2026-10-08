package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.GI0
 */
public class Modern_Battle_Gi0 {

    public static final GI0 FP;
    public static final GI0 lN;
    public static final GI0 Xd0;
    public static final GI0[] CON;
    public final byte ST;
    public final int FM;

    public Modern_Battle_Gi0(int n, int n2) {
        this.FM = n;
        this.ST = (byte)n2;
        if (n2 == this.OI()) {
            return;
        }
        throw new RuntimeException();
    }

    static {
        GI0 gI04 = new GI0(0, 0);
        FP = gI04;
        GI0 gI05 = new GI0(1, 1);
        lN = gI05;
        GI0 gI06 = new GI0(2, 2);
        Xd0 = gI06;
        CON = (GI0[])new GI0[]{gI04, gI05, gI06}.clone();
    }

    public final int OI() {
        return this.FM;
    }
}


