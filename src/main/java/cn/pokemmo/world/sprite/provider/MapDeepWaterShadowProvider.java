/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.G90;
import f.Q20;
import f.XG0;
import f.au_2;
import f.da_0;
import f.i4_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.Kc
 */
public class MapDeepWaterShadowProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 DE;
    public final /* synthetic */ int jy;
    public final /* synthetic */ int LpT6;

    public MapDeepWaterShadowProvider(qa0_1 qa0_12, int n, int n2) {
        this.DE = qa0_12;
        this.jy = n;
        this.LpT6 = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.DE.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(this.jy + 228);
        int n = G90.GF0(byteBuffer.getInt());
        XG0 xG0 = XG0.hi0;
        return new Q20(n, 8, 16, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.LpT6, byteBuffer, (byte)0));
    }
}

