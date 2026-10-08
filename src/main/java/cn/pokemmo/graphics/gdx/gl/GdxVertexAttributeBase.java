/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.math.Matrix4;
import f.C8;
import f.kr0_0;

public abstract class GdxVertexAttributeBase {
    public static final Matrix4 f7 = new Matrix4();
    public static final C8 gn0 = new C8();

    public static float[] Dw0(float[] fArray, float[] fArray2) {
        kr0_0 kr0_03 = new kr0_0(fArray);
        int n = 0;
        float f = kr0_03.VD(0, 0) + fArray2[0 * 4 + 0];
        kr0_03.Jg(0, n, f);
        n = 0;
        f = kr0_03.VD(1, 0) + fArray2[0 * 4 + 1];
        kr0_03.Jg(1, n, f);
        n = 0;
        f = kr0_03.VD(2, 0) + fArray2[0 * 4 + 2];
        kr0_03.Jg(2, n, f);
        n = 1;
        f = kr0_03.VD(0, 1) + fArray2[1 * 4 + 0];
        kr0_03.Jg(0, n, f);
        n = 1;
        f = kr0_03.VD(1, 1) + fArray2[1 * 4 + 1];
        kr0_03.Jg(1, n, f);
        n = 1;
        f = kr0_03.VD(2, 1) + fArray2[1 * 4 + 2];
        kr0_03.Jg(2, n, f);
        C8 c8 = gn0;
        f = kr0_03.VD(0, 0);
        float f2 = kr0_03.VD(1, 0);
        c8.x = f;
        c8.y = f2;
        c8.z = kr0_03.VD(2, 0);
        c8.KM();
        f = c8.x;
        kr0_03.Jg(0, 0, f);
        f = c8.y;
        kr0_03.Jg(1, 0, f);
        f = c8.z;
        kr0_03.Jg(2, 0, f);
        f = kr0_03.VD(0, 1);
        f2 = kr0_03.VD(1, 1);
        c8.x = f;
        c8.y = f2;
        c8.z = kr0_03.VD(2, 1);
        c8.KM();
        f = c8.x;
        kr0_03.Jg(0, 1, f);
        f = c8.y;
        kr0_03.Jg(1, 1, f);
        f = c8.z;
        kr0_03.Jg(2, 1, f);
        int n2 = 2;
        f2 = kr0_03.VD(0, 2) + fArray2[2 * 4 + 0];
        kr0_03.Jg(0, n2, f2);
        n2 = 2;
        f2 = kr0_03.VD(1, 2) + fArray2[2 * 4 + 1];
        kr0_03.Jg(1, n2, f2);
        n2 = 2;
        float f3 = kr0_03.VD(2, 2) + fArray2[2 * 4 + 2];
        kr0_03.Jg(2, n2, f3);
        f3 = kr0_03.VD(0, 2);
        float f4 = kr0_03.VD(1, 2);
        c8.x = f3;
        c8.y = f4;
        c8.z = kr0_03.VD(2, 2);
        c8.KM();
        f3 = c8.x;
        kr0_03.Jg(0, 2, f3);
        f3 = c8.y;
        kr0_03.Jg(1, 2, f3);
        float f5 = c8.z;
        kr0_03.Jg(2, 2, f5);
        return fArray;
    }
}

