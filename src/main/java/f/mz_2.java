package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.material.attribute.GdxTextureAttribute;

/**
 * Shim: mz_2 -> GdxTextureAttribute
 * @see cn.pokemmo.graphics.material.attribute.GdxTextureAttribute
 */
public class mz_2 extends GdxTextureAttribute {
    public mz_2(long j) { super(j); }
    public mz_2(long j, B90 b90) { super(j, b90); }
    public mz_2(long j, B90 b90, float f, float f2, float f3, float f4, int i) { super(j, b90, f, f2, f3, f4, i); }
    public mz_2(long j, B90 b90, float f, float f2, float f3, float f4) { super(j, b90, f, f2, f3, f4); }
    public mz_2(long j, Texture texture) { super(j, texture); }
    public mz_2(long j, LPT6_ lpt6_) { super(j, lpt6_); }
    public mz_2(TextureAttribute mz_22) { super(mz_22); }
    @Override
    public hf_1 pD0() { return new mz_2(this); }
}
