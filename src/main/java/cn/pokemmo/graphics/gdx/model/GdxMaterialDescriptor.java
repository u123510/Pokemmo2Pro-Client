/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.graphics.Color;
import f.Bp0;
import f.C8;
import f.mu_0;

public class GdxMaterialDescriptor
implements mu_0 {
    public final C8 Bv;
    public boolean Qj;
    public final C8 t3;
    public boolean Lpt9;
    public final Color z20;
    public boolean OF0;
    public final Bp0 Lb;
    public boolean CT;

    public GdxMaterialDescriptor() {
        this.Bv = new C8();
        this.t3 = new C8(0.0f, 1.0f, 0.0f);
        this.z20 = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.Lb = new Bp0();
    }

    @Override
    public final void bL() {
        GdxMaterialDescriptor vC = this;
        C8 c8 = vC.Bv;
        float f = 0.0f;
        float f2 = 0.0f;
        c8.x = 0.0f;
        c8.y = f;
        c8.z = f2;
        C8 c82 = vC.t3;
        f = 1.0f;
        f2 = 0.0f;
        c82.x = 0.0f;
        c82.y = f;
        c82.z = f2;
        vC.z20.set(1.0f, 1.0f, 1.0f, 1.0f);
        Bp0 bp0 = vC.Lb;
        f = 0.0f;
        bp0.x = 0.0f;
        bp0.y = f;
    }

    public GdxMaterialDescriptor kf0(C8 c8, C8 c82) {
        this.bL();
        boolean bl = c8 != null;
        this.Qj = bl;
        if (bl) {
            C8 c83 = this.Bv;
            C8 c84 = c8;
            c83.getClass();
            float f = c84.x;
            float f2 = c84.y;
            float f3 = c84.z;
            this.Bv.x = f;
            this.Bv.y = f2;
            this.Bv.z = f3;
        }
        boolean bl2 = c82 != null;
        this.Lpt9 = bl2;
        if (bl2) {
            C8 c85 = this.t3;
            C8 c86 = c82;
            c85.getClass();
            float f = c86.x;
            float f4 = c86.y;
            float f5 = c86.z;
            this.t3.x = f;
            this.t3.y = f4;
            this.t3.z = f5;
        }
        this.OF0 = false;
        this.CT = false;
        return this;
    }

    public GdxMaterialDescriptor p70(float f, float f2) {
        GdxMaterialDescriptor vC = this;
        Bp0 bp0 = vC.Lb;
        bp0.x = f;
        bp0.y = f2;
        vC.CT = true;
        return vC;
    }
}
