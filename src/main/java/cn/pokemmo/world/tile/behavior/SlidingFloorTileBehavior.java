package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SlidingFloorTileBehavior extends BaseTileBehavior {
    public final int lp;
    public final int N70;
    public final int u;
    public final w9_0 Ql;

    public SlidingFloorTileBehavior(w9_0 w9_02, int n, int n2, int n3) {
        this.Ql = w9_02;
        this.lp = n;
        this.N70 = n2;
        this.u = n3;
    }

    @Override
    public final boolean fu(LT lT, bi0_1 bi0_12, byte by) {
        if (by != 1) return false;
        if (bi0_12 != tw0_0.e60.jB0) return false;

        int current = this.u;
        if (current != -1 && current != this.Ql.l70[this.lp]) return true;

        w9_0 owner = this.Ql;
        int side = this.lp;
        int required = owner.Oa0[side];
        int present = current == -1 ? 0 : 1;
        if (required == -1 || required != present) return true;

        short[][] entries = owner.Ce[side];
        short[] selected = entries[this.N70];
        for (int i = 0; i < entries.length; ++i) {
            if (i == this.N70) continue;
            short[] candidate = entries[i];
            short marker = candidate[2];
            if (marker == -1 || marker == owner.l70[side]) {
                selected = candidate;
                break;
            }
        }

        zv_2 pose = bi0_12.ba0.Xr();
        bi0_12.ba0.Xr().Y30 = 1;
        owner.Qo0[side] = true;
        owner.lK[side].sC0(2, false, null);
        tw0_0.rl.fw = true;
        _finally.HG().dH0(new g0_0(bi0_12), 0.15f);
        float delay = (float)(nk_0.uj.h3 + 150 + nk_0.aA.h3 + 100) / 1000.0f;
        _finally.HG().dH0(new Wo0((DD)(Object)this, bi0_12), delay);
        owner.Hw0[side] = new oa_2((DD)(Object)this, bi0_12, selected, pose);
        return true;
    }
}
