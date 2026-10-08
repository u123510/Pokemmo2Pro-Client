package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.texture.GdxPixmapPacker;

/**
 * Shim: cg_1 -> GdxPixmapPacker
 * @see cn.pokemmo.graphics.gdx.texture.GdxPixmapPacker
 */
public abstract class cg_1 extends GdxPixmapPacker {
    public cg_1(int var1, int var2) { super(var1, var2); }
}
