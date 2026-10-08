/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.Mi;
import f.au_2;
import f.i4_0;

/*
 * Renamed from f.Xd
 */
public class MapSwampBubbleSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ int yx;
    public final /* synthetic */ Mi coM5;

    public MapSwampBubbleSpriteProvider(Mi mi, int n) {
        this.coM5 = mi;
        this.yx = n;
    }

    @Override
    public final i4_0 KN() {
        return this.coM5.Yz[this.yx].By();
    }
}

