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
 * Renamed from f.ex
 */
public class MapWaterfallSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 GW;
    public final /* synthetic */ int PG0;
    public final /* synthetic */ int yb0;

    public MapWaterfallSpriteProvider(qa0_1 qa0_12, int n, int n2) {
        this.GW = qa0_12;
        this.PG0 = n;
        this.yb0 = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.GW.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(this.PG0 + 16);
        int n = G90.GF0(byteBuffer.getInt());
        XG0 xG0 = XG0.hi0;
        return new Q20(n, 4, 1, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.yb0, byteBuffer, (byte)0));
    }
}

