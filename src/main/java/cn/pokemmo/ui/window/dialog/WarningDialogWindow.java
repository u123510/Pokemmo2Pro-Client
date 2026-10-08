package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 警告提示对话框
 *
 * 原混淆类: f.uf0_0
 */
public class WarningDialogWindow extends cx_0 implements tr_1  {
    public final uf0_0 asBridge() {
        return (uf0_0) (Object) this;
    }

    public final fy_2 fo0;
    public final xe_1 rd;
    public final Aj fD0;
    public final xe_1[] z30;
    public int AuX;

    public WarningDialogWindow(String v1, int i2, uw_0 v3, le0_2 v4) {
        super(tw0_0.kz0());
        this.AuX = 3;
        uf("confirm-widget");
        fy_2 v5 = new fy_2();
        this.fo0 = v5;
        v5.uf("confirm-panel");
        cn_0 v6 = new cn_0(v1);
        v6.uf("label");
        Aj vAj = new Aj(1, i2, 1);
        this.fD0 = vAj;
        VL0 v7 = new VL0(vAj);
        xe_1 btn1 = new xe_1(sm0_0.c0(49));
        btn1.RR(() -> ph(i2));
        xe_1 btn2 = new xe_1(sm0_0.c0(60));
        btn2.RR(() -> s6(v3, v4));
        xe_1 btn3 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.rd = btn3;
        btn3.RR(() -> Cz(v4));
        this.z30 = new xe_1[]{v7.aB0, v7.BA0, btn1, btn2, btn3};

        v5.x40(v5.H10().Kn0(v6).X20(v5.lo0().LPt3(v7, btn1)).X20(v5.H10().LPt3(btn2, btn3)).Ze0());
        v5.WQ(v5.lo0().Kn0(v6).X20(v5.H10().Kn0(v7).Ze0().Kn0(btn1)).X20(v5.lo0().Kn0(btn2).Kn0(btn3)));
        SL(v5);
    }

    @Override
    public final void K8() {
        super.K8();
        this.fo0.lt0();
        kh0();
        this.fo0.vf(pa0_0.Ol);
    }

    @Override
    public final void C(zk0_1 v1) {
        super.C(v1);
        v1.xx(this::nW);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            rp_0 sJ0 = rp_0.sJ0;
            int unused = dw_2.ff;
            if (sJ0 != null && sJ0.Ov(key)) {
                a7_0.bH(this.z30[this.AuX].ER.Fc0);
                return true;
            }
            rp_0 nK0 = rp_0.nK0;
            if (nK0 != null && nK0.Ov(key)) {
                a7_0.bH(this.rd.ER.Fc0);
                return true;
            }
            rp_0 kC0 = rp_0.kC0;
            if (kC0 != null && kC0.Ov(key)) {
                if (--this.AuX < 0) {
                    this.AuX = 0;
                }
                lpt6__0.v90(this.z30[this.AuX]);
                return true;
            }
            rp_0 sync = rp_0.synchronized$;
            if (sync != null && sync.Ov(key)) {
                if (++this.AuX >= this.z30.length - 1) {
                    this.AuX = this.z30.length - 1;
                }
                lpt6__0.v90(this.z30[this.AuX]);
                return true;
            }
            rp_0 I90 = rp_0.I90;
            if (I90 != null && I90.Ov(key)) {
                if (--this.AuX < 0) {
                    this.AuX = 0;
                }
                lpt6__0.v90(this.z30[this.AuX]);
                return true;
            }
            rp_0 Ni = rp_0.Ni;
            if (Ni != null && Ni.Ov(key)) {
                if (++this.AuX >= this.z30.length - 1) {
                    this.AuX = this.z30.length - 1;
                }
                lpt6__0.v90(this.z30[this.AuX]);
                return true;
            }
        }
        return super.nd0(v1);
    }

    public final void nW() {
        lpt6__0.v90(this.z30[this.AuX]);
    }

    public final void Cz(le0_2 v1) {
        xe0();
        if (v1 != null) {
            lpt6__0.v90(v1);
        }
    }

    public final void s6(uw_0 v1, le0_2 v2) {
        v1.Q(this.fD0.cx0);
        xe0();
        if (v2 != null) {
            lpt6__0.v90(v2);
        }
    }

    public final void ph(int i1) {
        this.fD0.X90(i1);
    }
}
