package f;

import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import cn.pokemmo.graphics.gdx.texture.GdxCustomTextureBufferData;

/**
 * Shim: UF -> GdxCustomTextureBufferData
 * @see cn.pokemmo.graphics.gdx.texture.GdxCustomTextureBufferData
 */
public class UF extends GdxCustomTextureBufferData {
    public UF(boolean var1, int var2, kz_0... var3) { super(var1, var2, var3); }
    public UF(boolean var1, int var2, sa_0 var3) { super(var1, var2, var3); }
}
