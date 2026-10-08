package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.text.SimpleDateFormat;

public class MoveEffectTooltipComponent extends BaseComponent {
    public final fy_2 HT;
    public final cg_0 Vm0;

    public MoveEffectTooltipComponent(Qy0 qy0, ch0_2 ch0_2Var) {
        uf("confirm-widget");
        fy_2 fy_2Var = new fy_2();
        this.HT = fy_2Var;
        fy_2Var.uf("confirm-panel");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        String uv0 = ch0_2Var.sm().uv0();
        String str = "?";
        if (ch0_2Var.qr0() != null) {
            str = simpleDateFormat.format(Long.valueOf(((long) ch0_2Var.qr0().wc0()) * 1000L));
        }
        boolean xm = ch0_2Var.Xm();
        if (xm && !ch0_2Var.sm().Y00().isEmpty()) {
            uv0 = ch0_2Var.sm().Y00();
        }
        cn_0 cn_0Var = new cn_0(sm0_0.Bx(xm ? 1062 : 1061, new String[]{uv0, str}));
        cg_0 cg_0Var = new cg_0();
        this.Vm0 = cg_0Var;
        cg_0Var.I7();
        cg_0Var.ef0(16);
        cn_0 cn_0Var2 = new cn_0(sm0_0.c0(1053));
        cn_0Var2.coM8(cg_0Var);
        cn_0Var2.kl();
        xe_1 xe_1Var = new xe_1(sm0_0.c0(nf0_0.BA));
        xe_1Var.RR(() -> eo(ch0_2Var));
        xe_1 xe_1Var2 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        xe_1Var2.RR(() -> Qi0(qy0));

        ya_1 hGroup = fy_2Var.H10();
        hGroup.Kn0(cn_0Var);
        hGroup.X20(fy_2Var.hb(new le0_2[]{cn_0Var2, cg_0Var}));
        hGroup.Kn0(xe_1Var);
        hGroup.Kn0(xe_1Var2);
        hGroup.Ze0();
        fy_2Var.x40(hGroup);

        ya_1 vGroup = fy_2Var.lo0();
        vGroup.X20(fy_2Var.C7(new le0_2[]{cn_0Var2, cg_0Var}));
        vGroup.Kn0(cn_0Var);
        vGroup.Kn0(xe_1Var);
        vGroup.Kn0(xe_1Var2);
        fy_2Var.WQ(vGroup);

        SL(fy_2Var);
    }

    public static void Qi0(Qy0 qy0) {
        MoveEffectTooltipComponent mr0Var = qy0.TG0;
        if (mr0Var != null) {
            mr0Var.xe0();
        }
        qy0.TG0 = null;
    }

    @Override
    public final void K8() {
        this.HT.lt0();
        kh0();
        this.HT.N80(pa0_0.Ol);
    }

    public final void eo(ch0_2 ch0_2Var) {
        CH0 ch0 = ch0_2Var.Pc0.WN;
        String str = ((wn0_0) this.Vm0.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new wy_1(ch0, str));
    }
}
