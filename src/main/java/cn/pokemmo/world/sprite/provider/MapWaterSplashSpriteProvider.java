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
 * Renamed from f.jC0
 */
public class MapWaterSplashSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 df0;
    public final /* synthetic */ Q20 eb0;
    public final /* synthetic */ int[] COm7;

    public MapWaterSplashSpriteProvider(qa0_1 qa0_12, Q20 q20, int[] nArray) {
        this.df0 = qa0_12;
        this.eb0 = q20;
        this.COm7 = nArray;
    }

    @Override
    public final i4_0 KN() {
        MapWaterSplashSpriteProvider jc0_12 = this;
        ByteBuffer byteBuffer = jc0_12.df0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return jc0_12.eb0.MO(da_0.Ic.tv(XG0.hi0, this.COm7[3], byteBuffer, (byte)0));
    }
}

