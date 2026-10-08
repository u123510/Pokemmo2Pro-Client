/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import f.LPT6_;
import f.fm0_0;
import f.nb_2;

/*
 * Renamed from f.Yd
 */
public class GdxTextureResource
implements fm0_0 {
    public final nb_2 hw;

    public GdxTextureResource(nb_2 nb_22) {
        this.hw = nb_22;
    }

    @Override
    public final LPT6_ Qq0(String string) {
        return new LPT6_((Texture)this.hw.Wk0(string));
    }
}

