package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.platform.desktop.jni.GdxTaggedNativeHandle;

/**
 * Shim: Q3 -> GdxTaggedNativeHandle
 * @see cn.pokemmo.platform.desktop.jni.GdxTaggedNativeHandle
 */
public final class Q3 extends GdxTaggedNativeHandle {
    public Q3(long l, boolean bl, String string) { super(l, bl, string); }
    public Q3(String string) { super(string); }
    public Q3(String string, int n) { super(string, n); }
    public Q3(String string, int n, boolean bl, boolean bl2) { super(string, n, bl, bl2); }
}
