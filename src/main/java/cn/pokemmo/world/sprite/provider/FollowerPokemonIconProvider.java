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

public class FollowerPokemonIconProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 oo;

    public FollowerPokemonIconProvider(qa0_1 qa0_12) {
        this.oo = qa0_12;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.oo.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.oo.EZ.V(br_2.T3), 2, 8, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.oo.EZ.V(br_2.yw), byteBuffer, (byte)0));
    }
}

