/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.Q20;
import f.XG0;
import f.au_2;
import f.fp_2;
import f.i4_0;
import f.qa0_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class FollowerPokemonFormProvider extends BaseSpriteFrameProvider {
    public final /* synthetic */ qa0_1 yr0;
    public final /* synthetic */ int gp;
    public final /* synthetic */ int[] MC;
    public final /* synthetic */ int n70;
    public final /* synthetic */ int sj;

    public FollowerPokemonFormProvider(qa0_1 qa0_12, int n, int[] nArray, int n2, int n3) {
        this.yr0 = qa0_12;
        this.gp = n;
        this.MC = nArray;
        this.n70 = n2;
        this.sj = n3;
    }

    @Override
    public final i4_0 KN() {
        qa0_1 qa0_12 = this.yr0;
        Q20 q20 = new Q20(this.gp, 320, 1, XG0.hi0, qa0_12.VL0.slice().order(ByteOrder.LITTLE_ENDIAN));
        return fp_2.F9(qa0_12, q20, this.MC[this.n70], this.sj, 240, 256);
    }
}

