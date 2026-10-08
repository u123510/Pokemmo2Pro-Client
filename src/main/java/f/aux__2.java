package f;

import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.gdx.gl.GdxFrameBufferTextureProvider;

/**
 * Shim: aux__2 -> GdxFrameBufferTextureProvider
 * @see cn.pokemmo.graphics.gdx.gl.GdxFrameBufferTextureProvider
 */
public class aux__2 extends GdxFrameBufferTextureProvider {
    public aux__2(int base, int translationTable, int rotationTable, boolean single,
                  int count, ByteBuffer buffer) { super(base, translationTable, rotationTable, single, count, buffer); }
}
