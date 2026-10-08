package cn.pokemmo.ui.window.dialog;

import f.*;

/**
 * 玩家行为守则对话框
 *
 * 原混淆类: f.oi0_0
 */
public class RulesDialogWindow extends cx_0 implements tr_1  {
    public final oi0_0 asBridge() {
        return (oi0_0) (Object) this;
    }

    public final CH0 X7;
    public final fy_2 nu0;
    public final xe_1 Ta;

    public RulesDialogWindow(CH0 v1, IL v2, String v3, G50 v4, int i5) {
        super(false, false);
        this.X7 = v1;
        uf("confirm-widget");
        this.nu0 = new fy_2();
        this.nu0.uf("confirm-panel");
        qk0_2 v7 = new qk0_2();
        ge_0 v8 = new ge_0(v7);
        v8.hp(oi0_0::Tk);
        v8.uf("textarea");
        StringBuilder v9 = new StringBuilder();
        int i10 = v2.ordinal();
        String v2_str;
        if (i10 == 2) {
            v2_str = sm0_0.c0(2071);
        } else if (i10 == 3) {
            v2_str = sm0_0.c0(2068);
        } else if (i10 == 14) {
            v2_str = sm0_0.c0(2072);
        } else if (i10 >= 5 && i10 <= 7) {
            switch (i10) {
                case 5:
                    v2_str = sm0_0.c0(2075);
                    break;
                case 6:
                    v2_str = sm0_0.c0(2070);
                    break;
                case 7:
                    v2_str = sm0_0.c0(2069);
                    break;
                default:
                    v2_str = sm0_0.wa0(2074, v3);
                    break;
            }
        } else if (i10 >= 17 && i10 <= 23) {
            switch (i10) {
                case 17:
                    v2_str = sm0_0.c0(2073);
                    break;
                case 18:
                    v2_str = sm0_0.c0(2079);
                    break;
                case 19:
                    v2_str = sm0_0.c0(2076);
                    break;
                case 20:
                    v2_str = sm0_0.c0(2078);
                    break;
                case 21:
                    v2_str = sm0_0.wa0(2077, v4.aD());
                    break;
                case 22:
                case 23:
                    int i2 = (v2 == IL.Ko) ? 2080 : 2081;
                    IL il = sm0_0.ab(v3);
                    String str3 = v3;
                    if (il != IL.Sp) {
                        str3 = sm0_0.c0(il.en0());
                    }
                    String str4 = (i5 < 10) ? sm0_0.c0(8049) : tx_1.je0(i5);
                    v2_str = sm0_0.Bx(i2, new String[] { str3, str4 });
                    break;
                default:
                    v2_str = sm0_0.wa0(2074, v3);
                    break;
            }
        } else {
            v2_str = sm0_0.wa0(2074, v3);
        }
        qQ(v9, v2_str);
        v7.Eo(v9.toString());
        this.Ta = new xe_1(sm0_0.c0(nf0_0.BA));
        this.Ta.pw0(false);
        this.Ta.RR(() -> d30(v1));
        this.nu0.x40(this.nu0.H10().Kn0(v8).Kn0(this.Ta).Ze0());
        this.nu0.WQ(this.nu0.lo0().Kn0(v8).Kn0(this.Ta));
        SL(this.nu0);
        this.Ey = tw0_0.kz0();
    }

    public static void Tk(String v0) {
        lg_0.lv0.Lf(v0);
    }

    public static void qQ(StringBuilder v0, String v1) {
        v0.append("<div style=\"word-wrap: break-word; font-family: default; text-align: center;");
        v0.append(" \\\">");
        v1 = v1.replaceAll("\\\\n", "<br/>");
        if (v1.contains("https://pokemmo.com/code_of_conduct")) {
            v1 = v1.replace("https://pokemmo.com/code_of_conduct", "<a style=\"display: inline; float: left; font: link\" href=\"https://pokemmo.com/code_of_conduct\">https://pokemmo.com/code_of_conduct</a>");
        }
        v0.append(v1);
        v0.append("<br/>");
        v0.append("<br/>");
        v0.append("</div>");
    }

    @Override
    public final void C(zk0_1 v1) {
        lpt6__0.v90(this.Ta);
        com8__3 c = new com8__3(v1);
        c.Mu(10000);
        c.Gi0();
        c.bm0 = this::E50;
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int i2 = v1.finally$;
            rp_0 sJ0 = rp_0.sJ0;
            int unused = dw_2.ff;
            if ((sJ0 != null && sJ0.Ov(i2)) || (rp_0.nK0 != null && rp_0.nK0.Ov(v1.finally$))) {
                a7_0.bH(this.Ta.ER.Fc0);
                return true;
            }
        }
        return super.nd0(v1);
    }

    @Override
    public final void K8() {
        super.K8();
        this.nu0.lt0();
        kh0();
        this.nu0.vf(pa0_0.Ol);
    }

    @Override
    public final void HP(zk0_1 v1) {
        if (tw0_0.kz0()) {
            BL();
        } else {
            lpt6__0.v90(this.Ta);
        }
        super.HP(v1);
    }

    public final void E50() {
        this.Ta.pw0(true);
    }

    public final void d30(CH0 v1) {
        if (!this.Ta.OI) {
            return;
        }
        xe0();
        BR br = tw0_0.rl;
        if (br != null) {
            br.fk0.uQ(new KE0(v1));
            br.lZ.dN(v1);
            le0_2 bF0 = lpt6__0.bF0;
            if (bF0 != null) {
                bF0.BL();
            }
        }
    }
}
