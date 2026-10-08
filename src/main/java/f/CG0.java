package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.color.GdxShadingColorConfig;

/**
 * Shim: CG0 -> GdxShadingColorConfig
 * @see cn.pokemmo.graphics.gdx.color.GdxShadingColorConfig
 */
public final class CG0 extends GdxShadingColorConfig {
    public CG0() { super(); }
    public CG0(sc_0 var1, Color var2, YA var3, mb0_0 var4, de0_2 var5) { super(var1, var2, var3, var4, var5); }
    public CG0(CG0 var1) { super(var1); }
}
