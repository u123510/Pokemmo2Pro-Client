/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.LT;
import f._else;
import f.nt_1;

/*
 * Renamed from f.Fh
 */
public class DirectionalWarpTileBehavior extends BaseTileBehavior {
    @Override
    public final LT a0(_else else_, LT object, LT lT, byte by) {
        if (lT != null && !lT.LPt1() && Math.abs(((LT)object).S80() - lT.S80()) < 1.27f) {
            return lT;
        }
        if (((LT)object).gr0()) {
            LT lT2 = else_.gv((LT)object, by, 1);
            boolean bl = false;
            if (lT2 != null && lT2.gr0()) {
                bl = true;
                object = lT2;
            }
            Object object2 = object;
            short s = (short)((LT)object2).Ki().z;
            LT lT3 = else_.LB0((short)((LT)object).Ki().x, s, ((LT)object2).Ki().y);
            if (lT3 == null) {
                return null;
            }
            if (bl) {
                return lT3;
            }
            return else_.gv(lT3, by, 1);
        }
        if (lT == null) {
            return null;
        }
        LT lT4 = lT;
        float f = (float)lT4.Tz() + 0.5f;
        float f2 = (float)lT4.HR() + 0.5f;
        float f3 = ((LT)object).S80();
        return else_.pR(f, f2, f3);
    }
}

