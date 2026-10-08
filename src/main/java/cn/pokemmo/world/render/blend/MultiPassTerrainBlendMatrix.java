/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import com.badlogic.gdx.graphics.Texture;
import f.QI;
import f.gj_0;
import f.hk0_1;
import f.hl0_1;

/*
 * Renamed from f.CoM5
 */
public class MultiPassTerrainBlendMatrix extends BaseTerrainTileBlender {
    public final long gN = hk0_1.lQ();
    public final int Qy0;
    public final int fV;
    public final byte LPT3;
    public final int Lb0;
    public int kI = 100;

    public MultiPassTerrainBlendMatrix(byte by, int n, int n2, int n3) {
        this.Qy0 = n;
        this.fV = n2;
        this.LPT3 = by;
        this.Lb0 = n3;
    }

    @Override
    public final void x8(hl0_1 hl0_12, int n, int n2, int n3) {
        if (n == 10) {
            return;
        }
        int n4 = this.Qy0;
        long l = hk0_1.KG - this.gN;
        if ((long)n4 > l) {
            return;
        }
        if (l > (long)(n4 = this.fV + n4)) {
            int n5 = this.kI;
            if (l < (long)(n4 + n5)) {
                int n6 = n;
                n = 2;
                if (n6 == 0) {
                    return;
                }
            } else if (l < (long)(n5 * 2 + n4)) {
                int n7 = n;
                n = 3;
                if (n7 == 0) {
                    return;
                }
            } else if (l < (long)(n5 * 3 + n4)) {
                int n8 = n;
                n = 4;
                if (n8 == 0) {
                    return;
                }
            } else {
                n = 0;
            }
            MultiPassTerrainBlendMatrix com5__12 = this;
            byte by = com5__12.LPT3;
            Texture texture = QI.Py.kN(by, com5__12.Lb0, false).li0(n).H8();
            float f = n2;
            float f2 = n3;
            hl0_12.CH0(texture, f, f2);
        } else if (n == 0) {
            MultiPassTerrainBlendMatrix com5__13 = this;
            byte by = com5__13.LPT3;
            Texture texture = QI.Py.kN(by, com5__13.Lb0, false).li0(1).H8();
            float f = n2;
            float f3 = n3;
            hl0_12.CH0(texture, f, f3);
        }
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.gN > (long)(this.kI * 4 + this.fV + this.Qy0);
    }
}

