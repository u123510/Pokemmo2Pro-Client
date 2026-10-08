package cn.pokemmo.ui.battle;

import f.*;

/**
 * 对战精灵切换与道具使用返回按钮面板 (Battle Switch Return Button Panel)
 * 挂载在战斗界面的队伍槽位或背包道具选择框上，提供队伍精灵快速选择及返回上级界面的操作响应。
 *
 * 原混淆类: f.eg_1
 */
public class BattleSwitchReturnButton extends tk0_0 implements tr_1 {
    public int Ka;
    public int Sn0;
    public xe_1[] uH;
    public final tk0_0 bW;
    public final G20[] oB0;
    public final hh0_1 Q00;
    public final K5 ke;

    public BattleSwitchReturnButton(jc_2 jc_22, K5 k5) {
        this.Sn0 = 0;
        this.uH = new xe_1[0];
        this.ke = k5;
        this.uf("tm-target-inner-panel");
        tk0_0 tk0_02;
        this.bW = tk0_02 = new tk0_0();
        tk0_02.uf("dialoglayout");
        this.oB0 = new G20[6];
        for (short s = 0; s < this.oB0.length; s = (short) (s + 1)) {
            this.oB0[s] = new G20("-", "");
            this.oB0[s].uf("/item-use-dialog-button");
            this.oB0[s].qF0(pa0_0.up0);
            VU vu = tw0_0.rl.Wp().Ry0(s);
            if (vu == null) {
                this.oB0[s].pw0(false);
            } else {
                Br0 br0 = this.oB0[s].Gx();
                br0.o60(yh_0.Dl0().qC0(vu.RJ().Kr(), vu.Dg0(), vu.LPt6()));
                br0.nq0(36, 36);
                br0.Gy0(4, 2);
                if (tw0_0.kz0()) {
                    br0.Gy0(-5, -12);
                    br0.dA(2.0f);
                }
                this.oB0[s].SU(vu.na0());
                if (!vu.uF0() && k5.LW().Zq() > 0 && vu.i3().dG(Wx0.rz, k5.LW().Zq())) {
                    boolean bl = vu.RJ().Mb(k5.LW().Zq());
                    this.oB0[s].Pc(sm0_0.c0(bl ? 1868 : 78));
                    this.oB0[s].pw0(!bl);
                } else {
                    this.oB0[s].Pc(sm0_0.c0(79));
                    this.oB0[s].pw0(false);
                }
            }
            this.oB0[s].RR(() -> BattleSwitchReturnButton.eU(jc_22, k5, vu));
        }
        if (tw0_0.kz0()) {
            this.Q00 = new hh0_1(sm0_0.c0(nf0_0.Bq0));
        } else {
            this.Q00 = new hh0_1(sm0_0.c0(nf0_0.Bq0), 96, 30);
            this.gg0.rx0(65.0f);
        }
        this.Q00.uf("battle-button-return");
        this.Q00.RR(jc_22::ew0);
        this.gg0.EF(15.0f);
        this.gg0.yI().ys0(3.0f);
        this.bW.gg0.EF(15.0f);
        this.bW.gg0.yI().ys0(3.0f);
        this.bW.gg0.vx0(this.oB0[0]).yi0(this.oB0[1]).im0();
        this.bW.gg0.vx0(this.oB0[2]).yi0(this.oB0[3]).im0();
        this.bW.gg0.vx0(this.oB0[4]).yi0(this.oB0[5]).im0();
        this.gg0.vx0(new le0_2()).pJ0().im0();
        this.gg0.vx0(this.bW).im0();
        this.gg0.vx0(new le0_2()).pJ0().im0();
        this.gg0.vx0(this.Q00).tr0().jN().GD();
        this.zE0(this.oB0);
    }

    public static void eU(jc_2 jc_22, K5 k5, VU vu) {
        eg_1 eg_12;
        if ((eg_12 = jc_22.AV) != null) {
            jc_22.u3(eg_12);
            jc_22.AV = null;
            int i3 = -1;
            for (byte b = 0; b < 4; b = (byte) (b + 1)) {
                if (vu.I8.Gu[b] < 1) {
                    i3 = b;
                    break;
                }
            }
            if (i3 > 0) {
                short wQ = k5.nn.wQ;
                CH0 br = k5.nn.Br;
                CH0 pu = vu.pu;
                jc_22.ew0();
                tw0_0.rl.sn0(wQ, br, pu, (short) 1, (byte) i3);
            } else {
                jc_22.Oa0 = new QV(jc_22, k5, vu);
                jc_22.Hy(sm0_0.Bw((byte) 2, lpt6__2.Q80, 157, 39, sm0_0.zb0).replace('\n', ' '));
                jc_22.F9(jc_22.fU(), jc_22.Oa0);
            }
        }
    }

    @Override
    public void C(zk0_1 zk0_1) {
        int i1;
        if ((i1 = this.Ka) >= 0 && i1 < this.uH.length) {
            lpt6__0.v90(this.uH[i1]);
        }
    }

    @Override
    public boolean nd0(i70_0 i70_0) {
        if (E00.ZU(i70_0.zu) && i70_0.iT()) {
            int i2 = i70_0.finally$;
            rp_0 sJ0 = rp_0.sJ0;
            int ff = dw_2.ff;
            if (sJ0 != null && sJ0.Ov(i2)) {
                xe_1 xe_12;
                if ((xe_12 = this.uH[this.Ka]).OI) {
                    a7_0.bH(xe_12.ER.Fc0);
                }
                return true;
            }
            if (this.Q00 != null) {
                int i2_2 = i70_0.finally$;
                rp_0 nK0 = rp_0.nK0;
                if (nK0 != null && nK0.Ov(i2_2)) {
                    a7_0.bH(this.Q00.ER.Fc0);
                }
            }
            int i2_3 = i70_0.finally$;
            while (true) {
                rp_0 ni = rp_0.Ni;
                if (ni != null && ni.Ov(i2_3)) {
                    int i1;
                    if ((i1 = this.Ka + 1) % this.Sn0 != 0) {
                        this.Ka = i1;
                    }
                    break;
                }
                int i2_4 = i70_0.finally$;
                rp_0 i90 = rp_0.I90;
                if (i90 != null && i90.Ov(i2_4)) {
                    int i1;
                    if (((i1 = this.Ka) + 1) % this.Sn0 != 1) {
                        this.Ka = i1 - 1;
                    }
                    break;
                }
                int i2_5 = i70_0.finally$;
                rp_0 kC0 = rp_0.kC0;
                if (kC0 != null && kC0.Ov(i2_5)) {
                    int i1;
                    if ((i1 = this.Ka - this.Sn0) >= 0) {
                        this.Ka = i1;
                    }
                    break;
                }
                int i1_6 = i70_0.finally$;
                rp_0 synchronized$ = rp_0.synchronized$;
                if (synchronized$ != null && synchronized$.Ov(i1_6)) {
                    int i1;
                    if ((i1 = this.Ka + this.Sn0) < this.uH.length) {
                        this.Ka = i1;
                    }
                }
                break;
            }
            int i1;
            if ((i1 = this.Ka) >= 0 && i1 < this.uH.length) {
                lpt6__0.v90(this.uH[i1]);
            }
            return true;
        }
        return super.nd0(i70_0);
    }

    @Override
    public void K8() {
        super.K8();
    }

    public void zE0(xe_1[] xe_1Array) {
        this.Ka = 0;
        this.Sn0 = 2;
        this.uH = xe_1Array;
        if (xe_1Array.length != 0) {
            lpt6__0.v90(xe_1Array[0]);
        }
    }
}
