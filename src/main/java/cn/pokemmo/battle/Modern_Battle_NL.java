package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.NL
 */
public class Modern_Battle_NL {

    public static final NL bU;
    public static final NL n70;
    public static final NL Mt;
    public static final NL cOM1;
    public static final NL Ws;
    public static final NL g40;
    public static final bm0_1 rE0;
    public final byte xG0;

    public Modern_Battle_NL(byte value) {
        super();
        this.xG0 = value;
    }

    static {
        Object ignored = da_2.X30;
        bU = new NL((byte) 0);
        n70 = new NL((byte) 1);
        Mt = new NL((byte) 2);
        cOM1 = new NL((byte) 3);
        Ws = new NL((byte) 4);
        g40 = new NL((byte) -128);
        rE0 = new bm0_1();
        NL[] values = new NL[]{bU, n70, Mt, cOM1, Ws, g40};
        for (NL value : values) {
            rE0.gE0(value.xG0, value);
        }
    }

    public final int bB0() {
        return this.xG0 * 2 + 100100;
    }
}

