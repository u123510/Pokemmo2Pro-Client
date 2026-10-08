package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.w50_0
 */
public class Modern_Battle_w50_0 {

    public final Y30 bW;
    public final gn_0 Fz0;
    public final gn_0 jL0;

    public Modern_Battle_w50_0(Y30 y30, gn_0 gn_02, gn_0 gn_03) {
        if (gn_03 == null) {
            gn_03 = gn_02;
        }
        this.bW = y30;
        this.Fz0 = w50_0.df0(gn_02);
        this.jL0 = w50_0.df0(gn_03);
    }

    public static gn_0 df0(gn_0 gn_02) {
        if (gn_0.WHITE.equals(gn_02)) {
            gn_02 = null;
        }
        return gn_02;
    }
}


