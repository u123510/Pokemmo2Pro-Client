/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.LT;
import f.bi0_1;
import f.nt_1;
import f.wy0_0;

/*
 * Renamed from f.rk0
 */
public class CrackedFloorTileBehavior extends BaseTileBehavior {
    public final wy0_0 Ud;
    public final int OB0;

    public CrackedFloorTileBehavior(wy0_0 wy0_02, int n) {
        this.Ud = wy0_02;
        this.OB0 = n;
    }

    @Override
    public final boolean zF(LT lT, bi0_1 bi0_12, byte by, byte by2) {
        return this.Ud.nr0 != this.OB0;
    }
}

