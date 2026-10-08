/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import f.LPT6_;

/*
 * Renamed from f.wd0
 */
public class GdxTextureRegionKey {
    public LPT6_ sI0;
    public int c0;
    public int Uw0;

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        object = (wd0_2)object;
        return this.Uw0 == ((wd0_2)object).Uw0 && this.c0 == ((wd0_2)object).c0 && this.sI0.OB == ((wd0_2)object).sI0.OB;
    }

    public final int hashCode() {
        Texture texture = this.sI0.OB;
        return ((texture != null ? texture.hashCode() : 0) * 31 + this.c0) * 31 + this.Uw0;
    }
}

