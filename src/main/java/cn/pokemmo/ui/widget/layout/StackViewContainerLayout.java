package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class StackViewContainerLayout extends BaseLayoutBox {
    public static final DecimalFormat cy;
    public static final gn_0 E4;
    public final byte C7;
    public av_1 wi;
    public final X6 ji;
    public final X6 Uz0;
    public final ArrayList Mw0;
    public final S70 Ow;
    public final cn_0 TR;
    public final cn_0 yg0;
    public final cn_0 Vc;
    public final cn_0 Hk0;
    public final cn_0 Mi;
    public final cn_0 Pn0;
    public final S70[] OQ;
    public final ya_1[] interface$;
    public final ya_1[] FR;
    public final I7 Yw0;
    public final I7 Pw0;
    public final cn_0 Dp0;
    public final cn_0 eL;
    public final pz_2[] Dj0;
    public boolean Pu0;

    static {
        cy = new DecimalFormat("#0.00");
        E4 = new gn_0((byte) 0, (byte) 0, (byte) 0, (byte) 127);
    }

    public StackViewContainerLayout(pz_2[] pz_2Arr, int i) {
        this.C7 = tw0_0.rl.Xx0();
        this.wi = null;
        this.Mw0 = new ArrayList();
        this.Pu0 = false;
        this.Dj0 = pz_2Arr;

        ArrayList arrayList = new ArrayList();
        for (av_1 av_1Var : av_1.Vk0) {
            if (av_1Var.s90() && av_1Var.Sz()) {
                arrayList.add(av_1Var);
            }
        }

        X6 x6 = new X6(new pg0_2(arrayList));
        this.ji = x6;
        x6.Bd(0);
        this.ji.Rm0(this::update);

        X6 x62 = new X6(new pg0_2());
        this.Uz0 = x62;
        x62.Rm0(this::update);

        cn_0 cn_0Var = new cn_0(sm0_0.wa0(5690, tx_1.i((int) (((long) i) - (System.currentTimeMillis() / 1000L)), true)));
        this.Hk0 = cn_0Var;
        cn_0Var.uf("/label-time");

        S70 s70 = new S70();
        this.Ow = s70;
        s70.uf("label-mmr");

        cn_0 cn_0Var2 = new cn_0();
        this.TR = cn_0Var2;
        cn_0 cn_0Var3 = new cn_0();
        this.yg0 = cn_0Var3;

        cn_0 cn_0Var4 = new cn_0(sm0_0.c0(5664));
        this.Vc = cn_0Var4;
        cn_0Var4.uf("label-title");
        cn_0Var2.uf("label-stats");
        cn_0Var3.uf("label-stats");

        cn_0 cn_0Var5 = new cn_0();
        this.Mi = cn_0Var5;
        cn_0 cn_0Var6 = new cn_0(sm0_0.c0(5647));
        this.Pn0 = cn_0Var6;
        cn_0Var5.uf("label-stats");
        cn_0Var6.uf("label-title");

        cn_0 cn_0Var7 = new cn_0(sm0_0.c0(5646));
        this.Dp0 = cn_0Var7;
        cn_0Var7.uf("label-title");

        cn_0 cn_0Var8 = new cn_0(sm0_0.c0(5645));
        this.eL = cn_0Var8;
        cn_0Var8.uf("label-title");

        av_1 av_1Var2 = (av_1) arrayList.get(this.ji.ao());
        pz_2 pz_2Var = null;
        for (pz_2 pz_2Var2 : this.Dj0) {
            if (pz_2Var2.qR() == av_1Var2) {
                pz_2Var = pz_2Var2;
                break;
            }
        }
        if (pz_2Var == null) {
            this.OQ = null;
            this.interface$ = null;
            this.FR = null;
            this.Yw0 = null;
            this.Pw0 = null;
            return;
        }

        ag_0[] ps = pz_2Var.ps();
        ag_0[] da = pz_2Var.Da();
        this.OQ = new S70[ps.length + da.length];
        for (int i2 = 0; i2 < this.OQ.length; i2++) {
            if (tw0_0.kz0()) {
                this.OQ[i2] = new S70(100, 100);
                this.OQ[i2].JH().dA(2.0f);
            } else {
                this.OQ[i2] = new S70(48, 48);
            }
            this.OQ[i2].Bb(0);
            this.OQ[i2].uf("reward-slot");
        }

        Lj0(pz_2Var);

        this.interface$ = new ya_1[(this.OQ.length / 5) + 1];
        this.FR = new ya_1[(this.OQ.length / 5) + 1];
        this.Yw0 = H10();
        this.Pw0 = H10();

        for (int i3 = 0; i3 < this.interface$.length; i3++) {
            this.FR[i3] = H10();
            this.interface$[i3] = lo0();
        }

        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < ps.length; i6++) {
            if (i6 % 5 == 0 && i4 < this.interface$.length - 1) {
                i4++;
            }
            this.FR[i4].Kn0(this.OQ[i6]);
            this.interface$[i4].Kn0(this.OQ[i6]);
            i5++;
        }

        this.Pw0.Ze0();
        this.Yw0.qd(7);
        for (int i7 = 0; i7 < da.length; i7++) {
            this.Pw0.Kn0(this.OQ[i5]);
            this.Yw0.Kn0(this.OQ[i5]);
            i5++;
        }
        this.Pw0.Ze0();

        uf("stats-layout");
        WQ(H10().Xq(new ya_1[]{
                lo0().Xq(new ya_1[]{
                        C7(new le0_2[]{this.ji}),
                        C7(new le0_2[]{this.Uz0}),
                        C7(new le0_2[]{this.Vc, this.TR, this.yg0}),
                        C7(new le0_2[]{this.Pn0, this.Mi}),
                        C7(new le0_2[]{this.Dp0}),
                        Ou0(this.FR)
                }),
                hb(new le0_2[]{this.Ow}).Xq(new ya_1[]{
                        C7(new le0_2[]{this.eL}),
                        this.Pw0
                }).Kn0(this.Hk0)
        }));

        x40(lo0().Xq(new ya_1[]{
                H10().Xq(new ya_1[]{
                        hb(new le0_2[]{this.ji}),
                        hb(new le0_2[]{this.Uz0}),
                        hb(new le0_2[]{this.Vc, this.TR, this.yg0}),
                        hb(new le0_2[]{this.Pn0, this.Mi}),
                        hb(new le0_2[]{this.Dp0}),
                        bx0(this.interface$)
                }),
                C7(new le0_2[]{this.Ow}).Xq(new ya_1[]{
                        hb(new le0_2[]{this.eL}),
                        this.Yw0
                }).Ze0().Kn0(this.Hk0)
        }));

        update();
    }

    public static void Bc(ag_0 ag_0Var, S70 s70, short s) {
        s70.uf("reward-slot");
        if (ag_0Var == null) {
            s70.og.lo0();
            s70.yj0 = "";
            s70.yB0();
            s70.Sk("");
            s70.Ll(false);
            return;
        }

        byte b = ag_0Var.Tc;
        int i0;
        int i2;

        if (b == 0) {
            short s2 = ag_0Var.Yq;
            gu0 gu0Var = gu0.l2;
            mc0_1 lPT6 = gu0Var.lPT6(s2);
            if (lPT6.Iq != null) {
                String sb = CO.go("\n", s, " / ").append((int) ag_0Var.E70).toString();
                s70.yj0 = new gi_1(lPT6, (byte) 0, null, true, true, sb);
                s70.yB0();
            } else {
                s70.yj0 = "x" + ((int) ag_0Var.oA0) + " " + sm0_0.c0(gu0Var.lPT6(s2).Nl) + "\n\n" + s + " / " + ((int) ag_0Var.E70);
                s70.yB0();
            }
            s70.og.Nk(new Wr[]{gh_1.aH0.PB(lPT6.V4(), false)});
            s70.Sk("x" + ((int) ag_0Var.oA0));
            if (tw0_0.kz0()) {
                i0 = 28;
                i2 = 15;
            } else {
                i0 = 12;
                i2 = 4;
            }
        } else if (b == 1) {
            short s3 = ag_0Var.Yq;
            s70.og.o60(new AG0[]{yh_0.Xm0.qC0(yh_0.Ed((byte) 0, s3), (byte) 0, false)[0]});
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (ag_0Var.Tc == 1) {
                byte b2 = ag_0Var.yv;
                sb2.append(sm0_0.Bx(5583, new String[]{sm0_0.c0(5615), sm0_0.c0(ag_0Var.Yq + 150000)}));
                sb2.append("\n");
                sb2.append(sm0_0.c0(5584));
                if (ag_0Var.VA0) {
                    sb2.append("\n");
                    sb2.append(sm0_0.c0(5585));
                }
                if (ag_0Var.tm) {
                    sb2.append("\n");
                    sb2.append(sm0_0.c0(8100));
                }
                if (ag_0Var.ad > 0) {
                    sb2.append("\n");
                    sb2.append(sm0_0.wa0(5686, Integer.toString(ag_0Var.ad)));
                }
                if (b2 > 0) {
                    sb2.append("\n");
                    sb2.append(sm0_0.wa0(9110, Integer.toString(b2)));
                }
            }
            sb.append(sb2.toString().trim());
            sb.append("\n\n");
            sb.append((int) s);
            sb.append(" / ");
            sb.append((int) ag_0Var.E70);
            s70.yj0 = sb.toString();
            s70.yB0();
            s70.Sk(sm0_0.wa0(1731, "50"));
            if (tw0_0.kz0()) {
                i0 = 14;
                i2 = 0;
            } else {
                i0 = 5;
                i2 = -5;
            }
        } else if (b == 2) {
            short s4 = ag_0Var.Fq;
            s70.og.r8(new LPT6_[]{fn_0.qz0().aA});
            StringBuilder sb = new StringBuilder();
            long j = (long) s4;
            sb.append(NumberFormat.getInstance().format(j));
            sb.append(" ");
            sb.append(sm0_0.c0(121));
            sb.append("\n\n");
            sb.append((int) s);
            sb.append(" / ");
            sb.append((int) ag_0Var.E70);
            s70.yj0 = sb.toString();
            s70.yB0();
            s70.Sk(NumberFormat.getInstance().format(j));
            if (tw0_0.kz0()) {
                i0 = 28;
                i2 = 15;
            } else {
                i0 = 12;
                i2 = 5;
            }
        } else {
            return;
        }

        s70.og.gY = i0;
        s70.og.a4 = i2;
        s70.Ll(true);
    }

    public final void update() {
        if (this.Pu0) {
            return;
        }
        this.Pu0 = true;
        if (this.wi != this.ji.mu0.KB.YS(this.ji.mu0.Mw0)) {
            this.wi = (av_1) this.ji.mu0.KB.YS(this.ji.mu0.Mw0);
            this.Mw0.clear();
            ArrayList arrayList = new ArrayList();
            for (byte b = 0; b <= this.C7; b++) {
                Im op0 = tw0_0.rl.A20.op0(b, this.wi);
                if (op0.Hr0 > 0 || op0.Mg0 > 0 || op0.UI0 != 500.0f || op0.u20 == this.C7) {
                    String c0;
                    if (b == 0) {
                        c0 = sm0_0.c0(5495);
                    } else {
                        c0 = sm0_0.wa0(5496, Integer.toString(b));
                    }
                    arrayList.add(c0);
                    this.Mw0.add(Byte.valueOf(b));
                }
            }
            this.Uz0.r30(new pg0_2(arrayList));
            this.Uz0.Bd(arrayList.size() - 1);
        }

        byte byteValue = ((Byte) this.Mw0.get(this.Uz0.mu0.Mw0)).byteValue();
        Im op02 = tw0_0.rl.A20.op0(byteValue, this.wi);
        StringBuilder sb = new StringBuilder();
        int i = byteValue == this.C7 ? 5653 : 5648;
        sb.append(sm0_0.wa0(i, cy.format((double) op02.UI0)));
        sb.append("\n\n");
        int i2 = byteValue == this.C7 ? 5654 : 5649;
        sb.append(sm0_0.wa0(i2, op02.xl0().GJ0(op02.ML)));
        this.Ow.Sk(sb.toString());

        if (op02.xl0().MI >= 0) {
            this.Ow.og.Nk(new Wr[]{ob0_0.Ui0().lq0(0, op02.xl0().MI)});
            this.Ow.og.wx0(null);
        } else {
            this.Ow.og.Nk(new Wr[]{ob0_0.Ui0().lq0(0, 30)});
            this.Ow.og.wx0(E4);
        }

        if (tw0_0.kz0()) {
            this.Ow.og.OA0 = true;
            this.Ow.og.IF = 96;
            this.Ow.og.gx0 = 96;
            this.Ow.og.gY = 100;
            this.Ow.og.a4 = 35;
        } else {
            this.Ow.og.OA0 = true;
            this.Ow.og.IF = 64;
            this.Ow.og.gx0 = 64;
            this.Ow.og.gY = 16;
            this.Ow.og.a4 = 35;
        }

        this.TR.Sk(op02.Hr0 + " / " + op02.Mg0);
        String str = "0%";
        if (op02.Hr0 > 0) {
            str = cy.format((((double) op02.Hr0) / ((double) (op02.Hr0 + op02.Mg0))) * 100.0) + "%";
        }
        this.yg0.Sk(str);

        String format;
        if (op02.we > 0) {
            format = NumberFormat.getInstance().format((long) op02.we);
        } else {
            format = "--";
        }
        this.Mi.Sk(format);

        if (byteValue == this.C7) {
            pz_2 pz_2Var = null;
            for (pz_2 pz_2Var2 : this.Dj0) {
                if (pz_2Var2.Yy0 == this.wi) {
                    pz_2Var = pz_2Var2;
                    break;
                }
            }
            this.Dp0.Ll(true);
            this.eL.Ll(true);
            this.Hk0.Ll(true);
            Lj0(pz_2Var);
        } else {
            this.Dp0.Ll(false);
            this.eL.Ll(false);
            this.Hk0.Ll(false);
            for (S70 s70 : this.OQ) {
                s70.Ll(false);
            }
        }

        this.Pu0 = false;
    }

    public final void Lj0(pz_2 pz_2Var) {
        if (pz_2Var == null) {
            return;
        }

        ag_0[] ag_0Arr = pz_2Var.kw0;
        int i = 0;
        for (int i2 = 0; i2 < ag_0Arr.length; i2++) {
            ag_0 ag_0Var = ag_0Arr[i2];
            short s = pz_2Var.VQ;
            S70 s70 = this.OQ[i2];
            Bc(ag_0Var, s70, s);
            if (ag_0Var != null) {
                if (s >= ag_0Var.E70) {
                    s70.uf("reward-slot-complete");
                    s70.yI();
                } else if (i == 0 && s > 0) {
                    s70.uf("reward-slot-inprogress");
                    s70.yI();
                    i = 1;
                } else {
                    s70.uf("reward-slot");
                    s70.yI();
                }
            }
        }

        ag_0[] ag_0Arr2 = pz_2Var.kg;
        for (int i3 = 0; i3 < ag_0Arr2.length; i3++) {
            ag_0 ag_0Var2 = ag_0Arr2[i3];
            short s2 = pz_2Var.WK0;
            S70 s702 = this.OQ[ag_0Arr.length + i3];
            Bc(ag_0Var2, s702, s2);
            if (ag_0Var2 != null) {
                if (s2 >= ag_0Var2.E70) {
                    s702.uf("reward-slot-complete");
                    s702.yI();
                } else if (i == 0 && s2 > 0) {
                    s702.uf("reward-slot-inprogress");
                    s702.yI();
                    i = 1;
                } else {
                    s702.uf("reward-slot");
                    s702.yI();
                }
            }
        }
    }
}
