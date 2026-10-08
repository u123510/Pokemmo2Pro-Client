package cn.pokemmo.order;

import f.*;

public class OrderedAnimatedMapActor extends sg_2 implements Comparable {

    public final short Hr0;
    public Mj Vt0;
    public long ed;

    public OrderedAnimatedMapActor(Mj v1, short i2) {
        super();
        this.ed = 0L;
        _volatile v3 = _volatile.Ch;
        int i4 = (v1.Bm0() == v3) ? 70 : 46;
        int i5 = (v1.Bm0() == v3) ? 32 : 40;
        xf0(i4, i5);
        this.Vt0 = v1;
        this.Hr0 = i2;
        tL0(v1.Bm0().TV());
        boolean z = v1.Bm0().JX() && tw0_0.kz0();
        j10(z);
        Br0 v2 = sl();
        int i4_pos = (v1.Bm0() == v3) ? 5 : 4;
        v2.Gy0(i4_pos, -4);
        if (tw0_0.kz0() && v1.Bm0() == v3) {
            xf0(76, 76);
            sl().dA(2.0f);
            sl().Gy0(2, 2);
        }
        lg_0.k.lPT5(this::update);
    }

    public final boolean BT(i70_0 v1) {
        int i2 = v1.finally$;
        rp_0 v3 = rp_0.sJ0;
        int dummy = dw_2.ff;
        if (v3 == null) {
            return false;
        }
        if (!v3.Ov(i2)) {
            return false;
        }
        QT v2 = BU.T50.OJ;
        if (v2 == null) {
            return false;
        }
        if (v1.zu == 10 && v2.W70 == null) {
            long j2 = this.ed;
            if (j2 == 0L) {
                return true;
            }
            if (System.currentTimeMillis() - j2 < 500L) {
                Zq0();
            }
            this.ed = 0L;
            return true;
        }
        if (v1.iT() && !v1.l() && v2.W70 == null) {
            this.ed = System.currentTimeMillis();
            n0_0 n0 = new n0_0((jb0_0) this, v2);
            _finally.HG().dH0(n0, 0.5f);
            return true;
        }
        if (!v1.iT() && v1.zu == 10 && !v1.l()) {
            this.ed = 0L;
            int i1 = this.A20 + this.e80;
            int x = (a3() / 2) + i1;
            int i0 = this.SB0 + this.y9;
            int y = (k5() / 2) + i0;
            v2.mf0(x, y);
            return true;
        }
        return false;
    }

    public void Ol0() {
        nA();
        if (this.Vt0.Jn0 != _volatile.Ch) {
            return;
        }
        if (!tw0_0.kz0()) {
            this.W10.E40(this.A20 + 50, this.SB0 + 1);
            P10 v1 = this.C5;
            int i2 = this.W10.A20;
            int i3 = this.W10.SB0;
            int i4 = (this.W10.og.yH0() > 0) ? 13 : 0;
            v1.E40(i2, i3 + i4);
            this.Hh.E40(this.A20 + 38, this.SB0 + 5);
            P10 v1_xt = this.Xt;
            int i2_xt = this.A20 + 36;
            int i0 = this.Hh.SB0;
            int i3_xt = (this.Hh.og.yH0() > 0) ? 13 : 0;
            v1_xt.E40(i2_xt, i0 + i3_xt - 4);
        } else if (tw0_0.kz0()) {
            this.W10.E40(this.A20 + 45, this.SB0 + 11);
            P10 v1 = this.C5;
            int i2 = this.W10.A20;
            int i3 = this.W10.SB0;
            int i4 = (this.W10.og.yH0() > 0) ? 16 : 0;
            v1.E40(i2, i3 + i4);
            this.Hh.E40(this.A20 + 16, this.SB0 + 14);
            P10 v1_xt = this.Xt;
            int i2_xt = this.A20 + 16;
            int i0 = this.Hh.SB0;
            int i3_xt = (this.Hh.og.yH0() > 0) ? 16 : 0;
            v1_xt.E40(i2_xt, i0 + i3_xt);
        }
    }

    public void TG0(i70_0 v1) {
        BU v2 = BU.T50;
        di0_1 v3 = v2.vs0;
        lr_0 v4 = v2.Xf0;
        QT v5 = v2.OJ;
        gc_0 v6 = v2.YB0;
        qu_2 v7 = v2.de0;
        _volatile v8 = this.Vt0.Jn0;
        int i9 = v1.nA0;
        if (i9 == 0) {
            if ((v1.J30 & 36) != 0) {
                _volatile v1_bv = _volatile.BV;
                if (v8 == v1_bv && v3 != null) {
                    mi_0[] v1_arr = v3.FF;
                    mi_0 v2_mi = (v1_arr[0].AG == null) ? v1_arr[0] : ((v1_arr[2].AG == null) ? v1_arr[2] : null);
                    if (v2_mi != null) {
                        v2_mi.G9(this);
                    }
                    return;
                }
                boolean i2 = v8.Uf0;
                if (i2 && v5 != null) {
                    ye_0 v1_ye = QT.LPt7(v5.Uc0(), 0);
                    if (v1_ye != null) {
                        v1_ye.G9(this);
                    }
                    return;
                }
                if (i2 && v6 != null) {
                    jb0_0[] v1_arr = v6.md[0];
                    jb0_0 v4_found = null;
                    for (int i3 = 0; i3 < v1_arr.length; i3++) {
                        jb0_0 cand = v1_arr[i3];
                        if (cand.ol0() == null) {
                            v4_found = cand;
                            break;
                        }
                    }
                    if (v4_found != null) {
                        v4_found.G9(this);
                    }
                    return;
                }
                if (v8 == v1_bv) {
                    if (v4 != null) {
                        v4.nA0.Db(ol0());
                        v4.hq.Zd((com2__3) v4.hq.g6.get(3));
                        lpt6__0.v90(v4.nA0);
                    } else if (v7 != null) {
                        v7.Dg0(ol0());
                    }
                }
            } else if (!v1.VP) {
                if (tw0_0.kz0() && v8 == _volatile.Ch && ol0() != null) {
                    BU.T50.FI(ol0(), null, qo_1.DL, false);
                } else if (this.Nj != null) {
                    this.Nj.run();
                }
            }
        } else if (i9 == 1) {
            if ((v1.J30 & 36) != 0) {
                v2.FI(ol0(), this, qo_1.DL, false);
            } else {
                v2.FI(ol0(), null, qo_1.DL, false);
            }
        }
    }

    public short Xh0() {
        return this.Hr0;
    }

    public boolean HP() {
        return this instanceof com6__3;
    }

    public final void iV(Mj v1) {
        this.Vt0 = v1;
        nI();
        zl();
        COm3();
        a7_0.bH(this.ER.Fc0);
    }

    public void zl() {
        _volatile v1 = this.Vt0.Jn0;
        if (v1 == _volatile.Ch) {
            this.Hh.Ll(true);
            this.W10.Ll(true);
            this.C5.Ll(true);
            this.Xt.Ll(true);
        } else if (v1.Uf0) {
            this.Hh.Ll(true);
            this.Q50.Ll(true);
        }
    }

    public void av0(sg_2 v1) {
        v1.IE0(obj -> n9((OrderedAnimatedMapActor) obj));
    }

    public VU ol0() {
        if (this.Vt0 == null) {
            return null;
        }
        return this.Vt0.Ry0(this.Hr0);
    }

    public _volatile h80() {
        return this.Vt0.Jn0;
    }

    @Override
    public final int compareTo(Object v1) {
        return Integer.compare(Xh0(), ((OrderedAnimatedMapActor) v1).Xh0());
    }

    public final void n9(OrderedAnimatedMapActor v1) {
        tw0_0.rl.getClass();
        tw0_0.rl.qn(new jb0_0[]{(jb0_0) v1}, new jb0_0[]{(jb0_0) this});
    }
}
