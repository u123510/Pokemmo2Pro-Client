package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.math.GdxMatrixBuffer;

/**
 * Shim: p8_0 -> GdxMatrixBuffer
 * @see cn.pokemmo.graphics.gdx.math.GdxMatrixBuffer
 */
public final class p8_0 extends GdxMatrixBuffer {
    public p8_0(ByteBuffer byteBuffer) { super(byteBuffer); }
}
