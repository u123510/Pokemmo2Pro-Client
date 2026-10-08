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

/*
 * Renamed from f.ei0
 */
public class HeightTransitionTileBehavior extends BaseTileBehavior {
    public final int COm6;
    public final float WO;

    public HeightTransitionTileBehavior(int n, float f) {
        this.COm6 = n;
        this.WO = f;
    }

    @Override
    public final void K40(bi0_1 bi0_12, LT lT) {
    }

    @Override
    public final int zd0(boolean bl) {
        return this.COm6;
    }

    @Override
    public final float Wk() {
        return this.WO;
    }
}

