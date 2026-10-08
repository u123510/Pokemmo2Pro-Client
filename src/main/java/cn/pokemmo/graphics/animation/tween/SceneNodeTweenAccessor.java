package cn.pokemmo.graphics.animation.tween;

import f.*;

public class SceneNodeTweenAccessor implements BaseTweenAccessor, f.BD {
    public static final boolean y6 = !SceneNodeTweenAccessor.class.desiredAssertionStatus();

    public SceneNodeTweenAccessor() {
        super();
    }

    static {
        new me0_2();
    }

    @Override
    public final void wl(Object value, int index, float[] data) {
        if (index != 1) {
            if (!y6) {
                throw new AssertionError();
            }
            return;
        }
        Ou0 object = (Ou0) value;
        float scale = data[0];
        C8 color = object.Zp;
        if (color.x == 0.0f) {
            return;
        }
        object.ho.qt(com.badlogic.gdx.math.Matrix4.EK.h50(color.x, color.y, color.z, scale));
    }

    @Override
    public final int AJ(Object value, int index, float[] data) {
        if (index != 1) {
            if (y6) {
                return 0;
            }
            throw new AssertionError();
        }
        data[0] = 0.0f;
        return 1;
    }

}
