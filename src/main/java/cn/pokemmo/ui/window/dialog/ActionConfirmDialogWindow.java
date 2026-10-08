package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 操作二次确认弹窗
 *
 * 原混淆类: f.lpt3__4
 */
public class ActionConfirmDialogWindow extends cx_0 implements tr_1  {
    public final lpt3__4 asBridge() {
        return (lpt3__4) (Object) this;
    }

    public fy_2 Py0;
    public xe_1 gY;
    public xe_1 qp0;
    public le0_2 Xt0;
    public ae0_1 yp0;
    public uk0_2 u20;
    public boolean D80 = false;
    public long A00 = -1L;
    public int vI0 = -1;
    public long Oi0 = 0L;

    public ActionConfirmDialogWindow(le0_2 le0_2Var, Runnable runnable, le0_2 le0_2Var2, xX xXVar) {
        super(false, false);
        this.D80 = false;
        this.A00 = -1L;
        this.vI0 = -1;
        this.Oi0 = 0L;
        uf("confirm-widget");
        fy_2 fy_2Var = new fy_2();
        this.Py0 = fy_2Var;
        fy_2Var.uf("confirm-panel");
        xe_1 xe_1Var = new xe_1(sm0_0.c0(xXVar == xX.jZ ? 52 : 50));
        xe_1Var.RR(runnable);
        xe_1 xe_1Var2 = null;
        if (xXVar == xX.Bm) {
            xe_1Var2 = new xe_1(sm0_0.c0(nf0_0.Yt));
        }
        Mq0(le0_2Var, xe_1Var, null, xe_1Var2, le0_2Var2);
    }

    public ActionConfirmDialogWindow(String str, Runnable runnable, le0_2 le0_2Var) {
        this(str, sm0_0.c0(nf0_0.uT), sm0_0.c0(nf0_0.Yt), runnable, le0_2Var);
    }

    public ActionConfirmDialogWindow(String str, String str2, String str3, Runnable runnable, le0_2 le0_2Var) {
        super(false, false);
        this.D80 = false;
        this.A00 = -1L;
        this.vI0 = -1;
        this.Oi0 = 0L;
        xe_1 xe_1Var = new xe_1(str2);
        xe_1Var.RR(runnable);
        Mq0(new cn_0(str), xe_1Var, null, new xe_1(str3), le0_2Var);
    }

    public ActionConfirmDialogWindow(le0_2 le0_2Var, xe_1 xe_1Var, xe_1 xe_1Var2, xe_1 xe_1Var3, le0_2 le0_2Var2) {
        super(false, false);
        this.D80 = false;
        this.A00 = -1L;
        this.vI0 = -1;
        this.Oi0 = 0L;
        Mq0(le0_2Var, xe_1Var, xe_1Var2, xe_1Var3, le0_2Var2);
    }

    @Override
    public final void K8() {
        this.Py0.lt0();
        kh0();
        this.Py0.vf(pa0_0.Ol);
    }

    public final void FW(zk0_1 zk0_1Var) {
        if (this.A00 > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.Oi0 > 20) {
                float f = ((float) (this.A00 - System.currentTimeMillis())) / ((float) this.vI0);
                if (f > 0.0f) {
                    this.yp0.aE(f);
                    this.Oi0 = System.currentTimeMillis();
                } else {
                    this.gY.pw0(true);
                    this.yp0.Ll(false);
                    this.yp0.aE(0.0f);
                    this.A00 = -1L;
                }
            }
        }
    }

    @Override
    public final void t5() {
        super.t5();
        lpt6__0.qK0(this, false);
        le0_2 le0_2Var = this.Xt0;
        if (le0_2Var != null) {
            lpt6__0.v90(le0_2Var);
        }
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        super.C(zk0_1Var);
        lg_0.k.lPT5(this::LPt4);
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT() && !i70_0Var.l()) {
            int i = i70_0Var.finally$;
            rp_0 rp_0Var = rp_0.kC0;
            int i2 = dw_2.ff;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                lpt6__0.v90(this.gY);
                return true;
            }
            rp_0 rp_0Var2 = rp_0.synchronized$;
            if (rp_0Var2 != null && rp_0Var2.Ov(i)) {
                lpt6__0.v90(this.qp0);
                return true;
            }
            rp_0 rp_0Var3 = rp_0.sJ0;
            if (rp_0Var3 != null && rp_0Var3.Ov(i)) {
                if (this.gY.Of() && this.gY.OI) {
                    a7_0.bH(this.gY.ER.Fc0);
                } else if (this.qp0 != null && this.qp0.Of()) {
                    a7_0.bH(this.qp0.ER.Fc0);
                }
                return true;
            }
            rp_0 rp_0Var4 = rp_0.nK0;
            if (rp_0Var4 != null && rp_0Var4.Ov(i)) {
                if (this.qp0 != null) {
                    a7_0.bH(this.qp0.ER.Fc0);
                } else {
                    a7_0.bH(this.gY.ER.Fc0);
                }
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }

    public final void Mq0(le0_2 le0_2Var, xe_1 xe_1Var, xe_1 xe_1Var2, xe_1 xe_1Var3, le0_2 le0_2Var2) {
        this.gY = xe_1Var;
        this.qp0 = xe_1Var3;
        Runnable runnable = this::Bg0;
        xe_1Var.RR(runnable);
        if (xe_1Var2 != null) {
            xe_1Var2.RR(runnable);
        }
        if (xe_1Var3 != null) {
            xe_1Var3.RR(runnable);
        }
        uf("confirm-widget");
        fy_2 fy_2Var = new fy_2();
        this.Py0 = fy_2Var;
        fy_2Var.uf("confirm-panel");
        this.u20 = new uk0_2();
        this.Py0.getClass();
        ya_1 Kn0 = new I7(this.Py0).Kn0(le0_2Var).Kn0(this.u20);
        this.Py0.getClass();
        this.Py0.x40(Kn0.X20(XN.sA(this.Py0, this.Py0).LPt3(new le0_2[]{this.gY, xe_1Var2, this.qp0})).Ze0());
        this.Py0.getClass();
        ya_1 Kn02 = new Hm0(this.Py0).Kn0(le0_2Var).Kn0(this.u20);
        this.Py0.getClass();
        this.Py0.WQ(Kn02.X20(D5.fE0(this.Py0, this.Py0).Kn0(this.gY).Kn0(xe_1Var2).Kn0(this.qp0)));
        F9(fU(), this.Py0);
        lpt6__0.ui0.add(this);
        this.Xt0 = le0_2Var2;
        this.Ey = tw0_0.kz0();
    }

    public final /* synthetic */ void LPt4() {
        lpt6__0.v90(this.D80 ? this.qp0 : this.gY);
    }

    public final void Bg0() {
        le0_2 le0_2Var = this.K20;
        if (le0_2Var != null) {
            le0_2Var.u3(this);
        }
    }
}
