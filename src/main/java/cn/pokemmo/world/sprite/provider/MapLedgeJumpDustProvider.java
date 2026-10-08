/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Iv
 */
public class MapLedgeJumpDustProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 jO;

    public MapLedgeJumpDustProvider(FJ fJ) {
        this.jO = fJ;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.jO.EG(66));
        Gt0 gt0 = new Gt0(this.jO.EG(65), false);
        int n = gt0.LA;
        return gt0.NK(tt02, n, gt0.v4);
    }
}

