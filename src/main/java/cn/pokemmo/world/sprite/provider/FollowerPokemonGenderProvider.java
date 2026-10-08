/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.G90;
import f.Q20;
import f.XG0;
import f.au_2;
import f.br_2;
import f.da_0;
import f.i4_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FollowerPokemonGenderProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 Jz;

    public FollowerPokemonGenderProvider(qa0_1 qa0_12) {
        this.Jz = qa0_12;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.Jz.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position(this.Jz.EZ.V(br_2.Ag0));
        int n = G90.GF0(byteBuffer.getInt());
        byteBuffer.position(byteBuffer.position() + 24);
        int n2 = G90.GF0(byteBuffer.getInt());
        XG0 xG0 = XG0.hi0;
        return new Q20(n2, 2, 2, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, n, byteBuffer, (byte)0));
    }
}

