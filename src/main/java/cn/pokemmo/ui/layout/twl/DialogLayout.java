package cn.pokemmo.ui.layout.twl;

import f.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DialogLayout extends le0_2 {
    public static final boolean do0;
    public static final Uu zx;
    public static final boolean oE0 = !DialogLayout.class.desiredAssertionStatus();
    public L50 zU;
    public L50 Cb;
    public L50 mK;
    public L50 vu0;
    public QS w8;
    public final boolean wr;
    public boolean gI;
    public boolean GG0;
    public boolean uc;
    public boolean tp;
    public boolean JL;
    public ya_1 pJ0;
    public ya_1 L4;
    public Throwable DH;
    public final HashMap wG;
    public boolean ua0;

    static {
        boolean debug = false;
        try {
            debug = Boolean.getBoolean("debugLayoutGroups");
        } catch (SecurityException ignored) {}
        do0 = debug;
        zx = new Uu(0, 0, 32767);
    }

    public DialogLayout() {
        super();
        this.wr = true;
        this.gI = true;
        this.ua0 = false;
        this.wG = new HashMap();
        ah0();
    }

    public final void ah0() {
        this.JL = true;
        if (do0) {
            this.DH = new Throwable("DialogLayout created/used here").fillInStackTrace();
        }
    }

    @Override
    public String Ck() {
        return "dialoglayout";
    }

    public final DialogLayout Pc() {
        WQ(new Hm0(this));
        x40(new Hm0(this));
        return this;
    }

    public final ya_1 kl0() {
        return this.pJ0;
    }

    public final void WQ(ya_1 v1) {
        if (v1 != null) {
            if (v1.p4 != this) {
                throw new IllegalArgumentException("Can't add group from different layout");
            }
            if (v1.o4) {
                throw new IllegalArgumentException("Group already added to another group");
            }
        }
        this.pJ0 = v1;
        ah0();
        this.GG0 = true;
        rc();
    }

    public final ya_1 nt0() {
        return this.L4;
    }

    public final void x40(ya_1 v1) {
        if (v1 != null) {
            if (v1.p4 != this) {
                throw new IllegalArgumentException("Can't add group from different layout");
            }
            if (v1.o4) {
                throw new IllegalArgumentException("Group already added to another group");
            }
        }
        this.L4 = v1;
        ah0();
        this.GG0 = true;
        rc();
    }

    @Override
    public final void Ib(Jn0 v1) {
        super.Ib(v1);
        try {
            this.tp = true;
            this.zU = (L50) ((LC0) v1).N30("smallGap", true, L50.class, L50.Uy);
            rc();
            LC0 lc = (LC0) v1;
            this.Cb = (L50) lc.N30("mediumGap", true, L50.class, L50.Uy);
            rc();
            this.mK = (L50) lc.N30("largeGap", true, L50.class, L50.Uy);
            rc();
            this.vu0 = (L50) lc.N30("defaultGap", true, L50.class, L50.Uy);
            rc();
            this.w8 = lc.C60("namedGaps");
            this.tp = false;
            this.uc = false;
            super.COm3();
        } catch (Throwable t) {
            this.tp = false;
            throw t;
        }
    }

    @Override
    public int R1() {
        if (this.pJ0 != null) {
            Jf0();
            int w = this.pJ0.zR(0);
            return this.e80 + this.NV + w;
        }
        return super.R1();
    }

    @Override
    public int Se() {
        if (this.L4 != null) {
            Jf0();
            int h = this.L4.zR(1);
            return this.y9 + this.Cz + h;
        }
        return super.Se();
    }

    @Override
    public int pi0() {
        if (this.pJ0 != null) {
            Jf0();
            return this.pJ0.Kn(0);
        }
        return super.pi0();
    }

    @Override
    public int zs0() {
        if (this.L4 != null) {
            Jf0();
            return this.L4.Kn(1);
        }
        return super.zs0();
    }

    public final void lt0() {
        if (this.pJ0 != null && this.L4 != null) {
            Jf0();
            int minW = this.pJ0.zR(0);
            int minH = this.L4.zR(1);
            int prefW = this.pJ0.Kn(0);
            int prefH = this.L4.Kn(1);
            int maxW = this.Ya0;
            int maxH = this.G4;
            int w = du0(prefW, minW, maxW);
            int h = du0(prefH, minH, maxH);
            gC0(w, h);
            t60();
        }
    }

    @Override
    public void K8() {
        if (this.pJ0 != null && this.L4 != null) {
            Jf0();
            t60();
        } else if (this.JL) {
            this.JL = false;
            if (!this.ua0) {
                Logger.getLogger(fy_2.class.getName()).log(Level.WARNING, "Dialog layout has incomplete state", this.DH);
            }
        }
    }

    public final void Jf0() {
        if (this.GG0) {
            if (this.wr) {
                try {
                    this.tp = true;
                    if (this.pJ0 != null && this.L4 != null) {
                        this.pJ0.VE0();
                        this.L4.VE0();
                        rc();
                    }
                    if (this.pJ0 != null && this.L4 != null) {
                        this.pJ0.u70();
                        this.L4.u70();
                        rc();
                    }
                    this.tp = false;
                } catch (Throwable t) {
                    this.tp = false;
                    throw t;
                }
            }
            this.GG0 = false;
            this.uc = false;
        }
        if (!this.uc) {
            for (Object obj : this.wG.values()) {
                zb0_1 entry = (zb0_1) obj;
                if (this.gI || entry.p40.eE) {
                    entry.ur = entry.p40.A20;
                    entry.Lz = entry.p40.SB0;
                    entry.Y50 = entry.p40.Mx;
                    entry.sM = entry.p40.OB;
                    entry.Y = entry.p40.R1();
                    entry.yF = entry.p40.Se();
                    entry.WH0 = entry.p40.S2();
                    entry.N1 = entry.p40.KC0();
                    entry.Fn = du0(entry.Y, entry.p40.m0(), entry.WH0);
                    entry.xk = du0(entry.yF, entry.p40.rm0(), entry.N1);
                    entry.D70 = 0;
                }
            }
            this.uc = true;
        }
    }

    public final void t60() {
        this.pJ0.od(0, this.A20 + this.e80, a3());
        this.L4.od(1, this.SB0 + this.y9, k5());
        try {
            for (Object obj : this.wG.values()) {
                zb0_1 entry = (zb0_1) obj;
                if (this.gI || entry.p40.eE) {
                    entry.aH();
                }
            }
        } catch (IllegalStateException e) {
            if (this.DH != null && e.getCause() == null) {
                e.initCause(this.DH);
            }
            throw e;
        }
    }

    @Override
    public final void COm3() {
        this.uc = false;
        super.COm3();
    }

    public final void FW(zk0_1 v1) {
        this.uc = false;
    }

    public final void Ej0() {
        this.uc = false;
        bA0();
    }

    public void C(zk0_1 v1) {
        this.uc = false;
    }

    public final ya_1 hb(le0_2... v1) {
        return new Hm0(this).LPt3(v1);
    }

    public final ya_1 Ou0(ya_1... v1) {
        return new Hm0(this).Xq(v1);
    }

    public final ya_1 C7(le0_2... v1) {
        return new I7(this).LPt3(v1);
    }

    public final ya_1 bx0(ya_1... v1) {
        return new I7(this).Xq(v1);
    }

    @Override
    public void em() {
        super.em();
        this.wG.clear();
        if (this.pJ0 != null) {
            this.pJ0.L1();
        }
        if (this.L4 != null) {
            this.L4.L1();
        }
        this.GG0 = true;
        rc();
    }

    @Override
    public final le0_2 fC0(int i1) {
        le0_2 removed = super.fC0(i1);
        this.wG.remove(removed);
        if (this.pJ0 != null) {
            this.pJ0.L1();
        }
        if (this.L4 != null) {
            this.L4.L1();
        }
        this.GG0 = true;
        rc();
        return removed;
    }

    public final void rc() {
        if (this.pJ0 != null && this.L4 != null && !this.tp) {
            this.uc = false;
            super.COm3();
        }
    }

    public final void YY(zb0_1 v1) {
        le0_2 widget = v1.p40;
        int idx = Dp(widget);
        if (!oE0 && idx < 0) {
            throw new AssertionError();
        }
        super.fC0(idx);
        this.wG.remove(widget);
    }

    @Override
    public final void F9(int i1, le0_2 v2) {
        super.F9(i1, v2);
        this.wG.put(v2, new zb0_1(v2));
    }

    public final void tI0() {
        if (this.gI) {
            this.gI = false;
            this.GG0 = true;
            rc();
        }
    }

    public final Hm0 lo0() {
        return new Hm0(this);
    }

    public final I7 H10() {
        return new I7(this);
    }

    public final void ld() {
        if (!this.gI) {
            this.GG0 = true;
            rc();
        }
    }

    public final void Yg(pa0_0 v1, le0_2 v2) {
        if (v2 == null) {
            throw new NullPointerException("widget");
        }
        if (v1 == null) {
            throw new NullPointerException("alignment");
        }
        zb0_1 entry = (zb0_1) this.wG.get(v2);
        if (entry != null) {
            if (!oE0 && v2.K20 != this) {
                throw new AssertionError();
            }
            entry.mU = v1;
        }
    }
}
