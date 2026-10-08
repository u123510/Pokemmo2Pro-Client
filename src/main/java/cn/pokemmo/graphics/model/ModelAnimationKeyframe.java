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
import f.nf_1;
import f.vo_0;

public class ModelAnimationKeyframe
extends vo_0 {
    /*
     * Enabled aggressive block sorting
     */
    public static void XI(L8 l8, float f, float f2, int n, float f3, float f4, float f5, float f6, float f7) {
        L8 l82;
        L8 l83 = l8;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 1.0f;
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
        float f17 = f6;
        f6 = f17 * ((float)Math.PI / 180);
        f7 = (f7 - f17) * ((float)Math.PI / 180) / (float)n;
        C8 c8 = vo_0.KI0;
        c8.x = f5;
        c8.y = f12;
        c8.z = f13;
        C8 c82 = c8.Fg0(f * 0.5f);
        c8 = vo_0.Hq;
        c8.x = f14;
        c8.y = f15;
        c8.z = f16;
        C8 c83 = c8.Fg0(f2 * 0.5f);
        c8 = vo_0.CS;
        c8.x = f5;
        c8.y = f12;
        c8.z = f13;
        f5 = 0.0f;
        c8.Fg0(0.0f);
        C8 c84 = vo_0.H9;
        c84.x = f14;
        c84.y = f15;
        c84.z = f16;
        c84.Fg0(f5);
        VC vC = vo_0.CE.kf0(null, null);
        vC.Lpt9 = true;
        vC.Qj = true;
        vC.CT = true;
        Bp0 bp0 = vC.Lb;
        f5 = 0.5f;
        bp0.x = 0.5f;
        bp0.y = f5;
        Object object = vC.Bv;
        ((C8)object).x = f8;
        ((C8)object).y = f3;
        vC.Bv.z = f9;
        object = vC.t3;
        ((C8)object).x = f10;
        ((C8)object).y = f4;
        vC.t3.z = f11;
        object = vo_0.Ti0.kf0(null, null);
        ((VC)object).Lpt9 = true;
        ((VC)object).Qj = true;
        ((VC)object).CT = true;
        Bp0 bp02 = ((VC)object).Lb;
        float f18 = 0.5f;
        bp02.x = 0.5f;
        bp02.y = f18;
        C8 c85 = ((VC)object).Bv;
        c85.x = f8;
        c85.y = f3;
        ((VC)object).Bv.z = f9;
        c85 = ((VC)object).t3;
        c85.x = f10;
        c85.y = f4;
        ((VC)object).t3.z = f11;
        short s = l8.ek0((VC)object);
        short s2 = 0;
        int n3 = 0;
        while (n3 <= n) {
            Object object2 = object;
            float f19 = f7 * (float)n3 + f6;
            float f20 = LW.Fm0(f19);
            f13 = LW.Po0(f19);
            C8 c86 = ((VC)object2).Bv;
            c86.x = f8;
            c86.y = f3;
            c86.z = f9;
            f14 = c82.x * f20;
            float f21 = c83.x * f13 + f14;
            f14 = c82.y * f20;
            f14 = c83.y * f13 + f14;
            f15 = c82.z * f20;
            c86.na(f21, f14, c83.z * f13 + f15);
            Bp0 bp03 = ((VC)object2).Lb;
            f20 = f20 * 0.5f + 0.5f;
            f13 = f13 * 0.5f + 0.5f;
            bp03.x = f20;
            bp03.y = f13;
            short s3 = l8.ek0((VC)object2);
            if (n3 != 0) {
                l8.Zh0(s3, s2, s);
            }
            ++n3;
            s2 = s3;
        }
        return;
    }
}

