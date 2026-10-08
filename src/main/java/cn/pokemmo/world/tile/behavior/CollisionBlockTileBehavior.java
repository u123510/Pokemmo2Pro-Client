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
import f.rj_1;

/*
 * Renamed from f.dh0
 */
public class CollisionBlockTileBehavior extends BaseTileBehavior {
    public final /* synthetic */ rj_1 B5;

    public CollisionBlockTileBehavior(rj_1 rj_12) {
        this.B5 = rj_12;
    }

    @Override
    public final boolean aH(LT lT, bi0_1 bi0_12, byte by, byte by2) {
        return (float)this.B5.az * 2.0f > lT.S80();
    }
}

