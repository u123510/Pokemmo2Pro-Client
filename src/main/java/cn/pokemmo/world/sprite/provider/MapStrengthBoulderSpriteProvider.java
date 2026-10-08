/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.eO
 */
public class MapStrengthBoulderSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 Tj0;
    public final /* synthetic */ int N2;

    public MapStrengthBoulderSpriteProvider(FJ fJ, int n) {
        this.Tj0 = fJ;
        this.N2 = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt0 = new Tt0(this.Tj0.EG(this.N2 * 5 + 1));
        Gt0 gt0 = new Gt0(this.Tj0.EG(this.N2 * 5), true);
        return new Rk0(this.Tj0.EG(this.N2 * 5 + 2), false).oQ(gt0, tt0, 0, 80, 80, 0);
    }
}

