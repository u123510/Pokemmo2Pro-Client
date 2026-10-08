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

public class CharacterRawTextureProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int H8;
    public final /* synthetic */ i8_0 sJ;
    public final /* synthetic */ PO f00;

    public CharacterRawTextureProvider(PO pO, int n, i8_0 i8_02) {
        this.f00 = pO;
        this.H8 = n;
        this.sJ = i8_02;
    }

    @Override
    public final i4_0 KN() {
        CharacterRawTextureProvider dF = this;
        int n = dF.H8;
        PO pO = dF.f00;
        int n2 = pO.Db / 8;
        int n3 = pO.FZ / 8;
        XG0 xG0 = XG0.hi0;
        ByteBuffer byteBuffer = pO.on.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return new Q20(n, n2, n3, xG0, byteBuffer).MO(this.sJ);
    }
}
