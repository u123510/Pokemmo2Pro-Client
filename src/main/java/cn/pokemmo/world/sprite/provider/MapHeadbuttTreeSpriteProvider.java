/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.au_2;
import f.dv_0;
import f.hj0_1;
import f.i4_0;

/*
 * Renamed from f.Fd
 */
public class MapHeadbuttTreeSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ hj0_1 F00;
    public final /* synthetic */ int Yq0;

    public MapHeadbuttTreeSpriteProvider(hj0_1 hj0_12, int n) {
        this.F00 = hj0_12;
        this.Yq0 = n;
    }

    @Override
    public final i4_0 KN() {
        hj0_1 hj0_12 = this.F00;
        int n = this.Yq0;
        int n2 = hj0_12.kl0;
        return n2 <= 0 ? null : ((dv_0)hj0_12.No.elementAt((int)(n %= n2))).hv;
    }
}

