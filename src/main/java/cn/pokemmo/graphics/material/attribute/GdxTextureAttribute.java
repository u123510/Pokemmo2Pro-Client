package cn.pokemmo.graphics.material.attribute;

import f.*;


import cn.pokemmo.graphics.material.attribute.TextureAttribute;
import com.badlogic.gdx.graphics.Texture;

public class GdxTextureAttribute extends TextureAttribute {
    public GdxTextureAttribute(long j) {
        super(j);
    }

    public GdxTextureAttribute(long j, B90 b90) {
        super(j, b90);
    }

    public GdxTextureAttribute(long j, B90 b90, float f, float f2, float f3, float f4, int i) {
        super(j, b90, f, f2, f3, f4, i);
    }

    public GdxTextureAttribute(long j, B90 b90, float f, float f2, float f3, float f4) {
        super(j, b90, f, f2, f3, f4);
    }

    public GdxTextureAttribute(long j, Texture texture) {
        super(j, texture);
    }

    public GdxTextureAttribute(long j, LPT6_ lpt6_) {
        super(j, lpt6_);
    }

    public GdxTextureAttribute(TextureAttribute mz_22) {
        super(mz_22);
    }

    @Override
    public hf_1 pD0() {
        return new f.mz_2(this);
    }
}
