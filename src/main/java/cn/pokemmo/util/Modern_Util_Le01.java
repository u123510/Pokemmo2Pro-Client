package cn.pokemmo.util;

import f.*;
import cn.pokemmo.world.entity.target.PlayerTargetSelector;

/**
 * 现代化重构类 - 原始混淆类: f.le0_1
 */
public class Modern_Util_Le01
extends VH {

    public Modern_Util_Le01() {
        super();
    }

    public PlayerTargetSelector ea0;
    public float ma;

    @Override
    public final void Qc() {
        this.ma = 0.0f;
    }

    @Override
    public final boolean Vq0(float f, float f2) {
        boolean bl;
        float f3;
        float f4 = f2 - f;
        f = f4 - this.ma;
        this.ma = f4;
        f2 = lg_0.S4.Kr0();
        float f5 = lg_0.S4.sD0();
        PlayerTargetSelector ji_12 = this.ea0;
        if (f2 > f5) {
            f2 = f5;
        }
        PlayerTargetSelector ji_13 = ji_12;
        f5 = f / f2;
        f5 = ji_13.Un * f5;
        if (!ji_13.bu0()) {
            bl = false;
        } else {
            PlayerTargetSelector ji_14 = ji_12;
            BJ0 bJ0 = ji_14.Q0;
            bJ0.Xw(ji_12.Bf0.np(bJ0.jd0).Fg0(f5));
            if (ji_14.Jc) {
                ji_12.Q0.ye(true);
            }
            bl = true;
        }
        return bl;
    }
}


