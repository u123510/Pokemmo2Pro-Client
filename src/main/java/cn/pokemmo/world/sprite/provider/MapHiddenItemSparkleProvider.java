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

public class MapHiddenItemSparkleProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 AV;
    public final /* synthetic */ Q20 oP;
    public final /* synthetic */ int[] switch$;

    public MapHiddenItemSparkleProvider(qa0_1 qa0_12, Q20 q20, int[] nArray) {
        this.AV = qa0_12;
        this.oP = q20;
        this.switch$ = nArray;
    }

    @Override
    public final i4_0 KN() {
        MapHiddenItemSparkleProvider gr02 = this;
        ByteBuffer byteBuffer = gr02.AV.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return gr02.oP.MO(da_0.Ic.tv(XG0.hi0, this.switch$[7], byteBuffer, (byte)0));
    }
}

