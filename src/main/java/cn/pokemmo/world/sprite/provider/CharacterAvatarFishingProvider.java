/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarFishingProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 fc;
    public final /* synthetic */ int mp;

    public CharacterAvatarFishingProvider(FJ fJ, int n) {
        this.fc = fJ;
        this.mp = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.fc.EG(this.mp + 1));
        Gt0 gt02 = new Gt0(this.fc.EG(this.mp + 4), false);
        return new IA0(this.fc.EG(this.mp + 6), false).dB(tt02, gt02);
    }
}

