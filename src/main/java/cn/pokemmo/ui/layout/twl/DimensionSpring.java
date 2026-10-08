package cn.pokemmo.ui.layout.twl;

import f.*;

public class DimensionSpring extends is0_0 {
    public final String P6;
    public final DialogLayout Us0;

    public DimensionSpring(DialogLayout layout, String key) {
        this.Us0 = layout;
        this.P6 = key;
    }

    public final int e4(int ignored) {
        QS settings = this.Us0.w8;
        Uu value = settings == null ? fy_2.zx
                : (Uu) ((LC0) settings).N30(this.P6, true, Uu.class, fy_2.zx);
        return value.Fv0;
    }

    public final int zR(int ignored) {
        QS settings = this.Us0.w8;
        Uu value = settings == null ? fy_2.zx
                : (Uu) ((LC0) settings).N30(this.P6, true, Uu.class, fy_2.zx);
        return value.COM1;
    }

    public final int Kn(int ignored) {
        QS settings = this.Us0.w8;
        Uu value = settings == null ? fy_2.zx
                : (Uu) ((LC0) settings).N30(this.P6, true, Uu.class, fy_2.zx);
        return value.vJ0;
    }

    public final void od(int first, int second, int third) {
    }
}
