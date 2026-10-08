package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.X4
 */
public abstract class Modern_Battle_X4 {

    public Modern_Battle_X4() {
        super();
    }

    public static short gA0(short s) {
        if (s >= 6000 && s < 7000) {
            s = (short)(s - 1000);
        }
        if (s >= 7000 && s < 8000) {
            s = (short)(s - 6000);
        }
        if (s == 1125) {
            return 1018;
        }
        return s;
    }

    public static short S90(short s) {
        if (s >= 5000 && s < 6000) {
            s = (short)(s + 1000);
        }
        if (s >= 1000 && s < 2000) {
            s = (short)(s + 6000);
        }
        if (s == 1018) {
            return 1125;
        }
        return s;
    }
}


