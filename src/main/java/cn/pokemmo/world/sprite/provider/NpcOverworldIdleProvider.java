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

public class NpcOverworldIdleProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 CO;
    public final /* synthetic */ int[] dw;

    public NpcOverworldIdleProvider(qa0_1 qa0_12, int[] nArray) {
        this.CO = qa0_12;
        this.dw = nArray;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.CO.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.dw[2], 1, 10, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.dw[9], byteBuffer, (byte)0));
    }
}

