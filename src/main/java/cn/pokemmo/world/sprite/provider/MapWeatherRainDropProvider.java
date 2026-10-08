/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.Er0;
import f.au_2;
import f.i4_0;

/*
 * Renamed from f.Nz
 */
public class MapWeatherRainDropProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ Er0 bn;
    public final /* synthetic */ int w10;

    public MapWeatherRainDropProvider(Er0 er0, int n) {
        this.bn = er0;
        this.w10 = n;
    }

    @Override
    public final i4_0 KN() {
        return this.bn.E10.Rt0(this.w10, 0);
    }
}

