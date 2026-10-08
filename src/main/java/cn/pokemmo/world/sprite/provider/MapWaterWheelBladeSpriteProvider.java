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
 * Renamed from f.Ui
 */
public class MapWaterWheelBladeSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 Fx0;
    public final /* synthetic */ int ni0;
    public final /* synthetic */ int LPT6;

    public MapWaterWheelBladeSpriteProvider(qa0_1 qa0_12, int n, int n2) {
        this.Fx0 = qa0_12;
        this.ni0 = n;
        this.LPT6 = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.Fx0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.ni0, 3, 3, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.LPT6, byteBuffer, (byte)0));
    }
}

