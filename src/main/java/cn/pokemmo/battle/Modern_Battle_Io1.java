package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.io_1
 */
public class Modern_Battle_Io1
extends Sp0 {

    public Modern_Battle_Io1() {
        super();
    }

    public static final io_1 uO = new io_1();

    @Override
    public final int M3(eo0_0 eo0_02, eo0_0 eo0_03) {
        if (eo0_02.D() != eo0_03.D()) {
            return eo0_02.D() - eo0_03.D();
        }
        byte by = eo0_02.mE0;
        byte by2 = eo0_03.mE0;
        if (by != by2) {
            return by - by2;
        }
        return eo0_02.JJ().compareTo(eo0_03.JJ());
    }
}


