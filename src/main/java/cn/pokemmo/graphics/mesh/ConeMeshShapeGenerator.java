/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.mesh;

import f.*;

import f.Bp0;
import f.C8;
import f.L8;
import f.LW;
import f.VC;
import f.dq0;
import f.nf_1;
import f.vo_0;

/*
 * Renamed from f.hB0
 */
public class ConeMeshShapeGenerator
extends vo_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static void lF0(L8 l8, float f, float f2, float f3, int n, boolean bl) {
        L8 l82;
        L8 l83 = l8;
        int n2 = n + 2;
        l83.qh.bD(l8.nF0 * n2);
        n2 = l83.NP;
        if (n2 == 1) {
            l82 = l8;
            n2 = n * 6;
        } else {
            if (n2 != 4 && n2 != 0) {
                throw new nf_1("Incorrect primtive type");
            }
            l82 = l8;
            n2 = n * 3;
        }
        l82.A00.Wf(n2);
        float f4 = f2;
        f2 = f * 0.5f;
        float f5 = f4 * 0.5f;
        float f6 = f3 * 0.5f;
        float f7 = 0.0f;
        float f8 = n;
        float f9 = (float)Math.PI * 2 / f8;
        f8 = 1.0f / f8;
        VC vC = vo_0.CE.kf0(null, null);
        vC.Lpt9 = true;
        vC.Qj = true;
        vC.CT = true;
        VC vC2 = vo_0.Ti0.kf0(null, null);
        float f10 = 0.0f;
        float f11 = 0.0f;
        C8 c8 = vC2.Bv;
        c8.x = f10;
        c8.y = f5;
        vC2.Bv.z = f11;
        vC2.Qj = true;
        f10 = 0.0f;
        f11 = 0.0f;
        float f12 = 1.0f;
        C8 c82 = vC2.t3;
        c82.x = f10;
        c82.y = f12;
        vC2.t3.z = f11;
        vC2.Lpt9 = true;
        short s = l8.ek0(vC2.p70(0.5f, 0.0f));
        short s2 = 0;
        for (int j = 0; j <= n; ++j) {
            VC vC3 = vC;
            float f13 = j;
            float f14 = f9 * f13 + f7;
            f13 = 1.0f - f8 * f13;
            C8 c83 = vC3.Bv;
            float f15 = LW.Fm0(f14) * f2;
            float f16 = f14;
            f14 = 0.0f;
            float f17 = LW.Po0(f16) * f6;
            c83.x = f15;
            c83.y = f14;
            c83.z = f17;
            vC3.t3.np(vC.Bv).KM();
            vC3.Bv.y = -f5;
            Bp0 bp0 = vC3.Lb;
            float f18 = f13;
            f13 = 1.0f;
            bp0.x = f18;
            bp0.y = f13;
            short s3 = l8.ek0(vC3);
            if (j != 0) {
                l8.Zh0(s, s3, s2);
            }
            s2 = s3;
        }
        if (bl) {
            float f19 = -f5;
            dq0.XI(l8, f, f3, n, f19, -1.0f, -1.0f, -180.0f, 180.0f);
        }
    }
}

