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

public class NpcOverworldActionProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 IW;

    public NpcOverworldActionProvider(qa0_1 qa0_12) {
        this.IW = qa0_12;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.IW.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.IW.EZ.V(br_2.Ew), 2, 14, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.IW.EZ.V(br_2.S7), byteBuffer, (byte)0));
    }
}

