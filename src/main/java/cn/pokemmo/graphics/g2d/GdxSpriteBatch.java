package cn.pokemmo.graphics.g2d;

import com.badlogic.gdx.graphics.Color;
import f.*;

/**
 * 现代化重构类 - 原始类: f.ir_0
 */
public class GdxSpriteBatch extends md0_1 implements fy0_0 {

    public final jy_1 Prn;
    public final C3 rg0;
    public boolean J9;
    public final xv_0 cx0;
    public final Bp0 Z90;
    public final te0_0[] eg0;
    public final boolean[] h10;
    public final int[] aH;
    public final int[] Gi;
    public int wm;
    public int Rr0;
    public te0_0 a40;
    public te0_0 sy0;
    public te0_0 S50;
    public final KU ql;
    public final boolean uG;

    public GdxSpriteBatch() {
        this(new ee0_1(P9.iw, (float) lg_0.S4.Kr0(), (float) lg_0.S4.sD0(), new PC0()), new ui_1());
        this.J9 = true;
    }

    public GdxSpriteBatch(jy_1 v1) {
        this(v1, new ui_1());
        this.J9 = true;
    }

    public GdxSpriteBatch(jy_1 v1, C3 v2) {
        super();
        this.Z90 = new Bp0();
        this.eg0 = new te0_0[20];
        this.h10 = new boolean[20];
        this.aH = new int[20];
        this.Gi = new int[20];
        this.ql = new KU(true, 4, SI.class);
        this.uG = true;
        Color c = new Color(0.0f, 1.0f, 0.0f, 0.85f);
        if (v1 == null) {
            throw new IllegalArgumentException("viewport cannot be null.");
        }
        if (v2 == null) {
            throw new IllegalArgumentException("batch cannot be null.");
        }
        this.Prn = v1;
        this.rg0 = v2;
        this.cx0 = new xv_0();
        this.cx0.BA((ir_0) this);
        v1.Yw0(lg_0.S4.Kr0(), lg_0.S4.sD0());
    }

    public final te0_0 Lpt3(te0_0 v1, int i2, int i3, int i4) {
        this.Z90.x = (float) i2;
        this.Z90.y = (float) i3;
        this.Prn.lPt8(this.Z90);
        te0_0 v2 = Ic(this.Z90.x, this.Z90.y, true);
        if (v2 == v1) {
            return v1;
        }
        if (v1 != null) {
            ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
            ev.wv = F00.G60;
            ev.BX = (ir_0) this;
            ev.hC0 = this.Z90.x;
            ev.Ki = this.Z90.y;
            ev.bF = i4;
            v1.getClass();
            v1.LC(ev);
            UE0.P3(ev);
        }
        if (v2 != null) {
            ni_1 ev2 = (ni_1) UE0.TL0(ni_1.class).obtain();
            ev2.wv = F00.Lj;
            ev2.BX = (ir_0) this;
            ev2.hC0 = this.Z90.x;
            ev2.Ki = this.Z90.y;
            ev2.bF = i4;
            v2.getClass();
            v2.LC(ev2);
            UE0.P3(ev2);
        }
        return v2;
    }

    public final void xX(te0_0 v1, int i2, int i3, int i4) {
        this.Z90.x = (float) i2;
        this.Z90.y = (float) i3;
        this.Prn.lPt8(this.Z90);
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.G60;
        ev.BX = (ir_0) this;
        ev.hC0 = this.Z90.x;
        ev.Ki = this.Z90.y;
        ev.bF = i4;
        v1.getClass();
        v1.LC(ev);
        UE0.P3(ev);
    }

    public final boolean R8(int i1, int i2, int i3, int i4) {
        if (!Nz(i1, i2)) {
            return false;
        }
        this.h10[i3] = true;
        this.aH[i3] = i1;
        this.Gi[i3] = i2;
        this.Z90.x = (float) i1;
        this.Z90.y = (float) i2;
        this.Prn.lPt8(this.Z90);
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.Fq0;
        ev.BX = (ir_0) this;
        float x = this.Z90.x;
        ev.hC0 = x;
        float y = this.Z90.y;
        ev.Ki = y;
        ev.bF = i3;
        ev.mF = i4;
        te0_0 target = Ic(x, y, true);
        if (target == null) {
            if (this.cx0.nx0 == cs_0.FU) {
                this.cx0.LC(ev);
            }
        } else {
            target.LC(ev);
        }
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final boolean Ao0(int i1, int i2, int i3) {
        this.aH[i3] = i1;
        this.Gi[i3] = i2;
        this.wm = i1;
        this.Rr0 = i2;
        if (this.ql.KB == 0) {
            return false;
        }
        this.Z90.x = (float) i1;
        this.Z90.y = (float) i2;
        this.Prn.lPt8(this.Z90);
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.O3;
        ev.BX = (ir_0) this;
        ev.hC0 = this.Z90.x;
        ev.Ki = this.Z90.y;
        ev.bF = i3;
        SI[] items = (SI[]) this.ql.pa();
        int size = this.ql.KB;
        for (int i = 0; i < size; i++) {
            SI si = items[i];
            if (si.Up == i3) {
                if (this.ql.j4(si, true)) {
                    ev.bA = si.k0;
                    ev.vB0 = si.Mb0;
                    if (si.CF.my(ev)) {
                        ev.bC = true;
                    }
                }
            }
        }
        this.ql.Gj0();
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final boolean kh(int i1, int i2, int i3, int i4) {
        this.h10[i3] = false;
        this.aH[i3] = i1;
        this.Gi[i3] = i2;
        if (this.ql.KB == 0) {
            return false;
        }
        this.Z90.x = (float) i1;
        this.Z90.y = (float) i2;
        this.Prn.lPt8(this.Z90);
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.Hz;
        ev.BX = (ir_0) this;
        ev.hC0 = this.Z90.x;
        ev.Ki = this.Z90.y;
        ev.bF = i3;
        ev.mF = i4;
        SI[] items = (SI[]) this.ql.pa();
        int size = this.ql.KB;
        for (int i = 0; i < size; i++) {
            SI si = items[i];
            if (si.Up == i3 && si.JQ == i4) {
                if (this.ql.sj0(si, true)) {
                    ev.bA = si.k0;
                    ev.vB0 = si.Mb0;
                    if (si.CF.my(ev)) {
                        ev.bC = true;
                    }
                    UE0.P3(si);
                }
            }
        }
        this.ql.Gj0();
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final boolean EA0(int i1, int i2) {
        this.wm = i1;
        this.Rr0 = i2;
        if (!Nz(i1, i2)) {
            return false;
        }
        this.Z90.x = (float) i1;
        this.Z90.y = (float) i2;
        this.Prn.lPt8(this.Z90);
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.Pi0;
        ev.BX = (ir_0) this;
        float x = this.Z90.x;
        ev.hC0 = x;
        float y = this.Z90.y;
        ev.Ki = y;
        te0_0 target = Ic(x, y, true);
        if (target == null) {
            target = this.cx0;
        }
        target.LC(ev);
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final boolean gl0(float f1, float f2) {
        te0_0 target = this.S50;
        if (target == null) {
            target = this.cx0;
        }
        this.Z90.x = (float) this.wm;
        this.Z90.y = (float) this.Rr0;
        this.Prn.lPt8(this.Z90);
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.x20;
        ev.BX = (ir_0) this;
        ev.hC0 = this.Z90.x;
        ev.Ki = this.Z90.y;
        ev.ks0 = f1;
        ev.coM1 = f2;
        target.LC(ev);
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final boolean GH0(int i1) {
        te0_0 target = this.sy0;
        if (target == null) {
            target = this.cx0;
        }
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.Hd;
        ev.BX = (ir_0) this;
        target.LC(ev);
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final boolean pH0(int i1) {
        te0_0 target = this.sy0;
        if (target == null) {
            target = this.cx0;
        }
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.Wf;
        ev.BX = (ir_0) this;
        target.LC(ev);
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final boolean i00(char i1) {
        te0_0 target = this.sy0;
        if (target == null) {
            target = this.cx0;
        }
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.eq;
        ev.BX = (ir_0) this;
        target.LC(ev);
        boolean handled = ev.bC;
        UE0.P3(ev);
        return handled;
    }

    public final void xe0(te0_0 v1) {
        ni_1 ev = null;
        SI[] items = (SI[]) this.ql.pa();
        int size = this.ql.KB;
        for (int i = 0; i < size; i++) {
            SI si = items[i];
            if (si.Mb0 == v1) {
                if (this.ql.sj0(si, true)) {
                    if (ev == null) {
                        ev = (ni_1) UE0.TL0(ni_1.class).obtain();
                        ev.wv = F00.Hz;
                        ev.BX = (ir_0) this;
                        ev.hC0 = -2.14748365E9f;
                        ev.Ki = -2.14748365E9f;
                    }
                    ev.bA = si.k0;
                    ev.vB0 = si.Mb0;
                    ev.bF = si.Up;
                    ev.mF = si.JQ;
                    si.CF.my(ev);
                }
            }
        }
        this.ql.Gj0();
        if (ev != null) {
            UE0.P3(ev);
        }
        te0_0 s50 = this.S50;
        if (s50 != null) {
            if (v1 == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            while (s50 != v1) {
                s50 = s50.xO;
                if (s50 == null) break;
            }
            if (s50 == v1) {
                Cl(null);
            }
        }
        te0_0 sy = this.sy0;
        if (sy != null) {
            if (v1 == null) {
                throw new IllegalArgumentException("actor cannot be null.");
            }
            while (sy != v1) {
                sy = sy.xO;
                if (sy == null) break;
            }
            if (sy == v1) {
                if (this.sy0 != null) {
                    X2 x2 = (X2) UE0.TL0(X2.class).obtain();
                    x2.BX = (ir_0) this;
                    if (this.sy0 != null) {
                        this.sy0.LC(x2);
                    }
                    this.sy0 = null;
                    UE0.P3(x2);
                }
            }
        }
    }

    public final te0_0 Ic(float f1, float f2, boolean i3) {
        this.Z90.x = f1;
        this.Z90.y = f2;
        this.cx0.lf(this.Z90);
        return this.cx0.nX(this.Z90.x, this.Z90.y, i3);
    }

    @Override
    public final void dispose() {
        Cl(null);
        if (this.sy0 != null) {
            X2 x2 = (X2) UE0.TL0(X2.class).obtain();
            x2.BX = (ir_0) this;
            if (this.sy0 != null) {
                this.sy0.LC(x2);
            }
            this.sy0 = null;
            UE0.P3(x2);
        }
        re0(null, null);
        for (int i = this.cx0.zz.KB - 1; i >= 0; i--) {
            SP sp = (SP) this.cx0.zz.get(i);
            if (sp.ay0 == null) {
                sp.ay0 = null;
            }
        }
        this.cx0.zz.clear();
        this.cx0.Rn0.clear();
        this.cx0.fx.clear();
        this.cx0.kl0();
        if (this.J9) {
            ((ui_1) this.rg0).dispose();
        }
    }

    public final boolean Nz(int i1, int i2) {
        int left = this.Prn.df;
        int right = left + this.Prn.Ty;
        int bottom = this.Prn.gS;
        int top = bottom + this.Prn.Ja;
        int invY = lg_0.S4.sD0() - 1 - i2;
        return i1 >= left && i1 < right && invY >= bottom && invY < top;
    }

    public final void re0(FH0 v1, te0_0 v2) {
        ni_1 ev = (ni_1) UE0.TL0(ni_1.class).obtain();
        ev.wv = F00.Hz;
        ev.BX = (ir_0) this;
        ev.hC0 = -2.14748365E9f;
        ev.Ki = -2.14748365E9f;
        SI[] items = (SI[]) this.ql.pa();
        int size = this.ql.KB;
        for (int i = 0; i < size; i++) {
            SI si = items[i];
            if (si.CF == v1 && si.Mb0 == v2) {
                continue;
            }
            if (this.ql.sj0(si, true)) {
                ev.bA = si.k0;
                ev.vB0 = si.Mb0;
                ev.bF = si.Up;
                ev.mF = si.JQ;
                si.CF.my(ev);
            }
        }
        this.ql.Gj0();
        UE0.P3(ev);
    }

    public final void Cl(U10 v1) {
        if (this.S50 == v1) {
            return;
        }
        X2 ev = (X2) UE0.TL0(X2.class).obtain();
        ev.BX = (ir_0) this;
        if (this.S50 != null) {
            this.S50.LC(ev);
        }
        this.S50 = v1;
        if (v1 != null) {
            v1.LC(ev);
        }
        UE0.P3(ev);
    }
}
