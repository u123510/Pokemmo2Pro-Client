package cn.pokemmo.graphics.render;

import f.C8;
import f.pc0_2;

public class RenderTransformVector2D extends pc0_2 {
    public final C8 jf;

    public RenderTransformVector2D() {
        this.jf = new C8();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RenderTransformVector2D) {
            return er0((RenderTransformVector2D) obj);
        }
        return false;
    }

    public boolean er0(RenderTransformVector2D qv_0) {
        if (qv_0 != null) {
            if (qv_0 == this) {
                return true;
            }
            if (this.l0.equals(qv_0.l0) && this.jf.equals(qv_0.jf)) {
                return true;
            }
        }
        return false;
    }
}
