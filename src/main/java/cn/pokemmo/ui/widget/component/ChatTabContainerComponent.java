package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ChatTabContainerComponent extends BaseComponent implements tr_1 {
    public final String EE;
    public final fy_2 Xd;
    public final xe_1 cd;
    public final xe_1 p4;
    public final pg0_2 ab0;
    public final X6 gx0;
    public final cn_0 yp0;
    public final cn_0 jp0;
    public final pg0_2 Sd;
    public final X6 OY;
    public final X6 gV;
    public final cn_0[] zx0;
    public final W9[] Ta0;
    public final cn_0 lY;
    public final cn_0 Gv0;
    public final cn_0 a8;
    public final cn_0 TA0;
    public final cn_0 WO;
    public final cn_0 zw;
    public final Gh0 gn;
    public final Gh0 Sj0;
    public final W9 bO;
    public final W9 BT;
    public final W9 WD;
    public final W9 h90;
    public boolean cM0;
    public boolean ds0;
    public final X6 tn0;

    public ChatTabContainerComponent(String opponent) {
        cM0 = false;
        EE = opponent;
        uf("duel-confirm-widget");
        fy_2 panel = new fy_2();
        Xd = panel;
        panel.tI0();
        panel.uf("duel-confirm-panel");
        cn_0 title = new cn_0(sm0_0.wa0(220, opponent));
        title.uf("label-title");
        cn_0 formatTitle = new cn_0(sm0_0.c0(221));
        formatTitle.uf("label-title");
        ab0 = new pg0_2();
        Cq[] formats = Cq.NZ;
        for (int i = 0; i < 4; i++) {
            ab0.Ii(sm0_0.c0(formats[i].MI()));
        }
        X6 format = new X6(ab0);
        gx0 = format;
        format.Bd(0);
        format.Rm0(this::wI);
        cn_0 levelTitle = new cn_0(sm0_0.c0(234));
        zw = levelTitle;
        levelTitle.uf("label-title");
        int[] levels = Stream.of(tw0_0.rl.r1(_volatile.BV).rT())
                .filter(Objects::nonNull).mapToInt(ChatTabContainerComponent::Y1).toArray();
        int defaultLevel;
        if (IntStream.of(levels).anyMatch(ChatTabContainerComponent::tW)) {
            defaultLevel = 50;
        } else {
            defaultLevel = (int) (Math.ceil((double) Math.abs(tx_1.m20(levels) / 5)) * 5.0);
            if (defaultLevel < 5) {
                defaultLevel = 5;
            }
        }
        Gh0 level = new Gh0(new Aj(0, 50, defaultLevel));
        Sj0 = level;
        level.v10(5);
        int noLimit = nf0_0.Po;
        level.TK(0, sm0_0.c0(noLimit));
        level.uf("valueadjuster");
        level.lt0();
        cn_0 customTitle = new cn_0(sm0_0.c0(232));
        a8 = customTitle;
        customTitle.uf("label-title");
        W9 custom = new W9();
        BT = custom;
        custom.RR(this::ox0);
        cn_0 timerTitle = new cn_0(sm0_0.c0(223));
        lY = timerTitle;
        timerTitle.uf("label-title");
        Gh0 timer = new Gh0(new Aj(0, 120, 60));
        gn = timer;
        timer.v10(15);
        timer.TK(0, sm0_0.c0(noLimit));
        timer.uf("valueadjuster");
        for (int i = 0; i <= 8; i++) {
            int time = i * 15;
            String label = i == 0 ? sm0_0.c0(nf0_0.Po) : sm0_0.wa0(226, String.valueOf(time));
            gn.TK(time, label);
        }
        cn_0 itemTitle = new cn_0(sm0_0.c0(228));
        Gv0 = itemTitle;
        itemTitle.uf("label-title");
        bO = new W9();
        cn_0 previewTitle = new cn_0(sm0_0.c0(231));
        TA0 = previewTitle;
        previewTitle.uf("label-title");
        W9 preview = new W9();
        WD = preview;
        preview.RR(this::oR);
        cn_0 otherTitle = new cn_0(sm0_0.c0(233));
        WO = otherTitle;
        otherTitle.uf("label-title");
        h90 = new W9();
        cn_0 tierTitle = new cn_0(sm0_0.c0(224));
        yp0 = tierTitle;
        tierTitle.uf("label-title");
        Sd = new pg0_2();
        byte maximumTier = tw0_0.rl.hz().go0();
        for (N2 tier : N2.k6) {
            if (tier.ma0() <= maximumTier) {
                Sd.Ii(tier);
            }
        }
        X6 tiers = new X6(Sd);
        OY = tiers;
        tiers.hK(N2.yH0);
        tiers.Rm0(this::u4);
        cn_0 clausesTitle = new cn_0(sm0_0.c0(225));
        jp0 = clausesTitle;
        clausesTitle.uf("label-title");
        pg0_2 clauseModes = new pg0_2();
        clauseModes.Ii(sm0_0.c0(229));
        clauseModes.Ii(sm0_0.c0(230));
        X6 clauses = new X6(clauseModes);
        gV = clauses;
        clauses.Bd(0);
        clauses.Rm0(this::n7);
        GV[] ruleTypes = GV.Ht0;
        Ta0 = new W9[ruleTypes.length];
        zx0 = new cn_0[ruleTypes.length];
        for (int i = 0; i < GV.Ht0.length; i++) {
            GV rule = GV.Ht0[i];
            Ta0[i] = new W9();
            Ta0[i].RR(this::b9);
            zx0[i] = new cn_0(sm0_0.c0(rule.q70()));
            zx0[i].uf("label-title");
            Ta0[i].Xr0(sm0_0.c0(rule.LA()));
            Ta0[i].Bb(100);
            zx0[i].Xr0(sm0_0.c0(rule.LA()));
            zx0[i].Bb(100);
        }
        cn_0 teamTitle = new cn_0(sm0_0.c0(227));
        teamTitle.uf("label-title");
        ArrayList<WJ0> teams = new ArrayList<>();
        teams.add(new WJ0(null));
        HY teamStorage = tw0_0.rl.hq();
        for (byte i = 0; i < tx_0.bm0(tw0_0.rl.ex().X1()); i++) {
            tx_0 team = teamStorage.Ed0(i);
            if (team.Xr0()) {
                teams.add(new WJ0(team));
            }
        }
        pg0_2 teamOptions = new pg0_2(teams);
        X6 teamChoice = new X6(teamOptions);
        tn0 = teamChoice;
        teamChoice.uf("combobox");
        teamChoice.Bd(0);
        teamChoice.pw0(teams.size() > 1);
        ox0();
        xe_1 confirm = new xe_1(sm0_0.c0(122));
        cd = confirm;
        confirm.RR(this::le);
        xe_1 cancel = new xe_1(sm0_0.c0(nf0_0.Bq0));
        p4 = cancel;
        cancel.RR(this::xe0);

        ya_1 horizontal = Xd.H10()
                .X20(Xd.lo0().LPt3(title))
                .X20(Xd.lo0().LPt3(formatTitle, gx0))
                .X20(Xd.lo0().LPt3(zw, Sj0));
        pa0_0 alignment = pa0_0.Vp0;
        horizontal = horizontal.X20(Xd.lo0().Kn0(teamTitle).k5(alignment, teamChoice))
                .X20(Xd.lo0().LPt3(a8, BT))
                .X20(Xd.lo0().LPt3(yp0, OY))
                .X20(Xd.lo0().LPt3(lY, gn))
                .X20(Xd.lo0().LPt3(TA0, WD, WO, h90))
                .X20(Xd.lo0().LPt3(Gv0, bO));
        ya_1 vertical = Xd.lo0()
                .X20(Xd.H10().Kn0(title))
                .X20(Xd.H10().Kn0(formatTitle).Kn0(gx0))
                .X20(Xd.H10().LPt3(zw, Sj0))
                .X20(Xd.H10().Kn0(teamTitle).k5(alignment, teamChoice))
                .X20(Xd.H10().LPt3(a8, BT))
                .X20(Xd.H10().Kn0(yp0).Kn0(OY))
                .X20(Xd.H10().Kn0(lY).Kn0(gn))
                .X20(Xd.H10().LPt3(TA0, WD, WO, h90))
                .X20(Xd.H10().LPt3(Gv0, bO));
        horizontal.X20(Xd.lo0().LPt3(jp0, gV));
        vertical.X20(Xd.H10().Kn0(jp0).Kn0(gV));
        for (int i = 0; i < Ta0.length;) {
            int next = i + 2;
            if (next <= Ta0.length) {
                horizontal.X20(Xd.lo0().LPt3(zx0[i], Ta0[i], zx0[i + 1], Ta0[i + 1]));
                vertical.X20(Xd.H10().LPt3(zx0[i], Ta0[i]).qd(6).LPt3(zx0[i + 1], Ta0[i + 1]));
                i = next;
            } else {
                horizontal.X20(Xd.lo0().LPt3(zx0[i], Ta0[i]));
                vertical.X20(Xd.H10().LPt3(zx0[i], Ta0[i]).Ze0());
                i++;
            }
        }
        horizontal.X20(Xd.H10().LPt3(cd, p4)).Ze0();
        vertical.X20(Xd.lo0().Kn0(cd).Kn0(p4));
        Xd.x40(horizontal);
        Xd.WQ(vertical);
        SL(Xd);
    }

    public static lq0[] h90(int size) {
        return new lq0[size];
    }

    public static lq0 mt0(int index) {
        return lq0.p8(GV.TH0[index]);
    }

    public static boolean tW(int level) {
        return level >= 50;
    }

    public static int Y1(VU member) {
        return member.I8.wj;
    }

    public final void ox0() {
        if (cM0) {
            return;
        }
        boolean show = BT.ER.U20();
        lY.Ll(show);
        gn.Ll(show);
        yp0.Ll(show);
        OY.Ll(show);
        jp0.Ll(show);
        gV.Ll(show);
        X6 selector = gV;
        boolean showClauses = selector.eE && selector.mu0.Mw0 == 1;
        for (cn_0 label : zx0) {
            label.Ll(showClauses ? show : false);
        }
        for (W9 button : Ta0) {
            button.Ll(showClauses ? show : false);
        }
        Gv0.Ll(show);
        bO.Ll(show);
        TA0.Ll(show);
        WD.Ll(show);
        WD.ER.lK0(show);
        ds0 = WD.ER.U20();
        WO.Ll(show);
        h90.Ll(show);
        h90.ER.lK0(show);
        if (!show) {
            for (int i = 0; i < Ta0.length; i++) {
                Ta0[i].ER.lK0(false);
            }
        } else {
            for (int i = 0; i < Ta0.length; i++) {
                Ta0[i].ER.lK0(GV.Ht0[i].cOm3);
            }
        }
    }

    public final void Qw() {
        Cq format = Cq.NZ[gx0.mu0.Mw0];
        boolean items = false;
        boolean preview = false;
        boolean other = false;
        byte time = 0;
        byte level = (byte) Sj0.eB0;
        N2 tier = N2.BF;
        lq0[] rules = lq0.CoM4;
        if (BT.ER.U20()) {
            items = bO.ER.U20();
            time = (byte) gn.eB0;
            tier = (N2) OY.Vh0();
            preview = WD.ER.U20();
            other = h90.ER.U20();
            rules = IntStream.range(0, Ta0.length).filter(this::yW)
                    .mapToObj(ChatTabContainerComponent::mt0).toArray(ChatTabContainerComponent::h90);
        }
        BR client = tw0_0.rl;
        String opponent = EE;
        byte team = ((WJ0) tn0.Vh0()).DZ;
        client.fk0.uQ(new Bs0(opponent, format, items, preview, other, time, level, tier, rules, team));
    }

    @Override
    public final void K8() {
        Xd.lt0();
        lt0();
        N80(pa0_0.Ol);
    }

    public final void C(zk0_1 context) {
        lpt6__0.v90(cd);
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int key = event.finally$;
            rp_0 binding = rp_0.kC0;
            int initialization = dw_2.ff;
            if (binding != null && binding.Ov(key)) {
                lpt6__0.v90(cd);
                return true;
            }
            binding = rp_0.synchronized$;
            if (binding != null && binding.Ov(key)) {
                lpt6__0.v90(p4);
                return true;
            }
            binding = rp_0.sJ0;
            if (binding != null && binding.Ov(key)) {
                if (cd.Of()) {
                    a7_0.bH(cd.ER.Fc0);
                } else if (p4.Of()) {
                    a7_0.bH(p4.ER.Fc0);
                }
                return true;
            }
            binding = rp_0.nK0;
            if (binding != null && binding.Ov(key)) {
                a7_0.bH(p4.ER.Fc0);
                return true;
            }
        }
        return super.nd0(event);
    }

    public final boolean yW(int index) {
        return Ta0[index].ER.U20();
    }

    public final void le() {
        xe0();
        Qw();
    }

    public final void b9() {
        cM0 = true;
    }

    public final void n7() {
        X6 selector = gV;
        boolean show = selector.eE && selector.mu0.Mw0 == 1;
        for (cn_0 label : zx0) {
            label.Ll(show);
        }
        for (W9 button : Ta0) {
            button.Ll(show);
        }
    }

    public final void u4() {
        if (OY.Vh0() == N2.b6) {
            WD.pw0(false);
            WD.ER.lK0(true);
            for (int i = 0; i < GV.Ht0.length; i++) {
                GV rule = GV.Ht0[i];
                Ta0[i].pw0(false);
                W9 button = Ta0[i];
                boolean selected = S.ZT(rule, GV.gj0);
                button.ER.lK0(selected);
            }
        } else {
            WD.pw0(true);
            W9 button = WD;
            button.ER.lK0(ds0);
            for (int i = 0; i < GV.Ht0.length; i++) {
                Ta0[i].pw0(true);
            }
        }
    }

    public final void oR() {
        ds0 = WD.ER.U20();
    }

    public final void wI() {
        X6 tier = OY;
        if (!tier.eE) {
            if (gx0.mu0.Mw0 != 0) {
                tier.hK(N2.BF);
            } else {
                tier.hK(N2.yH0);
            }
        }
    }
}
