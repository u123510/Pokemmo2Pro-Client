package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import cn.pokemmo.graphics.gdx.texture.GdxCompressedTextureData;

/**
 * Shim: es_0 -> GdxCompressedTextureData
 * @see cn.pokemmo.graphics.gdx.texture.GdxCompressedTextureData
 */
public class es_0 extends GdxCompressedTextureData {
    public es_0(boolean isStatic, int numVertices, kz_0... attributes) { super(isStatic, numVertices, attributes); }
    public es_0(boolean isStatic, int numVertices, sa_0 attributes) { super(isStatic, numVertices, attributes); }
    public es_0(boolean isStatic, ByteBuffer byteBuffer, sa_0 attributes) { super(isStatic, byteBuffer, attributes); }
}
