package cn.pokemmo.ui.window.social;

import f.*;

import java.text.SimpleDateFormat;

/**
 * 好友私聊弹窗
 *
 * 原混淆类: f.nq_1
 */
public class PrivateMessageWindow extends nx_2 {
    public final nq_1 asBridge() {
        return (nq_1) (Object) this;
    }

    public final cg_0 hx0;
    public final String YJ;
    public final lo0_0 yE;
    public final ge_0 ED;
    public final dd0_0 vP;
    public final SimpleDateFormat j40;
    public QU O9;
    public final StringBuilder hF0;

    public PrivateMessageWindow(String v1) {
        super("pm-box-frame");
        this.j40 = new SimpleDateFormat("hh:mm:ss a");
        this.hF0 = new StringBuilder();
        this.YJ = v1;
        fy_2 v2 = new fy_2();
        ff0(3);
        uf("pm-box-frame");
        Hy("PM (" + v1 + ")");
        Pb0(new sg0_0(v1));
        cg_0 v4_cg = new cg_0();
        v4_cg.c2();
        dd0_0 v3_dd = new dd0_0();
        this.vP = v3_dd;
        ge_0 v4_ge = new ge_0(v3_dd);
        this.ED = v4_ge;
        v4_ge.uf("textarea");
        v4_ge.hp(new h0_0());
        v4_ge.pw0(false);
        lo0_0 v3_lo = new lo0_0(v4_ge);
        this.yE = v3_lo;
        v3_lo.uf("text-scrollpane");
        this.hx0 = new cg_0();
        xe_1 v5_xe = new xe_1(sm0_0.c0(1525));
        xe_1 v6_xe = new xe_1("⇲");
        v6_xe.uf("button-symbol");
        v6_xe.RR(new rb0_0(asBridge()));
        this.hx0.Ii(new fp_1(asBridge()));
        v5_xe.RR(new com4__0(asBridge()));

        v2.WQ(v2.lo0().X20(v2.H10().Kn0(v3_lo)).X20(v2.H10().LPt3(new le0_2[]{this.hx0, v5_xe, v6_xe})));
        v2.x40(v2.H10().X20(v2.lo0().Kn0(v3_lo)).X20(v2.lo0().LPt3(new le0_2[]{this.hx0, v5_xe, v6_xe})));
        SL(v2);
        this.Ia = v2;

        String shortTitle = v1;
        if (shortTitle.length() > 10) {
            shortTitle = shortTitle.substring(0, 9) + "...";
        }
        this.w20 = new qj_2(xq_1.pz0("PM (", shortTitle, ")"), 200, 30);
        this.w20.sl().Gy0(7, 7);
        this.w20.sl().nq0(16, 16);
        this.w20.sl().C80(250);
        this.w20.RR(new kp_2(asBridge()));
        this.Hn0.SL(this.w20);
        this.SL(this.Hn0);
        this.Hn0.Ll(false);
    }

    public static void jz(nq_1 v0) {
        String msg = ((wn0_0) v0.hx0.dI0).YA.toString();
        if (msg.isEmpty()) {
            return;
        }
        tw0_0.rl.Cp(zo_0.YL, msg, v0.YJ, true);
        v0.hx0.Gv("");
    }

    public final void Ub0(sf0_2 v1) {
        lg_0.k.lPT5(() -> iK0(v1));
    }

    public final void Ig0(VU v1) {
        if (v1 == null || v1.I8.vn()) {
            return;
        }
        String current = ((wn0_0) this.hx0.dI0).YA.toString();
        this.hx0.Gv(current + "{M:" + v1.pu + "}");
        lpt6__0.v90(this.hx0);
    }

    public final void ND0(sf0_2 v1) {
        String bg = "admin";
        String name = v1.At0;
        if (v1.Mp0.Uz0()) {
            bg = "player";
            name = tw0_0.e60.jB0.oc0;
        }
        int prevLen = this.hF0.length();
        if (v1.Mp0.Uz0()) {
            this.hF0.append("\n<div style=\"width: 340px;\"><div style=\"float: right; width: 240px; background-image: url(");
            this.hF0.append(bg);
            this.hF0.append(");\">");
            this.hF0.append("\n\t<chat style=\"text-align: right; font-family: link; margin-right: 14px; margin-top: 12px;\">");
            this.hF0.append(name);
            this.hF0.append("</chat>");
            this.hF0.append("\n\t<div style=\"display: inline; text-align: right; word-wrap: break-word; margin-right: 10px; padding: 3px; padding-bottom: 10px;font-family: chatdefault; \">");
            if (v1.Zy > 0) {
                BU.T50.BK.aL0(this.ED, v1.lw, v1.Mp0, this.hF0, true, false, false);
            }
            if (v1.lw.contains("{") && v1.lw.contains("}")) {
                XH bk = BU.T50.BK;
                ge_0 ed = this.ED;
                String text = v1.lw;
                CH0 mp = v1.Mp0;
                StringBuilder sb = this.hF0;
                boolean z = v1.Zy > 0;
                bk.aL0(ed, text, mp, sb, z, false, false);
            } else {
                this.hF0.append(v1.lw);
            }
            this.hF0.append("</div>");
            this.hF0.append("\n</div>");
            this.hF0.append("\n\t<div style=\"display: block; float: right; text-align: right; width: 240px;font-family: chatdefault;\">");
            this.hF0.append(this.j40.format(Long.valueOf(System.currentTimeMillis())));
            this.hF0.append("</div>");
            this.hF0.append("</div>");
        } else {
            this.hF0.append("\n<div style=\"width: 340px;\"><div style=\"width: 240px; background-image: url(");
            this.hF0.append(bg);
            this.hF0.append(");\">");
            this.hF0.append("\n\t<chat style=\"font-family: link; margin-left: 4px; margin-top: 12px;\">");
            this.hF0.append(name);
            this.hF0.append("</chat>");
            this.hF0.append("\n\t<div style=\"display: inline; text-align: left; word-wrap: break-word; margin-right: 10px; padding: 3px; padding-bottom: 10px;font-family: chatdefault; \">");
            if (v1.Zy > 0) {
                BU.T50.BK.aL0(this.ED, v1.lw, v1.Mp0, this.hF0, true, false, false);
            } else if (v1.lw.contains("{") && v1.lw.contains("}")) {
                BU.T50.BK.aL0(this.ED, v1.lw, v1.Mp0, this.hF0, false, false, false);
            } else {
                this.hF0.append(v1.lw);
            }
            this.hF0.append("</div>");
            this.hF0.append("\n</div>");
            this.hF0.append("\n\t<div style=\"display: block; float: left; text-align: left; width: 240px;font-family: chatdefault;\">");
            this.hF0.append(this.j40.format(Long.valueOf(System.currentTimeMillis())));
            this.hF0.append("</div>");
            this.hF0.append("</div>");
        }
        this.O9 = new QU(this.hF0.length() - prevLen, v1.Mp0, v1.lw);
        KB g1 = this.yE.g1;
        boolean atBottom = g1.hm == g1.VP;
        this.vP.hm(this.hF0.toString());
        this.ED.LX(this.vP);
        if (this.Hn0.eE && v1.Mp0.uI0()) {
            this.w20.tp0.ug = true;
        }
        if (atBottom) {
            lg_0.k.lPT5(new WA0(asBridge()));
        }
    }

    public final void iK0(sf0_2 v1) {
        if (this.O9 != null && this.O9.COm1.equals(v1.Mp0)) {
            this.hF0.delete(this.hF0.length() - this.O9.bI0, this.hF0.length());
            String merged = this.O9.vx + "<br/>" + wq_0.P60(v1.lw);
            sf0_2 newMsg = new sf0_2(v1.hB0, v1.Mp0, v1.At0, v1.Ww, v1.Zy, merged);
            ND0(newMsg);
        } else {
            ND0(v1);
        }
    }
}
