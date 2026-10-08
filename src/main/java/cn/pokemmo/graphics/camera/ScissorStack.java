/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.camera;

import f.*;

import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.CI0;
import f.Tv0;
import f.es_1;
import f.lg_0;
import f.ql_0;

public class ScissorStack {
    public static final es_1 Kz0 = new es_1();
    public static final C8 ja = new C8();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Sj(ql_0 ql_02) {
        float f;
        float f2;
        ql_02.j80 = Math.round(ql_02.j80);
        ql_02.Wm0 = Math.round(ql_02.Wm0);
        ql_02.IA = Math.round(ql_02.IA);
        ql_02.Eu0 = f2 = (float)Math.round(ql_02.Eu0);
        float f3 = ql_02.IA;
        if (f3 < 0.0f) {
            ql_02.IA = f3 = -f3;
            ql_02.j80 -= f3;
        }
        if (f2 < 0.0f) {
            ql_02.Eu0 = f2 = -f2;
            ql_02.Wm0 -= f2;
        }
        es_1 es_12 = Kz0;
        int n = es_12.KB;
        if (n == 0) {
            if (ql_02.IA < 1.0f || ql_02.Eu0 < 1.0f) return false;
            lg_0.OH0.glEnable(3089);
        } else {
            float f4;
            float f5;
            ql_0 ql_03 = (ql_0)es_12.get(n - 1);
            float f6 = Math.max(ql_03.j80, ql_02.j80);
            float f7 = Math.min(ql_03.j80 + ql_03.IA, ql_02.j80 + ql_02.IA) - f6;
            if (f7 < 1.0f) {
                return false;
            }
            ql_0 ql_04 = ql_03;
            float f8 = Math.max(ql_04.Wm0, ql_02.Wm0);
            float f9 = Math.min(ql_04.Wm0 + ql_03.Eu0, ql_02.Wm0 + ql_02.Eu0) - f8;
            if (f9 < 1.0f) {
                return false;
            }
            ql_02.j80 = f6;
            ql_02.Wm0 = f8;
            ql_02.IA = f7;
            ql_02.Eu0 = Math.max(1.0f, f9);
        }
        es_12.Ue0(ql_02);
        CI0.Ry((int)ql_02.j80, (int)ql_02.Wm0, (int)ql_02.IA, (int)ql_02.Eu0);
        return true;
    }

    public static ql_0 eF() {
        Object object = Kz0;
        ql_0 ql_02 = (ql_0)((es_1)object).rq0();
        if (((es_1)object).KB == 0) {
            lg_0.OH0.glDisable(3089);
        } else {
            Object object2 = object = (ql_0)((es_1)object).GH0();
            int n = (int)((ql_0)object2).IA;
            CI0.Ry((int)((ql_0)object).j80, (int)((ql_0)object).Wm0, n, (int)((ql_0)object2).Eu0);
        }
        return ql_02;
    }

    public static void Y0(Tv0 tv0, float f, float f2, float f3, float f4, Matrix4 matrix4, ql_0 ql_02, ql_0 ql_03) {
        ql_0 ql_04 = ql_03;
        C8 c8 = ja;
        float f5 = f;
        C8 c82 = c8;
        float f6 = f;
        C8 c83 = c8;
        ql_0 ql_05 = ql_02;
        float f7 = ql_05.j80;
        f = ql_05.Wm0;
        float f8 = f7;
        f7 = 0.0f;
        c83.x = f8;
        c83.y = f;
        c83.z = f7;
        c8.cu(matrix4);
        tv0.ZX(c8, f6, f2, f3, f4);
        ql_03.j80 = c8.x;
        ql_03.Wm0 = c8.y;
        f7 = ql_02.Wm0 + ql_02.Eu0;
        f = 0.0f;
        c82.x = ql_02.j80 + ql_02.IA;
        c82.y = f7;
        c82.z = f;
        c8.cu(matrix4);
        tv0.ZX(c8, f5, f2, f3, f4);
        ql_04.IA = c8.x - ql_03.j80;
        ql_04.Eu0 = c8.y - ql_03.Wm0;
    }

    static {
        new ql_0();
    }
}

