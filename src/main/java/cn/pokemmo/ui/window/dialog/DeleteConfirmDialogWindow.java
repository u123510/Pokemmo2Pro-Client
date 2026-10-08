package cn.pokemmo.ui.window.dialog;

import f.*;

import java.text.NumberFormat;

/**
 * 删除/放生危险确认弹窗
 *
 * 原混淆类: f.x3_0
 */
public class DeleteConfirmDialogWindow extends cx_0 implements tr_1  {
    public final x3_0 asBridge() {
        return (x3_0) (Object) this;
    }

    public final xe_1 Ek0;
    public final tk0_0 ZL;
    public final Rs0 KJ;

    public DeleteConfirmDialogWindow(Rs0 v1) {
        super(false, false);
        this.KJ = v1;
        uf("confirm-widget");
        this.ZL = new tk0_0();
        this.ZL.uf("confirm-panel");
        A40 table = this.ZL.gg0;
        table.EF(10.0f);
        table.yI().Wa0().ys0(5.0f);
        table.vx0(new cn_0(sm0_0.c0(16777271))).ae0(3).ru();
        table.Rg();

        W9[] checkboxes = new W9[3];
        cn_0[] labels3 = new cn_0[3];
        cn_0[] labels4 = new cn_0[3];
        short flags = 0;
        if (tw0_0.rl != null) {
            flags = tw0_0.rl.hz().ma((byte) 4, (short) 1495);
        }
        for (int i6 = 0; i6 < 3; i6++) {
            checkboxes[i6] = new W9();
            checkboxes[i6].pw0(false);
            boolean checked = (flags & (1 << i6)) != 0;
            checkboxes[i6].k50(checked);
            labels4[i6] = new cn_0();
            labels3[i6] = new cn_0();
            table.vx0(checkboxes[i6]).yi0(labels3[i6]).yi0(labels4[i6]);
            table.Rg();
        }

        labels3[0].Sk(sm0_0.wa0(16777268, NumberFormat.getInstance().format(999L)));
        labels4[0].Sk(sm0_0.wa0(16777270, NumberFormat.getInstance().format(500L)));

        labels3[1].Sk(sm0_0.wa0(16777268, NumberFormat.getInstance().format(9999L)));
        labels4[1].Sk(sm0_0.wa0(16777270, NumberFormat.getInstance().format(5000L)));

        labels3[2].Sk(sm0_0.wa0(16777269, NumberFormat.getInstance().format(8L)));
        labels4[2].Sk(gu0.Az0().lPT6((short) 4675).getName());

        xe_1 okBtn = new xe_1(sm0_0.c0(nf0_0.BA));
        this.Ek0 = okBtn;
        okBtn.RR(this::xe0);
        ((A40) this.ZL.gg0.YI0()).vx0(okBtn).ae0(3).Yt();
        this.ZL.Nu();
        SL(this.ZL);
        this.Ey = tw0_0.kz0();
    }

    @Override
    public final boolean xe0() {
        super.xe0();
        lpt6__0.v90(this.KJ);
        return true;
    }

    @Override
    public final void C(zk0_1 v1) {
        lpt6__0.v90(this.Ek0);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            rp_0 r1 = rp_0.sJ0;
            int unused = dw_2.ff;
            if (r1 != null && r1.Ov(key)) {
                a7_0.bH(this.Ek0.ER.Fc0);
                return true;
            }
            int key2 = v1.finally$;
            rp_0 r2 = rp_0.nK0;
            if (r2 != null && r2.Ov(key2)) {
                a7_0.bH(this.Ek0.ER.Fc0);
                return true;
            }
        }
        return super.nd0(v1);
    }

    @Override
    public final void K8() {
        super.K8();
        this.ZL.lt0();
        this.ZL.vf(pa0_0.Ol);
        kh0();
    }
}
