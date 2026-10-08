package cn.pokemmo.graphics.animation.tween;

import f.*;

public class WidgetTweenAccessor implements BaseTweenAccessor, f.BD {
    public static final boolean X10 = !WidgetTweenAccessor.class.desiredAssertionStatus();

    @Override
    public final void wl(Object value, int index, float[] data) {
        jk_0 target = (jk_0) value;
        switch (index) {
            case 1 -> target.yJ = (int) data[0];
            case 2 -> target.tX = (int) data[0];
            case 3 -> { target.yJ = (int) data[0]; target.tX = (int) data[1]; }
            case 4 -> target.fj0 = data[0];
            case 5 -> target.I40 = data[0];
            case 6 -> { target.fj0 = data[0]; target.I40 = data[1]; }
            case 7 -> target.Sg0 = data[0];
            case 10 -> target.Rk = data[0];
            case 11 -> target.h3 = data[0];
            case 12 -> { target.Rk = data[0]; target.h3 = data[1]; }
            case 13 -> { target.J5 = (int) data[0]; target.kH0(); }
            default -> { if (!X10) throw new AssertionError(); }
        }
    }

    @Override
    public final int AJ(Object value, int index, float[] data) {
        jk_0 target = (jk_0) value;
        switch (index) {
            case 1 -> { data[0] = target.yJ; return 1; }
            case 2 -> { data[0] = target.tX; return 1; }
            case 3 -> { data[0] = target.yJ; data[1] = target.tX; return 2; }
            case 4 -> { data[0] = target.fj0; return 1; }
            case 5 -> { data[0] = target.I40; return 1; }
            case 6 -> { data[0] = target.fj0; data[1] = target.I40; return 2; }
            case 7 -> { data[0] = target.Sg0; return 1; }
            case 10 -> { data[0] = target.Rk; return 1; }
            case 11 -> { data[0] = target.h3; return 1; }
            case 12 -> { data[0] = target.Rk; data[1] = target.h3; return 2; }
            case 13 -> { data[0] = target.J5; return 1; }
            default -> { if (X10) return 0; throw new AssertionError(); }
        }
    }
}
