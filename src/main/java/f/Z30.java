package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.texture.GdxAnimatedTextureDrawable;

/**
 * Shim: Z30 -> GdxAnimatedTextureDrawable
 * @see cn.pokemmo.graphics.gdx.texture.GdxAnimatedTextureDrawable
 */
public final class Z30 extends GdxAnimatedTextureDrawable {
    public Z30(qq_0 qq_0Var, Texture texture, int i, int i2, int i3, int i4, gn_0 gn_0Var) { super(qq_0Var, texture, i, i2, i3, i4, gn_0Var); }
    public Z30(qq_0 qq_0Var, Texture texture, int i, int i2, int i3, int i4, int i5, int i6, gn_0 gn_0Var) { super(qq_0Var, texture, i, i2, i3, i4, i5, i6, gn_0Var); }
    public Z30(Z30 z30, gn_0 gn_0Var) { super(z30, gn_0Var); }
}
