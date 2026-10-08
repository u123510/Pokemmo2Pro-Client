package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.N50
 */
public abstract class Modern_Battle_N50 {

    public Modern_Battle_N50() {
        super();
    }

    public static final byte[] Fb = new byte[]{0, 4, 1, 3, 2};
    public static final byte[] DD = new byte[]{0, 4, 1, 3, 2, 10};

    public static boolean Aa(byte by) {
        return by == 0 || by == 1;
    }

    public static boolean Fc(byte by) {
        return by == 2 || by == 3 || by == 4;
    }

    public static String k10(byte by) {
        if (sm0_0.cU.l90(by = (byte)(by + 250000))) {
            return sm0_0.c0(by);
        }
        return GQ.ti("{STRING_", by, "}");
    }
}


