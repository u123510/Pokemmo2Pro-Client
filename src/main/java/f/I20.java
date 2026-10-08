package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.math.GdxTransformState;

/**
 * Shim: I20 -> GdxTransformState
 * @see cn.pokemmo.graphics.gdx.math.GdxTransformState
 */
public final class I20 extends GdxTransformState {
    public I20() { super(); }
    public I20(U30 u30, BM bM) { super(u30, bM); }
}
