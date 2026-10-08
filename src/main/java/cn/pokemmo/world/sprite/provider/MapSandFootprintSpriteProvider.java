/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.au_2;
import f.i4_0;
import f.ji0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Me0
 */
public class MapSandFootprintSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ ByteBuffer C0;
    public final /* synthetic */ int Qi;
    public final /* synthetic */ int[][] cC;
    public final /* synthetic */ int Xi0;
    public final /* synthetic */ int e1;

    public MapSandFootprintSpriteProvider(ByteBuffer byteBuffer, int n, int[][] nArray, int n2) {
        this.C0 = byteBuffer;
        this.Qi = n;
        this.cC = nArray;
        this.Xi0 = n2;
        this.e1 = 9;
    }

    @Override
    public final i4_0 KN() {
        MapSandFootprintSpriteProvider me0_02 = this;
        int n = me0_02.Qi;
        int[][] nArray = me0_02.cC;
        int n2 = me0_02.Xi0;
        int n3 = me0_02.e1;
        return ji0_0.J60(this.C0, n, nArray, n2, n3);
    }
}

