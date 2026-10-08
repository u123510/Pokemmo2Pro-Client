package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.color.GdxMaterialLightingColor;

/**
 * Shim: rj0_2 -> GdxMaterialLightingColor
 * @see cn.pokemmo.graphics.gdx.color.GdxMaterialLightingColor
 */
public final class rj0_2 extends GdxMaterialLightingColor {
    public rj0_2(Color color, Color color2, Color color3, Color color4, Color color5, C8 c8) { super(color, color2, color3, color4, color5, c8); }
    public rj0_2(ByteBuffer byteBuffer) { super(byteBuffer); }
}
