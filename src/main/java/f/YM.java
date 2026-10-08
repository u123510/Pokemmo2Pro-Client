package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.texture.GdxTextureStreamDecoder;

/**
 * Shim: YM -> GdxTextureStreamDecoder
 * @see cn.pokemmo.graphics.gdx.texture.GdxTextureStreamDecoder
 */
public final class YM extends GdxTextureStreamDecoder {
    public YM(VE vE) { super(vE); }
}
