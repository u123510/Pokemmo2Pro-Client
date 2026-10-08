package cn.pokemmo.ui.window.dialog;

import f.*;

import java.text.DecimalFormat;

/**
 * 付费确认弹窗
 *
 * 原混淆类: f.qj0_2
 */
public class PaymentConfirmDialogWindow extends cx_0 implements tr_1  {
    public final qj0_2 asBridge() {
        return (qj0_2) (Object) this;
    }

    public final DecimalFormat m0;
    public final fy_2 VD;
    public final ae0_1 ww0;
    public final cn_0 bz;

    public PaymentConfirmDialogWindow(String text) {
        super(false, false);
        this.m0 = new DecimalFormat("0.00");
        this.uf("confirm-widget");
        this.VD = new fy_2();
        this.VD.uf("confirm-panel");
        this.bz = new cn_0(text);
        this.ww0 = new ae0_1();
        this.VD.x40(this.VD.H10().Kn0(this).Kn0(this.ww0).Ze0());
        this.VD.WQ(this.VD.lo0().Kn0(this).Kn0(this.ww0));
        this.SL(this.VD);
    }

    @Override
    public final void K8() {
        super.K8();
        this.VD.lt0();
        this.kh0();
        this.VD.vf(pa0_0.Ol);
    }

    public final void Rs0(float value) {
        if (LW.LH0(value, -1.0f)) {
            float current = this.ww0.uc;
            value = current + (1.0f - current) * Math.min(0.1f, lg_0.S4.uL);
        }
        if (value > 0.9999f) {
            value = 0.9999f;
        }
        this.ww0.aE(value);
        this.ww0.B(new StringBuilder().append(this.m0.format(value * 100.0f)).append('%').toString());
    }
}
