package cn.pokemmo.ui.window.dialog;

import f.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 数量确认输入弹窗
 *
 * 原混淆类: f.bg_1
 */
public class QuantityConfirmDialogWindow extends cx_0 implements tr_1  {
    public final bg_1 asBridge() {
        return (bg_1) (Object) this;
    }

    public final fy_2 qB;
    public final o60_0 E5;
    public final jr0_0 et;
    public final qu_2 o8;
    public X6 lk0;
    public X6 Zl;
    public X6[] Ho = new X6[0];
    public vk0_1[] id;
    public W9[] ez;
    public VL0[] Dx0;

    public QuantityConfirmDialogWindow(o60_0 o, qu_2 q) {
        super(true, false);
        this.uf("confirm-widget");
        this.o8 = q;
        this.E5 = o;
        this.qB = new fy_2();
        this.qB.uf("confirm-panel");
        cn_0 label = new cn_0();
        label.uf("label-title");
        this.qB.x40(this.qB.C7(new le0_2[]{label}));
        this.qB.WQ(this.qB.hb(new le0_2[]{label}));
        this.et = o.UB();
        if (this.et.Lr0() > 0) {
            label.Sk(sm0_0.c0(5613));
            cq_0 species = mp_1.vf0().W50(this.et.Lr0());
            StringBuilder sb = new StringBuilder(ig_0.u9(59, new StringBuilder(), " ").append(this.et.k40()).append(" ").toString());
            if (this.et.uM() && this.et.pF0()) {
                sb.append(sm0_0.c0(5621)).append(" ");
            } else if (this.et.uM()) {
                sb.append(sm0_0.c0(5614)).append(" ");
            } else if (this.et.pF0()) {
                sb.append(sm0_0.c0(5615)).append(" ");
            }
            sb.append(species.zj());
            cn_0 title = new cn_0(sb.toString());
            this.qB.nt0().Kn0(title);
            this.qB.kl0().Kn0(title);

            if (this.et.Lp0()) {
                cn_0 label2 = new cn_0(sm0_0.c0(8106));
                String[] options = new String[rz_0.lpT5.length + 1];
                options[0] = "-";
                for (int i = 0; i < rz_0.lpT5.length; i++) {
                    rz_0 r = rz_0.lpT5[i];
                    options[r.EC() + 1] = r.e8();
                }
                this.lk0 = new X6(new pg0_2(options));
                this.lk0.Bd(0);
                this.qB.nt0().X20(this.qB.lo0().LPt3(new le0_2[]{label2, this.lk0}));
                this.qB.kl0().X20(this.qB.H10().Kn0(label2).Ze0().Kn0(this.lk0));
            }
            if (this.et.my()) {
                cn_0 label3 = new cn_0(sm0_0.c0(8100));
                this.Zl = new X6(new pg0_2(new String[]{"-", sm0_0.c0(8101), sm0_0.c0(8102)}));
                this.Zl.Bd(0);
                this.qB.nt0().X20(this.qB.lo0().LPt3(new le0_2[]{label3, this.Zl}));
                this.qB.kl0().X20(this.qB.H10().Kn0(label3).Ze0().Kn0(this.Zl));
            }

            this.Ho = new X6[this.et.rC0()];
            ArrayList<vk0_1> list = new ArrayList<>();
            list.add(ec0_2.Sx().SX((short)0));
            java.util.Iterator<?> it = ec0_2.Sx().Com6().iterator();
            while (((OI)it).hasNext()) {
                vk0_1 v = (vk0_1)((V3)it).next();
                if (v.oC0() < 1 || v.Kq0() || !species.IK(this.et.k40(), v.oC0())) continue;
                list.add(v);
            }
            Collections.sort(list, vk0_1.ga0);
            this.id = list.toArray(new vk0_1[0]);

            for (int i = 0; i < this.et.rC0(); i++) {
                cn_0 label4 = new cn_0(sm0_0.wa0(5616, Integer.toString(i + 1)));
                this.Ho[i] = new X6(new pg0_2(this.id));
                this.Ho[i].Bd(0);
                this.qB.nt0().X20(this.qB.lo0().LPt3(new le0_2[]{label4, this.Ho[i]}));
                this.qB.kl0().X20(this.qB.H10().Kn0(label4).Ze0().Kn0(this.Ho[i]));
            }

            if (this.et.jD0() > 0) {
                cn_0 header = new cn_0(sm0_0.wa0(9110, Integer.toString(this.et.jD0())));
                this.qB.nt0().Kn0(header);
                this.qB.kl0().Kn0(header);
                this.ez = new W9[6];
                cn_0[] names = new cn_0[6];
                this.Dx0 = new VL0[6];
                for (int i = 0; i < gc_2.fe0.length; i++) {
                    final int idx = i;
                    gc_2 g = gc_2.fe0[i];
                    names[i] = new cn_0(g.toString());
                    names[i].uf("label-title");
                    this.Dx0[i] = new VL0(new Aj(0, 31, 31));
                    this.Dx0[i].uf("valueadjuster-small");
                    this.Dx0[i].pw0(false);
                    this.ez[i] = new W9();
                    this.ez[i].RR(() -> this.tb(idx));
                }
                ya_1 left = this.qB.H10()
                    .X20(this.qB.lo0().LPt3(new le0_2[]{names[0], this.ez[0], this.Dx0[0]}))
                    .X20(this.qB.lo0().LPt3(new le0_2[]{names[1], this.ez[1], this.Dx0[1]}))
                    .X20(this.qB.lo0().LPt3(new le0_2[]{names[2], this.ez[2], this.Dx0[2]}))
                    .X20(this.qB.lo0().LPt3(new le0_2[]{names[3], this.ez[3], this.Dx0[3]}))
                    .X20(this.qB.lo0().LPt3(new le0_2[]{names[4], this.ez[4], this.Dx0[4]}))
                    .X20(this.qB.lo0().LPt3(new le0_2[]{names[5], this.ez[5], this.Dx0[5]}));
                ya_1 right = this.qB.lo0()
                    .X20(this.qB.H10().Kn0(names[0]).Ze0().LPt3(new le0_2[]{this.ez[0], this.Dx0[0]}))
                    .X20(this.qB.H10().Kn0(names[1]).Ze0().LPt3(new le0_2[]{this.ez[1], this.Dx0[1]}))
                    .X20(this.qB.H10().Kn0(names[2]).Ze0().LPt3(new le0_2[]{this.ez[2], this.Dx0[2]}))
                    .X20(this.qB.H10().Kn0(names[3]).Ze0().LPt3(new le0_2[]{this.ez[3], this.Dx0[3]}))
                    .X20(this.qB.H10().Kn0(names[4]).Ze0().LPt3(new le0_2[]{this.ez[4], this.Dx0[4]}))
                    .X20(this.qB.H10().Kn0(names[5]).Ze0().LPt3(new le0_2[]{this.ez[5], this.Dx0[5]}));
                this.qB.nt0().X20(left);
                this.qB.kl0().X20(right);
            }

            xe_1 confirm = new xe_1(sm0_0.c0(nf0_0.BA));
            confirm.RR(this::pV);
            this.qB.nt0().Kn0(confirm);
            this.qB.kl0().Kn0(confirm);
        } else {
            label.Sk(sm0_0.c0(5588));
            if (this.et.BK() > 0) {
                xe_1 btn = new xe_1(new StringBuilder("$").append(NumberFormat.getInstance().format(this.et.BK())).toString());
                btn.RR(this::TC);
                this.qB.nt0().Kn0(btn);
                this.qB.kl0().Kn0(btn);
            }
            if (this.et.lPt2() > 0) {
                xe_1 btn = new xe_1(new StringBuilder().append(NumberFormat.getInstance().format(this.et.lPt2())).append(" ").append(sm0_0.c0(3002)).toString());
                btn.RR(this::q40);
                this.qB.nt0().Kn0(btn);
                this.qB.kl0().Kn0(btn);
            }
            if (this.et.Vh() > 0) {
                xe_1 btn = new xe_1(new StringBuilder().append(NumberFormat.getInstance().format(this.et.Vh())).append(" ").append(sm0_0.c0(121)).toString());
                btn.RR(this::Wg0);
                this.qB.nt0().Kn0(btn);
                this.qB.kl0().Kn0(btn);
            }
            if (this.et.xa0() > 0) {
                StringBuilder sb = new StringBuilder();
                mc0_1 item = gu0.Az0().lPT6(this.et.xa0());
                sb.append(this.et.s6()).append("x ").append(item.getName());
                xe_1 btn = new xe_1(sb.toString());
                Runnable r = item.jc() != null && item.jc().yt()
                    ? () -> this.yx(q, item, o)
                    : this::dp;
                btn.RR(r);
                this.qB.nt0().Kn0(btn);
                this.qB.kl0().Kn0(btn);
            }
        }
        xe_1 close = new xe_1(sm0_0.c0(nf0_0.Bq0));
        close.RR(this::xe0);
        this.qB.nt0().qd(25).Kn0(close);
        this.qB.kl0().Kn0(close);
        this.SL(this.qB);
    }

    public final void pV() {
        if (this.et.P50 < 1) {
            return;
        }
        rz_0 rm = null;
        if (this.et.coM5 && (rm = (rz_0)rz_0.RM.BM((byte)(this.lk0.mu0.Mw0 - 1))) == null) {
            tw0_0.rl.qK(sm0_0.c0(5618));
            return;
        }
        byte by2 = -1;
        if (this.et.Dz0) {
            by2 = (byte)(this.Zl.mu0.Mw0 - 1);
            if (by2 < 0) {
                tw0_0.rl.qK(sm0_0.c0(5623));
                return;
            }
        }
        wx_2 wx = new wx_2();
        if (this.et.bL > 0) {
            for (int n = 0; n < this.et.bL; n++) {
                vk0_1 v = this.id[this.Ho[n].mu0.Mw0];
                if (v == null) continue;
                short s = v.hC0;
                if (s < 1 || wx.bL0(s)) continue;
                wx.TI0(v.hC0);
            }
        }
        if (wx.Rv != this.et.bL) {
            tw0_0.rl.qK(sm0_0.wa0(5619, Integer.toString(this.et.bL)));
            return;
        }
        mv_1 mv = new mv_1();
        if (this.et.oH0 > 0) {
            gc_2[] arr = gc_2.fe0;
            for (int i = 0; i < arr.length; i++) {
                gc_2 g = arr[i];
                if (!this.ez[g.CoM2].ER.U20()) continue;
                mv.Is0((byte)this.Dx0[g.CoM2].eB0, g);
            }
        }
        if (mv.Rv != this.et.oH0) {
            tw0_0.rl.qK(sm0_0.wa0(5620, Integer.toString(this.et.oH0)));
            return;
        }
        short[] sArray = wx.Eo();
        gc_2[] gcArray = (gc_2[])mv.Fy(new gc_2[mv.Rv]);
        byte[] byArray = new byte[mv.Rv];
        byte[] za = mv.ZA0;
        Object[] yw = mv.Yw;
        int count = 0;
        for (int idx = za.length - 1; idx >= 0; idx--) {
            Object o = yw[idx];
            if (o == iw_2.VW || o == iw_2.J80) continue;
            byArray[count++] = za[idx];
        }
        fb0_1 packet = new fb0_1(rm, by2, sArray, gcArray, byArray);
        tw0_0.rl.fk0.uQ(new E30(this.E5.Uv0, this.E5.sA, packet, this.o8.Dw.GM, (byte)0));
        this.xe0();
    }

    public final void W70(byte by) {
        fb0_1 packet = new fb0_1(by);
        tw0_0.rl.fk0.uQ(new E30(this.E5.Uv0, this.E5.sA, packet, this.o8.Dw.GM, (byte)0));
        this.xe0();
    }

    public final void K8() {
        super.K8();
        this.qB.lt0();
        this.kh0();
        this.qB.vf(pa0_0.Ol);
    }

    public final void t5() {
        super.t5();
        if (this.o8 != null) {
            lpt6__0.v90(this.o8);
        }
    }

    public final void yx(qu_2 q, mc0_1 m, o60_0 o) {
        l3_0 l = new l3_0(m.Iq.SG, m.Iq.ax, o, q);
        if (q.NW == null) {
            q.NW = l;
        } else {
            q.NW.xe0();
            q.NW = l;
        }
        q.F9(q.fU(), l);
        this.xe0();
    }

    public final void dp() {
        this.W70((byte)5);
    }

    public final void Wg0() {
        this.W70((byte)4);
    }

    public final void q40() {
        this.W70((byte)3);
    }

    public final void TC() {
        this.W70((byte)2);
    }

    public final void tb(int i) {
        this.Dx0[i].pw0(this.ez[i].ER.U20());
    }
}


