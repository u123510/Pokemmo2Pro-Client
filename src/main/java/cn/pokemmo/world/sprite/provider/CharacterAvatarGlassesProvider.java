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

public class CharacterAvatarGlassesProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 mr;
    public final /* synthetic */ int Nb;
    public final /* synthetic */ int Zz0;

    public CharacterAvatarGlassesProvider(qa0_1 qa0_12, int n, int n2) {
        this.mr = qa0_12;
        this.Nb = n;
        this.Zz0 = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.mr.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.Nb, 3, 3, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.Zz0, byteBuffer, (byte)0).FQ());
    }
}

