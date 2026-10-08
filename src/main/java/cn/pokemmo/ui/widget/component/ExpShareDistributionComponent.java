package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class ExpShareDistributionComponent extends BaseComponent {
    public int Ox;
    public int QQ;
    public pa0_0 BE;

    public ExpShareDistributionComponent() {
        this(1);
    }

    public ExpShareDistributionComponent(int i) {
        this.BE = pa0_0.dC0;
        this.Ox = i;
    }

    public ExpShareDistributionComponent(le0_2... le0_2VarArr) {
        this.BE = pa0_0.dC0;
        this.Ox = 1;
        Fp(le0_2VarArr);
    }

    public static int Pj(le0_2 v0) {
        int fU = v0.fU();
        int i2 = 0;
        for (int i3 = 0; i3 < fU; i3++) {
            i2 = Math.max(i2, v0.qA(i3).Se());
        }
        return i2;
    }

    public static int Lw0(le0_2 v0) {
        int fU = v0.fU();
        int i2 = 0;
        for (int i3 = 0; i3 < fU; i3++) {
            le0_2 qA = v0.qA(i3);
            i2 = Math.max(i2, du0(qA.Se(), qA.rm0(), qA.KC0()));
        }
        return i2;
    }

    public static int Bb0(le0_2 v0) {
        int fU = v0.fU();
        int i2 = 0;
        for (int i3 = 0; i3 < fU; i3++) {
            i2 = Math.max(i2, v0.qA(i3).R1());
        }
        return i2;
    }

    public static int rg0(le0_2 v0) {
        int fU = v0.fU();
        int i2 = 0;
        for (int i3 = 0; i3 < fU; i3++) {
            le0_2 qA = v0.qA(i3);
            i2 = Math.max(i2, du0(qA.R1(), qA.m0(), qA.S2()));
        }
        return i2;
    }

    @Override
    public final String Ck() {
        return "boxlayout";
    }

    public final void LPT2(pa0_0 pa0_0Var) {
        if (pa0_0Var != null) {
            if (this.BE != pa0_0Var) {
                this.BE = pa0_0Var;
                COm3();
            }
            return;
        }
        throw new NullPointerException("alignment");
    }

    @Override
    public final int R1() {
        int i1;
        if (this.Ox == 1) {
            int i2 = this.QQ;
            int fU = fU();
            i1 = Math.max(0, fU - 1) * i2;
            for (int i3 = 0; i3 < fU; i3++) {
                i1 += qA(i3).R1();
            }
        } else {
            i1 = Bb0(this);
        }
        return Math.max(super.R1(), this.e80 + this.NV + i1);
    }

    @Override
    public final int Se() {
        int i1;
        if (this.Ox == 1) {
            i1 = Pj(this);
        } else {
            int i2 = this.QQ;
            int fU = fU();
            i1 = Math.max(0, fU - 1) * i2;
            for (int i3 = 0; i3 < fU; i3++) {
                i1 += qA(i3).Se();
            }
        }
        return Math.max(super.Se(), this.y9 + this.Cz + i1);
    }

    @Override
    public final int pi0() {
        int i1;
        if (this.Ox == 1) {
            int i2 = this.QQ;
            int fU = fU();
            i1 = Math.max(0, fU - 1) * i2;
            for (int i3 = 0; i3 < fU; i3++) {
                le0_2 qA = qA(i3);
                i1 += du0(qA.R1(), qA.m0(), qA.S2());
            }
        } else {
            i1 = rg0(this);
        }
        return i1;
    }

    @Override
    public final int zs0() {
        if (this.Ox == 1) {
            return Lw0(this);
        }
        int i2 = this.QQ;
        int fU = fU();
        int i1 = Math.max(0, fU - 1) * i2;
        for (int i3 = 0; i3 < fU; i3++) {
            le0_2 qA = qA(i3);
            i1 += du0(qA.Se(), qA.rm0(), qA.KC0());
        }
        return i1;
    }

    @Override
    public final void Ib(Jn0 jn0) {
        super.Ib(jn0);
        LC0 lc0 = (LC0) jn0;
        int H10 = lc0.H10(0, "spacing");
        if (this.QQ != H10) {
            this.QQ = H10;
            COm3();
        }
        pa0_0 defaultAlign = pa0_0.dC0;
        Enum<?> enumVal = (Enum<?>) lc0.N30("alignment", true, defaultAlign.getDeclaringClass(), null);
        if (enumVal != null) {
            defaultAlign = (pa0_0) enumVal;
        }
        LPT2(defaultAlign);
    }

    @Override
    public final void K8() {
        if (fU() <= 0) {
            return;
        }
        if (this.Ox == 1) {
            int spacing = this.QQ;
            pa0_0 alignment = this.BE;
            int count = fU();
            int innerHeight = k5();
            int curX = this.A20 + this.e80;
            int innerY = this.SB0 + this.y9;
            for (int i = 0; i < count; i++) {
                le0_2 child = qA(i);
                int childWidth = du0(child.R1(), child.m0(), child.S2());
                int childHeight;
                if (alignment == pa0_0.Vp0) {
                    childHeight = innerHeight;
                } else {
                    childHeight = du0(child.Se(), child.rm0(), child.KC0());
                }
                child.oY(childWidth, childHeight);
                child.sy(curX, innerY + ((innerHeight - childHeight) * alignment.V4) / 2);
                curX += childWidth + spacing;
            }
        } else {
            int spacing = this.QQ;
            pa0_0 alignment = this.BE;
            int count = fU();
            int innerWidth = a3();
            int innerX = this.A20 + this.e80;
            int curY = this.SB0 + this.y9;
            for (int i = 0; i < count; i++) {
                le0_2 child = qA(i);
                int childWidth;
                if (alignment == pa0_0.Vp0) {
                    childWidth = innerWidth;
                } else {
                    childWidth = du0(child.R1(), child.m0(), child.S2());
                }
                int childHeight = du0(child.Se(), child.rm0(), child.KC0());
                child.oY(childWidth, childHeight);
                child.sy(innerX + ((innerWidth - childWidth) * alignment.CB0) / 2, curY);
                curY += childHeight + spacing;
            }
        }
    }

    public final void Fp(le0_2... le0_2VarArr) {
        if (le0_2VarArr.length < 1) {
            return;
        }
        int length = le0_2VarArr.length;
        for (int i = 0; i < length; i++) {
            le0_2 le0_2Var = le0_2VarArr[i];
            F9(fU(), le0_2Var);
        }
    }
}
