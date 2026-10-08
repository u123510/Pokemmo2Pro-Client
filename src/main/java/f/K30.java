package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.color.GdxColorPalette;

/**
 * Shim: K30 -> GdxColorPalette
 * @see cn.pokemmo.graphics.gdx.color.GdxColorPalette
 */
public final class K30 extends GdxColorPalette {
    public K30() { super(); }
    public K30(sc_0 sc_02, Color color, YA yA, YA yA2, YA yA3) { super(sc_02, color, yA, yA2, yA3); }
    public K30(K30 k30) { super(k30); }
}
