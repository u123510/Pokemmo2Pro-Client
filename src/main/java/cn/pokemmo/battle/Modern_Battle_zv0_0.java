package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.zv0_0
 */
public class Modern_Battle_zv0_0 {

    public final Y30 GS;
    public final gn_0 TQ;
    public final gn_0 sm0;

    public Modern_Battle_zv0_0(Y30 y30, gn_0 gn_02, gn_0 gn_03) {
        if (gn_03 == null) {
            gn_03 = gn_02;
        }
        this.GS = y30;
        this.TQ = zv0_0.Cb(gn_02);
        this.sm0 = zv0_0.Cb(gn_03);
    }

    public static gn_0 Cb(gn_0 gn_02) {
        if (gn_0.WHITE.equals(gn_02)) {
            gn_02 = null;
        }
        return gn_02;
    }
}


