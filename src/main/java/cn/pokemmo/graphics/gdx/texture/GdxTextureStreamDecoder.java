/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import f.Dn0;
import f.VE;
import f.a00_0;
import f.am_2;
import f.eb0_1;
import f.u4_0;
import f.vt_0;
import f.wc_2;

public class GdxTextureStreamDecoder
extends u4_0 {
    public final /* synthetic */ Dn0 PT;

    public GdxTextureStreamDecoder(VE vE) {
        this.PT = vE;
    }

    @Override
    public final void Od0(vt_0 vt_02, am_2 am_22) {
    }

    @Override
    public final Texture De0(String string) {
        this.PT.Br().wp(string + ".png").el();
        wc_2.eg0.getClass();
        Texture texture = new Texture(this.PT.Br().wp(string + ".png"), false);
        eb0_1 eb0_12 = eb0_1.Y30;
        texture.setFilter(eb0_12, eb0_12);
        a00_0 a00_02 = a00_0.x3;
        texture.setWrap(a00_02, a00_02);
        return texture;
    }
}

