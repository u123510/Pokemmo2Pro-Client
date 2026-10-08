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

public class DoorTriggerTileBehavior extends BaseTileBehavior {
    @Override
    public final boolean zF(LT lT, bi0_1 bi0_12, byte by, byte by2) {
        if (!(bi0_12 instanceof E90)) {
            return true;
        }
        return !((E90)bi0_12).iz0((byte)4) || (by2 & 0x40) == 0;
    }
}

