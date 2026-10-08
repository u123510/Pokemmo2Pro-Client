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
import f.tw0_0;

public class ConveyorBeltTileBehavior extends BaseTileBehavior {
    @Override
    public final boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        if (!(bi0_12 instanceof E90)) {
            return false;
        }
        short s = -1;
        if (lT.xl0() >= 632 && lT.xl0() <= 638) {
            s = (short)(lT.xl0() - 570);
        }
        if (s == -1) {
            s = 62;
        }
        tw0_0.RE0.Hq0((byte)1, s);
        return false;
    }
}

