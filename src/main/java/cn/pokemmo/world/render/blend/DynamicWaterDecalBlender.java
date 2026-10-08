/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import f.C8;
import f.LT;
import f.bi0_1;
import f.gj_0;
import f.hk0_1;
import f.hl0_1;
import f.nk_0;
import f.t70_0;
import f.tw0_0;

public class DynamicWaterDecalBlender extends BaseTerrainTileBlender {
    public final long pb0;
    public final LT hG0;
    public final bi0_1 KE;
    public final boolean VO;
    public final boolean tf;
    public final short[][][] hE0;
    public final short[][][] op0;
    public final short[][][] ss0;
    public final short[][][] MD;

    public DynamicWaterDecalBlender(LT object, bi0_1 bi0_12, boolean bl, boolean bl2) {
        this.pb0 = hk0_1.lQ();
        this.hE0 = new short[][][]{
                {{720, 721}, {728, 729}, {736, 737}},
                {{778, 779}, {786, 787}, {794, 795}},
                {{776, 777}, {784, 785}, {792, 793}}
        };
        this.op0 = new short[][][]{
                {{731, 732}, {739, 740}, {747, 748}},
                {{782, 783}, {790, 791}, {798, 799}},
                {{780, 781}, {788, 789}, {796, 797}}
        };
        this.ss0 = new short[][][]{
                {{640, 641}, {648, 649}, {656, 657}},
                {{642, 643}, {650, 651}, {658, 659}},
                {{644, 645}, {652, 653}, {660, 661}}
        };
        this.MD = new short[][][]{
                {{664, 665}, {672, 673}, {680, 681}},
                {{666, 667}, {674, 675}, {682, 683}},
                {{668, 669}, {676, 677}, {684, 685}}
        };
        this.hG0 = object;
        this.KE = bi0_12;
        this.VO = bl;
        this.tf = bl2;
        if (bl2) {
            this.UB0(0L);
        }
        if (bi0_12.Ou()) {
            tw0_0.rl.Am(true);
        }
    }
    @Override
    public final void x8(hl0_1 var1, int layer, int var3, int var4) {
        if (layer != 0) {
            return;
        }

        long elapsed = hk0_1.KG - this.pb0;
        int frame = 0;
        if (elapsed < (long)t70_0.li) {
            frame = this.tf ? 2 : 0;
        } else if (elapsed < 500L) {
            frame = 1;
        } else if (elapsed < 750L) {
            frame = this.tf ? 2 : 0;
        }

        this.UB0(elapsed);

        short[][][] tiles;
        if (this.hG0.F2().dw == 1) {
            tiles = (this.VO == this.tf) ? this.MD : this.ss0;
        } else {
            tiles = (this.VO == this.tf) ? this.op0 : this.hE0;
        }

        for (int dx = -1; dx < 1; ++dx) {
            for (int dy = -1; dy < 2; ++dy) {
                LT tile = this.hG0.F2().Fn(this.hG0.Tz() + dx, this.hG0.HR() + dy, 0);
                short region = tiles[frame][dy + 1][dx + 1];
                if (tile != null) {
                    tile.HU(tile.uj(), region);
                }
            }
        }
    }

    @Override
    public final boolean qR() {
        if (hk0_1.KG - this.pb0 > 1000L) {
            DynamicWaterDecalBlender d8 = this;
            d8.KE.uR().OA0.rB0();
            if (d8.tf) {
                if (this.KE.Ou()) {
                    tw0_0.rl.uh0((byte)3, false, false);
                    if (this.KE == tw0_0.e60.jB0) {
                        tw0_0.rl.Am(false);
                    }
                } else {
                    this.KE.il0.fY(nk_0.lpT8, false);
                }
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void UB0(long l) {
        block4: {
            int n;
            int n2;
            block6: {
                block7: {
                    block5: {
                        int n3 = t70_0.li;
                        if (l <= (long)n3 && !this.tf) break block4;
                        boolean bl = this.tf;
                        if (!bl) {
                            l -= (long)n3;
                        }
                        long l2 = l;
                        n2 = (int)(l2 / 50L);
                        n = (int)(l2 / 80L);
                        if (!bl) break block5;
                        this.KE.ba0.Y30 = (byte)3;
                        n2 -= 20;
                        n -= 12;
                        if (!this.VO) break block6;
                        break block7;
                    }
                    n = n < 2 ? 0 : (n -= 2);
                    n2 *= -1;
                    if (!this.VO) break block6;
                }
                n *= -1;
            }
            C8 c8 = this.KE.uR().OA0;
            float f = n2;
            float f2 = n;
            float f3 = f;
            f = 0.0f;
            c8.x = f3;
            c8.y = f2;
            c8.z = f;
        }
    }
}

