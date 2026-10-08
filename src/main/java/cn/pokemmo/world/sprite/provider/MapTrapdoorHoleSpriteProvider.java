/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

/*
 * Renamed from f.uH0
 */
public class MapTrapdoorHoleSpriteProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 kl;

    public MapTrapdoorHoleSpriteProvider(FJ fJ) {
        this.kl = fJ;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.kl.EG(20));
        Gt0 gt02 = new Gt0(this.kl.EG(10), false);
        return new IA0(this.kl.EG(11), false).dB(tt02, gt02);
    }
}

