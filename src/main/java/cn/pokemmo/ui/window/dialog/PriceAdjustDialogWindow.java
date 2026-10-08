package cn.pokemmo.ui.window.dialog;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 价格调整确认弹窗
 *
 * 原混淆类: f.ok_1
 */
public class PriceAdjustDialogWindow extends cx_0 implements tr_1  {
    public final ok_1 asBridge() {
        return (ok_1) (Object) this;
    }

    public final fy_2 PG0;
    public final o60_0 i30;
    public final yi0_1 Ik;
    public final qu_2 dF;
    public X6 aF;
    public X6 Jv0;
    public X6[] Kk0;
    public vk0_1[] cF0;
    public W9[] Da0;
    public VL0[] Bx0;

    public PriceAdjustDialogWindow(o60_0 o60_02, qu_2 qu_22) {
        super(false, false);
        this.aF = null;
        this.Jv0 = null;
        this.Kk0 = new X6[0];
        this.Da0 = null;
        this.uf("confirm-widget");
        this.dF = qu_22;
        this.i30 = o60_02;
        fy_2 panel = new fy_2();
        this.PG0 = panel;
        panel.uf("confirm-panel");
        cn_0 titleLabel = new cn_0();
        titleLabel.uf("label-title");
        panel.x40(panel.C7(new le0_2[]{titleLabel}));
        panel.WQ(panel.hb(new le0_2[]{titleLabel}));
        this.Ik = o60_02.jI();
        if (this.Ik.jl0() > 0) {
            titleLabel.Sk(sm0_0.c0(5613));
            cq_0 cq = mp_1.vf0().W50(this.Ik.jl0());
            StringBuilder sb = new StringBuilder(g7_0.Zx(59, new StringBuilder(), " 50 "));
            sb.append(sm0_0.c0(5615)).append(" ");
            sb.append(cq.zj());
            cn_0 descLabel = new cn_0(sb.toString());
            this.PG0.nt0().Kn0(descLabel);
            this.PG0.kl0().Kn0(descLabel);
            if (this.Ik.BH()) {
                cn_0 natureLabel = new cn_0(sm0_0.c0(8106));
                rz_0[] rzArr = rz_0.lpT5;
                String[] natureNames = new String[rzArr.length + 1];
                natureNames[0] = "-";
                for (int i = 0; i < rzArr.length; ++i) {
                    natureNames[rzArr[i].EC() + 1] = rzArr[i].e8();
                }
                pg0_2 natureModel = new pg0_2(natureNames);
                X6 natureCombo = new X6(natureModel);
                this.aF = natureCombo;
                natureCombo.Bd(0);
                this.PG0.nt0().X20(this.PG0.lo0().LPt3(natureLabel, natureCombo));
                this.PG0.kl0().X20(this.PG0.H10().Kn0(natureLabel).Ze0().Kn0(natureCombo));
            }
            if (this.Ik.lx()) {
                cn_0 genderLabel = new cn_0(sm0_0.c0(8100));
                String[] genderNames = new String[]{"-", sm0_0.c0(8101), sm0_0.c0(8102)};
                pg0_2 genderModel = new pg0_2(genderNames);
                X6 genderCombo = new X6(genderModel);
                this.Jv0 = genderCombo;
                genderCombo.Bd(0);
                this.PG0.nt0().X20(this.PG0.lo0().LPt3(genderLabel, genderCombo));
                this.PG0.kl0().X20(this.PG0.H10().Kn0(genderLabel).Ze0().Kn0(genderCombo));
            }
            this.Kk0 = new X6[this.Ik.St()];
            ArrayList<vk0_1> abilityList = new ArrayList<>();
            abilityList.add(ec0_2.Sx().SX((short) 0));
            Iterator iterator = ec0_2.Sx().Com6().iterator();
            while (iterator.hasNext()) {
                vk0_1 ability = (vk0_1) iterator.next();
                if (ability.oC0() < 1 || ability.Kq0()) continue;
                this.Ik.getClass();
                if (!cq.IK((byte) 50, ability.oC0())) continue;
                abilityList.add(ability);
            }
            Collections.sort(abilityList, vk0_1.ga0);
            this.cF0 = abilityList.toArray(new vk0_1[0]);
            for (int i = 0; i < this.Ik.St(); ++i) {
                cn_0 slotLabel = new cn_0(sm0_0.wa0(5616, Integer.toString(i + 1)));
                pg0_2 slotModel = new pg0_2(this.cF0);
                X6 slotCombo = new X6(slotModel);
                this.Kk0[i] = slotCombo;
                slotCombo.Bd(0);
                this.PG0.nt0().X20(this.PG0.lo0().LPt3(slotLabel, this.Kk0[i]));
                this.PG0.kl0().X20(this.PG0.H10().Kn0(slotLabel).Ze0().Kn0(this.Kk0[i]));
            }
            if (this.Ik.oq0() > 0) {
                cn_0 ivLabel = new cn_0(sm0_0.wa0(9110, Integer.toString(this.Ik.oq0())));
                this.PG0.nt0().Kn0(ivLabel);
                this.PG0.kl0().Kn0(ivLabel);
                this.Da0 = new W9[6];
                cn_0[] statLabels = new cn_0[6];
                this.Bx0 = new VL0[6];
                for (int i = 0; i < gc_2.fe0.length; ++i) {
                    gc_2 stat = gc_2.fe0[i];
                    cn_0 statLabel = new cn_0(stat.toString());
                    statLabels[i] = statLabel;
                    statLabel.uf("label-title");
                    Aj aj = new Aj(0, 31, 31);
                    VL0 adjuster = new VL0(aj);
                    this.Bx0[i] = adjuster;
                    adjuster.uf("valueadjuster-small");
                    adjuster.pw0(false);
                    W9 checkbox = new W9();
                    this.Da0[i] = checkbox;
                    int finalI = i;
                    checkbox.RR(() -> this.q2(finalI));
                }
                ya_1 hGroup = this.PG0.lo0()
                    .LPt3(statLabels[0], this.Da0[0], this.Bx0[0])
                    .X20(this.PG0.lo0().LPt3(statLabels[1], this.Da0[1], this.Bx0[1]))
                    .X20(this.PG0.lo0().LPt3(statLabels[2], this.Da0[2], this.Bx0[2]))
                    .X20(this.PG0.lo0().LPt3(statLabels[3], this.Da0[3], this.Bx0[3]))
                    .X20(this.PG0.lo0().LPt3(statLabels[4], this.Da0[4], this.Bx0[4]))
                    .X20(this.PG0.lo0().LPt3(statLabels[5], this.Da0[5], this.Bx0[5]));

                ya_1 vGroup = this.PG0.H10()
                    .Kn0(statLabels[0]).Ze0().LPt3(this.Da0[0], this.Bx0[0])
                    .X20(this.PG0.H10().Kn0(statLabels[1]).Ze0().LPt3(this.Da0[1], this.Bx0[1]))
                    .X20(this.PG0.H10().Kn0(statLabels[2]).Ze0().LPt3(this.Da0[2], this.Bx0[2]))
                    .X20(this.PG0.H10().Kn0(statLabels[3]).Ze0().LPt3(this.Da0[3], this.Bx0[3]))
                    .X20(this.PG0.H10().Kn0(statLabels[4]).Ze0().LPt3(this.Da0[4], this.Bx0[4]))
                    .X20(this.PG0.H10().Kn0(statLabels[5]).Ze0().LPt3(this.Da0[5], this.Bx0[5]));

                this.PG0.nt0().X20(hGroup);
                this.PG0.kl0().X20(vGroup);
            }
            xe_1 confirmBtn = new xe_1(sm0_0.c0(nf0_0.BA));
            confirmBtn.RR(new En0(asBridge()));
            this.PG0.nt0().Kn0(confirmBtn);
            this.PG0.kl0().Kn0(confirmBtn);
        }
        xe_1 cancelBtn = new xe_1(sm0_0.c0(nf0_0.Bq0));
        cancelBtn.RR(this::xe0);
        this.PG0.nt0().qd(25).Kn0(cancelBtn);
        this.PG0.kl0().Kn0(cancelBtn);
        this.SL(this.PG0);
    }

    @Override
    public final void K8() {
        super.K8();
        this.PG0.lt0();
        this.kh0();
        this.PG0.vf(pa0_0.Ol);
    }

    @Override
    public final void t5() {
        super.t5();
        if (this.dF != null) {
            lpt6__0.v90(this.dF);
        }
    }

    public final void q2(int i) {
        this.Bx0[i].pw0(this.Da0[i].ER.U20());
    }
}
