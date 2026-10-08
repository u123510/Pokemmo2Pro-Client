package cn.pokemmo.graphics.animation.tween;

import f.*;

import com.badlogic.gdx.graphics.Color;

public class SpriteTweenAccessor implements BaseTweenAccessor, f.BD {
    public static final boolean ir0 = !SpriteTweenAccessor.class.desiredAssertionStatus();

    @Override public final void wl(Object value, int index, float[] data) {
        te0_0 target = (te0_0) value;
        switch (index) {
            case 1 -> target.cM0 = data[0];
            case 2 -> target.iG = data[0];
            case 3 -> { target.cM0 = data[0]; target.iG = data[1]; }
            case 4 -> target.cz0 = data[0];
            case 5 -> target.SE0 = data[0];
            case 6 -> { target.cz0 = data[0]; target.SE0 = data[1]; }
            case 7 -> target.uf0 = data[0];
            case 8 -> target.dC.a = data[0];
            default -> { if (!ir0) throw new AssertionError(); }
        }
    }

    @Override public final int AJ(Object value, int index, float[] data) {
        te0_0 target = (te0_0) value;
        switch (index) {
            case 1 -> { data[0] = target.cM0; return 1; }
            case 2 -> { data[0] = target.iG; return 1; }
            case 3 -> { data[0] = target.cM0; data[1] = target.iG; return 2; }
            case 4 -> { data[0] = target.cz0; return 1; }
            case 5 -> { data[0] = target.SE0; return 1; }
            case 6 -> { data[0] = target.cz0; data[1] = target.SE0; return 2; }
            case 7 -> { data[0] = target.uf0; return 1; }
            case 8 -> { data[0] = target.dC.a; return 1; }
            default -> { if (ir0) return 0; throw new AssertionError(); }
        }
    }
}
