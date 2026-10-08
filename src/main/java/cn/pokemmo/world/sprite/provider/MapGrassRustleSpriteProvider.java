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
import f.fp_2;
import f.i4_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.j7
 */
public class MapGrassRustleSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int WD0;
    public final /* synthetic */ qa0_1 lN;
    public final /* synthetic */ int sK;
    public final /* synthetic */ int Xj;
    public final /* synthetic */ int ut;
    public final /* synthetic */ int wW;

    public MapGrassRustleSpriteProvider(int n, int n2, int n3, qa0_1 qa0_12) {
        this.WD0 = n;
        this.lN = qa0_12;
        this.sK = n2;
        this.Xj = n3;
        this.ut = 256;
        this.wW = 256;
    }

    @Override
    public final i4_0 KN() {
        int n = 1;
        int n2 = 1;
        XG0 xG0 = XG0.hi0;
        ByteBuffer byteBuffer = this.lN.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        Q20 q202 = new Q20(this.WD0, n, n2, xG0, byteBuffer);
        MapGrassRustleSpriteProvider j7_02 = this;
        int n3 = j7_02.sK;
        int n4 = j7_02.Xj;
        n = j7_02.ut;
        n2 = j7_02.wW;
        return fp_2.F9(this.lN, q202, n3, n4, n, n2);
    }
}

