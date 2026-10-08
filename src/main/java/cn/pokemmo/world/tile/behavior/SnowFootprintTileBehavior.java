/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.LT;
import f.bi0_1;
import f.hc0_0;
import f.nt_1;
import f.tw0_0;

/*
 * Renamed from f.t80
 */
public class SnowFootprintTileBehavior extends BaseTileBehavior {
    @Override
    public final void K40(bi0_1 bi0_12, LT lT) {
        if (bi0_12.vx0() && !lT.lW() && !tw0_0.LD0.nv()) {
            hc0_0 hc0_03 = new hc0_0(lT);
            lT.ZD0(hc0_03);
        }
    }

    @Override
    public final boolean Xc() {
        return false;
    }
}

