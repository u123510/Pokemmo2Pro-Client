package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.platform.desktop.jni.GdxNativeHandle;

/**
 * Shim: bi_1 -> GdxNativeHandle
 * @see cn.pokemmo.platform.desktop.jni.GdxNativeHandle
 */
public class bi_1 extends GdxNativeHandle {
    public bi_1(long pointer, boolean register) { super(pointer, register); }
    public bi_1(int length, boolean register, boolean guarded) { super(length, register, guarded); }
}
