package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.color.GdxColorHolder;

/**
 * Shim: T1 -> GdxColorHolder
 * @see cn.pokemmo.graphics.gdx.color.GdxColorHolder
 */
public final class T1 extends GdxColorHolder {
    public T1() { super(); }
    public T1(sc_0 sc_02, Color color) { super(sc_02, color); }
    public T1(T1 t1) { super(t1); }
}
