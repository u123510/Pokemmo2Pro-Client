/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import f.I70;
import f.KI0;
import f.PA;
import f.a00_0;
import f.cg_1;
import f.eb0_1;
import f.ix0_0;
import f.lg_0;
import f.lq_2;
import f.y_0;

/*
 * Renamed from f.Na
 */
public class GdxTextureAnimation
extends PA {
    public GdxTextureAnimation() {
    }

    public GdxTextureAnimation(cg_1 cg_12) {
        super(cg_12);
    }

    public GdxTextureAnimation(ix0_0 ix0_02, int n, int n2, boolean bl) {
        this(ix0_02, n, n2, bl, false);
    }

    public GdxTextureAnimation(ix0_0 ix0_02, int n, int n2, boolean bl, boolean bl2) {
        KI0 kI02 = new KI0(n, n2);
        kI02.I7(ix0_02);
        if (bl) {
            kI02.XK0();
        }
        if (bl2) {
            kI02.aC();
        }
        this.dx0 = kI02;
        this.zY();
    }

    @Override
    public final void x30(lq_2 lq_22) {
        int n = ((Texture)lq_22).getTextureObjectHandle();
        lg_0.Sf0.glFramebufferTexture2D(36160, 36064, 3553, n, 0);
    }

    @Override
    public final void WX(lq_2 lq_22) {
        ((Texture)lq_22).dispose();
    }

    @Override
    public final Texture w1(y_0 y_02) {
        y_0 y_03 = y_02;
        cg_1 cg_12 = this.dx0;
        int n = cg_12.Yd0;
        int n2 = cg_12.JY;
        int n3 = y_03.sc0;
        int n4 = y_03.Px0;
        int n5 = y_03.bE0;
        I70 i702 = new I70(n, n2, 0, n3, n4, n5);
        Texture texture = new Texture(i702);
        eb0_1 eb0_12 = eb0_1.jc0;
        texture.setFilter(eb0_12, eb0_12);
        a00_0 a00_02 = a00_0.x3;
        texture.setWrap(a00_02, a00_02);
        return texture;
    }
}

