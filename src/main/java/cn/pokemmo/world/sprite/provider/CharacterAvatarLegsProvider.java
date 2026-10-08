/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CharacterAvatarLegsProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ vh_1 Lz;
    public final /* synthetic */ int PI0;

    public CharacterAvatarLegsProvider(FJ fJ, int n) {
        this.Lz = fJ;
        this.PI0 = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt02 = new Tt0(this.Lz.EG(this.PI0 * 5 + 1));
        Gt0 gt02 = new Gt0(this.Lz.EG(this.PI0 * 5), true);
        int n = 80;
        int n2 = 80;
        return new Rk0(this.Lz.EG(this.PI0 * 5 + 2), false).oQ(gt02, tt02, 0, n, n2, 0);
    }
}

