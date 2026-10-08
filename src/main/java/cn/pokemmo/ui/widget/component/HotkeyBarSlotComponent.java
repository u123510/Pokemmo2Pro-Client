/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import f.KU;
import f.le0_2;

/*
 * Renamed from f.kA0
 */
public class HotkeyBarSlotComponent extends BaseComponent {
    public float pj;
    public float dK0;
    public boolean fq0 = true;
    public final int ax;
    public final boolean H4;
    public float C80;
    public float qq;

    public final void el0() {
        HotkeyBarSlotComponent ka0_12 = this;
        ka0_12.fq0 = false;
        KU kU = ka0_12.t30;
        int n = kU.KB;
        ka0_12.dK0 = 0.0f;
        ka0_12.pj = ka0_12.C80 * (float)(n - 1) + 0.0f;
        for (int j = 0; j < n; ++j) {
            HotkeyBarSlotComponent ka0_13 = this;
            le0_2 le0_22 = (le0_2)kU.get(j);
            ka0_13.pj += (float)le0_22.m0();
            ka0_13.dK0 = Math.max(ka0_13.dK0, (float)le0_22.rm0());
        }
        HotkeyBarSlotComponent ka0_14 = this;
        ka0_14.dK0 += 0.0f;
        if (ka0_14.H4) {
            HotkeyBarSlotComponent ka0_15 = this;
            ka0_15.pj = Math.round(ka0_15.pj);
            ka0_15.dK0 = Math.round(ka0_15.dK0);
        }
    }

    @Override
    public final String Ck() {
        return "";
    }

    @Override
    public final void COm3() {
        super.COm3();
        this.fq0 = true;
    }

    @Override
    public final void K8() {
        if (this.fq0) {
            this.el0();
        }
        int n = this.ax;
        HotkeyBarSlotComponent ka0_12 = this;
        float f = ka0_12.C80;
        float f2 = 0.0f;
        float f3 = ka0_12.qq;
        float f4 = ka0_12.dK0 - 0.0f - f2;
        float f5 = 0.0f;
        if ((n & 0x10) != 0) {
            f5 = (float)this.Mx - this.pj + f5;
        } else if ((n & 8) == 0) {
            f5 = ((float)this.Mx - this.pj) / 2.0f + f5;
        }
        if ((n & 4) == 0) {
            f2 = (n & 2) != 0 ? (float)this.OB - 0.0f - f4 : ((float)this.OB - f2 - 0.0f - f4) / 2.0f + f2;
        }
        KU kU = this.t30;
        int n2 = kU.KB;
        int n3 = 1;
        int n4 = 0;
        while (n4 != n2) {
            float f6;
            le0_2 le0_22 = (le0_2)kU.get(n4);
            float f7 = le0_22.m0();
            float f8 = le0_22.rm0();
            if (f3 > 0.0f) {
                f8 = f4 * f3;
            }
            f8 = Math.max(f8, (float)le0_22.Se());
            float f9 = le0_22.KC0();
            if (f9 > 0.0f && f8 > f9) {
                f8 = f9;
            }
            int n5 = n4;
            float f10 = (f4 - f8) / 2.0f + f2;
            le0_22.sy(this.A20 + (int)f5, this.SB0 + (int)f10);
            n4 = (int)f7;
            le0_22.oY(n4, (int)f8);
            f5 = f7 + f + f5;
            le0_22.Iu();
            n4 = n5 + n3;
        }
    }

    @Override
    public final int m0() {
        if (this.fq0) {
            this.el0();
        }
        return (int)this.pj;
    }

    @Override
    public final int rm0() {
        if (this.fq0) {
            this.el0();
        }
        return (int)this.dK0;
    }

    public HotkeyBarSlotComponent() {
        this.ax = 8;
        this.H4 = true;
    }

    public HotkeyBarSlotComponent(le0_2 ... le0_2Array) {
        this.ax = 8;
        this.H4 = true;
        int n = le0_2Array.length;
        for (int j = 0; j < n; ++j) {
            this.SL(le0_2Array[j]);
        }
    }
}

