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
import f.da_0;
import f.i4_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.iU
 */
public class MapTeleportEffectSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 lo;
    public final /* synthetic */ int Q7;
    public final /* synthetic */ int xc;

    public MapTeleportEffectSpriteProvider(qa0_1 qa0_12, int n, int n2) {
        this.lo = qa0_12;
        this.Q7 = n;
        this.xc = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.lo.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.Q7, 8, 8, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.xc, byteBuffer, (byte)0));
    }
}

