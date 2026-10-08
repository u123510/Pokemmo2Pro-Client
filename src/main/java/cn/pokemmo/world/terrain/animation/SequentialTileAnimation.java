/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.terrain.animation;

import f.*;

import f.dd_1;
import f.nk_0;
import f.rg0_2;

public class SequentialTileAnimation
extends BaseTerrainTileAnimation {
    public SequentialTileAnimation(byte by, byte by2, nk_0 ... nk_0Array) {
        super(by, by2, nk_0Array);
        if (nk_0Array.length != 0) {
            return;
        }
        throw new RuntimeException();
    }

    @Override
    public final nk_0 Gs(int n, int n2, int n3) {
        return this.mH0[rg0_2.r4(this.mH0.length)];
    }
}

