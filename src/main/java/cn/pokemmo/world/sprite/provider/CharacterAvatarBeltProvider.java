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
import f.i4_0;
import f.i8_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CharacterAvatarBeltProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 HA0;
    public final /* synthetic */ int nH;
    public final /* synthetic */ ByteBuffer jW;

    public CharacterAvatarBeltProvider(int n, qa0_1 qa0_12, ByteBuffer byteBuffer) {
        this.HA0 = qa0_12;
        this.nH = n;
        this.jW = byteBuffer;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer byteBuffer = this.HA0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        XG0 xG0 = XG0.hi0;
        return new Q20(this.nH, 16, 16, xG0, byteBuffer).MO(new i8_0(xG0, 128, this.jW));
    }
}

