/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.PO;
import f.Q20;
import f.XG0;
import f.au_2;
import f.i4_0;
import f.i8_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class CharacterAvatarCapeProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int aE0;
    public final /* synthetic */ i8_0 Nz0;
    public final /* synthetic */ PO a40;

    public CharacterAvatarCapeProvider(PO pO, int n, i8_0 i8_02) {
        this.a40 = pO;
        this.aE0 = n;
        this.Nz0 = i8_02;
    }

    @Override
    public final i4_0 KN() {
        CharacterAvatarCapeProvider iv0 = this;
        int n = iv0.aE0;
        PO pO = iv0.a40;
        int n2 = pO.Db / 2 / 8;
        int n3 = pO.FZ / 8;
        XG0 xG0 = XG0.hi0;
        ByteBuffer byteBuffer = pO.on.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return new Q20(n, n2, n3, xG0, byteBuffer).MO(this.Nz0);
    }
}
