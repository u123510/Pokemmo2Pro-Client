/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.Ab
 */
public class NpcTrainerCardSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 Cz;
    public final /* synthetic */ int g90;
    public final /* synthetic */ int EV;

    public NpcTrainerCardSpriteProvider(FJ fJ, int n, int n2) {
        this.Cz = fJ;
        this.g90 = n;
        this.EV = n2;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt0 = new Tt0(this.Cz.EG(this.g90));
        Gt0 gt0 = new Gt0(this.Cz.EG(this.EV), false);
        return gt0.NK(tt0, gt0.LA, gt0.v4);
    }
}

