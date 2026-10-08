package f;

import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.LW;
import java.io.Serializable;
import cn.pokemmo.graphics.gdx.math.GdxQuaternion;

/**
 * Shim: me0_2 -> GdxQuaternion
 * @see cn.pokemmo.graphics.gdx.math.GdxQuaternion
 */
public class me0_2 extends GdxQuaternion {
    public static final me0_2 Bq = new me0_2(0.0f, 0.0f, 0.0f, 0.0f);
    public static final me0_2 Aux = new me0_2(0.0f, 0.0f, 0.0f, 0.0f);
    public me0_2(float f, float f2, float f3, float f4) { super(f, f2, f3, f4); }
    public me0_2() { super(); }
    public me0_2(me0_2 me0_22) { super(me0_22); }
    public me0_2(C8 c8, float f) { super(c8, f); }
    @Override
    public me0_2 CA0(me0_2 me0_22) {
        super.CA0(me0_22);
        return this;
    }
    @Override
    public me0_2 Cx() {
        super.Cx();
        return this;
    }
    @Override
    public me0_2 Z80(float f, float f2, float f3, float f4) {
        super.Z80(f, f2, f3, f4);
        return this;
    }
    @Override
    public me0_2 p1(me0_2 me0_22) {
        super.p1(me0_22);
        return this;
    }
    @Override
    public me0_2 Rx0() {
        super.Rx0();
        return this;
    }
    @Override
    public me0_2 h50(float f, float f2, float f3, float f4) {
        super.h50(f, f2, f3, f4);
        return this;
    }
    @Override
    public me0_2 et0(boolean bl, Matrix4 matrix4) {
        super.et0(bl, matrix4);
        return this;
    }
    @Override
    public me0_2 WA0(boolean bl, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        super.WA0(bl, f, f2, f3, f4, f5, f6, f7, f8, f9);
        return this;
    }
}
