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
import f.fp_2;
import f.i4_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CharacterAvatarHatProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 X50;
    public final /* synthetic */ int hp0;
    public final /* synthetic */ int vk0;

    public CharacterAvatarHatProvider(qa0_1 qa0_12, int n, int n2) {
        this.X50 = qa0_12;
        this.hp0 = n;
        this.vk0 = n2;
    }

    @Override
    public final i4_0 KN() {
        CharacterAvatarHatProvider gN = this;
        ByteBuffer byteBuffer = gN.X50.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        Q20 q202 = new Q20(this.hp0, 1, 1, XG0.hi0, byteBuffer);
        qa0_1 qa0_12 = gN.X50;
        int n = qa0_12.EZ.V(br_2.Jh);
        return fp_2.F9(qa0_12, q202, n, this.vk0, 256, 160);
    }
}

