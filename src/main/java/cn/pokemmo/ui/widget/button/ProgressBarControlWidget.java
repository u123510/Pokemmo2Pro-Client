/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.button;

import f.*;
import java.util.*;

import f.Jn0;
import f.KG0;
import f.LC0;
import f.MD0;
import f.dz_2;
import f.wl0_2;
import f.zk0_1;

/*
 * Renamed from f.aE0
 */
public class ProgressBarControlWidget extends BaseControl {
    public static final MD0 hn = MD0.cB("valueChanged");
    public static final MD0 j50 = MD0.cB("indeterminate");
    public wl0_2 RM;
    public float uc;

    public ProgressBarControlWidget() {
        ProgressBarControlWidget ae0_12 = this;
        ae0_12.Ed0().Mk(hn);
    }

    @Override
    public final String Ck() {
        return "progressbar";
    }

    public void aE(float f) {
        if (!(f > 0.0f)) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (this.uc != f) {
            this.uc = f;
            KG0 kG0 = this.M;
            kG0.j70(j50, false);
            kG0.Mk(hn);
        }
    }

    @Override
    public final void Ib(Jn0 jn0) {
        super.Ib(jn0);
        this.RM = ((LC0)((Object)jn0)).uT("progressImage");
    }

    @Override
    public final void FW(zk0_1 zk0_12) {
        ProgressBarControlWidget ae0_12 = this;
        int n = ae0_12.a3();
        int n2 = ae0_12.k5();
        wl0_2 wl0_22 = ae0_12.RM;
        if (wl0_22 != null && this.uc >= 0.0f) {
            int n3 = n - (n = wl0_22.Nx());
            int n4 = (int)((float)n3 * this.uc);
            if (n4 < 0) {
                n3 = 0;
            } else if (n4 <= n3) {
                n3 = n4;
            }
            int n5 = n3;
            ProgressBarControlWidget ae0_13 = this;
            KG0 kG0 = ae0_13.M;
            n3 = ae0_13.A20 + this.e80;
            n4 = ae0_13.SB0 + this.y9;
            int n6 = n + n5;
            this.RM.uf(kG0, n3, n4, n6, n2);
        }
        ProgressBarControlWidget ae0_14 = this;
        ae0_14.QD(ae0_14.M);
    }

    @Override
    public final int R1() {
        ProgressBarControlWidget ae0_12 = this;
        int n = super.R1();
        wl0_2 wl0_22 = ae0_12.Jj0;
        if (wl0_22 != null) {
            int n2 = n;
            n = wl0_22.Nx();
            n = Math.max(n2, this.e80 + this.NV + n);
        }
        return n;
    }

    @Override
    public int Se() {
        ProgressBarControlWidget ae0_12 = this;
        int n = super.Se();
        wl0_2 wl0_22 = ae0_12.Jj0;
        if (wl0_22 != null) {
            int n2 = n;
            n = wl0_22.Af();
            n = Math.max(n2, this.y9 + this.Cz + n);
        }
        return n;
    }

    @Override
    public final int pi0() {
        ProgressBarControlWidget ae0_12 = this;
        int n = super.pi0();
        wl0_2 wl0_22 = ae0_12.RM;
        if (wl0_22 != null) {
            n = Math.max(n, wl0_22.Nx());
        }
        return n;
    }

    @Override
    public final int zs0() {
        ProgressBarControlWidget ae0_12 = this;
        int n = super.zs0();
        wl0_2 wl0_22 = ae0_12.RM;
        if (wl0_22 != null) {
            n = Math.max(n, wl0_22.Af());
        }
        return n;
    }
}

