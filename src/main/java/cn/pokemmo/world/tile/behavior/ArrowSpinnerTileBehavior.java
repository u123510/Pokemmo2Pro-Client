/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.F90;
import f.LT;
import f.bi0_1;
import f.nk_0;
import f.nt_1;

/*
 * Renamed from f.Rw
 */
public class ArrowSpinnerTileBehavior extends BaseTileBehavior {
    @Override
    public final boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        F90 f90 = lT.F2().Xg0();
        if (f90 == null) {
            return false;
        }
        LT lT3 = lT;
        short s = lT3.Tz();
        short s2 = lT3.HR();
        lT3.S80();
        if (f90.Ub0(s, s2) == null) {
            return false;
        }
        return bi0_12.il0.Zw(lT, false, new nk_0[0]);
    }
}

