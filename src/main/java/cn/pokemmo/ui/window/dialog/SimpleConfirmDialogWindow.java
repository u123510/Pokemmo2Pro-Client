/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.window.dialog;

import f.*;

import f.E00;
import f.a7_0;
import f.cn_0;
import f.cx_0;
import f.fy_2;
import f.i70_0;
import f.le0_2;
import f.lpt6__0;
import f.nf0_0;
import f.pa0_0;
import f.rp_0;
import f.sm0_0;
import f.tr_1;
import f.tw0_0;
import f.xe_1;
import f.zk0_1;

/*
 * Renamed from f.bu0
 */
/**
 * 通用确认对话框
 *
 * 原混淆类: f.bu0_0
 */
public class SimpleConfirmDialogWindow
extends cx_0
implements tr_1  {
    public final bu0_0 asBridge() {
        return (bu0_0) (Object) this;
    }

    public final fy_2 xF;
    public final xe_1 uO;
    public Runnable hG0;

    public SimpleConfirmDialogWindow(String object) {
        super(false, false);
        this.uf("confirm-widget");
        this.xF = new fy_2();
        this.xF.uf("confirm-panel");
        cn_0 label = new cn_0(object);
        this.uO = new xe_1(sm0_0.c0(nf0_0.BA));
        this.uO.RR(() -> {
            this.xe0();
            Runnable runnable = this.hG0;
            if (runnable != null) {
                runnable.run();
            }
        });
        this.xF.x40(this.xF.H10().Kn0(label).Kn0(this.uO).Ze0());
        this.xF.WQ(this.xF.lo0().Kn0(label).Kn0(this.uO));
        this.SL(this.xF);
        this.Ey = tw0_0.kz0();
    }

    @Override
    public final void C(zk0_1 zk0_12) {
        lpt6__0.v90(this.uO);
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        block2: {
            block3: {
                if (!E00.ZU(i70_02.zu) || !i70_02.iT()) break block2;
                int n = i70_02.finally$;
                rp_0 rp_02 = rp_0.sJ0;
                if (rp_02 != null && rp_02.Ov(n)) break block3;
                n = i70_02.finally$;
                rp_02 = rp_0.nK0;
                if (rp_02 == null || !rp_02.Ov(n)) break block2;
            }
            a7_0.bH(this.uO.ER.Fc0);
            return true;
        }
        return super.nd0(i70_02);
    }

    @Override
    public final void K8() {
        SimpleConfirmDialogWindow bu0_02 = this;
        super.K8();
        bu0_02.xF.lt0();
        bu0_02.kh0();
        bu0_02.xF.vf(pa0_0.Ol);
    }
}
