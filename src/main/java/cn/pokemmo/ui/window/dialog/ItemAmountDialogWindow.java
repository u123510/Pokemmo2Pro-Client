package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 道具数量选择确认弹窗
 *
 * 原混淆类: f.IZ
 */
public class ItemAmountDialogWindow extends cx_0 implements tr_1  {
    public final IZ asBridge() {
        return (IZ) (Object) this;
    }

    public final fy_2 pc0;
    public final le0_2 TW;
    public final CE Pv;
    public final K5 mk0;
    public final VL0[] fa;
    public final cn_0 la0;
    public final byte Uc;

    public ItemAmountDialogWindow(K5 k5, CE ce) {
        super(false, false);
        this.uf("confirm-widget");
        this.TW = null;
        this.Pv = ce;
        this.mk0 = k5;
        this.Uc = k5.LW().vy();

        this.pc0 = new fy_2();
        this.pc0.uf("confirm-panel");

        cn_0 title = new cn_0();
        title.uf("label-title");
        this.pc0.x40(this.pc0.C7(new le0_2[]{title}));
        this.pc0.WQ(this.pc0.hb(new le0_2[]{title}));
        title.Sk(sm0_0.c0(5613));

        cq_0 species = mp_1.vf0().W50(ce.SA0());
        String infoText = ig_0.u9(59, new StringBuilder(), " ")
                .append(ce.tr0())
                .append(" ")
                .append(species.zj())
                .toString();
        cn_0 info = new cn_0(infoText);
        this.pc0.nt0().Kn0(info);
        this.pc0.kl0().Kn0(info);

        cn_0 label = new cn_0(sm0_0.c0(1849));
        this.pc0.nt0().Kn0(label);
        this.pc0.kl0().Kn0(label);

        cn_0[] labels = new cn_0[6];
        this.fa = new VL0[6];
        for (int i = 0; i < gc_2.fe0.length; i++) {
            gc_2 stat = gc_2.fe0[i];
            cn_0 statLabel = new cn_0(stat.toString());
            labels[i] = statLabel;
            statLabel.uf("label-title");
            byte value = ce.RI(stat);
            Aj range = new Aj(0, 31, value);
            this.fa[i] = new W50(asBridge(), range);
            this.fa[i].uf("valueadjuster-small");
            this.fa[i].BA0.pw0(value < 31);
            this.fa[i].aB0.pw0(value > 0);
        }

        ya_1 rows = this.pc0.H10()
                .X20(this.pc0.lo0().LPt3(new le0_2[]{labels[0], this.fa[0]}))
                .X20(this.pc0.lo0().LPt3(new le0_2[]{labels[1], this.fa[1]}))
                .X20(this.pc0.lo0().LPt3(new le0_2[]{labels[2], this.fa[2]}))
                .X20(this.pc0.lo0().LPt3(new le0_2[]{labels[3], this.fa[3]}))
                .X20(this.pc0.lo0().LPt3(new le0_2[]{labels[4], this.fa[4]}))
                .X20(this.pc0.lo0().LPt3(new le0_2[]{labels[5], this.fa[5]}));
        ya_1 cols = this.pc0.lo0()
                .X20(this.pc0.H10().Kn0(labels[0]).Ze0().LPt3(new le0_2[]{this.fa[0]}))
                .X20(this.pc0.H10().Kn0(labels[1]).Ze0().LPt3(new le0_2[]{this.fa[1]}))
                .X20(this.pc0.H10().Kn0(labels[2]).Ze0().LPt3(new le0_2[]{this.fa[2]}))
                .X20(this.pc0.H10().Kn0(labels[3]).Ze0().LPt3(new le0_2[]{this.fa[3]}))
                .X20(this.pc0.H10().Kn0(labels[4]).Ze0().LPt3(new le0_2[]{this.fa[4]}))
                .X20(this.pc0.H10().Kn0(labels[5]).Ze0().LPt3(new le0_2[]{this.fa[5]}));
        this.pc0.nt0().X20(rows);
        this.pc0.kl0().X20(cols);

        String[] args = new String[2];
        args[0] = k5.Ua();
        args[1] = String.valueOf(0);
        this.la0 = new cn_0(sm0_0.Bx(5638, args));
        this.la0.uf("label-title");
        this.pc0.nt0().Kn0(this.la0);
        this.pc0.kl0().Kn0(this.la0);

        xe_1 ok = new xe_1(sm0_0.c0(nf0_0.BA));
        ok.RR(this::NX);
        this.pc0.nt0().Kn0(ok);
        this.pc0.kl0().Kn0(ok);

        xe_1 cancel = new xe_1(sm0_0.c0(nf0_0.Bq0));
        cancel.RR(this::xe0);
        this.pc0.nt0().qd(25).Kn0(cancel);
        this.pc0.kl0().Kn0(cancel);
        this.SL(this.pc0);
    }

    public final void NX() {
        gc_2[] stats = gc_2.Wp;
        byte[] values = new byte[stats.length];
        for (int i = 0; i < stats.length; i++) {
            gc_2 stat = stats[i];
            values[stat.v10] = (byte) this.fa[stat.CoM2].eB0;
        }
        TE0 packet = new TE0(this.Pv, values);
        short s = this.mk0.nn.wQ;
        tw0_0.rl.fk0.uQ(new Y(s, packet));
        this.xe0();
    }

    @Override
    public final void K8() {
        super.K8();
        this.pc0.lt0();
        this.kh0();
        this.pc0.vf(pa0_0.Ol);
    }

    @Override
    public final void t5() {
        super.t5();
        le0_2 panel = this.TW;
        if (panel != null) {
            lpt6__0.v90(panel);
        }
    }

    public final int wy() {
        CE ce = this.Pv;
        ce.getClass();
        int n = gc_2.Wp.length;
        byte[] original = new byte[n];
        for (int i = 0; i < n; i++) {
            original[i] = ce.RI(gc_2.Wp[i]);
        }
        int total = 0;
        for (gc_2 stat : gc_2.Wp) {
            total += Math.abs((byte) this.fa[stat.CoM2].eB0 - original[stat.v10]);
        }
        return (int) Math.ceil((double) total / (double) this.Uc);
    }
}
