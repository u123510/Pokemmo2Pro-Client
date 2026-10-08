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
import f.nk_0;
import f.nt_1;

public class BridgeCrossTileBehavior extends BaseTileBehavior {
    @Override
    public final boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        if (!(bi0_12 instanceof E90)) {
            return false;
        }
        bi0_12.il0.LE(nk_0.lPt3);
        return false;
    }
}

