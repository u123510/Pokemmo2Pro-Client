package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;
import cn.pokemmo.graphics.material.attribute.TextureAttribute;


import cn.pokemmo.graphics.gdx.model.GdxBoneTransformData;

/**
 * Shim: I90 -> GdxBoneTransformData
 * @see cn.pokemmo.graphics.gdx.model.GdxBoneTransformData
 */
public final class I90 extends GdxBoneTransformData {
    public I90(ByteBuffer data) { super(data); }
}
