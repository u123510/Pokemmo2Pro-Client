/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import f.LT;
import f.gj_0;
import f.hk0_1;
import f.hl0_1;

/*
 * Renamed from f.Qc0
 */
public class LightingTextureDecalBlender extends BaseTerrainTileBlender {
    public final long nH = hk0_1.lQ();
    public final int XB;
    public final LT Ei;

    public LightingTextureDecalBlender(LT lT) {
        this.XB = 120;
        this.Ei = lT;
    }

    @Override
    public final void x8(hl0_1 hl0_12, int n, int n2, int n3) {
        if (n == 10) {
            return;
        }
        int n4 = this.XB;
        long l = n4;
        long l2 = hk0_1.KG - this.nH;
        if (l > l2) {
            return;
        }
        if (l2 > l) {
            if (l2 < (long)(n4 + 150)) {
                n4 = 1;
                if (n == 0) {
                    return;
                }
            } else if (l2 < (long)(n4 + 300)) {
                n4 = 2;
                if (n == 0) {
                    return;
                }
            } else {
                n4 = 3;
                if (n == 0) {
                    return;
                }
            }
            LightingTextureDecalBlender qc0_02 = this;
            short s = (short)((short)(qc0_02.Ei.xl0() / 4 * 4) + n4);
            LT lT = qc0_02.Ei;
            lT.HU(lT.uj(), s);
        }
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.nH > (long)(500 + this.XB);
    }
}

