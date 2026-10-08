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

public class CharacterAvatarMountProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 g5;
    public final /* synthetic */ int kG;
    public final /* synthetic */ int Ag0;

    public CharacterAvatarMountProvider(qa0_1 qa0_12, int n, int n2) {
        this.g5 = qa0_12;
        this.kG = n;
        this.Ag0 = n2;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.g5.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.kG, 8, 8, xG0, byteBuffer).MO(da_0.Ic.tv(xG0, this.Ag0, byteBuffer, (byte)0));
    }
}

