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
import f.i4_0;
import f.i8_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.Ql0
 */
public class MapWeatherFogOverlayProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 sd0;
    public final /* synthetic */ int Ak;
    public final /* synthetic */ ByteBuffer hj0;

    public MapWeatherFogOverlayProvider(int n, qa0_1 qa0_12, ByteBuffer byteBuffer) {
        this.sd0 = qa0_12;
        this.Ak = n;
        this.hj0 = byteBuffer;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.sd0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.Ak, 16, 16, xG0, byteBuffer).MO(new i8_0(xG0, 288, this.hj0));
    }
}

