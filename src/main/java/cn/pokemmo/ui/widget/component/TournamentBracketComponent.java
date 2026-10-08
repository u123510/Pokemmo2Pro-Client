package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;

public class TournamentBracketComponent extends BaseComponent {
    public static final MD0 gC;
    public static final MD0 QI0;
    public final ArrayList rJ;
    public final ia0_1 HB0;
    public final le0_2 El;
    public final uk0_2 Kj;
    public final uk0_2 PN;
    public boolean cM;
    public int tC0;
    public jg0_1 Vp0;
    public PB tI;

    static {
        gC = MD0.cB("firstTab");
        QI0 = MD0.cB("lastTab");
    }

    public TournamentBracketComponent() {
        this.uf("spritetabbedpane");
        this.rJ = new ArrayList();
        ia0_1 ia0_12 = new ia0_1();
        this.HB0 = ia0_12;
        le0_2 le0_22 = new le0_2();
        this.El = le0_22;
        uk0_2 uk0_22 = new uk0_2();
        this.Kj = uk0_22;
        uk0_2 uk0_23 = new uk0_2();
        this.PN = uk0_23;
        this.Vp0 = jg0_1.wk;
        ia0_12.uf("tabbox");
        le0_22.uf("");
        uk0_23.uf("");
        uk0_23.m00();
        le0_22.SL(ia0_12);
        uk0_22.SL(uk0_23);
        super.F9(0, uk0_22);
        super.F9(1, le0_22);
        this.Na("nextTab", this::DY);
        this.Na("prevTab", this::la);
    }

    public final void rR(int n) {
        int n2;
        if (this.Vp0.Tk) {
            n2 = this.HB0.Mx - this.El.Mx;
        } else {
            n2 = this.HB0.OB - this.El.OB;
        }
        n = Math.max(0, Math.min(n, n2));
        this.tC0 = n;
        if (this.Vp0.Tk) {
            this.HB0.E40(this.El.A20 - n, this.El.SB0);
        } else {
            this.HB0.E40(this.El.A20, this.El.SB0 - n);
        }
    }

    @Override
    public final void Ib(Jn0 jn0) {
        super.Ib(jn0);
        jg0_1 jg0_12 = (jg0_1) ((LC0) jn0).N30("tabPosition", false, jg0_1.class, jg0_1.wk);
        if (jg0_12 == null) {
            throw new NullPointerException("tabPosition");
        }
        if (this.Vp0 != jg0_12) {
            this.Vp0 = jg0_12;
            ia0_1 ia0_12 = this.HB0;
            int n = jg0_12.Tk ? 1 : 2;
            if (n == 0) {
                ia0_12.getClass();
                throw new NullPointerException("direction");
            }
            if (ia0_12.Ox != n) {
                ia0_12.Ox = n;
                ia0_12.COm3();
            }
            this.COm3();
        }
    }

    public final void Od0(boolean bl) {
        if (this.cM) {
            this.cM = false;
            this.El.IM = false;
            this.COm3();
        }
    }

    public final void qf(PB pB) {
        if (pB != null) {
            if (pB.oq0.K20 != this.HB0) {
                throw new IllegalArgumentException("Invalid tab");
            }
        }
        PB pB2 = this.tI;
        if (pB2 != pB) {
            this.tI = pB;
            if (pB2 != null) {
                pB2.Iw0();
            }
            if (pB != null) {
                pB.Iw0();
            }
            if (this.cM) {
                this.Iu();
                int n;
                int n2;
                int n3;
                if (this.Vp0.Tk) {
                    n = pB.oq0.A20 - this.HB0.A20;
                    n2 = pB.oq0.Mx + n;
                    n3 = this.El.Mx;
                } else {
                    n = pB.oq0.SB0 - this.HB0.SB0;
                    n2 = pB.oq0.OB + n;
                    n3 = this.El.OB;
                }
                int n4 = (n3 + 19) / 20;
                int n5 = n - n4;
                int n6 = n2 + n4;
                int n7 = this.tC0;
                if (n6 < n7) {
                    this.rR(n5);
                } else if (n6 > n7 + n3) {
                    this.rR(n6 - n3);
                }
            }
            if (pB != null && pB.pe0 != null) {
                lpt6__0.v90(pB.pe0);
            }
        }
    }

    @Override
    public final int R1() {
        int n;
        if (this.Vp0.Tk) {
            if (!this.cM) {
                n = Math.max(this.HB0.R1(), this.Kj.R1());
            } else {
                throw null;
            }
        } else {
            n = this.Kj.R1() + this.HB0.R1();
        }
        return Math.max(super.R1(), this.e80 + this.NV + n);
    }

    @Override
    public final int Se() {
        int n;
        if (this.Vp0.Tk) {
            n = this.Kj.Se() + this.HB0.Se();
        } else {
            n = Math.max(this.Kj.Se(), this.HB0.Se());
        }
        return Math.max(super.Se(), this.y9 + this.Cz + n);
    }

    @Override
    public final int pi0() {
        if (this.Vp0.Tk) {
            if (!this.cM) {
                return Math.max(this.HB0.m0(), this.Kj.m0());
            }
            throw null;
        }
        return this.Kj.m0() + this.HB0.m0();
    }

    @Override
    public final int zs0() {
        if (this.Vp0.Tk) {
            return this.Kj.rm0() + this.HB0.rm0();
        }
        return Math.max(this.Kj.rm0(), this.HB0.rm0());
    }

    @Override
    public final void K8() {
        int n = 0;
        int n2 = 0;
        int n3 = this.HB0.m0();
        int n4 = this.HB0.rm0();
        if (this.cM) {
            throw null;
        }
        if (this.Vp0.Tk) {
            n4 = Math.max(n2, n4);
        } else {
            n3 = Math.max(n, n3);
        }
        this.HB0.oY(n3, n4);
        switch (this.Vp0.ordinal()) {
            case 3: {
                this.El.E40(this.A20 + this.e80, this.SB0 + this.y9 - n4);
                this.El.oY(Math.max(0, this.a3() - n), n4);
                this.Kj.oY(this.a3(), Math.max(0, this.k5() - n4));
                this.Kj.E40(this.A20 + this.e80, this.SB0 + this.y9);
                break;
            }
            case 2: {
                this.El.E40(this.A20 + this.e80 - n3, this.SB0 + this.y9);
                this.El.oY(n3, Math.max(0, this.k5() - n2));
                this.Kj.oY(Math.max(0, this.a3() - n3), this.k5());
                this.Kj.E40(this.A20 + this.e80, this.SB0 + this.y9);
                break;
            }
            case 1: {
                this.El.E40(this.A20 + this.e80, this.SB0 + this.y9);
                this.El.oY(n3, Math.max(0, this.k5() - n2));
                this.Kj.oY(Math.max(0, this.a3() - n3), this.k5());
                this.Kj.E40(this.El.A20 + this.El.Mx, this.SB0 + this.y9);
                break;
            }
            case 0: {
                this.El.E40(this.A20 + this.e80, this.SB0 + this.y9);
                this.El.oY(Math.max(0, this.a3() - n), n4);
                this.Kj.oY(this.a3(), Math.max(0, this.k5() - n4));
                this.Kj.E40(this.A20 + this.e80, this.El.SB0 + this.El.OB);
                break;
            }
        }
    }

    @Override
    public final void em() {
        throw new UnsupportedOperationException("use addTab/removeTab");
    }

    @Override
    public final le0_2 fC0(int n) {
        throw new UnsupportedOperationException("use addTab/removeTab");
    }

    public final void la() {
        int n = -1;
        if (!this.rJ.isEmpty()) {
            int n2 = this.rJ.indexOf(this.tI);
            if (n2 < 0) {
                n = 0;
            } else {
                n = (n2 + n) % this.rJ.size();
                n = (n + this.rJ.size()) % this.rJ.size();
            }
            this.qf((PB) this.rJ.get(n));
        }
    }

    public final void DY() {
        int n = 1;
        if (!this.rJ.isEmpty()) {
            int n2 = this.rJ.indexOf(this.tI);
            if (n2 < 0) {
                n = 0;
            } else {
                n = (n2 + n) % this.rJ.size();
                n = (n + this.rJ.size()) % this.rJ.size();
            }
            this.qf((PB) this.rJ.get(n));
        }
    }

    @Override
    public final void F9(int n, le0_2 le0_22) {
        throw new UnsupportedOperationException("use addTab/removeTab");
    }
}
