package cn.pokemmo.ui.window.dialog;

import f.*;

import com.badlogic.gdx.graphics.Texture;

/**
 * 带倒计时确认弹窗
 *
 * 原混淆类: f.mt_1
 */
public class TimedConfirmDialogWindow extends cx_0 implements tr_1  {
    public final mt_1 asBridge() {
        return (mt_1) (Object) this;
    }

    public final fy_2 LPT1;
    public final cn_0 lB;
    public final S70 wu0;
    public final xe_1 bH;
    public final cg_0 yr;
    public final ae0_1 Sc0;
    public long wC;
    public long jA0;
    public Texture Y5;

    public TimedConfirmDialogWindow(Texture texture, byte b) {
        super(false, false);
        this.Y5 = null;
        uf("confirm-widget");
        this.Y5 = texture;
        fy_2 fy_2Var = new fy_2();
        this.LPT1 = fy_2Var;
        fy_2Var.uf("confirm-panel");
        cn_0 cn_0Var = new cn_0(sm0_0.wa0(70, b + ""));
        this.lB = cn_0Var;
        cn_0Var.Oq0(true);
        ae0_1 ae0_1Var = new ae0_1();
        this.Sc0 = ae0_1Var;
        ae0_1Var.aE(1.0f);
        ae0_1Var.uf("countdown-progressbar");
        ae0_1Var.Oq0(true);
        this.wC = System.currentTimeMillis();
        this.jA0 = 45000L;
        S70 s70 = new S70(texture.getWidth() * 2, texture.getHeight() * 2);
        this.wu0 = s70;
        s70.JH().LX(new Texture[]{texture});
        s70.JH().dA(2.0f);
        s70.Oq0(true);
        cg_0 cg_0Var = new cg_0();
        this.yr = cg_0Var;
        cg_0Var.I7();
        xe_1 xe_1Var = new xe_1(sm0_0.c0(69));
        this.bH = xe_1Var;
        xe_1Var.RR(new YI0(asBridge()));
        cg_0Var.Ii(new oj_0(asBridge()));
        if (tw0_0.Xy0()) {
            fy_2Var.x40(fy_2Var.H10().Kn0(s70).Kn0(ae0_1Var).Kn0(cn_0Var).Kn0(cg_0Var).Kn0(xe_1Var).Ze0());
            fy_2Var.WQ(fy_2Var.lo0().Kn0(s70).Kn0(ae0_1Var).Kn0(cn_0Var).Kn0(cg_0Var).Kn0(xe_1Var));
        } else {
            fy_2Var.x40(fy_2Var.H10().Kn0(cn_0Var).Kn0(s70).Kn0(cg_0Var).Kn0(xe_1Var).Kn0(ae0_1Var).Ze0());
            fy_2Var.WQ(fy_2Var.lo0().Kn0(cn_0Var).Kn0(s70).Kn0(cg_0Var).Kn0(xe_1Var).Kn0(ae0_1Var));
        }
        SL(fy_2Var);
    }

    public final void gO(boolean z) {
        if (!this.bH.OI) {
            return;
        }
        if (!z && ((wn0_0) this.yr.dI0).YA.toString().isEmpty()) {
            lpt6__0.v90(this.yr);
            return;
        }
        this.bH.SU(sm0_0.c0(nf0_0.EC0));
        this.bH.pw0(false);
        this.yr.pw0(false);
        String text = ((wn0_0) this.yr.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new fu_0(text, z));
    }

    @Override
    public final void HP(zk0_1 zk0_1Var) {
        if (tw0_0.kz0()) {
            BL();
        } else if (tw0_0.kz0()) {
            this.yr.BL();
        } else if (!this.yr.Of()) {
            lpt6__0.v90(this.yr);
        }
        float progress = (float) (this.wC + this.jA0 - System.currentTimeMillis()) / (float) this.jA0;
        if (progress > 0.0f) {
            this.Sc0.aE(progress);
            super.HP(zk0_1Var);
            return;
        }
        if (!((wn0_0) this.yr.dI0).YA.toString().isEmpty() && this.bH.OI) {
            gO(true);
        }
        super.HP(zk0_1Var);
    }

    @Override
    public final void t5() {
        super.t5();
        if (this.Y5 != null) {
            this.Y5.dispose();
        }
    }

    @Override
    public final void K8() {
        super.K8();
        this.LPT1.lt0();
        kh0();
        if (tw0_0.kz0()) {
            this.LPT1.vf(pa0_0.dC0);
        } else {
            this.LPT1.vf(pa0_0.Ol);
        }
    }
}
