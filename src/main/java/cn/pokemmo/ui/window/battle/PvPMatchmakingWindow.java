package cn.pokemmo.ui.window.battle;

import f.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * PVP排位赛与锦标赛匹配主窗口
 *
 * 原混淆类: f.Yl
 */
public class PvPMatchmakingWindow extends nx_2 implements tr_1  {
    public final Yl asBridge() {
        return (Yl) (Object) this;
    }

    public static final DecimalFormat Bk0;
    public static final SimpleDateFormat X50;
    public final BU NG;
    public final P8 T6;
    public final lo0_0 WD;
    public mx_1[] FR;
    public final ArrayList EY;
    public final cg_0 aB;
    public byte D10;
    public final xe_1 xz0;
    public xe_1 Cv;
    public final cn_0 XJ;
    public final lo0_0 h00;
    public xe_1[] Sj;
    public final hv_0 UB;
    public final P8 gh;
    public fy_2 oL0;
    public lo0_0 cOn;
    public cn_0 qi0;
    public X6 OE0;
    public av_1 LB;
    public final X6 jq0;
    public final Kw0[] qa0;
    public boolean PH;
    public boolean j0;
    public av_1[] I60;
    public CH0 fO;
    public final lq0[] Lh0;
    public final HZ[] kJ0;
    public N2[] mQ;
    public final boolean sE;
    public final zp0_0[] Xr;
    public int a50;
    public int n10;
    public xe_1[][] LP;
    public final int uL0;
    public Comparator ao;
    public m0_0 pM;
    public final ArrayList COn;
    public final in_2 z00;

    static {
        Bk0 = new DecimalFormat("#0.00");
        X50 = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
    }

    public PvPMatchmakingWindow(BU owner, boolean tournament, zp0_0[] events, HZ[] restrictions, pz_2[] rewards, int limit) {
        super("matchmakingframe", tw0_0.kz0());
        EY = new ArrayList();
        aB = new cg_0();
        D10 = 0;
        LB = null;
        qa0 = new Kw0[6];
        PH = false;
        j0 = false;
        I60 = null;
        fO = CH0.j1;
        Lh0 = lq0.ul;
        mQ = N2.CG;
        a50 = 0;
        n10 = 0;
        ao = ub_0.iu0;
        pM = null;
        z00 = new in_2(250);
        NG = owner;
        Pb0(this::J8);
        sE = tournament;
        Xr = events;
        kJ0 = restrictions;
        uL0 = limit;
        YearMonth.now(ZoneId.of("UTC"));
        uf("matchmakingframe");
        Hy(sm0_0.c0(tournament ? 9150 : 5500));
        ff0(1);
        T6 = new P8();
        fy_2 signup = new fy_2();
        WD = new lo0_0();
        Hm0 signupVertical = signup.lo0();
        I7 signupHorizontal = signup.H10();
        xz0 = new xe_1(sm0_0.c0(5507));
        xz0.RR(this::AN);
        xz0.uf("signup-button");
        XJ = new cn_0("");
        XJ.uf("label-time");
        signupVertical.Kn0(WD);
        signupHorizontal.Kn0(WD);
        COn = new ArrayList();
        COn.add(new WJ0(null));
        HY teams = tw0_0.rl.hq();
        for (byte i = 0; i < tx_0.bm0(tw0_0.rl.ex().X1()); i++) {
            tx_0 team = teams.Ed0(i);
            if (team.Xr0()) COn.add(new WJ0(team));
        }
        if (!tournament) {
            jq0 = null;
            signupHorizontal.X20(signup.hb(new le0_2[] { xz0, XJ }));
            signupVertical.X20(signup.C7(new le0_2[] { XJ }).Ze0().Kn0(xz0));
        } else {
            pg0_2 options = new pg0_2(COn);
            X6 selector = new X6(options);
            jq0 = selector;
            selector.uf("signup-combobox");
            if (COn.size() <= 1) selector.pw0(false);
            selector.Bd(0);
            selector.Rm0(this::tj);
            for (byte i = 0; i < qa0.length; i++) qa0[i] = new Kw0();
            tj();
            signupHorizontal.LPt3(new le0_2[] { jq0 });
            signupHorizontal.X20(signup.lo0().LPt3(qa0));
            signupVertical.X20(signup.H10().Ze0().LPt3(new le0_2[] { jq0 }).Ze0())
                    .X20(signup.H10().Ze0().LPt3(qa0).Ze0());
        }
        signup.WQ(signupVertical);
        signup.x40(signupHorizontal);
        T6.Wq(signup, sm0_0.c0(5525));
        fy_2 rulesPanel = new fy_2();
        fy_2 bansPanel = new fy_2();
        fy_2 infoPanel = new fy_2();
        if (!tournament) {
            String rewardTitle = sm0_0.c0(5651);
            T6.Wq(new ql0_2(rewards, uL0), rewardTitle);
            P8 tiers = new P8();
            gh = tiers;
            tiers.uf("tier-tabbed-pane");
            T6.Wq(tiers, sm0_0.c0(1127));
            TreeMap<Integer, av_1> available = new TreeMap<>();
            HashSet<Integer> seen = new HashSet<>();
            for (av_1 tier : av_1.Vk0) {
                if (tier.s90() && tier.Sz() && !seen.contains(tier.xB0())) {
                    available.put(tier.xB0(), tier);
                    seen.add(tier.xB0());
                }
            }
            av_1 first = null;
            for (av_1 tier : available.values()) {
                if (!tier.s90() || !tier.Sz()) continue;
                String title = zT(tier);
                gh.Wq(new fy_2().Pc(), title).Kj(() -> pr0(tier));
                if (first == null) first = tier;
            }
            kd0(first);
            fy_2 spectate = new fy_2();
            lo0_0 stats = new lo0_0();
            h00 = stats;
            stats.uf("stats");
            stats.AH0(new cn_0(sm0_0.c0(74)));
            cn_0 searchLabel = new cn_0(g7_0.Zx(8112, new StringBuilder(), ":"));
            hv_0 pager = new hv_0(asBridge());
            UB = pager;
            aB.I7();
            aB.Ii(this::Fr0);
            if (tw0_0.kz0()) pager.uf("mobile-pager");
            spectate.WQ(spectate.hb(new le0_2[] { stats }).X20(spectate.H10().Ze0().Kn0(pager).Ze0()
                    .LPt3(new le0_2[] { searchLabel, aB })));
            spectate.x40(spectate.C7(new le0_2[] { stats }).X20(spectate.hb(new le0_2[] { pager, searchLabel, aB })));
            com2__3 tab = T6.Wq(spectate, sm0_0.c0(5667));
            tab.Kj(() -> Zu(tab));
        } else {
            gh = null;
            h00 = null;
            UB = null;
        }
        rulesPanel.uf("info-layout");
        cn_0 heading = new cn_0(sm0_0.c0(5526));
        ya_1 rulesVertical = rulesPanel.hb(new le0_2[] { heading });
        ya_1 rulesHorizontal = rulesPanel.C7(new le0_2[] { heading });
        for (lq0 rule : Lh0) {
            cn_0 title = new cn_0(rule.R3());
            title.uf("label-type");
            cn_0 description = new cn_0(rule.B3());
            description.uf("label-desc");
            rulesVertical.X20(rulesPanel.C7(new le0_2[] { title, description }));
            rulesHorizontal.X20(rulesPanel.hb(new le0_2[] { title, description }));
        }
        rulesPanel.WQ(rulesVertical.X20(rulesPanel.H10()));
        rulesPanel.x40(rulesHorizontal.X20(rulesPanel.lo0()));
        T6.Wq(rulesPanel, sm0_0.c0(5527));
        bansPanel.uf("info-layout");
        Hm0 bansVertical = bansPanel.lo0();
        I7 bansHorizontal = bansPanel.H10();
        cn_0 blank = new cn_0();
        bansVertical.X20(bansPanel.C7(new le0_2[] { blank }));
        bansHorizontal.X20(bansPanel.hb(new le0_2[] { blank }));
        if (restrictions.length < 1) {
            cn_0 empty = new cn_0(sm0_0.c0(5634));
            empty.uf("label-game-mode");
            bansHorizontal.X20(bansPanel.hb(new le0_2[] { empty }));
            bansVertical.X20(bansPanel.H10().Ze0().Kn0(empty).Ze0());
        } else {
            for (HZ restrictionSet : restrictions) {
                String titleText = restrictionSet.hT() == null ? sm0_0.c0(5749) : restrictionSet.hT().wI();
                cn_0 title = new cn_0(titleText);
                title.uf("label-banned-title");
                bansVertical.X20(bansPanel.C7(new le0_2[] { title }));
                bansHorizontal.X20(bansPanel.hb(new le0_2[] { title }));
                ArrayList list = restrictionSet.Gc0();
                S70[] icons = new S70[Math.min(list.size(), 8)];
                int count = 0;
                int index = 0;
                for (Object value : list) {
                    qr_1 restriction = (qr_1) value;
                    S70 icon = tw0_0.kz0() ? new S70(72, 72) : new S70(48, 48);
                    bansPanel.SL(icon);
                    if (restriction.zk() == 0 || restriction.zk() == 2) {
                        icon.uf("label-banned-monster");
                    } else if (restriction.zk() == 1) {
                        icon.uf("label-suspect-testing-monster");
                    }
                    boolean monsterIcon = false;
                    if (restriction.Ds() > 0) {
                        cq_0 species = mp_1.vf0().W50(restriction.Ds());
                        short id = restriction.Ds();
                        if (restriction.QL() >= 0) id = species.Qz(restriction.QL());
                        icon.JH().o60(new AG0[] { yh_0.Dl0().qC0(id, (byte) 0, false)[0] });
                        monsterIcon = true;
                    } else if (restriction.fy() > 0) {
                        icon.JH().Nk(new Wr[] { gh_1.Jh0().S1(restriction.fy()) });
                    } else if (restriction.uj() > 0) {
                        vk0_1 move = ec0_2.Sx().SX(restriction.uj());
                        if (move != null) {
                            icon.JH().Nk(new Wr[] { gh_1.Jh0().S1(move.yS(null).mt()) });
                        } else {
                            monsterIcon = true;
                        }
                    } else if (restriction.r6() > 0) {
                        icon.JH().Nk(new Wr[] { gh_1.Jh0().S1((short) 1018) });
                    } else {
                        icon.JH().Nk(new Wr[] { gh_1.Jh0().S1((short) 0) });
                    }
                    if (monsterIcon) {
                        if (tw0_0.kz0()) {
                            icon.JH().dA(2.0F);
                            icon.JH().Gy0(0, -4);
                        } else {
                            icon.JH().nq0(48, 48);
                        }
                    } else {
                        if (tw0_0.kz0()) {
                            icon.JH().dA(1.5F);
                            icon.JH().Gy0(0, 0);
                        } else {
                            icon.JH().Gy0(6, 6);
                            icon.JH().nq0(36, 36);
                        }
                        icon.JH().Gy0(6, 6);
                        icon.JH().nq0(36, 36);
                    }
                    icon.Xr0(lb0_2.jt(restriction));
                    icon.Bb(0);
                    icons[index++] = icon;
                    count++;
                    if (count % 8 == 0) {
                        bansVertical.X20(bansPanel.H10().Ze0().LPt3(icons).Ze0());
                        bansHorizontal.X20(bansPanel.hb(icons));
                        icons = new S70[Math.min(list.size() - count, 8)];
                        index = 0;
                    }
                }
                if (index > 0) {
                    bansVertical.X20(bansPanel.H10().Ze0().LPt3(icons).Ze0());
                    bansHorizontal.X20(bansPanel.hb(icons));
                }
            }
        }
        bansPanel.WQ(bansVertical.X20(bansPanel.H10()));
        bansPanel.x40(bansHorizontal.Ze0().X20(bansPanel.lo0()));
        T6.Wq(bansPanel, sm0_0.c0(5530)).Kj(this::tj);
        infoPanel.uf("info-layout");
        Hm0 infoVertical = infoPanel.lo0();
        I7 infoHorizontal = infoPanel.H10();
        if (tournament) {
            cn_0 title = new cn_0(sm0_0.c0(7102));
            title.uf("label-type");
            StringBuilder text = new StringBuilder();
            for (int id = 7140; id <= 7146; id++) {
                if (text.length() > 0) text.append("\n");
                text.append(sm0_0.c0(id));
            }
            cn_0 description = new cn_0(text.toString());
            description.uf("label-desc");
            infoVertical.X20(infoPanel.C7(new le0_2[] { title, description }));
            infoHorizontal.X20(infoPanel.hb(new le0_2[] { title, description }));
        } else {
            for (int section = 0; section < 4; section++) {
                int titleId;
                int start;
                int end;
                switch (section) {
                    case 0: titleId = 7100; start = 7120; end = 7121; break;
                    case 1: titleId = 7101; start = 7130; end = 7135; break;
                    case 2: titleId = 7103; start = 7150; end = 7153; break;
                    default: titleId = 7104; start = 7160; end = 7163;
                }
                cn_0 title = new cn_0(sm0_0.c0(titleId));
                title.uf("label-type");
                StringBuilder text = new StringBuilder();
                for (int id = start; id <= end; id++) {
                    if (text.length() > 0) text.append("\n");
                    text.append(sm0_0.c0(id));
                }
                cn_0 description = new cn_0(text.toString());
                description.uf("label-desc");
                infoVertical.X20(infoPanel.C7(new le0_2[] { title, description }));
                infoHorizontal.X20(infoPanel.hb(new le0_2[] { title, description }));
            }
        }
        infoPanel.WQ(infoVertical.X20(infoPanel.H10()));
        infoPanel.x40(infoHorizontal.Ze0().X20(infoPanel.lo0()));
        T6.Wq(infoPanel, sm0_0.c0(5531));
        SL(T6);
        Ia = T6;
        oU = new xe_1();
        oU.uf("minimizeButton");
        oU.Oq0(false);
        oU.Ll(false);
        oU.RR(this::zp);
        SL(oU);
        jZ();
        if (tw0_0.kz0()) {
            w20 = new qj_2("", 280, 60);
            w20.sl().Gy0(4, 5);
            w20.sl().nq0(48, 48);
        } else {
            w20 = new qj_2("", 200, 30);
            w20.sl().Gy0(4, 3);
            w20.sl().nq0(24, 24);
        }
        w20.sl().Nk(new Wr[] { zr_2.MA0.uh() });
        w20.sl().C80(25);
        w20.sl().hG();
        w20.RR(this::BH0);
        Hn0.SL(w20);
        SL(Hn0);
        Hn0.Ll(false);
        nm();
    }

    public static void vD0(ub_0 entry) {
        BR client = tw0_0.rl;
        int id = entry.rA0;
        client.fk0.uQ(new Nx0(id));
    }

    public static String zT(av_1 tier) {
        for (av_1 candidate : av_1.Vk0) {
            if (!candidate.k10 && candidate.Lq == tier.Lq) {
                return candidate.toString();
            }
        }
        return "";
    }

    public final void sq0() {
        oL0 = new fy_2();
        cOn = new lo0_0(null);
        cOn.uf("stats");
        cn_0 label = new cn_0(null, 0);
        label.Sk(sm0_0.c0(74));
        cOn.AH0(label);
        label = new cn_0(null, 0);
        label.Sk(sm0_0.wa0(5650, "-"));
        qi0 = label;
        label.uf("label-leaderboard-updated-time");
        byte last = tw0_0.rl.lt;
        ArrayList<String> seasons = new ArrayList<>();
        for (byte season = 0; season <= last; season++) {
            seasons.add(season == 0 ? sm0_0.c0(5495) : sm0_0.wa0(5496, Integer.toString(season)));
        }
        pg0_2 options = new pg0_2(seasons);
        X6 selector = new X6();
        selector.r30(options);
        OE0 = selector;
        selector.Bd(seasons.size() - 1);
        OE0.Rm0(this::uS);
        oL0.WQ(oL0.hb(new le0_2[] { cOn }).X20(oL0.C7(new le0_2[] { OE0 }).Ze0().Kn0(qi0)));
        oL0.x40(oL0.C7(new le0_2[] { cOn }).X20(oL0.hb(new le0_2[] { OE0, qi0 })));
        gh.bC.gn(oL0);
        uS();
    }

    public final void nm() {
        ArrayList<xe_1> buttons = new ArrayList<>();
        xe_1 close = new xe_1(sm0_0.c0(65));
        Cv = close;
        close.RR(this::J8);
        fy_2 panel = new fy_2();
        panel.x40(new I7(panel));
        panel.WQ(new Hm0(panel));
        Hm0 rows = new Hm0(panel);
        I7 columns = new I7(panel);
        if (sE) {
            panel.uf("tournament-signup");
            FR = new mx_1[Xr.length];
            for (int i = 0; i < Xr.length; i++) {
                FR[i] = new mx_1(asBridge(), Xr[i]);
                fy_2 entry = FR[i].gr0;
                columns.Ze0();
                columns.Kn0(entry);
                rows.Kn0(entry);
                if (i > 0 && (i + 1) % 2 == 0) {
                    columns.Ze0();
                    panel.L4.X20(rows);
                    panel.pJ0.X20(columns);
                    rows = new Hm0(panel);
                    columns = new I7(panel);
                } else {
                    columns.Ze0();
                }
                buttons.add(FR[i].ub0);
            }
            zA();
        } else {
            FR = new mx_1[0];
            EY.clear();
            fy_2 modes = new fy_2();
            modes.uf("game-mode");
            I7 horizontal = new I7(modes);
            Hm0 vertical = new Hm0(modes);
            modes.tI0();
            modes.x40(horizontal);
            modes.WQ(vertical);
            for (int id = 0; id <= av_1.Bs; id++) {
                av_1 unranked = null;
                for (av_1 candidate : av_1.Vk0) {
                    if (candidate.Lq == id && !candidate.k10) {
                        unranked = candidate;
                        break;
                    }
                }
                av_1 ranked = null;
                for (av_1 candidate : av_1.Vk0) {
                    if (candidate.Lq == id && candidate.k10) {
                        ranked = candidate;
                        break;
                    }
                }
                if (unranked == null || ranked == null || (!unranked.BB && !ranked.BB)) {
                    continue;
                }
                P30 entry = new P30(asBridge(), unranked, ranked, Lh0, COn);
                EY.add(entry);
                String text = g7_0.Zx(unranked.Um, new StringBuilder(), ":");
                cn_0 label = new cn_0(null, 0);
                label.Sk(text);
                label.uf("label-game-mode");
                ya_1 row = new I7(modes).X20(modes.hb(new le0_2[] { label }));
                row.qd(tw0_0.kz0() ? 28 : 4).Xq(new ya_1[] {
                        modes.hb(new le0_2[] { entry.Ce0 }), modes.hb(new le0_2[] { entry.Gr }) });
                row.qd(tw0_0.kz0() ? 92 : 29).Xq(new ya_1[] {
                        modes.hb(new le0_2[] { entry.jg0 }), modes.hb(new le0_2[] { entry.Py0 }) });
                vertical.Xq(new ya_1[] { row });
                horizontal.X20(new Hm0(modes).Xq(new ya_1[] {
                        modes.C7(new le0_2[] { label }), modes.C7(new le0_2[] { entry.Ce0 }),
                        modes.C7(new le0_2[] { entry.Gr }), modes.C7(new le0_2[] { entry.jg0 }),
                        modes.C7(new le0_2[] { entry.Py0 }) }));
                vertical.X20(new I7(modes).qd(1).Kn0(entry.kr0).qd(5).LPt3(entry.UZ).Ze0());
                horizontal.X20(new I7(modes).Xq(new ya_1[] { modes.hb(entry.UZ).Kn0(entry.kr0) }));
                buttons.add(entry.Ce0);
                buttons.add(entry.jg0);
            }
            columns.Kn0(modes);
            rows.Kn0(modes);
            buttons.add(xz0);
        }
        panel.L4.X20(rows);
        panel.pJ0.X20(columns);
        panel.L4.qd(5);
        panel.pJ0.qd(5);
        LP = new xe_1[][] { buttons.toArray(new xe_1[0]) };
        if (FR.length == 1) {
            panel.L4.qd(5);
            panel.pJ0.qd(5);
        }
        if (sE && FR.length < 1) {
            cn_0 empty = new cn_0(null, 0);
            empty.Sk(sm0_0.c0(9151));
            empty.uf("label-game-mode");
            rows.X20(panel.hb(new le0_2[] { empty }));
            columns.X20(new I7(panel).Ze0().Kn0(empty).Ze0());
        }
        I7 spacer = new I7(panel);
        Hm0 otherSpacer = new Hm0(panel);
        panel.L4.X20(spacer);
        panel.pJ0.X20(otherSpacer);
        panel.L4.qd(5);
        WD.AH0(panel);
        xe_1[][] navigation = LP;
        if (navigation.length > 0) {
            xe_1[] first = navigation[0];
            if (first.length > 0) lpt6__0.v90(first[0]);
        }
    }

    public final void vi0() {
        I60 = null;
        fO = CH0.j1;
        for (mx_1 entry : FR) {
            entry.Y2.Sk("");
            entry.XR = true;
            entry.Jq0();
            entry.ub0.yj0 = null;
            entry.ub0.yB0();
            entry.Am.og.Ve = false;
            entry.Rd.Sk("");
            entry.ub0.SU(sm0_0.c0(5515));
        }
        for (Object value : EY) {
            P30 entry = (P30) value;
            entry.q70 = false;
            entry.Xr0();
        }
        Cv.SU(sm0_0.c0(65));
        Cv.pw0(true);
        oU.pw0(false);
        oU.Ll(false);
        xz0.SU(sm0_0.c0(5507));
        xz0.pw0(true);
    }

    public final void jZ() {
        if (!Hn0.eE) {
            if (tw0_0.kz0()) {
                oU.lt0();
                oU.RY(60, 60);
                oU.A20(pa0_0.Mk, -60, 0);
            } else {
                oU.lt0();
                oU.RY(16, 16);
                oU.g2(16, 16);
                oU.oY(16, 16);
                oU.E40(A20 + Mx - 38, SB0 + 10);
            }
        }
    }

    public final void AN() {
        if (I60 != null || fO.uI0()) {
            J8();
            return;
        }
        ArrayList<av_1> tiers = new ArrayList<>();
        fa_0 teams = new fa_0(10, 0);
        for (Object value : EY) {
            P30 entry = (P30) value;
            W9 selected = entry.jg0;
            if (selected.OI && selected.ER.U20()) {
                tiers.add(entry.QL0);
                teams.nf0(((WJ0) entry.kr0.Vh0()).DZ);
            }
            selected = entry.Ce0;
            if (selected.OI && selected.ER.U20()) {
                tiers.add(entry.B90);
                teams.nf0(((WJ0) entry.kr0.Vh0()).DZ);
            }
        }
        if (tiers.isEmpty()) {
            tw0_0.RE0.Hq0((byte) 2, (short) 1367);
            return;
        }
        av_1[] selection = tiers.toArray(new av_1[0]);
        RO(new wf0_1(selection, teams.Jh0()));
    }

    public final void RO(wf0_1 request) {
        if (I60 != null || fO.uI0()) {
            J8();
            return;
        }
        if (request.ni0 != null) {
            SD0(request);
            return;
        }
        zp0_0 event = request.q30;
        if (event != null) {
            if (event.NO == 2) {
                byte mode = event.Ib0;
                if (mode == 2 || mode == 3) {
                    Qy0.yI0.sr0(new lpt3__4(sm0_0.wa0(9120, event.FA()), () -> se(request), asBridge()));
                } else {
                    SD0(request);
                }
                return;
            }
            SD0(request);
        }
    }

    public final void se(wf0_1 request) {
        SD0(request);
    }

    public final void Ml0() {
        for (mx_1 entry : FR) {
            entry.Y2.Sk("");
            entry.XR = false;
            entry.Jq0();
            entry.Am.og.Ve = false;
            entry.Rd.Sk("");
            entry.ub0.SU(sm0_0.c0(5515));
        }
        tw0_0.rl.fk0.uQ(new a8_0());
        PH = false;
        j0 = true;
        Cv.SU(sm0_0.c0(65));
        Cv.pw0(false);
    }

    public final void I00(id_0[] entries, int updated) {
        cn_0 rank = new cn_0(null, 0);
        rank.Sk(sm0_0.c0(5663));
        cn_0 title = new cn_0(null, 0);
        title.Sk("");
        cn_0 name = new cn_0(null, 0);
        name.Sk(sm0_0.c0(9155));
        cn_0 winLoss = new cn_0(null, 0);
        winLoss.Sk(sm0_0.c0(5664));
        winLoss.yj0 = sm0_0.c0(5665);
        winLoss.yB0();
        cn_0 percent = new cn_0(null, 0);
        percent.Sk(sm0_0.c0(5666));
        cn_0 rating = new cn_0(null, 0);
        rating.Sk(sm0_0.c0(5668));
        rank.uf("label-rank");
        title.uf("label-title-icon");
        name.uf("label-name");
        winLoss.uf("label-winloss");
        percent.uf("label-winpercent");
        rating.uf("label-rating");
        fy_2 panel = new fy_2();
        panel.WQ(new Hm0(panel));
        panel.x40(new I7(panel));
        panel.pJ0.X20(new I7(panel).LPt3(new le0_2[] { rank, name, winLoss, percent, rating }));
        panel.L4.X20(new Hm0(panel).LPt3(new le0_2[] { rank, name, winLoss, percent, rating }));
        ArrayList<id_0> rows = new ArrayList<>();
        if (entries == null) {
            cn_0 empty = new cn_0(null, 0);
            empty.Sk(sm0_0.c0(5582));
            panel.pJ0.X20(panel.C7(new le0_2[] { empty }));
            panel.L4.X20(panel.hb(new le0_2[] { empty }));
        } else {
            Collections.addAll(rows, entries);
        }
        for (id_0 entry : rows) {
            cn_0 rankValue = new cn_0(null, 0);
            rankValue.Sk(sm0_0.c0(5663));
            OT icon;
            if (tw0_0.kz0()) {
                icon = new OT(48, 48, entry.EO);
                icon.J60.Ta = 2;
                icon.Te0(-34, -31);
            } else {
                icon = new OT(24, 24, entry.EO);
            }
            cn_0 nameValue = new cn_0(null, 0);
            nameValue.Sk(sm0_0.c0(9155));
            int wins = entry.Hr0;
            int losses = entry.Mg0;
            cn_0 winLossValue = new cn_0(null, 0);
            winLossValue.Sk(new StringBuilder().append(wins).append(" / ").append(losses).toString());
            cn_0 percentValue = new cn_0(null, 0);
            percentValue.Sk(sm0_0.c0(5666));
            cn_0 ratingValue = new cn_0(null, 0);
            ratingValue.Sk(sm0_0.c0(5668));
            rankValue.uf("label-rank-value");
            nameValue.uf("label-name-value");
            winLossValue.uf("label-winloss-value");
            percentValue.uf("label-winpercent-value");
            ratingValue.uf("label-rating-value");
            rankValue.Sk(Integer.toString(entry.ML));
            nameValue.Sk(entry.EO.DR);
            StringBuilder text = new StringBuilder();
            DecimalFormat formatter = Bk0;
            percentValue.Sk(text.append(formatter.format((double) wins / (double) (wins + losses) * 100.0)).append("%").toString());
            ratingValue.Sk(formatter.format((double) entry.UI0));
            panel.pJ0.X20(new I7(panel).LPt3(new le0_2[] { rankValue, icon, nameValue, winLossValue, percentValue, ratingValue }));
            panel.L4.X20(new Hm0(panel).LPt3(new le0_2[] { rankValue, icon, nameValue, winLossValue, percentValue, ratingValue }));
        }
        qi0.Sk(sm0_0.wa0(5650, X50.format(Long.valueOf((long) updated * 1000L))));
        cOn.AH0(panel);
    }

    public final void ic0(short total, byte page, ub_0[] entries) {
        cn_0 battle = new cn_0(null, 0);
        battle.Sk(sm0_0.c0(5659));
        xe_1 tier = new xe_1(sm0_0.c0(5669));
        xe_1 duration = new xe_1(sm0_0.c0(5661));
        xe_1 rating = new xe_1(sm0_0.c0(5668));
        cn_0 versus = new cn_0(null, 0);
        versus.Sk("");
        battle.uf("label-battle");
        tier.uf("label-tier");
        tier.RR(() -> bf0(total, page, entries));
        rating.uf("label-rating");
        rating.RR(() -> IR(rating, total, page, entries));
        duration.uf("label-duration");
        duration.RR(() -> mm(total, page, entries));
        versus.uf("label-vs");
        fy_2 panel = new fy_2();
        panel.WQ(new Hm0(panel));
        panel.x40(new I7(panel));
        panel.pJ0.X20(new I7(panel).LPt3(new le0_2[] { battle, tier, rating, duration, versus }));
        panel.L4.X20(new Hm0(panel).LPt3(new le0_2[] { battle, tier, rating, duration, versus }));
        Sj = new xe_1[entries.length];
        for (int i = 0; i < entries.length; i++) {
            ub_0 entry = entries[i];
            cd0_2[] players = entry.G60;
            String first = players[0].DR;
            String second = players[1].DR;
            if (!tw0_0.kz0()) {
                if (first.length() >= 10) first = new StringBuilder().append(first.substring(0, 8)).append("...").toString();
                if (second.length() >= 10) second = new StringBuilder().append(second.substring(0, 8)).append("...").toString();
            }
            OT firstIcon;
            OT secondIcon;
            if (tw0_0.kz0()) {
                firstIcon = new OT(50, 36, players[0]);
                secondIcon = new OT(50, 36, players[1]);
                firstIcon.J60.Ta = 2;
                firstIcon.Te0(-32, -36);
                secondIcon.J60.Ta = 2;
                secondIcon.Te0(-32, -36);
            } else {
                firstIcon = new OT(21, 24, players[0]);
                secondIcon = new OT(21, 24, players[1]);
                secondIcon.Te0(-17, -12);
                firstIcon.Te0(-17, -12);
            }
            cn_0 firstName = I5.df(null, 0, first);
            cn_0 secondName = I5.df(null, 0, second);
            cn_0 vs = new cn_0(null, 0);
            vs.Sk(sm0_0.c0(5024));
            firstName.yj0 = players[0].DR;
            firstName.yB0();
            secondName.yj0 = players[1].DR;
            secondName.yB0();
            int minimum = entry.oc;
            cn_0 ratingValue;
            if (minimum < 1) {
                ratingValue = I5.df(null, 0, "--");
            } else {
                ratingValue = new cn_0(null, 0);
                ratingValue.Sk(new StringBuilder().append(minimum).append("+").toString());
            }
            av_1 matchTier = entry.ei;
            int tierText = matchTier == av_1.oq0 || matchTier == av_1.op ? 5776 : matchTier.Lpt2.Hv0;
            cn_0 tierValue = new cn_0(null, 0);
            tierValue.Sk(sm0_0.c0(tierText));
            cn_0 elapsed = new cn_0(null, 0);
            elapsed.Sk(tx_1.HU((int) (System.currentTimeMillis() / 1000L) - entry.PF0, 1));
            Sj[i] = new xe_1("\u27a4");
            Sj[i].uf("button-symbol");
            Sj[i].RR(() -> vD0(entry));
            firstName.uf("label-name-spectate-value-button");
            secondName.uf("label-name-spectate-value-button");
            vs.uf("label-vs-value");
            tierValue.uf("label-tier-value");
            ratingValue.uf("label-rating-value");
            elapsed.uf("label-duration-value");
            panel.pJ0.X20(new I7(panel).LPt3(new le0_2[] { firstIcon, firstName, vs, secondIcon, secondName, tierValue, ratingValue, elapsed, Sj[i] }));
            panel.L4.X20(new Hm0(panel).LPt3(new le0_2[] { firstIcon, firstName, vs, secondIcon, secondName, tierValue, ratingValue, elapsed, Sj[i] }));
        }
        if (entries.length < 1) {
            cn_0 empty = new cn_0(null, 0);
            empty.Sk(sm0_0.c0(5662));
            empty.uf("label-name");
            panel.pJ0.X20(new I7(panel).LPt3(new le0_2[] { empty }));
            panel.L4.X20(new Hm0(panel).LPt3(new le0_2[] { empty }));
        }
        h00.AH0(panel);
    }

    public final void mm(short total, byte page, ub_0[] entries) {
        Comparator comparator = ub_0.CQ;
        ao = ao == comparator ? comparator.reversed() : comparator;
        D3(total, page, entries);
    }

    public final void IR(xe_1 button, short total, byte page, ub_0[] entries) {
        Comparator comparator = ub_0.iu0;
        ao = ao == comparator ? comparator.reversed() : comparator;
        D3(total, page, entries);
    }

    public final void bf0(short total, byte page, ub_0[] entries) {
        Comparator comparator = ub_0.Gj;
        ao = ao == comparator ? comparator.reversed() : comparator;
        D3(total, page, entries);
    }

    public final void Zu(com2__3 tab) {
        if (tab == T6.bC) {
            D10 = 0;
            tw0_0.rl.fk0.uQ(new ZI((byte) 0, ""));
        }
    }

    public final void pr0(av_1 tier) {
        LB = tier;
        sq0();
    }

    public final void uS() {
        av_1 tier = LB;
        if (tier == null) {
            TC0(0, (byte) 0, null, null);
            return;
        }
        BR client = tw0_0.rl;
        byte season = (byte) OE0.mu0.Mw0;
        client.fk0.uQ(new Jp0(season, tier));
    }

    public final void kd0(av_1 tier) {
        LB = tier;
        sq0();
    }

    public final void D3(short total, byte page, ub_0[] entries) {
        if (D10 != page) {
            return;
        }
        Arrays.sort(entries, ao);
        UB.JK0(D10, total);
        lg_0.k.lPT5(() -> ic0(total, page, entries));
    }

    public final void TC0(int updated, byte season, av_1 tier, id_0[] entries) {
        if (tier != LB) {
            return;
        }
        if (tier != null && season != OE0.mu0.Mw0) {
            return;
        }
        lg_0.k.lPT5(() -> I00(entries, updated));
    }

    public final void tj() {
        X6 selector = jq0;
        WJ0 team = selector == null ? null : (WJ0) selector.Vh0();
        F8(team, qa0, Lh0, mQ);
    }

    public final void SD0(wf0_1 request) {
        if (I60 != null || fO.uI0()) {
            return;
        }
        zp0_0 event = request.q30;
        mQ = event == null ? N2.CG : event.i30;
        PH = true;
        j0 = false;
        tw0_0.rl.fk0.uQ(new wl_0(request));
        for (mx_1 entry : FR) {
            entry.Y2.Sk("");
            entry.XR = false;
            entry.Jq0();
            event = request.q30;
            if (event != null && event.LB0.equals(entry.RU.LB0)) {
                entry.Y2.Sk(sm0_0.wa0(5505, entry.RU.Y10()));
            }
        }
        for (Object value : EY) {
            P30 entry = (P30) value;
            entry.q70 = true;
            entry.Xr0();
        }
        Cv.SU(sm0_0.c0(5504));
        oU.pw0(true);
        oU.Ll(true);
        zA();
    }

    public final void J8() {
        if (!Cv.OI) {
            return;
        }
        if (I60 == null && !fO.uI0() && !PH) {
            BU owner = NG;
            Yl frame = owner.Vi0;
            if (frame != null) {
                frame.xe0();
                owner.Vi0 = null;
            }
            tw0_0.rl.fk0.uQ(new SA());
            return;
        }
        Qy0 root = Qy0.yI0;
        lpt3__4 dialog = new lpt3__4(sm0_0.c0(5524), this::Ml0, asBridge());
        dialog.D80 = true;
        root.sr0(dialog);
    }

    @Override
    public final void HP(zk0_1 context) {
        if (z00.ty0()) {
            zA();
        }
        super.HP(context);
    }

    @Override
    public final void lt0() {
        if (tw0_0.kz0() && !Hn0.eE) {
            VB();
            oY(Em0.Mx, Em0.OB);
        } else {
            super.lt0();
        }
    }

    @Override
    public final void K8() {
        super.K8();
        jZ();
    }

    @Override
    public final void C(zk0_1 context) {
        if (w6() == null) {
            lpt6__0.v90(this);
        } else {
            lpt6__0.v90(w6());
        }
    }

    public final void cx(int row, int column) {
        if (row < 0) row = 0;
        xe_1[][] buttons = LP;
        if (row >= buttons.length) row = buttons.length - 1;
        if (column < 0) column = 0;
        xe_1[] selected = buttons[row];
        if (column >= selected.length) column = selected.length - 1;
        xe_1 button;
        if (column < 0 || column >= selected.length || !selected[column].eE) {
            button = null;
        } else {
            a50 = column;
            n10 = row;
            button = w6();
        }
        if (button == null) return;
        if (w6() == null) return;
        lpt6__0.v90(w6());
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            if (Qy0.af(this)) {
                return super.nd0(event);
            }
            int key = event.finally$;
            if (T6.Bb() == 0) {
                rp_0 binding = rp_0.I90;
                int initialized = dw_2.ff;
                if (binding != null && binding.Ov(key)) {
                    cx(n10, a50 - 1);
                    return true;
                }
                binding = rp_0.Ni;
                if (binding != null && binding.Ov(key)) {
                    cx(n10, a50 + 1);
                    return true;
                }
                binding = rp_0.synchronized$;
                if (binding != null && binding.Ov(key) && T6.Bb() + 1 < T6.g6.size()) {
                    P8 tabs = T6;
                    int index = tabs.Bb() + 1;
                    tabs.Zd((com2__3) tabs.g6.get(index));
                    return true;
                }
                binding = rp_0.sJ0;
                if (binding != null && binding.Ov(key)) {
                    if (w6() != null) {
                        a7_0.bH(w6().ER.Fc0);
                    }
                    return true;
                }
                binding = rp_0.nK0;
                if (binding != null && binding.Ov(key)) {
                    J8();
                    return true;
                }
            } else {
                rp_0 binding = rp_0.kC0;
                int initialized = dw_2.ff;
                if (binding != null && binding.Ov(key) && T6.Bb() > 0) {
                    P8 tabs = T6;
                    int index = tabs.Bb() - 1;
                    tabs.Zd((com2__3) tabs.g6.get(index));
                    return true;
                }
                binding = rp_0.synchronized$;
                if (binding != null && binding.Ov(key) && T6.Bb() + 1 < T6.g6.size()) {
                    P8 tabs = T6;
                    int index = tabs.Bb() + 1;
                    tabs.Zd((com2__3) tabs.g6.get(index));
                    return true;
                }
                binding = rp_0.nK0;
                if (binding != null && binding.Ov(key)) {
                    J8();
                    return true;
                }
            }
        }
        return super.nd0(event);
    }

    public final xe_1 w6() {
        int row = n10;
        xe_1[][] buttons = LP;
        if (row < buttons.length) {
            int column = a50;
            xe_1[] selected = buttons[row];
            if (column < selected.length) {
                return selected[column];
            }
        }
        return null;
    }

    public final void BH0() {
        Yi0(false, true);
    }

    public final void zp() {
        if (I60 != null || fO.uI0()) {
            Yi0(true, true);
        }
    }

    public final void Fr0(int event) {
        long delay = 250L;
        m0_0 previous = pM;
        if (previous != null) {
            long scheduled;
            synchronized (previous) {
                scheduled = previous.bM0;
            }
            if (scheduled > 0L) {
                delay = pM.LW() - System.nanoTime() / 1000000L;
                pM.ky0();
                pM = null;
            }
        }
        wf_2 task = new wf_2(asBridge());
        float seconds = (float) delay / 1000.0F;
        pM = _finally.HG().dH0(task, seconds);
    }

    public final void F8(WJ0 selection, mi_0[] slots, lq0[] rules, N2[] tiers) {
        wx_2 species = new wx_2();
        wx_2 items = new wx_2();
        N2 forced = null;
        for (N2 tier : tiers) {
            if (tier.LM) forced = tier;
        }
        tx_0 team = selection == null ? null : selection.extends$;
        for (byte i = 0; i < slots.length; i++) {
            VU monster;
            if (team == null) {
                monster = tw0_0.rl.r1(_volatile.BV).Ry0((short) i);
            } else {
                monster = tw0_0.rl.FJ0(team.NG0[i], new _volatile[] { _volatile.BV, _volatile.Bf0 });
            }
            mi_0 slot = slots[i];
            if (slot == null) continue;
            slot.Db(monster);
            int status = 0;
            StringBuilder explanation = new StringBuilder();
            if (monster != null && !monster.I8.vn()) {
                if (forced != null) {
                    if (!monster.SC.lD.contains(forced)) {
                        String message = sm0_0.wa0(5625, sm0_0.c0(forced.R5));
                        if (explanation.length() > 0) explanation.append("\n");
                        explanation.append(message);
                        status = 1;
                    }
                } else if (!S.ZT(monster.SC.gq0, tiers)) {
                    String message = sm0_0.wa0(5629, sm0_0.c0(monster.SC.gq0.R5));
                    if (explanation.length() > 0) explanation.append("\n");
                    explanation.append(message);
                    status = 1;
                }
                GV rule = GV.SE0;
                if (S.ZT(lq0.p8(rule), rules) && species.bL0(monster.I8.Yb0)) {
                    String message = sm0_0.c0(rule.pN);
                    if (explanation.length() > 0) explanation.append("\n");
                    explanation.append(message);
                    status = 1;
                }
                rule = GV.Hg0;
                if (S.ZT(lq0.p8(rule), rules) && monster.I8.rh0() > 0 && items.bL0(monster.I8.rh0())) {
                    String message = sm0_0.c0(rule.pN);
                    if (explanation.length() > 0) explanation.append("\n");
                    explanation.append(message);
                    status = 1;
                }
                if ((forced == null || forced.Zz0 < 1) && monster.I8.wj < 50) {
                    String message = sm0_0.c0(5627);
                    if (explanation.length() > 0) explanation.append("\n");
                    explanation.append(message);
                    status = 1;
                }
                if (S.ZT(lq0.p8(GV.Uu0), rules)) {
                    short[] restricted = lq0.q00;
                    for (int j = 0; j < 2; j++) {
                        short id = restricted[j];
                        if (X4.gA0(monster.I8.rh0()) == id) {
                            String message = sm0_0.c0(GV.Uu0.pN);
                            if (explanation.length() > 0) explanation.append("\n");
                            explanation.append(message);
                            status = 1;
                            break;
                        }
                    }
                }
                for (HZ set : kJ0) {
                    for (Object value : set.x2) {
                        qr_1 restriction = (qr_1) value;
                        CE stats = monster.I8;
                        short form = monster.Aq0();
                        byte mode = restriction.Ee0;
                        if ((mode == 0 || mode == 2) && restriction.Tt(stats, form, rules, tiers)) {
                            String message = sm0_0.c0(5628);
                            if (explanation.length() > 0) explanation.append("\n");
                            explanation.append(message);
                            status = 1;
                            continue;
                        }
                        stats = monster.I8;
                        form = monster.Aq0();
                        if (restriction.Ee0 == 1 && restriction.Tt(stats, form, rules, tiers)) {
                            String message = sm0_0.c0(5630);
                            if (explanation.length() > 0) explanation.append("\n");
                            explanation.append(message);
                            if (status == 0) status = 2;
                        }
                    }
                }
                species.TI0(monster.I8.Yb0);
                items.TI0(monster.I8.rh0());
            } else {
                String message = sm0_0.c0(5626);
                if (explanation.length() > 0) explanation.append("\n");
                explanation.append(message);
                status = -1;
            }
            slot.yj0 = explanation.toString();
            slot.yB0();
            slot.GH0 = 0;
            String style;
            switch (status) {
                case -1: style = "label-monster-slot"; break;
                case 0: style = "label-unbanned-monster"; break;
                case 1: style = "label-banned-monster"; break;
                case 2: style = "label-suspect-testing-monster"; break;
                default: continue;
            }
            if (!style.equals(slot.gW)) {
                slot.uf(style);
                slot.yI();
            }
        }
    }

    public final void zA() {
        long remaining = av_1.TC.vn - System.currentTimeMillis();
        remaining = (long) c8_0.JD0.HY * 1000L + remaining;
        while (remaining < 0L) {
            av_1 ignored = av_1.TC;
            remaining += 120000L;
        }
        remaining /= 1000L;
        if (remaining > 0L) {
            int message = 5502;
            if (remaining > 120L) {
                remaining /= 60L;
                message = 5513;
                if (remaining > 60L) {
                    remaining /= 60L;
                    message = 5514;
                }
            }
            String amount = Long.toString(remaining);
            if (!sE) XJ.Sk(sm0_0.wa0(message, amount));
            w20.SU(sm0_0.wa0(5508, amount));
        }
        if (Hn0.eE) return;
        mx_1[] entries = FR;
        if (entries != null) {
            for (mx_1 entry : entries) {
                zp0_0 event = entry.RU;
                long untilSignup = event.th0 - (long) (event.Fb0 * 60000) - System.currentTimeMillis();
                c8_0 settings = c8_0.JD0;
                untilSignup += (long) (settings.HY * 1000);
                event = entry.RU;
                long duration = (long) (event.Fb0 * 60000);
                long seconds = untilSignup / 1000L;
                if (seconds > 0L) {
                    entry.pi0.aE((float) (duration - untilSignup) / (float) duration);
                    entry.p1.Sk(sm0_0.wa0(5400, tx_1.bp(seconds)));
                } else {
                    long untilStart = event.th0 - System.currentTimeMillis() + (long) (settings.HY * 1000);
                    duration = (long) (entry.RU.Fb0 * 60000);
                    seconds = untilStart / 1000L;
                    if (seconds > 0L) {
                        entry.pi0.aE((float) (duration - untilStart) / (float) duration);
                        entry.p1.Sk(sm0_0.wa0(5401, tx_1.bp(seconds)));
                    } else {
                        duration = 60000L;
                        while (untilStart < 0L) untilStart += 60000L;
                        entry.pi0.aE((float) (duration - untilStart) / (float) duration);
                        entry.p1.Sk(sm0_0.wa0(5502, NumberFormat.getInstance().format(untilStart / 1000L)));
                    }
                }
                entry.Jq0();
            }
        }
        if (!sE) XJ.sn0 = false;
    }
}
