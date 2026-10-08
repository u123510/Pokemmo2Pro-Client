/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.model;

import f.*;

import f.Bp0;
import f.C8;
import f.L8;
import f.LW;
import f.VC;
import f.dq0;
import f.vo_0;

public class ModelAnimationKeyframeTrack
extends vo_0 {
    public static void gp0(L8 l8, float f, float f2, float f3, int n) {
        int n2 = n;
        float f4 = f2;
        f2 = 0.0f;
        float f5 = 360.0f;
        float f6 = f * 0.5f;
        float f7 = f4 * 0.5f;
        float f8 = f3 * 0.5f;
        float f9 = 0.0f;
        float f10 = n2;
        float f11 = (float)Math.PI * 2 / f10;
        f10 = 1.0f / f10;
        VC vC = vo_0.CE.kf0(null, null);
        vC.Lpt9 = true;
        vC.Qj = true;
        vC.CT = true;
        VC vC2 = vo_0.Ti0.kf0(null, null);
        vC2.Lpt9 = true;
        vC2.Qj = true;
        vC2.CT = true;
        short s = 0;
        short s2 = 0;
        int n3 = (n2 + 1) * 2;
        l8.qh.bD(l8.nF0 * n3);
        l8.Pm(n);
        for (n3 = 0; n3 <= n; ++n3) {
            VC vC3 = vC2;
            VC vC4 = vC;
            float f12 = n3;
            float f13 = f11 * f12 + f9;
            f12 = 1.0f - f10 * f12;
            C8 c8 = vC4.Bv;
            float f14 = LW.Fm0(f13) * f6;
            float f15 = f13;
            f13 = 0.0f;
            float f16 = LW.Po0(f15) * f8;
            c8.x = f14;
            c8.y = f13;
            c8.z = f16;
            vC4.t3.np(vC.Bv).KM();
            C8 c82 = vC4.Bv;
            vC4.Bv.y = -f7;
            Bp0 bp0 = vC4.Lb;
            f16 = 1.0f;
            bp0.x = f12;
            bp0.y = f16;
            C8 c83 = vC3.Bv;
            C8 c84 = c82;
            c83.getClass();
            float f17 = c84.x;
            f16 = c84.y;
            float f18 = c84.z;
            vC3.Bv.x = f17;
            vC3.Bv.y = f16;
            vC3.Bv.z = f18;
            vC3.t3.np(vC.t3);
            vC3.Bv.y = f7;
            Bp0 bp02 = vC3.Lb;
            float f19 = f12;
            f12 = 0.0f;
            bp02.x = f19;
            bp02.y = f12;
            short s3 = l8.ek0(vC);
            short s4 = l8.ek0(vC2);
            if (n3 != 0) {
                l8.Ix(s, s4, s3, s2);
            }
            s2 = s3;
            s = s4;
        }
        dq0.XI(l8, f, f3, n, f7, 1.0f, 1.0f, f2, f5);
        float f20 = -f7;
        dq0.XI(l8, f, f3, n, f20, -1.0f, -1.0f, -180.0f, 180.0f);
    }
}

