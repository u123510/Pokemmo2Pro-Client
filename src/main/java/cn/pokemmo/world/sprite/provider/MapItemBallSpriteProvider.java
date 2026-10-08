/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.Q20;
import f.XG0;
import f.au_2;
import f.br_2;
import f.da_0;
import f.i4_0;
import f.ix0_0;
import f.qa0_1;

/*
 * Renamed from f.gj0
 */
public class MapItemBallSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ Q20 CG;
    public final /* synthetic */ qa0_1 XE;
    public final /* synthetic */ int vH0;

    public MapItemBallSpriteProvider(Q20 q20, qa0_1 qa0_12, int n) {
        this.CG = q20;
        this.XE = qa0_12;
        this.vH0 = n;
    }

    @Override
    public final i4_0 KN() {
        i4_0 i4_02;
        MapItemBallSpriteProvider gj0_22 = this;
        Object object = XG0.hi0;
        int n = gj0_22.XE.EZ.V(br_2.Gb0);
        Object object2 = gj0_22.XE;
        object = this.CG.MO(da_0.Ic.OY((XG0)object, n, (qa0_1)object2));
        object2 = ix0_0.Vw;
        i4_0 i4_03 = new i4_0(16, 16, (ix0_0)((Object)object2));
        for (int j = 0; j < 4; ++j) {
            int n2 = j != 0 && j != 2 ? 8 : 0;
            int n3 = j != 2 && j != 3 ? 0 : 8;
            for (int k = 0; k < 8; ++k) {
                for (int i2 = 0; i2 < 8; ++i2) {
                    int n4 = k + n2;
                    int n5 = i2 + n3;
                    int n6 = j * 8 + i2 + this.vH0;
                    n6 = ((i4_0)object).XF.iH0(k, n6);
                    i4_03.XF.XS(n4, n5, n6);
                }
            }
        }
        ((i4_0)object).dispose();
        return i4_03;
    }
}

