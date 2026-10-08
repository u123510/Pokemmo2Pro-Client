package cn.pokemmo.ui.window.dialog;

import f.*;

import java.text.DateFormat;
import java.util.Locale;

/**
 * 系统公告通知弹窗
 *
 * 原混淆类: f.jy0
 */
public class NoticeDialogWindow extends cx_0 implements tr_1  {
    public final jy0 asBridge() {
        return (jy0) (Object) this;
    }

    public final fy_2 Gb0;
    public final xe_1 Fk;

    public NoticeDialogWindow(Qy0 qy0, vo0_0 vo0_0Var, IL il) {
        super(false, false);
        aS(cx_0.class);
        uf("disconnection-widget");
        fy_2 fy_2Var = new fy_2();
        this.Gb0 = fy_2Var;
        fy_2Var.uf("confirm-panel");
        qk0_2 qk0_2Var = new qk0_2();
        ge_0 ge_0Var = new ge_0(qk0_2Var);
        ge_0Var.hp(jy0::Bc);
        ge_0Var.uf("textarea");
        StringBuilder sb = new StringBuilder();
        String str;
        if (il != IL.Sp) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sm0_0.c0(il.en0()));
            int Sj = il.Sj();
            if (Sj > 0) {
                sb2.append("\n\n");
                sb2.append(hx_1.w70(sm0_0.c0(Sj), 80));
            }
            str = sb2.toString();
        } else {
            str = vo0_0Var.K00();
        }
        if (vo0_0Var.Ry() != -1) {
            Y1(sb, sm0_0.c0(1063), "big-yellow", true);
            Locale TK = wi0_0.pI().TK();
            String format = DateFormat.getDateTimeInstance(2, 3, TK).format(Long.valueOf(((long) vo0_0Var.Ry()) * 1000L));
            Y1(sb, sm0_0.wa0(1047, format), "default", true);
            Y1(sb, sm0_0.wa0(1046, str), "default", true);
            Y1(sb, sm0_0.c0(1064), "default", false);
        } else {
            Y1(sb, sm0_0.c0(1059), "big-red", true);
            Locale TK2 = wi0_0.pI().TK();
            String format2 = DateFormat.getDateInstance(2, TK2).format(Long.valueOf(((long) vo0_0Var.Fs()) * 1000L));
            Y1(sb, sm0_0.wa0(1048, format2), "default", true);
            Y1(sb, sm0_0.wa0(1046, str), "default", true);
            Y1(sb, sm0_0.c0(1064), "default", false);
        }
        qk0_2Var.Eo(sb.toString());
        xe_1 xe_1Var = new xe_1(sm0_0.c0(nf0_0.BA));
        this.Fk = xe_1Var;
        xe_1Var.pw0(false);
        xe_1Var.RR(this::x60);
        fy_2Var.x40(fy_2Var.H10().Kn0(ge_0Var).Kn0(xe_1Var).Ze0());
        fy_2Var.WQ(fy_2Var.lo0().Kn0(ge_0Var).Kn0(xe_1Var));
        SL(fy_2Var);
        this.Ey = tw0_0.kz0();
    }

    public static /* synthetic */ void Bc(String str) {
        lg_0.lv0.Lf(str);
    }

    public static void Y1(StringBuilder sb, String str, String str2, boolean z) {
        sb.append("<div style=\"word-wrap: break-word; font-family: " + str2 + "; text-align: center; \">");
        if (z) {
            str = QA0.W0(str, "\n\n");
        }
        String replaceAll = str.replaceAll("\\n", "<br/>");
        if (replaceAll.matches(".*https://([a-z\\.\\-]+)?pokemmo.com.*")) {
            replaceAll = replaceAll.replaceAll("(https://([a-z\\.\\-]+)?pokemmo\\.com\\S*)", "<a style=\"display: inline; float: left; font: link\" href=\"$1\">$1</a>");
        }
        sb.append(replaceAll);
        sb.append("</div>");
    }

    @Override
    public final void C(zk0_1 zk0_1Var) {
        lpt6__0.v90(this.Fk);
        com8__3 com8__3Var = new com8__3(zk0_1Var);
        com8__3Var.Mu(10000);
        com8__3Var.Gi0();
        com8__3Var.bm0 = this::hy0;
    }

    @Override
    public final boolean nd0(i70_0 i70_0Var) {
        if (E00.ZU(i70_0Var.zu) && i70_0Var.iT()) {
            int i = i70_0Var.finally$;
            rp_0 rp_0Var = rp_0.sJ0;
            int i2 = dw_2.ff;
            if (rp_0Var != null && rp_0Var.Ov(i)) {
                a7_0.bH(this.Fk.ER.Fc0);
                return true;
            }
            int i3 = i70_0Var.finally$;
            rp_0 rp_0Var2 = rp_0.nK0;
            if (rp_0Var2 != null && rp_0Var2.Ov(i3)) {
                a7_0.bH(this.Fk.ER.Fc0);
                return true;
            }
        }
        return super.nd0(i70_0Var);
    }

    @Override
    public final void K8() {
        super.K8();
        kh0();
        this.Gb0.lt0();
        this.Gb0.vf(pa0_0.Ol);
    }

    @Override
    public final void HP(zk0_1 zk0_1Var) {
        if (tw0_0.kz0()) {
            BL();
        } else {
            lpt6__0.v90(this.Fk);
        }
        super.HP(zk0_1Var);
    }

    public final /* synthetic */ void hy0() {
        this.Fk.pw0(true);
    }

    public final void x60() {
        if (this.Fk.OI) {
            xe0();
            BR br = tw0_0.rl;
            if (br != null) {
                br.m9();
            }
        }
    }
}
