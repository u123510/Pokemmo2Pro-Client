/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.graphics.Color;
import f.BB;
import f.Bp0;
import f.C8;
import f.UJ0;
import f.tj0_1;

/*
 * Renamed from f.Jk0
 */
public class GdxBlendStateConfig {
    public final C8 X70 = new C8(Float.NaN, 0.0f, 0.0f);
    public final Bp0 Er = new Bp0(Float.NaN, 0.0f);
    public final Color EN = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    public final Bp0 wG0 = new Bp0();
    public boolean TZ = false;
    public boolean hI = false;
    public boolean jJ0 = false;
    public boolean nh0 = false;
    public final UJ0 UA0 = new UJ0();
    public int gp0;

    public GdxBlendStateConfig() {
        new BB();
    }

    public final void Vl0(tj0_1 tj0_12, C8 c8) {
        GdxBlendStateConfig jk0_02 = this;
        C8 c82 = c8;
        c82.cu(tj0_12.Bw);
        float f = c82.x;
        float f2 = c82.y;
        float f3 = c82.z;
        ++jk0_02.gp0;
        UJ0 uJ0 = jk0_02.UA0;
        float[] fArray = uJ0.iS;
        int n = uJ0.Or;
        if (n + 2 >= fArray.length) {
            fArray = uJ0.TT(Math.max(8, (int)((float)n * 1.75f)));
        }
        int n2 = uJ0.Or;
        fArray[n2] = f;
        fArray[n2 + 1] = f2;
        fArray[n2 + 2] = f3;
        uJ0.Or = n2 + 3;
        if (this.jJ0) {
            UJ0 uJ02 = this.UA0;
            C8 c83 = this.X70;
            f2 = c83.x;
            f3 = c83.y;
            float f4 = c83.z;
            n = uJ02.Or;
            fArray = uJ02.iS;
            if (n + 2 >= fArray.length) {
                fArray = uJ02.TT(Math.max(8, (int)((float)n * 1.75f)));
            }
            int n3 = uJ02.Or;
            fArray[n3] = f2;
            fArray[n3 + 1] = f3;
            fArray[n3 + 2] = f4;
            uJ02.Or = n3 + 3;
        }
        if (this.TZ) {
            UJ0 uJ03 = this.UA0;
            Color color = this.EN;
            f2 = color.r;
            f3 = color.g;
            float f5 = color.b;
            float f6 = color.a;
            int n4 = uJ03.Or;
            float[] fArray2 = uJ03.iS;
            if (n4 + 3 >= fArray2.length) {
                fArray2 = uJ03.TT(Math.max(8, (int)((float)n4 * 1.8f)));
            }
            int n5 = uJ03.Or;
            fArray2[n5] = f2;
            fArray2[n5 + 1] = f3;
            fArray2[n5 + 2] = f5;
            fArray2[n5 + 3] = f6;
            uJ03.Or = n5 + 4;
        }
        if (this.hI) {
            UJ0 uJ04 = this.UA0;
            Bp0 bp0 = this.Er;
            f2 = bp0.x;
            f3 = 1.0f - bp0.y;
            int n6 = uJ04.Or;
            float[] fArray3 = uJ04.iS;
            if (n6 + 1 >= fArray3.length) {
                fArray3 = uJ04.TT(Math.max(8, (int)((float)n6 * 1.75f)));
            }
            int n7 = uJ04.Or;
            fArray3[n7] = f2;
            fArray3[n7 + 1] = f3;
            uJ04.Or = n7 + 2;
        }
        if (this.nh0) {
            UJ0 uJ05 = this.UA0;
            Bp0 bp0 = this.wG0;
            float f7 = bp0.x;
            f2 = bp0.y;
            int n8 = uJ05.Or;
            float[] fArray4 = uJ05.iS;
            if (n8 + 1 >= fArray4.length) {
                fArray4 = uJ05.TT(Math.max(8, (int)((float)n8 * 1.75f)));
            }
            int n9 = uJ05.Or;
            fArray4[n9] = f7;
            fArray4[n9 + 1] = f2;
            uJ05.Or = n9 + 2;
        }
    }
}

