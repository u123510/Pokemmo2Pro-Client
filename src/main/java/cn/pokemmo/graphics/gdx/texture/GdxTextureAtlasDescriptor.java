/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import f.LPT6_;
import f.Z30;
import f.gn_0;
import f.qq_0;
import f.tw0_0;

/*
 * Renamed from f.tg0
 */
public abstract class GdxTextureAtlasDescriptor {
    public static Z30 oU(LPT6_ lPT6_) {
        if (lPT6_ == null) {
            return null;
        }
        LPT6_ lPT6_2 = lPT6_;
        qq_0 qq_02 = tw0_0.LD0.wx0;
        Texture texture = lPT6_2.OB;
        int n = lPT6_2.Zi0();
        int n2 = Math.round(lPT6_2.Y60 * (float)lPT6_.OB.getHeight());
        int n3 = lPT6_2.bz;
        int n4 = lPT6_2.xZ;
        LPT6_ lPT6_3 = lPT6_;
        int n5 = lPT6_3.OB.getWidth();
        int n6 = lPT6_3.OB.getHeight();
        gn_0 gn_02 = gn_0.WHITE;
        return new Z30(qq_02, texture, n, n2, n3, n4, n5, n6, gn_02);
    }
}

