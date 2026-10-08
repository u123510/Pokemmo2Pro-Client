package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class TableViewContainerLayout extends BaseLayoutBox implements tr_1 {
    public final vy_2 k;
    public int jO;
    public int O;
    public xe_1[] Ts0;
    public final fy_2 Cs;
    public final G20[] xI;
    public final cn_0 Pt0;
    public final hh0_1 Cc0;
    public final dm_0 w30;

    public TableViewContainerLayout(vy_2 v1, mc0_1 v2, CH0 v3, VU v4) {
        this.O = 2;
        this.Ts0 = new xe_1[0];
        this.k = v1;
        if (v1 instanceof jc_2) {
            this.w30 = dm_0.Vt;
        } else {
            this.w30 = dm_0.Vu;
        }
        if (this.w30 == dm_0.Vt) {
            uf("hud-panel-invis");
        } else {
            uf("battle-panel-dark");
        }
        CE rj = v4.RJ();
        boolean singleMove = v2.YI0() < 1;
        this.Pt0 = new cn_0(sm0_0.H5(lpt6__2.Q80, 157, singleMove ? 22 : 21));
        this.Cs = new fy_2();
        this.xI = new G20[4];
        for (byte i = 0; i < 4; i++) {
            this.xI[i] = new A80((f.u2_0)(Object)this, i);
            this.xI[i].uf("item-move-dialog-button");
            vk0_1 vk = ec0_2.Sx().SX(rj.UD(i));
            if (rj.UD(i) == 0) {
                this.xI[i].SU("-");
                this.xI[i].Pc(sm0_0.c0(1852) + " - / -");
                this.xI[i].pw0(false);
                this.xI[i].Gx().lo0();
                this.xI[i].Xr0(null);
            } else {
                this.xI[i].pw0(true);
                this.xI[i].Xr0(s2_0.tq0(vk, v4));
                this.xI[i].Pc(ig_0.u9(1852, new StringBuilder(), " ").append((int) rj.xm(i)).append(" / ").append((int) rj.Vd(vk.N1(), i)).toString());
                i40_0 i40 = vk.yS(rj);
                this.xI[i].Gx().r8(new LPT6_[]{fn_0.qz0().jJ0(i40.o6())});
                this.xI[i].Gx().Gy0(153, 9);
                if (tw0_0.kz0()) {
                    this.xI[i].Gx().Gy0(153, 14);
                    this.xI[i].Gx().dA(2.0f);
                }
                this.xI[i].SU(vk.CoM2());
            }
            byte idx = i;
            this.xI[i].RR(() -> U40(v2, v1, v3, v4, idx));
        }
        if (this.w30 != dm_0.Vu) {
            this.Cs.x40(this.Cs.H10().qd(18).Xq(new ya_1[]{
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[0], this.xI[1]}),
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[2], this.xI[3]})
            }));
            this.Cs.WQ(this.Cs.H10().Xq(new ya_1[]{
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[0], this.xI[2]}),
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[1], this.xI[3]})
            }));
        } else {
            this.Cs.x40(this.Cs.H10().Xq(new ya_1[]{
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[0], this.xI[1]}),
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[2], this.xI[3]})
            }));
            this.Cs.WQ(this.Cs.H10().Xq(new ya_1[]{
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[0], this.xI[2]}),
                this.Cs.lo0().LPt3(new le0_2[]{this.xI[1], this.xI[3]})
            }));
        }
        SL(this.Cs);
        if (this.w30 == dm_0.Vu) {
            SL(this.Pt0);
        }
        if (this.w30 != dm_0.Vu) {
            this.Cc0 = new hh0_1(sm0_0.c0(nf0_0.Bq0), 96, 30);
            this.Cc0.uf("battle-button-return");
            this.Cc0.RR(v1::ew0);
            SL(this.Cc0);
        } else {
            this.Cc0 = null;
        }
        ec(this.xI);
    }

    public final void C(zk0_1 v1) {
        this.uc = false;
        if (this.jO >= 0 && this.jO < this.Ts0.length) {
            lpt6__0.v90(this.Ts0[this.jO]);
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            iD(v1);
            return true;
        }
        return super.nd0(v1);
    }

    public final void iD(i70_0 v1) {
        int key = v1.finally$;
        if (rp_0.sJ0 != null && rp_0.sJ0.Ov(key)) {
            xe_1 btn = this.Ts0[this.jO];
            if (btn.OI) {
                a7_0.bH(btn.ER.Fc0);
            }
            return;
        }
        if (this.Cc0 != null && rp_0.nK0 != null && rp_0.nK0.Ov(key)) {
            a7_0.bH(this.Cc0.ER.Fc0);
        }
        if (rp_0.Ni != null && rp_0.Ni.Ov(key)) {
            int next = this.jO + 1;
            if (next % this.O != 0) {
                this.jO = next;
            }
        } else if (rp_0.I90 != null && rp_0.I90.Ov(key)) {
            int next = this.jO + 1;
            if (next % this.O != 1) {
                this.jO = next - 1;
            }
        } else if (rp_0.kC0 != null && rp_0.kC0.Ov(key)) {
            int next = this.jO - this.O;
            if (next >= 0) {
                this.jO = next;
            }
        } else if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(key)) {
            int next = this.jO + this.O;
            if (next < this.Ts0.length) {
                this.jO = next;
            }
        }
        if (this.jO >= 0 && this.jO < this.Ts0.length) {
            lpt6__0.v90(this.Ts0[this.jO]);
        }
    }

    @Override
    public final void K8() {
        if (this.w30 == dm_0.Vt) {
            this.Cc0.oY(40, 40);
            this.Cc0.E40(this.K20.cz() - this.Cc0.Mx - 60, this.K20.VM() - this.Cc0.OB + 4);
            jc_2 jc = (jc_2) this.k;
            this.Cs.oY(jc.a3(), jc.k5());
            this.Cs.E40(jc.A20 + jc.e80, jc.SB0 + jc.y9 + 50);
            this.Cs.vi(8, 5, 8, 5);
        } else if (tw0_0.kz0()) {
            this.Pt0.E40(this.A20 + 10, this.SB0 + 30);
            this.Cs.oY(this.K20.a3(), this.K20.k5());
            this.Cs.E40(this.A20 + 10, this.Pt0.SB0 + this.Pt0.OB + 40);
        } else {
            if (this.k instanceof q40_0) {
                q40_0 q4 = (q40_0) this.k;
                oY(q4.Rg, q4.kr);
                E40(q4.fj, q4.jA);
                oY(q4.Rg, q4.kr);
                E40(q4.fj, q4.jA);
            }
            this.Pt0.E40(this.A20 + 450, this.SB0 + 30);
            this.Cs.oY(this.K20.a3(), this.K20.k5());
            this.Cs.E40(this.A20 + 5, this.SB0 + 5);
        }
    }

    public final void ec(xe_1[] v1) {
        this.jO = 0;
        this.O = 2;
        this.Ts0 = v1;
        if (v1.length == 0) {
            return;
        }
        lpt6__0.v90(v1[0]);
    }

    public final void U40(mc0_1 v1, vy_2 v2, CH0 v3, VU v4, byte i5) {
        if (v1.rg && this.w30 == dm_0.Vt) {
            BU.T50.throw$(v2, v3, v4, i5);
        } else {
            System.out.println(v2.getClass());
            v2.U90(v1.Z8, v3, v4.pu, i5);
        }
    }
}
