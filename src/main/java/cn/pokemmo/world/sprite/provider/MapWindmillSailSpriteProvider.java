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
 * Renamed from f.Uk0
 */
public class MapWindmillSailSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 cd0;
    public final /* synthetic */ int oe;
    public final /* synthetic */ int Fj;

    public MapWindmillSailSpriteProvider(qa0_1 qa0_12, int n, int n2) {
        this.cd0 = qa0_12;
        this.oe = n;
        this.Fj = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.cd0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(this.oe);
        int n = G90.GF0(byteBuffer.getInt());
        XG0 xG0 = XG0.hi0;
        return new Q20(n, 2, 24, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.Fj, byteBuffer, (byte)0));
    }
}

