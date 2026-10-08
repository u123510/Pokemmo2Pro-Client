package f;

import com.badlogic.gdx.math.Matrix4;
import cn.pokemmo.graphics.gdx.texture.GdxMipmapGenerator;

/**
 * Shim: Xz0 -> GdxMipmapGenerator
 * @see cn.pokemmo.graphics.gdx.texture.GdxMipmapGenerator
 */
public class Xz0 extends GdxMipmapGenerator {
    public Xz0() { super(); }

    @Override
    protected GdxMipmapGenerator createInstance() {
        return new Xz0();
    }

    public static Xz0 ry0(es_1 es_12, String str, boolean z) {
        return (Xz0) GdxMipmapGenerator.ry0(es_12, str, z);
    }

    @Override
    public Xz0 wb0() {
        return (Xz0) super.wb0();
    }

    @Override
    public Xz0 Ii0() {
        return (Xz0) super.Ii0();
    }
}
