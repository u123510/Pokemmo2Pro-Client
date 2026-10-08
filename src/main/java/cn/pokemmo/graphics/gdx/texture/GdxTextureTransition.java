/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Texture;

/*
 * Renamed from f.sl
 */
public class GdxTextureTransition
extends I00 {
    @Override
    public final boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        short s = 150;
        int delay = 0;
        if (bi0_12.oI0()) {
            s = 75;
        } else if (bi0_12.uv()) {
            s = 100;
        }
        if (bi0_12.ba0.Y30 == 1) {
            s += 150;
        }
        if (bi0_12.il0.BQ) {
            delay = 500;
        }
        if (lT2.u40() instanceof sl_2 && bi0_12 instanceof E90) {
            E90 cfr_ignored_0 = (E90)bi0_12;
        }
        if (bi0_12.vx0() && !tw0_0.LD0.nv()) {
            lT.ZD0(new ID0(bi0_12, delay, s));
            if (bi0_12.Ou()) {
                s = 1658;
                tw0_0.RE0.d00(true, (byte)2, s, 0.0f);
            }
        }
        return false;
    }

    @Override
    public final void u00(LT lT, bi0_1 bi0_12, hl0_1 hl0_12, int n, int n2, int n3, int n4) {
        if (lT.lW()) {
            return;
        }
        Object object = QI.Py.kN((byte)0, 167, false).li0(0);
        if (object != null) {
            object = ((Wr)object).H8();
            float f = n;
            float f2 = n2;
            hl0_12.CH0((Texture)object, f, f2);
        }
    }
}
