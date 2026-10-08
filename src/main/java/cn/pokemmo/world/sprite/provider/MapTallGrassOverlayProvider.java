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
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from f.wt
 */
public class MapTallGrassOverlayProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int uE0;
    public final /* synthetic */ qa0_1 na;
    public final /* synthetic */ Map TC;
    public final /* synthetic */ short XA;

    public MapTallGrassOverlayProvider(int n, qa0_1 qa0_12, HashMap hashMap, short s) {
        this.uE0 = n;
        this.na = qa0_12;
        this.TC = hashMap;
        this.XA = s;
    }

    @Override
    public final i4_0 KN() {
        int n = 8;
        int n2 = 8;
        XG0 xG0 = XG0.hi0;
        ByteBuffer byteBuffer = this.na.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return new Q20(this.uE0, n, n2, xG0, byteBuffer).MO((i8_0)this.TC.get(this.XA));
    }
}

