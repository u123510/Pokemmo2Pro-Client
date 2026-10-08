// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class PopupDialogContainerLayout extends BaseLayoutBox implements tr_1
{
    public final jc_2 z1;
    public final fy_2 Wp0;
    public final hh0_1 aS;
    public final G20[] ns0;
    public int Hi0;
    public final int Qp;
    
    public PopupDialogContainerLayout(final jc_2 z1, final K5 k5, final VU vu) {
        this.Hi0 = 0;
        this.Qp = 2;
        this.z1 = z1;
        this.uf("tm-learn-inner-panel");
        this.ns0 = new G20[5];
        G20[] ns0;
        int n;
        for (int i = 0; i < (ns0 = this.ns0).length; i = (byte)(n + 1)) {
            n = i;
            ns0[i] = new G20("", "");
            this.ns0[i].uf("item-move-dialog-button");
            this.ns0[i].qF0(pa0_0.up0);
        }
        G20[] ns2;
        for (int j = 0; j < (ns2 = this.ns0).length; j = (byte)(j + 1)) {
            short n2;
            if (j == 4) {
                n2 = k5.LW().Zq();
            }
            else {
                n2 = vu.RJ().UD(j);
            }
            if (n2 == 0) {
                this.ns0[j].SU("-");
                this.ns0[j].Pc("");
                this.ns0[j].pw0(false);
                this.ns0[j].Gx().lo0();
                this.ns0[j].Xr0(null);
            }
            else {
                this.ns0[j].pw0(true);
                final vk0_1 sx = ec0_2.Sx().SX(n2);
                this.ns0[j].Xr0(s2_0.tq0(sx, vu));
                this.ns0[j].Pc(lb0_2.fb0(sx));
                this.ns0[j].SU(sx.CoM2());
                final byte slot = (byte)j;
                this.ns0[j].RR(() -> PopupDialogContainerLayout.By(z1, k5, vu, slot));
                this.ns0[j].Gx().r8(fn_0.qz0().It(sx.yS(vu.RJ()).o6()));
                this.ns0[j].Gx().Gy0(153, 10);
            }
        }
        ns2[4].pw0(false);
        final hh0_1 as;
        final hh0_1 hh0_1 = as = new hh0_1(sm0_0.c0(nf0_0.Bq0), 96, 30);
        this.aS = as;
        hh0_1.uf("battle-button-return");
        hh0_1.RR(new ZG0(z1));
        final fy_2 wp0;
        final fy_2 fy_2 = wp0 = new fy_2();
        this.Wp0 = wp0;
        final ya_1 qd = fy_2.H10().qd(18);
        final ya_1[] array2;
        final ya_1[] array = array2 = new ya_1[3];
        final fy_2 fy_3 = wp0;
        final ya_1[] array3 = array2;
        final fy_2 fy_4 = wp0;
        final ya_1[] array4 = array2;
        final Hm0 lo0 = wp0.lo0();
        final le0_2[] array6;
        final le0_2[] array5 = array6 = new le0_2[2];
        final G20[] ns3 = this.ns0;
        array6[0] = ns3[0];
        array5[1] = ns3[1];
        array4[0] = lo0.LPt3(array5);
        final Hm0 lo2 = fy_4.lo0();
        final le0_2[] array8;
        final le0_2[] array7 = array8 = new le0_2[2];
        final G20[] ns4 = this.ns0;
        array8[0] = ns4[2];
        array7[1] = ns4[3];
        array3[1] = lo2.LPt3(array7);
        array[2] = fy_3.lo0().LPt3(this.ns0[4]);
        fy_2.x40(qd.Xq(array));
        final I7 h10 = fy_2.H10();
        final ya_1[] array9 = new ya_1[2];
        final fy_2 fy_5 = wp0;
        final Hm0 lo3 = wp0.lo0();
        final le0_2[] array11;
        final le0_2[] array10 = array11 = new le0_2[3];
        final G20[] ns5;
        final G20[] array12 = ns5 = this.ns0;
        final le0_2[] array13 = array11;
        final G20[] array14 = ns5;
        array11[0] = ns5[0];
        array13[1] = array14[2];
        array10[2] = array12[4];
        array9[0] = lo3.LPt3(array10);
        final Hm0 lo4 = fy_5.lo0();
        final le0_2[] array16;
        final le0_2[] array15 = array16 = new le0_2[2];
        final G20[] ns6 = this.ns0;
        array16[0] = ns6[1];
        array15[1] = ns6[3];
        array9[1] = lo4.LPt3(array15);
        fy_2.WQ(h10.Xq(array9));
        this.SL(wp0);
        this.SL(as);
    }
    
    public static void By(final jc_2 jc_2, final K5 k5, final VU vu, final byte b) {
        final hl0_0 nn = k5.nn;
        final short wq = nn.wQ;
        final CH0 br = nn.Br;
        final CH0 pu = vu.pu;
        final short n = 1;
        jc_2.ew0();
        tw0_0.rl.sn0(wq, br, pu, n, b);
    }
    
    @Override
    public final void C(final zk0_1 zk0_1) {
        super.uc = false;
        final int hi0;
        final G20[] ns0;
        if ((hi0 = this.Hi0) >= 0 && hi0 < (ns0 = this.ns0).length) {
            lpt6__0.v90(ns0[hi0]);
        }
    }
    
    @Override
    public final boolean nd0(final i70_0 i70_0) {
        if (E00.ZU(i70_0.zu) && i70_0.iT()) {
            final int finally$ = i70_0.finally$;
            final rp_0 sj0 = rp_0.sJ0;
            final int ff = dw_2.ff;
            if (sj0 != null) {
                if (sj0.Ov(finally$)) {
                    final G20 g20;
                    if ((g20 = this.ns0[this.Hi0]).OI) {
                        a7_0.bH(g20.ER.Fc0);
                        return true;
                    }
                    return true;
                }
            }
            final int finally$2 = i70_0.finally$;
            final rp_0 nk0;
            if ((nk0 = rp_0.nK0) != null) {
                if (nk0.Ov(finally$2)) {
                    a7_0.bH(this.aS.ER.Fc0);
                }
            }
            final int finally$3 = i70_0.finally$;
            Label_0301: {
                while (true) {
                    Label_0163: {
                        final rp_0 ni;
                        if ((ni = rp_0.Ni) == null) {
                            break Label_0163;
                        }
                        if (!ni.Ov(finally$3)) {
                            break Label_0163;
                        }
                        final int hi0;
                        if ((hi0 = this.Hi0 + 1) % this.Qp == 0) {
                            break Label_0301;
                        }
                        this.Hi0 = hi0;
                        break Label_0301;
                    }
                    final int finally$4 = i70_0.finally$;
                    final rp_0 i90;
                    if ((i90 = rp_0.I90) != null) {
                        if (i90.Ov(finally$4)) {
                            final int hi2;
                            if (((hi2 = this.Hi0) + 1) % this.Qp == 1) {
                                break Label_0301;
                            }
                            this.Hi0 = hi2 - 1;
                            break Label_0301;
                        }
                    }
                    final int finally$5 = i70_0.finally$;
                    final rp_0 kc0;
                    if ((kc0 = rp_0.kC0) != null) {
                        if (kc0.Ov(finally$5)) {
                            final int hi0;
                            if ((hi0 = this.Hi0 - this.Qp) < 0) {
                                break Label_0301;
                            }
                            continue;
                        }
                    }
                    final int finally$6 = i70_0.finally$;
                    final rp_0 synchronized$;
                    if ((synchronized$ = rp_0.synchronized$) != null) {
                        final int hi0;
                        if (synchronized$.Ov(finally$6) && (hi0 = this.Hi0 + this.Qp) < this.ns0.length) {
                            continue;
                        }
                    }
                    break;
                }
            }
            final int hi3;
            final G20[] ns0;
            if ((hi3 = this.Hi0) >= 0 && hi3 < (ns0 = this.ns0).length) {
                lpt6__0.v90(ns0[hi3]);
            }
            return true;
        }
        return super.nd0(i70_0);
    }
    
    @Override
    public final void K8() {
        this.Wp0.oY(this.z1.a3(), this.z1.k5());
        final jc_2 z1;
        this.Wp0.E40((z1 = this.z1).A20 + z1.e80, z1.SB0 + z1.y9 + 50);
        final fy_2 wp0 = this.Wp0;
        final int n = 8;
        final int n2 = 5;
        wp0.vi(n2, n, n2, n);
        this.aS.lt0();
        this.aS.E40(super.K20.cz() - this.aS.Mx - 5, super.K20.VM() - this.aS.OB - 6);
    }
}

