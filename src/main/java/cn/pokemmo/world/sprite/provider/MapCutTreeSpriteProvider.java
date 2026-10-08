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
 * Renamed from f.dD0
 */
public class MapCutTreeSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 XI0;
    public final /* synthetic */ Q20 kf0;
    public final /* synthetic */ int[] cx0;

    public MapCutTreeSpriteProvider(qa0_1 qa0_12, Q20 q20, int[] nArray) {
        this.XI0 = qa0_12;
        this.kf0 = q20;
        this.cx0 = nArray;
    }

    @Override
    public final i4_0 KN() {
        MapCutTreeSpriteProvider dd0_12 = this;
        ByteBuffer byteBuffer = dd0_12.XI0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return dd0_12.kf0.MO(da_0.Ic.tv(XG0.hi0, this.cx0[6], byteBuffer, (byte)0));
    }
}

