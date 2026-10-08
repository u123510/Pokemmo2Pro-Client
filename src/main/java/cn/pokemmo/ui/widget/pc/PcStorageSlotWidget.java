package cn.pokemmo.ui.widget.pc;

import f.*;

import java.util.Arrays;
import java.util.List;

public class PcStorageSlotWidget extends jb0_0 {
    public final QT mD0;
    public final NK O3;
    public long qP;

    public PcStorageSlotWidget(QT v1, NK v2, Mj v3, short i4) {
        super(v3, i4);
        this.qP = 0L;
        uf("pc-slot");
        int w = tw0_0.kz0() ? 80 : 58;
        int h = tw0_0.kz0() ? 80 : 48;
        xf0(w, h);
        j10(false);
        this.mD0 = v1;
        this.O3 = v2;
        if (tw0_0.kz0()) {
            sl().dA(2.0f);
            sl().Gy0(4, 0);
        } else {
            sl().Gy0(12, -4);
        }
        ne0(new tq_0());
    }

    public static void WZ() {
        BU.T50.OJ.Uc0().FL(true);
    }

    public final void zl() {
        this.J90.Ll(true);
        this.W10.Ll(true);
        this.C5.Ll(true);
        this.Xt.Ll(true);
        this.Hh.Ll(true);
        this.Ix0.Ll(true);
        VU v1 = ol0();
        if (v1 != null && !v1.I8.vn()) {
            boolean lCap = !(v1.I8.wj > tw0_0.rl.yh0.IL0(tw0_0.e60.Com4));
            this.M.j70(Nv0, !lCap);

            MD0 md_i8 = i8;
            HY hy = tw0_0.rl.dh0;
            boolean tierMatched = false;
            for (byte b = 0; b < tx_0.bm0(tw0_0.rl.k0.hL0); b = (byte) (b + 1)) {
                tx_0 tx = hy.Ed0(b);
                CH0 pu = v1.pu;
                CH0[] ng = tx.NG0;
                int len = ng.length;
                for (int i = 0; i < len; i++) {
                    if (ng[i].equals(pu)) {
                        tierMatched = true;
                        break;
                    }
                }
                if (tierMatched) {
                    break;
                }
            }
            this.M.j70(md_i8, tierMatched);
        } else {
            this.M.j70(AL, false);
            this.M.j70(Nv0, false);
            this.M.j70(i8, false);
        }
        if (v1 == null) {
            return;
        }
        di0_1 vs = BU.T50.vs0;
        if (vs != null) {
            mi_0[] ff = vs.FF;
            List list = Arrays.asList(ff[0], ff[2]);
            for (Object obj : list) {
                mi_0 mi = (mi_0) obj;
                VU ag = mi.AG;
                if (ag != null && ag.pu.equals(v1.pu)) {
                    this.tp0.wx0(gn_0.BLACK);
                }
            }
        } else if (this.mD0.Oa.ER.U20() && !v1.I8.COM6()) {
            this.tp0.wx0(tw0_0.kz0() ? gn_0.DARKGRAY : gn_0.GRAY);
        }
    }

    @Override
    public boolean nd0(i70_0 v1) {
        if (tw0_0.kz0()) {
            int zu = v1.zu;
            if (E00.C10(zu) && !v1.VP && v1.nA0 == 0 && this.ER.U20() && !this.XW && !this.O3.po) {
                if (zu == 3) {
                    this.qP = System.currentTimeMillis();
                } else if (zu == 4) {
                    long prev = this.qP;
                    if (prev != 0L && System.currentTimeMillis() - prev > 300L) {
                        Qy0.yI0.YD0(this.O3, this.O3.uO(), this, v1.f8, v1.AN, true);
                        this.qP = 0L;
                        return true;
                    }
                } else {
                    this.qP = 0L;
                }
            } else {
                this.qP = 0L;
            }
        }
        return super.nd0(v1);
    }

    @Override
    public void TG0(i70_0 v1) {
        BU bu = BU.T50;
        di0_1 vs = bu.vs0;
        int na = v1.nA0;
        if (na == 0) {
            int j30 = v1.J30;
            if ((j30 & 9) != 0) {
                LPT8(!this.ER.U20());
            } else if ((j30 & 36) != 0) {
                sg_2 targetSlot = null;
                if (vs != null) {
                    mi_0[] ff = vs.FF;
                    if (ff[0].AG == null) {
                        targetSlot = ff[0];
                    } else if (ff[2].AG == null) {
                        targetSlot = ff[2];
                    }
                } else {
                    targetSlot = bu.package$.S80();
                }
                if (targetSlot == null) {
                    return;
                }
                targetSlot.G9(this);
            } else if ((j30 & 1554) != 0) {
                if (this.ER.U20()) {
                    ye_0[] uo = this.O3.uO();
                    if (uo.length > 0) {
                        UA.rL(Qy0.m60(uo, this.O3), this, v1.f8, v1.AN);
                    }
                } else {
                    UA.rL(Qy0.m60(new jb0_0[]{this}, this.O3), this, v1.f8, v1.AN);
                }
            } else if (!v1.VP) {
                if (this.ER.U20()) {
                    if (this.mD0.wf0()) {
                        LPT8(false);
                    } else if (tw0_0.kz0()) {
                        for (ye_0 slot : this.O3.uO()) {
                            slot.LPT8(false);
                        }
                    }
                } else {
                    if (this.mD0.wf0()) {
                        LPT8(true);
                    } else if (tw0_0.kz0()) {
                        for (ye_0 slot : this.O3.uO()) {
                            slot.LPT8(false);
                        }
                        Qy0.yI0.YD0(this.O3, new jb0_0[]{this}, this, v1.f8, v1.AN, true);
                    } else {
                        for (ye_0 slot : this.O3.uO()) {
                            slot.LPT8(false);
                        }
                    }
                }
                if (this.Nj != null) {
                    this.Nj.run();
                }
            }
        } else if (na == 1) {
            if ((v1.J30 & 36) != 0) {
                bu.FI(ol0(), this, qo_1.DL, false);
            } else if (this.ER.U20()) {
                ye_0[] uo = this.O3.uO();
                if (uo.length > 0) {
                    Qy0.yI0.YD0(this.O3, uo, this, v1.f8, v1.AN, true);
                }
            } else {
                Qy0.yI0.YD0(this.O3, new jb0_0[]{this}, this, v1.f8, v1.AN, true);
            }
        }
    }

    public final void Ol0() {
        KO();
    }

    @Override
    public final void Dw0(zk0_1 v1) {
        super.Dw0(v1);
        if (this.mD0.Oa.ER.U20()) {
            VU vu = ol0();
            if (vu != null && vu.I8.COM6()) {
                Br0 og = this.sB0.og;
                int x = (R1() / 2) + this.A20 + og.gY;
                int y = (Se() / 2) + this.SB0 + og.a4;
                og.mt0(x, y);
            }
        }
    }

    public final void hs() {
        if (this.mD0.wf0()) {
            this.M.j70(cv0, true);
            this.M.j70(throws$, this.O3.po);
        }
    }

    public final void Bt() {
        this.M.j70(cv0, false);
        this.M.j70(throws$, false);
    }

    @Override
    public final void Zq0() {
        if (!this.ER.U20()) {
            if (ol0() != null) {
                Qy0.yI0.YD0(this.O3, new jb0_0[]{this}, this, this.A20, this.SB0, false);
            } else {
                lg_0.k.lPT5(this::nj);
                ye_0[] uo = this.O3.uO();
                for (int i = 0; i < uo.length; i++) {
                    uo[i].LPT8(false);
                }
            }
        } else {
            ye_0[] uo = this.O3.uO();
            if (uo.length > 0) {
                Qy0.yI0.YD0(this.O3, uo, this, this.A20, this.SB0, false);
            }
        }
    }

    @Override
    public final boolean tf0() {
        if (!this.XW) {
            if (!this.mD0.Oa.ER.U20()) {
                return true;
            }
            VU vu = ol0();
            if (vu == null || !vu.I8.COM6()) {
                return true;
            }
        }
        return false;
    }

    public final void nj() {
        Vt0 v1 = new Vt0();
        at_0 btn = new at_0(sm0_0.c0(2314));
        btn.eu0 = ye_0::WZ;
        v1.hx.add(btn);
        UA.rL(v1, this, this.A20, this.SB0);
    }
}
