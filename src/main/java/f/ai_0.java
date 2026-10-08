package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import cn.pokemmo.graphics.gdx.gl.GdxGLTexture;

/**
 * Shim: ai_0 -> GdxGLTexture
 * @see cn.pokemmo.graphics.gdx.gl.GdxGLTexture
 */
public class ai_0 extends GdxGLTexture {
    public ai_0(boolean isStatic, int numVertices, kz_0... attributes) { super(isStatic, numVertices, attributes); }
    public ai_0(boolean isStatic, int numVertices, sa_0 attributes) { super(isStatic, numVertices, attributes); }
    public ai_0(int usage, ByteBuffer buffer, boolean isOwner, sa_0 attributes) { super(usage, buffer, isOwner, attributes); }
}
