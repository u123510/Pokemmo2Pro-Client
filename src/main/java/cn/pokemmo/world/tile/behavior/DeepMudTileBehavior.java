/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.KF;
import f.LT;
import f.WB;
import f.bi0_1;
import f.nt_1;
import f.tw0_0;
import f.zv_2;

public class DeepMudTileBehavior extends BaseTileBehavior {
    @Override
    public final void K40(bi0_1 bi0_12, LT lT) {
        bi0_1 bi0_13 = bi0_12;
        bi0_13.getClass();
        if (!(bi0_13 instanceof KF) && !tw0_0.LD0.nv()) {
            bi0_1 bi0_14 = bi0_12;
            zv_2 zv_22 = bi0_14.ba0;
            byte by = zv_22.Y30;
            byte by2 = zv_22.Fc0;
            boolean bl = bi0_14.oI0();
            WB wB2 = new WB(by, by2, bl);
            lT.ZD0(wB2);
        }
    }

    @Override
    public final boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        if (bi0_12.vx0() && bi0_12.Ou()) {
            short s = 1663;
            tw0_0.RE0.d00(true, (byte)2, s, 0.0f);
        }
        return false;
    }
}

