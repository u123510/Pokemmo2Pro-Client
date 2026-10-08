package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Us0
 */
public class Modern_Battle_Us0 {

    public static final bm0_1 TJ0;
    public final byte KH0;
    public final int HE0;

    public Modern_Battle_Us0(byte key, int textId) {
        this.KH0 = key;
        this.HE0 = textId;
    }

    static {
        Us0[] values = {new Us0((byte) 0, 151000), new Us0((byte) 1, 190113)};
        TJ0 = new bm0_1();
        for (Us0 value : values.clone()) {
            TJ0.gE0(value.KH0, value);
        }
    }

    public final String toString() {
        return sm0_0.cU.l90(this.HE0) ? sm0_0.c0(this.HE0) : super.toString();
    }
}

