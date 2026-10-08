/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarFeetProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 AW;
    public final /* synthetic */ int Wh0;

    public CharacterAvatarFeetProvider(FJ fJ, int n) {
        this.AW = fJ;
        this.Wh0 = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.AW.EG(this.Wh0 + 87));
        Gt0 gt0 = new Gt0(this.AW.EG(this.Wh0 + 112), false);
        int n = gt0.LA;
        return gt0.NK(tt02, n, gt0.v4);
    }
}

