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
import f.i8_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.o00
 */
public class MapWeatherSnowFlakeProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 Cr;

    public MapWeatherSnowFlakeProvider(qa0_1 qa0_12) {
        this.Cr = qa0_12;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.Cr.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        i8_0 i8_02 = da_0.Ic.tv(xG0, this.Cr.EZ.V(br_2.W5), byteBuffer, (byte)0);
        return new Q20(this.Cr.EZ.V(br_2.SY), 2, 32, xG0, byteBuffer).MO(i8_02);
    }
}

