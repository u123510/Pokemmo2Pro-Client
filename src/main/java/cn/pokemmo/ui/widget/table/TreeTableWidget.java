// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.ui.widget.table;

import f.*;

public class TreeTableWidget extends Nj
{
    public static final /* synthetic */ boolean gp;
    public final r60_0 pk;
    public final Cm La;
    public final c70_0 rC;
    public Cs0[] Vg0;
    public int Z70;
    public vk_0 HI;
    public Cs0 kV;
    
    public TreeTableWidget() {
        this.pk = new r60_0((QN) this);
        this.Vg0 = new Cs0[64];
        this.La = new Cm((QN) this);
        this.rC = new c70_0((QN) this);
        super.aS = true;
        final pu_2 v = this.v();
        v.B8("expandLeadRow", this::z30, 1);
        v.B8("collapseLeadRow", this::wK, 1);
    }
    
    static {
        gp = (TreeTableWidget.class.desiredAssertionStatus() ^ true);
    }
    
    public TreeTableWidget(final O3 o3) {
        this();
        this.Wy0(o3);
    }
    
    public final boolean pF(Cs0 cs0) {
        Cs0 gk;
        while (cs0.E3 && (gk = cs0.Gk) != null) {
            final int fi = ((Zh)gk.qm).Fi((Zh)cs0.qm);
            if (!TreeTableWidget.gp && gk.Ma0.VQ != ((Zh)gk.qm).cx()) {
                throw new AssertionError();
            }
            final Cs0 cs2 = cs0;
            final wb_1 ma0 = gk.Ma0;
            final wb_1 ma2;
            int ie;
            if ((ma2 = cs2.Ma0) != null) {
                ie = ma2.iE();
            }
            else {
                final int cx;
                cs0.Hq = ((cx = ((Zh)cs0.qm).cx()) == 0);
                ie = cx;
            }
            ma0.IF(fi, ie + 1);
            cs0 = gk;
        }
        final Cs0 cs3 = cs0;
        super.Dx0 = this.kV.Ma0.iE();
        return cs3.Gk == null;
    }
    
    @Override
    public final String Ck() {
        return "treetable";
    }
    
    @Override
    public final void Ib(final Jn0 jn0) {
        super.Ib(jn0);
        this.bE(this.La);
        this.bE(this.rC);
    }
    
    public final int xK0(Zh zh) {
        final Zh zh2 = zh;
        final int n = -1;
        final Zh parent = zh2.getParent();
        final int n2 = n;
        Zh zh3 = zh;
        int n3 = n2;
        Cs0 cs0;
        int fi;
        wb_1 wb_1;
        wb_1 wb_2;
        Cs0 cs2;
        wb_1 wb_3;
        Cs0 cs3;
        wb_1 ma0;
        int cx;
        wb_1 wb_4;
        Zh zh4;
        int n4;
        Zh parent2;
        int n5;
        for (zh = parent; zh != null; zh = parent2) {
            if ((cs0 = (Cs0)a9_0.i40(this.Vg0, zh)) == null) {
                return -1;
            }
            if ((fi = zh.Fi(zh3)) < 0) {
                return -1;
            }
            if (cs0.Ma0 == null) {
                if (!cs0.E3) {
                    return -1;
                }
                wb_1 = new wb_1();
                wb_2 = wb_1;
                cs2 = cs0;
                wb_3 = wb_2;
                cs3 = cs0;
                ma0 = wb_2;
                new wb_1(64);
                cs3.Ma0 = ma0;
                wb_3.wB = 1;
                cx = ((Zh)cs2.qm).cx();
                if (wb_1.p2.length < cx) {
                    wb_2.p2 = new int[cx];
                }
                wb_4 = wb_2;
                wb_4.DE(0, wb_4.VQ = cx);
                wb_4.iB0(0, cx);
            }
            zh4 = zh;
            n4 = cs0.Ma0.eC0(fi) + 1 + n3;
            parent2 = zh4.getParent();
            n5 = n4;
            zh3 = zh;
            n3 = n5;
        }
        return n3;
    }
    
    @Override
    public final Zh Xt(int b) {
        Cs0 kv = this.kV;
        while (true) {
            final wb_1 ma0;
            int n2;
            if ((ma0 = kv.Ma0) == null) {
                final int n = b - ((b = Math.min(((Zh)kv.qm).cx() - 1, b)) + 1);
                n2 = b;
                b = n;
            }
            else {
                final int n3 = b;
                final Cs0 cs0 = kv;
                b = ma0.gC(b);
                final int n4 = n3 - (cs0.Ma0.eC0(b) + 1);
                n2 = b;
                b = n4;
            }
            if (b < 0) {
                return ((Zh)kv.qm).rW(n2);
            }
            if (!TreeTableWidget.gp && kv.Z5[n2] == null) {
                throw new AssertionError();
            }
            kv = kv.Z5[n2];
        }
    }
    
    public final Cs0 vE0(final Zh zh) {
        final Zh parent = zh.getParent();
        Cs0 cs0 = null;
        if (parent != null) {
            cs0 = (Cs0)a9_0.i40(this.Vg0, parent);
            if (!TreeTableWidget.gp) {
                if (cs0 == null) {
                    throw new AssertionError();
                }
            }
        }
        final Cs0 cs3 = new Cs0((QN) this, zh, cs0);
        final Cs0[] vg0;
        final Cs0[] array = vg0 = (Cs0[])a9_0.bj(this.Vg0, ++this.Z70);
        final Cs0 cs4 = cs3;
        final Cs0[] array2 = vg0;
        final Cs0 cs5 = cs3;
        this.Vg0 = vg0;
        final int n;
        cs4.Qk = array2[n = (cs5.Yj0 & vg0.length - 1)];
        array[n] = cs3;
        return cs3;
    }
    
    @Override
    public final Object Yp(final int n, final int n2, Zh xt) {
        if (xt == null) {
            xt = this.Xt(n);
        }
        return xt.Tb(n2);
    }
    
    @Override
    public final Fx0 Dd0(final int n, final int n2, Zh zh) {
        if (zh == null) {
            zh = this.Xt(n);
        }
        if (n2 != 0) {
            return super.Dd0(n, n2, zh);
        }
        final Zh zh2 = zh;
        final Object tb = zh2.Tb(n2);
        if (zh2.zD()) {
            final Cm la = this.La;
            int nl = -2;
            while (zh != null) {
                final Zh zh3 = zh;
                la.getClass();
                ++nl;
                zh = zh3.getParent();
            }
            final Cm cm = la;
            cm.NL = nl;
            final Fx0 vl0;
            final Fx0 fx0 = vl0 = this.vL0(n2, tb);
            la.rI = vl0;
            if (fx0 != null) {
                vl0.In(tb);
            }
            return this.La;
        }
        Cs0 ve0;
        if ((ve0 = (Cs0)a9_0.i40(this.Vg0, zh)) == null) {
            ve0 = this.vE0(zh);
        }
        final c70_0 rc;
        final c70_0 c70_0 = rc = this.rC;
        final Cs0 fj = ve0;
        rc.getClass();
        c70_0.FJ = fj;
        final Fx0 vl2;
        final Fx0 fx2 = vl2 = this.vL0(n2, tb);
        rc.rI = vl2;
        if (fx2 != null) {
            vl2.In(tb);
        }
        rc.NL = ve0.IK0;
        return this.rC;
    }
    
    @Override
    public final Object EO(final int n, final int n2) {
        final Zh xt;
        if ((xt = this.Xt(n)) != null) {
            xt.uj();
            return null;
        }
        return null;
    }
    
    public final void ED(final Cs0 cs0) {
        if (cs0 != null) {
            --this.Z70;
            a9_0.Fz(this.Vg0, cs0);
            final Cs0[] z5;
            if ((z5 = cs0.Z5) != null) {
                for (int length = z5.length, i = 0; i < length; ++i) {
                    this.ED(z5[i]);
                }
            }
        }
    }
    
    public final void wK() {
        final boolean b = false;
        final jf0_0 g00;
        final int aw;
        final int dx0;
        if ((g00 = super.G00) != null && (aw = g00.Vg0.aW) >= 0 && aw < (dx0 = super.Dx0)) {
            if (aw < 0 || aw >= dx0) {
                throw new IndexOutOfBoundsException("row");
            }
            final Zh xt = this.Xt(aw);
            Cs0 ve0;
            if ((ve0 = (Cs0)a9_0.i40(this.Vg0, xt)) == null) {
                ve0 = this.vE0(xt);
            }
            ve0.Dc0(b);
        }
    }
    
    public final void z30() {
        final boolean b = true;
        final jf0_0 g00;
        final int aw;
        final int dx0;
        if ((g00 = super.G00) != null && (aw = g00.Vg0.aW) >= 0 && aw < (dx0 = super.Dx0)) {
            if (aw < 0 || aw >= dx0) {
                throw new IndexOutOfBoundsException("row");
            }
            final Zh xt = this.Xt(aw);
            Cs0 ve0;
            if ((ve0 = (Cs0)a9_0.i40(this.Vg0, xt)) == null) {
                ve0 = this.vE0(xt);
            }
            ve0.Dc0(b);
        }
    }
    
    public final void Wy0(final O3 o3) {
        final vk_0 hi;
        if ((hi = this.HI) != null) {
            final vk_0 vk_0 = hi;
            final r60_0 pk = this.pk;
            final com6__0 com6__0 = (com6__0)vk_0;
            com6__0.Z = (r60_0[])a7_0.tp0(pk, com6__0.Z);
        }
        super.bL = o3;
        this.HI = o3;
        this.Vg0 = new Cs0[64];
        this.Z70 = 0;
        o3.Z = (r60_0[])a7_0.gE(o3.Z, this.pk, r60_0.class);
        final Cs0 ve0;
        final Cs0 cs0 = ve0 = this.vE0(o3);
        this.kV = ve0;
        cs0.IK0 = -1;
        cs0.E3 = true;
        final wb_1 wb_1 = new wb_1();
        final wb_1 wb_2 = wb_1;
        final Cs0 cs2 = ve0;
        final wb_1 wb_3 = wb_2;
        final Cs0 cs3 = ve0;
        final wb_1 ma0 = wb_2;
        new wb_1(64);
        cs3.Ma0 = ma0;
        wb_3.wB = 1;
        final int cx = ((Zh)cs2.qm).cx();
        if (wb_1.p2.length < cx) {
            wb_2.p2 = new int[cx];
        }
        final wb_1 wb_4 = wb_2;
        wb_4.DE(0, wb_4.VQ = cx);
        wb_4.iB0(0, cx);
        super.Dx0 = this.kV.Ma0.iE();
        super.gc0 = 2;
        this.wr();
        this.COm3();
    }
}

