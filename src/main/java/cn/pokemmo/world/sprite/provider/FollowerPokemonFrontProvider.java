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

public class FollowerPokemonFrontProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ Er0 eo;
    public final /* synthetic */ int b00;

    public FollowerPokemonFrontProvider(Er0 er0, int n) {
        this.eo = er0;
        this.b00 = n;
    }

    @Override
    public final i4_0 KN() {
        return this.eo.E10.Rt0(this.b00, 0);
    }
}

