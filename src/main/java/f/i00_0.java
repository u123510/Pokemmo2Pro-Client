package f;

import com.badlogic.gdx.math.Matrix4;
import cn.pokemmo.graphics.gdx.color.GdxSerializedColorPalette;

/**
 * Shim: i00_0 -> GdxSerializedColorPalette
 * @see cn.pokemmo.graphics.gdx.color.GdxSerializedColorPalette
 */
public class i00_0 extends GdxSerializedColorPalette {
    public i00_0() { super(); }
    public i00_0(GdxSerializedColorPalette other) { super(other); }
    public i00_0(float[] values) { super(values); }

    @Override
    public i00_0 aM() {
        super.aM();
        return this;
    }

    @Override
    public i00_0 T4(Matrix4 mat) {
        super.T4(mat);
        return this;
    }

    @Override
    public i00_0 Se0() {
        super.Se0();
        return this;
    }
}
