package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public abstract class EggIncubationProgressComponent extends BaseComponent {
    public static final MD0 FS;
    public final xe_1 Wt;
    public final xe_0 lK0;

    public EggIncubationProgressComponent() {
        this.Wt = new xe_1(this.Ed0());
        this.lK0 = new xe_0((X6) this, (X6) this);
        this.Wt.RR(new oy_1((X6) this));
        this.SL(this.Wt);
        this.Oq0(true);
        this.q20();
    }

    public static void P9(le0_2 widget, MD0 md0, boolean z) {
        widget.M.j70(md0, z);
        for (int i = 0; i < widget.fU(); i++) {
            P9(widget.qA(i), md0, z);
        }
    }

    static {
        FS = MD0.cB("comboboxKeyboardFocus");
    }

    public abstract boolean if0();

    @Override
    public final int pi0() {
        return ((X6) this).Il.m0() + this.Wt.m0();
    }

    @Override
    public final int zs0() {
        return Math.max(((X6) this).Il.rm0(), this.Wt.rm0());
    }

    @Override
    public final int R1() {
        return Math.max(super.R1(), ((X6) this).Il.R1() + this.Wt.R1());
    }

    @Override
    public final int Se() {
        int maxChild = Math.max(((X6) this).Il.Se(), this.Wt.Se());
        return Math.max(super.Se(), this.y9 + this.Cz + maxChild);
    }

    public final void oJ0() {
        int preferredHeight = this.lK0.Se();
        int minHeight = du0(preferredHeight, this.lK0.rm0(), this.lK0.G4);
        int parentBottom = this.lK0.K20.VM();
        int y = this.SB0;
        int belowY = y + this.OB;
        if (belowY + preferredHeight > parentBottom) {
            int aboveY = y - minHeight;
            le0_2 parent = this.lK0.K20;
            if (aboveY >= parent.SB0 + parent.y9) {
                this.lK0.E40(this.A20, aboveY);
            } else {
                this.lK0.E40(this.A20, parentBottom - preferredHeight);
            }
        } else {
            this.lK0.E40(this.A20, belowY);
        }
        int height = Math.min(minHeight, parentBottom - this.lK0.SB0);
        this.lK0.oY(this.Mx, height);
    }

    @Override
    public final void K8() {
        int buttonWidth = this.Wt.m0();
        int buttonHeight = this.k5();
        int innerX = this.A20 + this.e80;
        int innerY = this.SB0 + this.y9;
        this.Wt.E40(this.cz() - buttonWidth, innerY);
        this.Wt.oY(buttonWidth, buttonHeight);
        X6 x6 = (X6) this;
        x6.Il.E40(innerX, innerY);
        x6.Il.oY(Math.max(0, this.Wt.A20 - innerX), buttonHeight);
    }

    @Override
    public final void Ej0() {
        this.bA0();
        if (this.lK0.K20 != null) {
            this.oJ0();
        }
    }

    public final void hs() {
        P9(((X6) this).Il, FS, true);
    }

    public final void Bt() {
        P9(((X6) this).Il, FS, false);
    }
}
