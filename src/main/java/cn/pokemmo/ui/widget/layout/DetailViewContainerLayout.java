package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class DetailViewContainerLayout extends BaseLayoutBox {
    public final ML0 NR;
    public final ut_2 dF0;
    public final hh0_1 Yp;
    public final G20[] eL;
    public int Wb0;

    public DetailViewContainerLayout(ML0 v1, ut_2 v2) {
        this.Wb0 = 0;
        this.NR = v1;
        this.dF0 = v2;
        v1.rK("");
        uf("battle-panel-dark");
        cn_0 label = new cn_0(sm0_0.H5(lpt6__2.Q80, 157, 39));
        this.eL = new G20[5];
        for (byte i = 0; i < this.eL.length; i++) {
            this.eL[i] = new G20("", "");
            this.eL[i].uf("battle-move-button-left");
            this.eL[i].qF0(pa0_0.up0);
            this.eL[i].RR(new ju0_0((f.sc_2)(Object)this, i));
        }
        for (byte i = 0; i < this.eL.length; i++) {
            short moveId;
            if (i == 4) {
                moveId = v2.Ij();
            } else {
                moveId = v2.Bh0().RJ().UD(i);
            }
            if (moveId == 0) {
                this.eL[i].SU("-");
                this.eL[i].Pc("");
                this.eL[i].pw0(false);
                this.eL[i].Gx().lo0();
                this.eL[i].Xr0(null);
                this.eL[i].ML0();
            } else {
                this.eL[i].pw0(true);
                vk0_1 vk = ec0_2.Sx().SX(moveId);
                this.eL[i].Xr0(s2_0.tq0(vk, v2.Bh0()));
                this.eL[i].Pc(lb0_2.fb0(vk));
                i40_0 i40 = vk.yS(v2.Bh0().RJ());
                this.eL[i].Gx().r8(new LPT6_[]{fn_0.qz0().jJ0(i40.o6())});
                this.eL[i].Gx().Gy0(153, 10);
                if (tw0_0.kz0()) {
                    this.eL[i].Gx().Gy0(100, 15);
                    this.eL[i].Gx().dA(2.0f);
                }
                this.eL[i].SU(vk.CoM2());
                this.eL[i].ML0();
            }
        }
        this.eL[4].pw0(false);
        this.Yp = new hh0_1(sm0_0.c0(nf0_0.Bq0), 96, 30);
        this.Yp.uf("battle-button-return");
        this.Yp.RR(new t8_0((f.sc_2)(Object)this));
        if (tw0_0.kz0()) {
            this.Yp.iv(116, 116);
        }
        x40(H10().Xq(new ya_1[]{
            lo0().LPt3(new le0_2[]{this.eL[0], this.eL[1], label, this.Yp}),
            lo0().LPt3(new le0_2[]{this.eL[2], this.eL[3], this.eL[4]})
        }));
        WQ(H10().Xq(new ya_1[]{
            lo0().LPt3(new le0_2[]{this.eL[0], this.eL[2]}),
            lo0().LPt3(new le0_2[]{this.eL[1], this.eL[3]}),
            Ou0(new ya_1[]{C7(new le0_2[]{label, this.Yp})}).Kn0(this.eL[4])
        }));
    }

    public final void n7(byte i1) {
        Qy0.yI0.zm0();
        if (i1 < 0) {
            String text = sm0_0.Bw((byte) 2, lpt6__2.Q80, 157, 35, new String[]{
                this.dF0.L.na0(),
                sm0_0.c0(110000 + this.dF0.s20)
            });
            Qy0.yI0.sr0(new lpt3__4(text, () -> oh0(i1), this));
        } else {
            String moveName = sm0_0.c0(110000 + this.dF0.L.I8.Gu[i1]);
            String text = sm0_0.Bx(5058, new String[]{
                moveName,
                sm0_0.c0(110000 + this.dF0.s20)
            });
            Qy0.yI0.sr0(new lpt3__4(text, () -> LPt8(moveName, i1), this));
        }
    }

    @Override
    public final void K8() {
        super.K8();
        if (tw0_0.kz0()) {
            for (int i = 0; i < this.eL.length; i++) {
                G20 btn = this.eL[i];
                btn.zW.gY = btn.Mx / 2 - btn.zW.De0() / 2;
                btn.zW.a4 = 15;
            }
        }
        lpt6__0.v90(this.eL[this.Wb0]);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            if (rp_0.sJ0 != null && rp_0.sJ0.Ov(key)) {
                if (this.Wb0 >= 0 && this.Wb0 <= 3 && Of()) {
                    a7_0.bH(this.eL[this.Wb0].ER.Fc0);
                    return true;
                }
            }
            if (rp_0.nK0 != null && rp_0.nK0.Ov(key)) {
                if (this.Yp.eE && Of()) {
                    a7_0.bH(this.Yp.ER.Fc0);
                    return true;
                }
            }
            if ((rp_0.Ni != null && rp_0.Ni.Ov(key))
                || (rp_0.I90 != null && rp_0.I90.Ov(key))
                || (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(key))
                || (rp_0.kC0 != null && rp_0.kC0.Ov(key))) {
                int pos = this.Wb0;
                if (rp_0.Ni != null && rp_0.Ni.Ov(v1.finally$)) {
                    int next = pos + 1;
                    if (next % 2 != 0 || pos == 3) {
                        pos = next;
                    }
                } else if (rp_0.I90 != null && rp_0.I90.Ov(v1.finally$)) {
                    int next = pos + 1;
                    if (next % 2 == 1 && pos != 4) {
                        // pos unchanged
                    } else {
                        pos--;
                    }
                } else if (rp_0.kC0 != null && rp_0.kC0.Ov(v1.finally$)) {
                    if (pos - 2 >= 0) {
                        pos -= 2;
                    } else {
                        pos--;
                    }
                } else if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(v1.finally$)) {
                    int next = pos + 2;
                    if (next <= 4) {
                        pos = next;
                    }
                }
                if (pos < 0) {
                    pos = 0;
                }
                if (pos > 4) {
                    pos = 4;
                }
                while (!this.eL[pos].eE) {
                    if (this.Wb0 <= pos) {
                        pos--;
                    } else {
                        pos++;
                    }
                    if (pos >= this.eL.length || pos < 0) {
                        return true;
                    }
                }
                this.Wb0 = pos;
                lpt6__0.v90(this.eL[pos]);
                Object tip = this.eL[this.Wb0].yj0;
                if (tip != null) {
                    Qy0.yI0.vk(this.eL[this.Wb0], tip, pa0_0.L00);
                } else {
                    Qy0.yI0.zm0();
                }
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final void LPt8(String v1, byte i2) {
        this.NR.wJ("", sm0_0.Bw((byte) 2, lpt6__2.Q80, 157, 40, new String[]{
            this.dF0.L.na0(),
            v1
        }), null);
        this.NR.wJ("", sm0_0.Bw((byte) 2, lpt6__2.Q80, 157, 41, new String[]{
            this.dF0.L.na0(),
            sm0_0.c0(110000 + this.dF0.s20)
        }), null);
        tw0_0.rl.fk0.uQ(new BA(this.dF0.L.pu, i2, this.dF0.s20));
        this.NR.g9();
    }

    public final void oh0(byte i1) {
        this.NR.wJ("", sm0_0.Bw((byte) 2, lpt6__2.Q80, 157, 38, new String[]{
            this.dF0.L.na0(),
            sm0_0.c0(110000 + this.dF0.s20)
        }), null);
        tw0_0.rl.fk0.uQ(new BA(this.dF0.L.pu, i1, this.dF0.s20));
        this.NR.g9();
    }
}
