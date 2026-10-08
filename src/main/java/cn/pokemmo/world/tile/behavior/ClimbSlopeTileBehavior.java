/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.nt_1;
import f.t70_0;

public class ClimbSlopeTileBehavior extends BaseTileBehavior {
    public final byte Yl;
    public final byte pw0;

    public ClimbSlopeTileBehavior(byte by) {
        this.Yl = by;
        this.pw0 = t70_0.Kc0(by);
    }

    @Override
    public final boolean iI(byte by) {
        return by == this.Yl || by == this.pw0;
    }
}

