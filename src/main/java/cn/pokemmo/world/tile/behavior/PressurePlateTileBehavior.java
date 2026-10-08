/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.E90;
import f.LT;
import f.bi0_1;
import f.nt_1;

/*
 * Renamed from f.Kk
 */
public class PressurePlateTileBehavior extends BaseTileBehavior {
    public final boolean J40;

    public PressurePlateTileBehavior(boolean bl) {
        this.J40 = bl;
    }

    @Override
    public final boolean zF(LT lT, bi0_1 bi0_12, byte by, byte by2) {
        if (!(bi0_12 instanceof E90)) {
            return true;
        }
        boolean bl = (by2 & 0x40) != 0;
        if (!bl && this.J40 && (by == 1 || by == 0)) {
            return true;
        }
        if (!(bl || this.J40 || by != 3 && by != 2)) {
            return true;
        }
        return !((E90)bi0_12).iz0((byte)2);
    }
}

