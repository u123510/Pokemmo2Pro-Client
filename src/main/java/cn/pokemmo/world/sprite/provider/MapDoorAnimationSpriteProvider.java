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

/*
 * Renamed from f.Hf
 */
public class MapDoorAnimationSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int Jw0;
    public final /* synthetic */ i8_0 zc0;
    public final /* synthetic */ PO AP;

    public MapDoorAnimationSpriteProvider(PO pO, int n, i8_0 i8_02) {
        this.AP = pO;
        this.Jw0 = n;
        this.zc0 = i8_02;
    }

    @Override
    public final i4_0 KN() {
        MapDoorAnimationSpriteProvider hf_02 = this;
        int n = hf_02.Jw0;
        PO pO = hf_02.AP;
        int n2 = pO.Db / 8;
        int n3 = pO.FZ / 2 / 8;
        XG0 xG0 = XG0.hi0;
        ByteBuffer byteBuffer = pO.on.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return new Q20(n, n2, n3, xG0, byteBuffer).MO(this.zc0);
    }
}
