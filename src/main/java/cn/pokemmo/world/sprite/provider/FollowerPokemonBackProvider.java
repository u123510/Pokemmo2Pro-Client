/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class FollowerPokemonBackProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ short tm;
    public final /* synthetic */ int ag;
    public final /* synthetic */ Ae yI0;
    public final /* synthetic */ Rk0 Us;
    public final /* synthetic */ yh_0 VD;

    public FollowerPokemonBackProvider(yh_0 yh_02, short s, int n, Ae ae, Rk0 rk0) {
        this.VD = yh_02;
        this.tm = s;
        this.ag = n;
        this.yI0 = ae;
        this.Us = rk0;
    }

    @Override
    public final i4_0 KN() {
        Tt0 tt0 = new Tt0(this.VD.iD0.GJ((this.tm - 800) * 2 + 14251 + this.ag));
        Gt0 gt0 = new Gt0(this.yI0, true);
        return this.Us.oQ(gt0, tt0, 0, 96, 96, 0);
    }
}

