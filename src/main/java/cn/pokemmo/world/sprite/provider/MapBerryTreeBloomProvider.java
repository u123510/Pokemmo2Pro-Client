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
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Renamed from f.fo0
 */
public class MapBerryTreeBloomProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 TI;

    public MapBerryTreeBloomProvider(qa0_1 qa0_12) {
        this.TI = qa0_12;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.TI.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        MapBerryTreeBloomProvider fo0_02 = this;
        int n = fo0_02.TI.EZ.V(br_2.oA0);
        return new Q20(this.TI.EZ.V(br_2.mR), 2, 8, xG0, byteBuffer).MO(da_0.Ic.OY(xG0, n, fo0_02.TI));
    }
}

