package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.gl.GdxShortIndexBuffer;

/**
 * Shim: G6 -> GdxShortIndexBuffer
 * @see cn.pokemmo.graphics.gdx.gl.GdxShortIndexBuffer
 */
public final class G6 extends GdxShortIndexBuffer {
    public G6(int n) { super(n); }
}
