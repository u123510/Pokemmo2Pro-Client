/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  f.BR
 *  f.CH0
 *  f.Qy0
 *  f.ae0_1
 *  f.cn_0
 *  f.cx_0
 *  f.dw_2
 *  f.fy_2
 *  f.hl_2
 *  f.le0_2
 *  f.lg_0
 *  f.lpt6__0
 *  f.pa0_0
 *  f.sm0_0
 *  f.tr_1
 *  f.tw0_0
 *  f.xe_1
 *  f.zk0_1
 */
package cn.pokemmo.ui.window.dialog;

import f.*;

import f.BR;
import f.CH0;
import f.Qy0;
import f.ae0_1;
import f.cn_0;
import f.cx_0;
import f.dw_2;
import f.e30_0;
import f.fy_2;
import f.hl_2;
import f.le0_2;
import f.lg_0;
import f.lpt6__0;
import f.pa0_0;
import f.sm0_0;
import f.tr_1;
import f.tw0_0;
import f.xe_1;
import f.zk0_1;
import java.time.Duration;

/**
 * 防脚本验证码弹窗
 *
 * 原混淆类: f.AC
 */
public class CaptchaDialogWindow
extends cx_0
implements tr_1  {
    public final AC asBridge() {
        return (AC) (Object) this;
    }

    public final fy_2 Rp;
    public final xe_1 OU;
    public final ae0_1 JL0;
    public final long vE0;
    public final long CJ;

    public CaptchaDialogWindow(CH0 object, Duration duration, Duration duration2) {
        super(false, false);
        this.uf("confirm-widget");
        String captchaUrl = AC.AL(object);
        fy_2 fy_23 = new fy_2();
        fy_2 fy_24 = fy_23;
        this.Rp = fy_24;
        fy_23.uf("confirm-panel");
        cn_0 cn_04 = new cn_0(sm0_0.c0((int)8700));
        cn_04.Oq0(true);
        cn_0 cn_05 = new cn_0(sm0_0.c0((int)8701));
        cn_05.uf("label-danger");
        cn_05.Oq0(true);
        ae0_1 ae0_13 = new ae0_1();
        ae0_1 ae0_14 = ae0_13;
        this.JL0 = ae0_14;
        ae0_13.aE(1.0f);
        ae0_13.uf("countdown-progressbar");
        ae0_13.Oq0(true);
        this.vE0 = System.currentTimeMillis() - (duration.toMillis() - duration2.toMillis());
        this.CJ = duration.toMillis();
        xe_1 xe_13 = new xe_1(sm0_0.c0((int)8702));
        this.OU = xe_13;
        xe_13.RR(() -> AC.oY(captchaUrl));
        xe_1 xe_12 = new xe_1(sm0_0.c0((int)8703));
        xe_12.RR(() -> AC.vH0(captchaUrl));
        if (tw0_0.Xy0()) {
            fy_2 fy_25 = fy_23;
            fy_25.x40(fy_25.H10().Kn0((le0_2)ae0_13).Kn0((le0_2)cn_04).Kn0((le0_2)cn_05).Kn0((le0_2)xe_13).Kn0((le0_2)xe_12).Ze0());
            fy_25.WQ(fy_25.lo0().Kn0((le0_2)ae0_13).Kn0((le0_2)cn_04).Kn0((le0_2)cn_05).Kn0((le0_2)xe_13).Kn0((le0_2)xe_12));
        } else {
            fy_2 fy_26 = fy_23;
            fy_26.x40(fy_26.H10().Kn0((le0_2)cn_04).Kn0((le0_2)cn_05).Kn0((le0_2)xe_13).Kn0((le0_2)xe_12).Kn0((le0_2)ae0_13).Ze0());
            fy_26.WQ(fy_26.lo0().Kn0((le0_2)cn_04).Kn0((le0_2)cn_05).Kn0((le0_2)xe_13).Kn0((le0_2)xe_12).Kn0((le0_2)ae0_13));
        }
        this.SL((le0_2)fy_23);
    }

    public static void vH0(String string) {
        Qy0.yI0.dk(-1, sm0_0.c0((int)8704));
        lg_0.k.E00.getClass();
        hl_2.Ja0((String)string);
    }

    public static void oY(String string) {
        tw0_0.lM.getClass();
        lg_0.lv0.Lf(string);
    }

    public static String AL(CH0 cH0) {
        CH0 cH02 = CH0.j1;
        BR bR = tw0_0.rl;
        if (bR != null && bR.k0 != null) {
            cH02 = ((e30_0)bR.k0).WN;
        }
        return "https://pokemmo.com/captcha/" + cH02 + "/" + cH0.Sa + "/?local=" + dw_2.con;
    }

    public final void HP(zk0_1 zk0_12) {
        if (tw0_0.kz0()) {
            this.BL();
        } else if (tw0_0.kz0()) {
            this.OU.BL();
        } else if (!this.OU.Of()) {
            lpt6__0.v90((le0_2)this.OU);
        }
        float f2 = (float)(this.vE0 + this.CJ - System.currentTimeMillis()) / (float)this.CJ;
        if (f2 > 0.0f) {
            this.JL0.aE(f2);
        }
        super.HP(zk0_12);
    }

    public final void K8() {
        CaptchaDialogWindow aC = this;
        super.K8();
        aC.Rp.lt0();
        aC.kh0();
        aC.Rp.vf(pa0_0.Ol);
    }
}
