package cn.pokemmo.ui.widget.layout;

import f.*;
import java.util.*;

public class NavMenuContainerLayout extends BaseLayoutBox {

    public final cn_0 eB0;
    public final cn_0 zl;
    public final cn_0 eb;
    public final S70 Fr0;

    public NavMenuContainerLayout(HV v1, boolean i2) {
        super();
        uf("gameshop-item");
        boolean i3 = false;
        if (v1 != null) {
            if (System.currentTimeMillis() / 1000L - (long) v1.Op0() < 604800L) {
                uf("gameshop-item-new");
                i3 = true;
            }
        }
        if (!tw0_0.kz0() && v1 != null && v1.yg() > v1.eo()) {
            uf("gameshop-item-sale");
            i3 = true;
        }
        if (v1 != null && v1.Aq0() != null) {
            i3 = true;
            uf("gameshop-item-limited");
            if (v1.zi0() == 1) {
                uf("gameshop-item-seasonal");
            }
        }

        Wr v4 = null;
        if (v1 == null) {
            Ll(false);
        } else if (v1.un() == 1) {
            v4 = gh_1.Jh0().Xj0(gu0.Az0().lPT6(v1.MB0()));
        } else if (v1.un() == 3) {
            yj_2 v5 = QO.YL0().xW(v1.MB0());
            if (v5 != null && v5.I20() > 0) {
                ht_0 v5_ht = QI.KH0().t00(v5.Qz0(), v5.I20());
                if (v5_ht.XC(0)) {
                    v4 = v5_ht.li0(0);
                }
            }
        } else {
            v4 = gh_1.Jh0().Kd0(v1.MB0());
        }

        S70 v5 = new S70(78, 32);
        v5.JH().Nk(new Wr[]{v4});
        v5.JH().Gy0(26, 10);
        v5.JH().nq0(24, 24);
        if (tw0_0.kz0()) {
            v5.JH().dA(2.0f);
            v5.JH().Gy0(5, 5);
        }

        if (i3) {
            this.Fr0 = new S70(57, 57);
            uf("label-special");
        } else {
            this.Fr0 = null;
        }

        if (v1 != null && v1.Aq0() != null) {
            this.zl = new cn_0(sm0_0.wa0(3010, tx_1.je0(v1.Aq0().Rl0())));
            uf("limited-time");
        } else {
            this.zl = null;
        }

        cn_0 v3 = new cn_0(v1 == null ? "" : v1.wG0());
        this.eB0 = v3;
        if (v1 != null && v1.ZZ() > 1) {
            byte un = v1.un();
            if (un == 1 || un == 3 || un == 5) {
                v3.Sk("x" + v1.ZZ() + " " + v1.wG0());
            }
        }

        cn_0 v4_desc = new cn_0(v1 == null ? "" : v1.ZE0());
        cn_0 v6 = new cn_0(g7_0.Zx(3002, ig_0.u9(3001, new StringBuilder(), ": ").append(Cv()).append(" "), "."));
        cn_0 v7 = new cn_0(sm0_0.wa0(2996, v1 == null ? "" : Integer.toString(v1.eo())));

        cn_0 eb = null;
        if (v1 != null && v1.yg() > v1.eo()) {
            int i8 = (v1.yg() - v1.eo()) * 100 / v1.yg();
            if (tw0_0.kz0()) {
                eb = new cn_0(sm0_0.wa0(2995, Integer.toString(i8)));
                uf("label-discount");
            } else {
                v7.Sk(v7.kl() + " (" + sm0_0.wa0(2995, Integer.toString(i8)) + ")");
            }
        }
        this.eb = eb;

        String v8 = "";
        if (v1 != null && tw0_0.kz0()) {
            v8 = " (" + sm0_0.wa0(2994, Integer.toString(v1.eo())) + ")";
        }

        xe_1 v9 = null;
        xe_1 v1_btn;
        if (v1 == null) {
            v1_btn = new xe_1();
        } else if (v1.tf0() == E10.ug0) {
            xe_1 v10 = new xe_1(g7_0.Zx(56, new StringBuilder(), v8));
            v10.RR(new jk_1(v1));
            v1_btn = v10;
        } else {
            xe_1 v10 = new xe_1(g7_0.Zx(56, new StringBuilder(), v8));
            v10.RR(new w_0((f.un_1)(Object)this, v1));
            if (v1.MB0() == 1001) {
                v9 = new xe_1(sm0_0.c0(2991));
                v9.RR(() -> pR(v1));
            }
            if (v1.MB0() == 1004) {
                xe_1 v8_xe = new xe_1(sm0_0.c0(2991));
                v8_xe.RR(() -> Mt0(v1));
                v9 = v8_xe;
            }
            if (v1.tf0() == E10.WD) {
                v9 = new xe_1(sm0_0.c0(3006));
                v9.RR(new nul__3(v1));
            }
            v1_btn = v10;
        }

        xe_1 v2 = new xe_1(sm0_0.c0(3003).replace('\n', ' '));
        v2.RR(new TJ((f.un_1)(Object)this));

        if (i2) {
            if (tw0_0.H30()) {
                x40(lo0().Xq(new ya_1[]{
                    hb(new le0_2[]{this.Fr0, v5}),
                    C7(new le0_2[]{v3, this.zl, v4_desc, v7, this.eb, this.eb, v6, v9, v1_btn, v2})
                }));
                WQ(H10().Xq(new ya_1[]{
                    C7(new le0_2[]{this.Fr0, v5}),
                    hb(new le0_2[]{v3, this.zl, v4_desc, v7, this.eb, this.eb, v6, v9, v1_btn, v2})
                }));
            } else {
                x40(lo0().Xq(new ya_1[]{
                    hb(new le0_2[]{this.Fr0, v5}),
                    C7(new le0_2[]{v3, v4_desc, v7, v6, this.zl, v9, v1_btn, v2})
                }));
                WQ(H10().Xq(new ya_1[]{
                    C7(new le0_2[]{this.Fr0, v5}),
                    hb(new le0_2[]{v3, v4_desc, v7, v6, this.zl, v9, v1_btn, v2})
                }));
            }
        } else if (tw0_0.H30()) {
            x40(lo0().Xq(new ya_1[]{
                C7(new le0_2[]{this.Fr0, v5}),
                C7(new le0_2[]{this.zl, v3, v4_desc}).qd(12).Ze0().LPt3(new le0_2[]{v7, this.eb, v9, v1_btn})
            }));
            WQ(H10().Xq(new ya_1[]{
                hb(new le0_2[]{this.Fr0, v5}),
                hb(new le0_2[]{this.zl, v3, v4_desc, v7, this.eb, v9, v1_btn})
            }));
        } else {
            x40(H10().X20(lo0().Xq(new ya_1[]{
                C7(new le0_2[]{this.Fr0, v5}),
                C7(new le0_2[]{v3, v4_desc}).Ze0()
            })).X20(hb(new le0_2[]{this.eb})).X20(C7(new le0_2[]{this.zl, v9, v1_btn})));

            WQ(lo0().Xq(new ya_1[]{
                H10().Xq(new ya_1[]{
                    hb(new le0_2[]{this.Fr0, v5}),
                    hb(new le0_2[]{v3}).X20(C7(new le0_2[]{v4_desc}).Ze0())
                }),
                H10().Ze0().Kn0(this.eb),
                hb(new le0_2[]{this.zl, v9, v1_btn})
            }));
        }
    }

    public static void Mt0(HV v0) {
        BU v1 = Qy0.yI0.zK0;
        short i2 = v0.WA;
        yf0_0 v3 = v1.COm6;
        if (v3 != null) {
            v3.xe0();
            v1.COm6 = null;
        } else {
            yf0_0 v3_new = new yf0_0(v1, true, i2);
            v1.COm6 = v3_new;
            v1.SL(v3_new);
        }
    }

    public static void pR(HV v0) {
        BU v0_bu = Qy0.yI0.zK0;
        short i2 = v0.WA;
        if (v0_bu.iY != null) {
            v0_bu.aUX();
        } else {
            md0_0 v3 = new md0_0(v0_bu, true, i2);
            v0_bu.iY = v3;
            v0_bu.SL(v3);
        }
    }

    public static int Cv() {
        return tw0_0.rl.Cl.coN;
    }
}
