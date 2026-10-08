package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import cn.pokemmo.graphics.gdx.texture.GdxTextureData;

/**
 * Shim: N8 -> GdxTextureData
 * @see cn.pokemmo.graphics.gdx.texture.GdxTextureData
 */
public class N8 extends GdxTextureData {
    public N8(int count, kz_0... attributes) { super(count, attributes); }
    public N8(int count, sa_0 attributes) { super(count, attributes); }
}
