/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Fg
 */
public class MapBerryTreeGrowthProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 lO;
    public final /* synthetic */ int rI0;

    public MapBerryTreeGrowthProvider(FJ fJ, int n) {
        this.lO = fJ;
        this.rI0 = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt0 = new Tt0(this.lO.EG(0));
        Gt0 gt0 = new Gt0(this.lO.EG(1), false);
        return new IA0(this.lO.EG(this.rI0 + 2), false).dB(tt0, gt0);
    }
}

