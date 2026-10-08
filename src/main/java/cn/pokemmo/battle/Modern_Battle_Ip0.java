package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Ip0
 */
public class Modern_Battle_Ip0 {

    public static final Ip0 IL0;
    public static final bm0_1 tM;
    public final byte Gr0;
    public final int Z4;

    public Modern_Battle_Ip0(byte by, int n) {
        this.Gr0 = by;
        this.Z4 = n;
    }

    static {
        IL0 = new Ip0((byte) 0, 0);
        Ip0[] all = new Ip0[]{
                IL0,
                new Ip0((byte) 1, 2100),
                new Ip0((byte) 3, 2102),
                new Ip0((byte) 4, 2103),
                new Ip0((byte) 5, 2104),
                new Ip0((byte) 6, 2105),
                new Ip0((byte) 7, 2106),
                new Ip0((byte) 8, 2107),
                new Ip0((byte) 9, 2103),
                new Ip0((byte) 10, 2109)
        };
        Ip0[] values = all.clone();
        tM = new bm0_1();
        for (Ip0 value : values) {
            tM.gE0(value.Gr0, value);
        }
    }
}

