package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.JN
 */
public class Modern_Util_Jn
implements wp_0 {

    public final short Uz0;
    public final CH0 lpt6;
    public cd0_2 HP = null;

    public Modern_Util_Jn(short s, CH0 cH0) {
        this.Uz0 = s;
        this.lpt6 = cH0;
    }

    public final short ik() {
        return this.Uz0;
    }

    @Override
    public final CH0 eU() {
        return this.lpt6;
    }

    @Override
    public final cd0_2 oV() {
        return this.HP;
    }

    @Override
    public final void pD(cd0_2 cd0_22) {
        this.HP = cd0_22;
    }
}


