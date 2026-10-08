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
 * Renamed from f.Ul
 */
public class MapFenceGateSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 QS;
    public final /* synthetic */ Q20 com4;
    public final /* synthetic */ int[] tq;

    public MapFenceGateSpriteProvider(qa0_1 qa0_12, Q20 q20, int[] nArray) {
        this.QS = qa0_12;
        this.com4 = q20;
        this.tq = nArray;
    }

    @Override
    public final i4_0 KN() {
        MapFenceGateSpriteProvider ul_02 = this;
        ByteBuffer byteBuffer = ul_02.QS.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return ul_02.com4.MO(da_0.Ic.tv(XG0.hi0, this.tq[5], byteBuffer, (byte)0));
    }
}

