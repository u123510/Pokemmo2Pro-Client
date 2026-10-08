/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.nt_1;

public class WaterfallTileBehavior extends BaseTileBehavior {
    public final byte yE0;

    public WaterfallTileBehavior(byte by) {
        this.yE0 = by;
    }

    @Override
    public final boolean iI(byte by) {
        return by == this.yE0;
    }
}

