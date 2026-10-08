package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import cn.pokemmo.graphics.gdx.gl.GdxVertexBufferObject;

/**
 * Shim: hy_1 -> GdxVertexBufferObject
 * @see cn.pokemmo.graphics.gdx.gl.GdxVertexBufferObject
 */
public class hy_1 extends GdxVertexBufferObject {
    public hy_1(int i) { super(i); }
    public hy_1(boolean z, int i) { super(z, i); }
    public hy_1(boolean z, ByteBuffer byteBuffer) { super(z, byteBuffer); }
}
