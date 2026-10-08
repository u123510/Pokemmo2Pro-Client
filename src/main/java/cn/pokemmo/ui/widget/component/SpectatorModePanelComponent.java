package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.text.DecimalFormat;

public class SpectatorModePanelComponent extends BaseComponent {
    public final DecimalFormat Vp0;
    public final fy_2 fV;
    public final cn_0 xG0;
    public final ae0_1 vh0;
    public final fy_2 zh0;
    public final cn_0 Wp0;
    public final xe_1 ur;
    public final xe_1 tJ;
    public final fy_2 DO;
    public final Qy0 UB;
    public int Eh;
    public int u6;
    public int as0;

    static {
        Cq0.E1(SpectatorModePanelComponent.class);
    }

    public SpectatorModePanelComponent(Qy0 v1) {
        this(v1, -2);
    }

    public SpectatorModePanelComponent(Qy0 v1, int i2) {
        super();
        this.Vp0 = new DecimalFormat("0.00");
        this.Eh = -2;
        this.u6 = -2;
        this.as0 = 0;
        uf("logingui");
        this.UB = v1;
        this.Eh = i2;
        this.u6 = i2;

        fy_2 fv = new fy_2();
        this.fV = fv;
        fv.uf("login-panel");
        cn_0 xg = new cn_0(sm0_0.c0(74));
        this.xG0 = xg;
        this.vh0 = new ae0_1();
        fv.WQ(fv.hb(new le0_2[]{xg}));
        fv.x40(fv.C7(new le0_2[]{xg}));
        if (!tw0_0.Xy0()) {
            fv.Ll(false);
        }
        SL(fv);

        fy_2 zh = new fy_2();
        this.zh0 = zh;
        zh.uf("login-panel");
        this.Wp0 = new cn_0("");
        int ba = nf0_0.BA;
        this.ur = new xe_1(sm0_0.c0(ba));
        this.ur.RR(new er_1((f.re_1)(Object)this));
        this.tJ = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.tJ.RR(new W8());

        I7 zh_vertical = zh.H10();
        I7 v6 = zh.H10();
        v6.X20(zh.lo0().Kn0(this.Wp0).X20(zh.H10().Ze0().LPt3(new le0_2[]{this.ur, this.tJ}).Ze0()));
        zh_vertical.X20(zh.C7(new le0_2[]{this.Wp0}).p70(20).X20(zh.hb(new le0_2[]{this.ur, this.tJ})));
        zh.x40(zh_vertical);
        zh.WQ(v6);
        zh.Ll(false);
        SL(zh);

        fy_2 doLayout = new fy_2();
        this.DO = doLayout;
        doLayout.uf("login-panel");
        cn_0 doLabel = new cn_0("");
        xe_1 doBtn = new xe_1(sm0_0.c0(ba));
        doBtn.RR(new JG());

        I7 do_vertical = doLayout.H10();
        I7 doV4 = doLayout.H10();
        doV4.X20(doLayout.lo0().Kn0(doLabel).X20(doLayout.H10().Ze0().LPt3(new le0_2[]{doBtn}).Ze0()));
        do_vertical.X20(doLayout.bx0(new ya_1[]{doLayout.lo0().Kn0(doLabel), doLayout.lo0().LPt3(new le0_2[]{doBtn})}));
        doLayout.x40(do_vertical);
        doLayout.WQ(doV4);
        doLayout.Ll(false);
        SL(doLayout);
    }

    @Override
    public final void K8() {
        this.fV.lt0();
        int x1 = kq_0.lpT2(this.UB.A20 + this.UB.e80, 2, this.UB.a3(), this.fV.Mx);
        int y1 = kq_0.lpT2(this.UB.SB0 + this.UB.y9, 2, this.UB.k5(), this.fV.OB);
        this.fV.E40(x1, y1);

        this.zh0.lt0();
        int x2 = kq_0.lpT2(this.UB.A20 + this.UB.e80, 2, this.UB.a3(), this.zh0.Mx);
        int y2 = kq_0.lpT2(this.UB.SB0 + this.UB.y9, 2, this.UB.k5(), this.zh0.OB);
        this.zh0.E40(x2, y2);

        this.DO.lt0();
        int x3 = kq_0.lpT2(this.UB.A20 + this.UB.e80, 2, this.UB.a3(), this.DO.Mx);
        int y3 = kq_0.lpT2(this.UB.SB0 + this.UB.y9, 2, this.UB.k5(), this.DO.OB);
        this.DO.E40(x3, y3);
    }

    public final void p() {
        lg_0.k.lPT5(new vd_2((f.re_1)(Object)this, sm0_0.c0(904), -1.0f));
        this.zh0.Ll(false);
        this.fV.Ll(true);
        lpt5__5.hL.Com4.execute(this::Vz);
    }

    @Override
    public final void HP(zk0_1 v1) {
        Qx0();
        super.HP(v1);
    }

    @Override
    public final void aUX(zk0_1 v1) {
        if (dw_2.lp0 && tw0_0.kz0()) {
            lg_0.S4.getClass();
            lg_0.S4.getClass();
        }
        if (this.Jj0 != null) {
            this.Jj0.uf(this.M, this.A20, this.SB0, this.Mx, this.OB);
        }
    }

    public final void Qx0() {
        if (this.u6 != this.Eh) {
            int state = this.Eh;
            this.u6 = state;
            switch (state) {
                case 5:
                    this.zh0.Ll(false);
                    this.fV.Ll(false);
                    this.DO.Ll(false);
                    return;
                case 3:
                    tw0_0.Ro0.getClass();
                    if (!yo_1.ah && tw0_0.Ro0.yy0()) {
                        String timeStr = "";
                        if (tw0_0.xj0()) {
                            int cq = yo_1.He0.cq;
                            if (yo_1.O90 != null) {
                                tw0_0.Ro0.getClass();
                            }
                            if (yo_1.Fs0 != null) {
                                cq = yo_1.Fs0.cq;
                            }
                            tw0_0.Ro0.getClass();
                            timeStr = "\n\n" + sm0_0.wa0(915, tx_1.QR((long) cq));
                        }
                        this.Wp0.Sk(sm0_0.wa0(903, Integer.toString(yo_1.IB0)) + timeStr);
                    } else {
                        tw0_0.Dc0();
                        if (!yo_1.ah) {
                            this.Wp0.Sk(sm0_0.c0(916));
                        } else {
                            this.Wp0.Sk(sm0_0.wa0(902, Integer.toString(yo_1.IB0)));
                        }
                        this.ur.Ll(false);
                        this.ur.pw0(false);
                        this.tJ.Ll(false);
                        this.tJ.pw0(false);
                    }
                    this.zh0.Ll(true);
                    this.fV.Ll(false);
                    this.DO.Ll(false);
                    return;
                case 2:
                    lg_0.k.lPT5(new vd_2((f.re_1)(Object)this, sm0_0.c0(nf0_0.zg0), -1.0f));
                    return;
                case 1:
                    tw0_0.Ro0.getClass();
                    if (yo_1.oh0 && Gf.RH()) {
                        lg_0.k.lPT5(new vd_2((f.re_1)(Object)this, sm0_0.c0(nf0_0.n5), -1.0f));
                        this.Eh = 6;
                    } else {
                        lg_0.k.lPT5(new yc0_1((f.re_1)(Object)this));
                    }
                    return;
                default:
                    break;
            }
            return;
        }
        int state = this.Eh;
        if (state == -2) {
            this.as0++;
            if (this.as0 > 3 && tw0_0.Ll0 != null && !tw0_0.Ll0.zd && tw0_0.hH0 != null && tw0_0.hH0.N20) {
                tw0_0.hH0.z4();
                this.Eh = -1;
            }
            if (tw0_0.hH0.xe0) {
                this.Eh = 5;
            }
            if (tw0_0.Ll0 != null && tw0_0.Ll0.zd) {
                this.Eh = -1;
            }
        } else if (state == -1) {
            if (tw0_0.Ll0 != null) {
                if (tw0_0.Ll0.zd || (tw0_0.hH0 != null && tw0_0.hH0.N20 && tw0_0.hH0.hZ)) {
                    this.Eh = 0;
                    if (!lpt3__1.eR && x0_0.k40 != 0) {
                        this.fV.Ll(true);
                        lpt5__5.hL.Com4.execute(yo_1::Rh0);
                        lg_0.k.lPT5(new vd_2((f.re_1)(Object)this, sm0_0.c0(917), -1.0f));
                    } else {
                        this.Eh = 1;
                    }
                }
                if (tw0_0.hH0.xe0) {
                    this.Eh = 5;
                }
                if (tw0_0.KW != null && !tw0_0.KW.yG0.isEmpty()) {
                    this.fV.Ll(true);
                    ru0_0 ru = tw0_0.KW;
                    float progress;
                    if (ru.yG0.isEmpty()) {
                        progress = 0.0f;
                    } else {
                        float sum = 0.0f;
                        for (I2 it = ru.yG0.ZD(); it.hasNext(); ) {
                            gf0_0 gf = (gf0_0) it.next();
                            pe_1 pe = gf.sk0;
                            if (pe != null) {
                                float p;
                                byte ct = pe.cT;
                                if (ct == 2 || ct == 4) {
                                    if (pe.xq0) {
                                        p = 1.0f;
                                    } else {
                                        float sub = 0.0f;
                                        if (pe.Yg >= 0 && pe.X1 >= 1) {
                                            sub = (float) pe.Yg / (float) pe.X1;
                                        }
                                        p = ((float) pe.QJ + sub * 100.0f + (float) pe.NX) / (float) (pe.Wr0.length + 200);
                                    }
                                } else if (pe.xq0) {
                                    p = 1.0f;
                                } else if (pe.Yg >= 0) {
                                    p = (float) (pe.NX + pe.Yg) / (float) (pe.Wr0.length + pe.X1);
                                } else {
                                    p = (float) pe.NX / (float) (pe.Wr0.length + 590);
                                }
                                sum += p;
                            } else {
                                sum += 1.0f;
                            }
                        }
                        progress = sum / (float) ru.yG0.KB;
                    }
                    Runtime rt = Runtime.getRuntime();
                    long usedMb = (rt.totalMemory() - rt.freeMemory()) / 1048576L;
                    long maxMb = rt.maxMemory() / 1048576L;
                    String info = sm0_0.wa0(925, this.Vp0.format((double) (progress * 100.0f)))
                            + "\nMemory Info: " + usedMb + " / " + maxMb + " MB";
                    lg_0.k.lPT5(new vd_2((f.re_1)(Object)this, info, progress));
                }
            }
        } else if (state == 0) {
            if (yo_1.BA0) {
                if (!yo_1.Jf) {
                    this.Eh = 2;
                } else if (x0_0.k40 < yo_1.IB0 && !yo_1.ww0) {
                    this.Eh = 3;
                } else {
                    this.Eh = 1;
                }
            }
        }
    }

    public final void Vz() {
        this.Eh = 4;
        tw0_0.Ro0.qI0(false, new String[0]);
    }
}
