/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import f.le0_2;

public abstract class BaseItemSlotGridComponent extends BaseComponent {
    public BaseItemSlotGridComponent() {
        BaseItemSlotGridComponent c0 = this;
        c0.QI();
    }

    @Override
    public final void Pv0(le0_2 le0_22) {
        this.Qw0(le0_22);
    }

    public void Qw0(le0_2 le0_22) {
        if (this.Em0 != null && le0_22 != null) {
            int n;
            int n2;
            if (le0_22.K20 == this && (n2 = this.Dp(le0_22)) >= 0 && n2 < (n = this.fU() - 1)) {
                this.ND0(n2, n);
            }
            return;
        }
    }

    @Override
    public void K8() {
        BaseItemSlotGridComponent c0 = this;
        int n = c0.SB0 + this.y9;
        int n2 = c0.A20 + this.e80;
        int n3 = c0.cz();
        int n4 = c0.VM();
        int n5 = Math.max(0, n3 - n2);
        int n6 = Math.max(0, n4 - n);
        int n7 = c0.fU();
        for (int j = 0; j < n7; ++j) {
            le0_2 le0_22;
            le0_2 le0_23 = le0_22 = this.qA(j);
            int n8 = Math.min(Math.max(n5, le0_22.R1()), le0_22.Mx);
            le0_23.oY(n8, Math.min(Math.max(n6, le0_22.Se()), le0_22.OB));
            n8 = Math.max(n2, Math.min(n3 - le0_23.Mx, le0_22.A20));
            le0_22.sy(n8, Math.max(n, Math.min(n4 - le0_22.OB, le0_22.SB0)));
        }
    }
}

