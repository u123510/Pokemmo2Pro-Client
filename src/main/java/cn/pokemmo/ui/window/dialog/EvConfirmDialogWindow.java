package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 努力值分配确认弹窗
 *
 * 原混淆类: f.Z70
 */
public class EvConfirmDialogWindow extends cx_0 implements tr_1  {
    public final Z70 asBridge() {
        return (Z70) (Object) this;
    }

    public final fy_2 L5;
    public final le0_2 HP;
    public final CE Pa;
    public final K5 g6;
    public final X6 ZT;
    public final VL0[] z2;

    public EvConfirmDialogWindow(K5 v1, CE v2) {
        super(false, false);
        this.uf("confirm-widget");
        this.HP = null;
        this.Pa = v2;
        this.g6 = v1;

        fy_2 panel = new fy_2();
        this.L5 = panel;
        panel.uf("confirm-panel");

        cn_0 title = new cn_0();
        title.uf("label-title");
        panel.x40(panel.C7(new le0_2[]{title}));
        panel.WQ(panel.hb(new le0_2[]{title}));
        title.Sk(sm0_0.c0(5613));

        cq_0 cq = mp_1.vf0().W50(v2.SA0());
        cn_0 monLabel = new cn_0(" " + ((int) v2.tr0()) + " " + cq.zj());
        panel.nt0().Kn0(monLabel);
        panel.kl0().Kn0(monLabel);

        cn_0 natureTitle = new cn_0(sm0_0.c0(8106));
        cn_0 natureDesc = new cn_0("");

        rz_0[] natures = rz_0.lpT5;
        String[] natureNames = new String[natures.length + 1];
        natureNames[0] = "-";
        for (int i = 0; i < natures.length; i++) {
            natureNames[natures[i].EC() + 1] = natures[i].e8();
        }

        pg0_2 model = new pg0_2(natureNames);
        X6 combo = new X6(model);
        this.ZT = combo;
        combo.Bd(0);
        combo.Rm0(() -> this.PRN(natureDesc));

        panel.nt0().X20(panel.lo0().LPt3(new le0_2[]{natureTitle, combo}));
        panel.kl0().X20(panel.H10().Kn0(natureTitle).Ze0().Kn0(combo));
        panel.nt0().Kn0(natureDesc);
        panel.kl0().Kn0(natureDesc);

        cn_0 evTitle = new cn_0(sm0_0.c0(1800));
        panel.nt0().Kn0(evTitle);
        panel.kl0().Kn0(evTitle);

        cn_0[] evLabels = new cn_0[6];
        this.z2 = new VL0[6];
        for (int i = 0; i < gc_2.fe0.length; i++) {
            gc_2 stat = gc_2.fe0[i];
            cn_0 label = new cn_0(stat.toString());
            evLabels[i] = label;
            label.uf("label-title");
            Aj adj = new Aj(0, 252, v2.ZY(stat));
            VL0 adjuster = new VL0(adj);
            this.z2[i] = adjuster;
            adjuster.uf("valueadjuster-small");
        }

        ya_1 hGroup = panel.lo0().LPt3(new le0_2[]{evLabels[0], this.z2[0]})
                .X20(panel.lo0().LPt3(new le0_2[]{evLabels[1], this.z2[1]}))
                .X20(panel.lo0().LPt3(new le0_2[]{evLabels[2], this.z2[2]}))
                .X20(panel.lo0().LPt3(new le0_2[]{evLabels[3], this.z2[3]}))
                .X20(panel.lo0().LPt3(new le0_2[]{evLabels[4], this.z2[4]}))
                .X20(panel.lo0().LPt3(new le0_2[]{evLabels[5], this.z2[5]}));

        panel.nt0().X20(hGroup);
        panel.kl0().X20(panel.H10().Kn0(evLabels[0]).Ze0().LPt3(new le0_2[]{this.z2[0]})
                .X20(panel.H10().Kn0(evLabels[1]).Ze0().LPt3(new le0_2[]{this.z2[1]}))
                .X20(panel.H10().Kn0(evLabels[2]).Ze0().LPt3(new le0_2[]{this.z2[2]}))
                .X20(panel.H10().Kn0(evLabels[3]).Ze0().LPt3(new le0_2[]{this.z2[3]}))
                .X20(panel.H10().Kn0(evLabels[4]).Ze0().LPt3(new le0_2[]{this.z2[4]}))
                .X20(panel.H10().Kn0(evLabels[5]).Ze0().LPt3(new le0_2[]{this.z2[5]})));

        xe_1 btnConfirm = new xe_1(sm0_0.c0(nf0_0.BA));
        btnConfirm.RR(this::BW);
        panel.nt0().Kn0(btnConfirm);
        panel.kl0().Kn0(btnConfirm);

        xe_1 btnCancel = new xe_1(sm0_0.c0(nf0_0.Bq0));
        btnCancel.RR(this::xe0);
        panel.nt0().qd(25).Kn0(btnCancel);
        panel.kl0().Kn0(btnCancel);

        this.SL(panel);
    }

    public final void BW() {
        byte natureIndex = (byte) (this.ZT.mu0.Mw0 - 1);
        rz_0 nature = (rz_0) rz_0.RM.BM(natureIndex);
        if (nature == null) {
            tw0_0.rl.qK(sm0_0.c0(5618));
            return;
        }
        short[] evs = new short[gc_2.Wp.length];
        int total = 0;
        for (int i = 0; i < gc_2.Wp.length; i++) {
            gc_2 stat = gc_2.Wp[i];
            short val = (short) this.z2[stat.CoM2].eB0;
            evs[stat.v10] = val;
            total += val;
        }
        if (total != 510) {
            tw0_0.rl.qK(sm0_0.wa0(5636, "510"));
            return;
        }
        ef0_0 ef = new ef0_0(this.Pa, nature, evs);
        short wQ = this.g6.nn.wQ;
        tw0_0.rl.fk0.uQ(new se_1(wQ, ef));
        this.xe0();
    }

    @Override
    public final void K8() {
        super.K8();
        this.L5.lt0();
        this.kh0();
        this.L5.vf(pa0_0.Ol);
    }

    @Override
    public final void t5() {
        super.t5();
        if (this.HP != null) {
            lpt6__0.v90(this.HP);
        }
    }

    public final void PRN(cn_0 v1) {
        int idx = this.ZT.mu0.Mw0;
        if (idx != 0) {
            v1.Sk(lb0_2.GK0(rz_0.lpT5[idx - 1]));
        } else {
            v1.Sk("");
        }
    }
}
