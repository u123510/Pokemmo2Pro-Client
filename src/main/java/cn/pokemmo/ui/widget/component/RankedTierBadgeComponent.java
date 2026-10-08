package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class RankedTierBadgeComponent extends BaseComponent {
    public final fy_2 DE0;
    public final xe_1 HD0;
    public final cg_0 Gr;
    public final cg_0 N4;

    public RankedTierBadgeComponent(BU v1, boolean i2, short i3) {
        super();
        uf("confirm-widget");
        fy_2 fy_2 = new fy_2();
        this.DE0 = fy_2;
        fy_2.uf("confirm-panel");
        cn_0 title = new cn_0(sm0_0.c0(100011));
        cg_0 cg_0_1 = new cg_0();
        this.Gr = cg_0_1;
        cg_0 cg_0_2 = new cg_0();
        this.N4 = cg_0_2;
        cg_0_1.ef0(16);
        cg_0_1.LPt8("[a-zA-ZÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]");
        cg_0_1.I7();
        cg_0_2.ef0(4);
        cg_0_2.LPt8("[a-zA-ZÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõöøùúûüýþÿ]");
        cg_0_2.I7();
        cn_0 fieldLabel1 = new cn_0(sm0_0.c0(2729));
        cn_0 fieldLabel2 = new cn_0(sm0_0.c0(2730));
        fieldLabel2.kl();
        fieldLabel1.kl();
        if (i2) {
            xe_1 btn = new xe_1(sm0_0.c0(2991));
            this.HD0 = btn;
            btn.RR(() -> SH0(i3));
        } else {
            xe_1 btn = new xe_1(sm0_0.c0(nf0_0.BA));
            this.HD0 = btn;
            btn.RR(() -> Ft(v1, i3));
        }
        xe_1 cancelBtn = new xe_1(sm0_0.c0(nf0_0.Bq0));
        cancelBtn.RR(() -> ut(v1));
        fy_2.x40(fy_2.H10().Kn0(title).X20(fy_2.lo0().LPt3(new le0_2[]{fieldLabel1, cg_0_1})).X20(fy_2.lo0().LPt3(new le0_2[]{fieldLabel2, cg_0_2})).X20(fy_2.H10().LPt3(new le0_2[]{this.HD0, cancelBtn})).Ze0());
        fy_2.WQ(fy_2.lo0().Kn0(title).X20(fy_2.H10().LPt3(new le0_2[]{fieldLabel1, cg_0_1})).X20(fy_2.H10().LPt3(new le0_2[]{fieldLabel2, cg_0_2})).X20(fy_2.lo0().Kn0(this.HD0).Kn0(cancelBtn)));
        SL(this.DE0);
    }

    public static void ut(BU v0) {
        RankedTierBadgeComponent yf = v0.COm6;
        if (yf != null) {
            yf.xe0();
            v0.COm6 = null;
        }
    }

    @Override
    public final void C(zk0_1 v1) {
        lpt6__0.v90(this.Gr);
    }

    @Override
    public final void K8() {
        this.DE0.lt0();
        kh0();
        this.DE0.vf(pa0_0.Ol);
    }

    public final void Ft(BU v1, short i2) {
        RankedTierBadgeComponent yf = v1.COm6;
        if (yf != null) {
            yf.xe0();
            v1.COm6 = null;
        }
        String text1 = ((wn0_0) this.Gr.dI0).YA.toString();
        String text2 = ((wn0_0) this.N4.dI0).YA.toString();
        String msg = sm0_0.Bx(100013, text1, text2);
        Qy0.yI0.sr0(new lpt3__4(msg, () -> Lb(i2), this));
    }

    public final void Lb(short i1) {
        String text1 = ((wn0_0) this.Gr.dI0).YA.toString();
        String text2 = ((wn0_0) this.N4.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new m60_0(i1, text1, text2, false));
    }

    public final void SH0(short i1) {
        String text1 = ((wn0_0) this.Gr.dI0).YA.toString();
        String text2 = ((wn0_0) this.N4.dI0).YA.toString();
        tw0_0.rl.fk0.uQ(new m60_0(i1, text1, text2, true));
    }
}
