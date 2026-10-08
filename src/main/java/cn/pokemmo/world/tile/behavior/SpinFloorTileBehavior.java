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
import f.zr0_0;

public class SpinFloorTileBehavior extends BaseTileBehavior {
    public final int BU;
    public final int j60;
    public final /* synthetic */ zr0_0 lpT3;

    public SpinFloorTileBehavior(zr0_0 zr0_02, int n, int n2) {
        this.lpT3 = zr0_02;
        this.BU = n;
        this.j60 = n2;
    }

    @Override
    public final boolean aH(LT lT, bi0_1 bi0_12, byte by, byte by2) {
        if (!bi0_12.Ou()) {
            return false;
        }
        int n = this.j60;
        this.lpT3.mV[this.BU].tW(n, (E90)bi0_12);
        return true;
    }
}

