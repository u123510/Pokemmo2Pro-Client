package cn.pokemmo.pvp.tournament;

import f.*;

import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TournamentMatchmakingCalendar {
    public final kf0_2 QH;
    public fy_2 ao0;
    public lo0_0 xL0;
    public X6 CE;
    public cg_0 wp0;
    public tk0_0 Com9;
    public tk0_0 b4;
    public Comparator gr0;
    public cn_0 Com4;
    public byte oS;
    public short S3;
    public rs_1 hV;
    public final ov0_0 xx0;
    public OG0 RL0;
    public xe_1 XF0;
    public S70 ar;
    public xt_0 y2;
    public final es_1 gp;
    public final OG0 NB0;
    public final byte X20;
    public final HZ[] Cq;
    public final com2__3 GP;
    public int TG;

    public TournamentMatchmakingCalendar(kf0_2 controller, com2__3 screen, OG0 defaultTier, byte monthCount, HZ[] restrictions) {
        this.gr0 = bf0_0.mJ0;
        this.oS = (byte)YearMonth.now(ZoneId.of("UTC")).getMonthValue();
        this.xx0 = new ov0_0();
        this.gp = new es_1();
        this.TG = 0;
        this.QH = controller;
        this.GP = screen;
        this.NB0 = defaultTier;
        this.X20 = monthCount;
        this.Cq = restrictions;
    }

    public static String[] Fo(int count) {
        return new String[count];
    }

    public static boolean qx(String prefix, String text) {
        return text.startsWith(prefix);
    }

    public static String xW(bf0_0 entry) {
        return mp_1.vf0().W50(entry.RX).Ay(false);
    }

    public final void A00(int battles, int appearances, int wins, int leadBattles, int leadWins, int switchBattles, int switchWins,
                          short pokemonId, qp_1[] items, qp_1[] natures, qp_1[] abilities, qp_1[] moves) {
        if (pokemonId != this.S3) {
            return;
        }

        this.clearDetail();
        cq_0 pokemon = (cq_0)mp_1.vf0().k2.get(pokemonId);
        if (pokemon == null) {
            return;
        }

        this.b4 = new tk0_0(new A40());
        cq_0 basePokemon = pokemon.kT == null ? pokemon : pokemon.kT;
        boolean alternateForm = basePokemon != pokemon;
        cn_0 title = new cn_0((KG0)null, 0);
        title.Sk(pokemon.Ay(alternateForm) + " (" + this.CE.Vh0() + ") (" + this.RL0 + ")");
        title.uf("/matchmaking-stats-frame.label-name-monster-tiering");
        this.b4.gg0.vx0(title).ys0(6.0f);

        cn_0 summary = new cn_0((KG0)null, 0);
        summary.Sk(this.statLine(5673, appearances, battles * 2)
            + "\n" + this.statLine(5674, leadWins, leadBattles * 2)
            + "\n" + this.statLine(5675, switchWins, switchBattles * 2)
            + "\n" + this.statLine(5676, wins, appearances));
        summary.uf("/matchmaking-stats-frame.label-name-monster-tiering-value");
        this.b4.gg0.vx0(summary);

        this.addStatSection(5677, abilities, battles);
        this.addStatSection(5678, items, battles);
        this.addStatSection(5679, natures, battles);
        this.addStatSection(5680, moves, battles);

        xe_1 back = new xe_1(sm0_0.c0(5681));
        back.RR(this::r50);
        this.b4.gg0.vx0(back).GD().d80 = 3;
        this.xL0.AH0(this.b4);
        this.xL0.Xr0(0);
        if (this.GP.to0 == this.ao0) {
            this.GP.to0.em();
            this.GP.gn(this.xL0);
        }
    }

    public final le0_2 D50() {
        if (this.b4 != null) {
            return this.b4;
        }
        if (this.Com9 != null) {
            return this.Com9;
        }
        cn_0 loading = new cn_0((KG0)null, 0);
        loading.Sk(sm0_0.c0(74));
        loading.uf("/matchmaking-stats-frame.label-tiering-updated-time");
        lg_0.k.lPT5(this::r7);
        return loading;
    }

    public final fy_2 Ho0(boolean rebuild) {
        this.clearDetail();
        if (this.ao0 == null || rebuild) {
            this.ao0 = new fy_2();
            this.xL0 = new lo0_0((le0_2)null);
            cn_0 loading = new cn_0((KG0)null, 0);
            loading.Sk(sm0_0.c0(74));
            this.xL0.AH0(loading);

            ArrayList months = new ArrayList();
            YearMonth currentMonth = YearMonth.now(ZoneId.of("UTC"));
            this.oS = (byte)currentMonth.getMonthValue();
            for (int index = 0; index < this.X20; index++) {
                months.add(currentMonth.minusMonths(index));
            }
            this.CE = new X6(new pg0_2(months));
            this.CE.Bd(0);
            this.CE.Rm0(this::zo0);
            this.wp0 = new cg_0((KG0)null, new wn0_0());
            this.wp0.NR = true;
            this.wp0.Ii(ignored -> this.Ho0(false));
            if (tw0_0.Xy0()) {
                this.wp0.aO(this::tg0);
            }
            this.ao0.WQ(this.ao0.lo0().Kn0(this.CE).Kn0(this.wp0).Kn0(this.xL0));
            this.gr0 = this.RL0 != null && this.RL0.EE0 == N2.b6 ? bf0_0.MY : bf0_0.mJ0;
        }

        this.Com9 = new tk0_0(new A40());
        this.Com4 = new cn_0((KG0)null, 0);
        this.Com4.Sk(sm0_0.wa0(5650, "-"));
        if (this.hV == null) {
            cn_0 loading = new cn_0((KG0)null, 0);
            loading.Sk(sm0_0.c0(74));
            loading.uf("/matchmaking-stats-frame.label-tiering-updated-time");
            this.Com9.gg0.vx0(loading);
            this.xL0.AH0(this.Com9);
            return this.ao0;
        }

        ArrayList entries = new ArrayList(new M(this.hV.vf0));
        Collections.sort(entries, this.gr0);
        if (entries.isEmpty()) {
            cn_0 empty = new cn_0((KG0)null, 0);
            empty.Sk(sm0_0.c0(5633));
            empty.uf("/matchmaking-stats-frame.label-tiering-updated-time");
            this.Com9.gg0.vx0(empty);
            this.xL0.AH0(this.Com9);
            return this.ao0;
        }

        this.addOverviewHeader();
        boolean canRequestDetails = this.RL0 != null && tw0_0.rl.yn() >= this.RL0.EE0.Au0;
        String filter = ((wn0_0)this.wp0.dI0).YA.toString().toLowerCase();
        int totalAppearances = this.hV.kz0 * 2;
        for (Object object : entries) {
            bf0_0 entry = (bf0_0)object;
            cq_0 pokemon = (cq_0)mp_1.vf0().k2.get(entry.RX);
            if (pokemon == null || !filter.isEmpty() && !pokemon.Ay(false).toLowerCase().startsWith(filter)) {
                continue;
            }
            this.addOverviewEntry(entry, pokemon, canRequestDetails, totalAppearances);
        }

        this.Com4.Sk("\n" + sm0_0.wa0(5672, Integer.toString(this.hV.kz0)) + "\n"
            + sm0_0.wa0(5650, this.QH.Vf0.format(this.hV.gJ * 1000L)));
        this.Com4.uf("/matchmaking-stats-frame.label-tiering-updated-time");
        this.Com9.gg0.Rg().GD().d80 = 99;
        this.Com9.gg0.vx0(this.Com4);
        this.Com9.gg0.EF(20.0f);
        this.xL0.AH0(this.Com9);
        return this.ao0;
    }

    public final void r7() {
        tw0_0.rl.R5((byte)YearMonth.now(ZoneId.of("UTC")).getMonthValue(), this.NB0.cOm4, this.NB0.EE0);
    }

    public final void N60(xe_1 selected, short pokemonId, bf0_0 entry) {
        this.XF0 = selected;
        tw0_0.rl.fk0.uQ(new Rr0(this.oS, this.RL0.cOm4.WW, this.RL0.EE0.yz, pokemonId));
        this.S3 = entry.RX;
    }

    public final void Id() {
        this.toggleSort(bf0_0.MY);
    }

    public final void zg() {
        this.toggleSort(bf0_0.mJ0);
    }

    public final void xG() {
        this.toggleSort(bf0_0.LO);
    }

    public final KZ tg0(String prefix, int cursor, KZ previous) {
        if (this.hV == null) {
            return null;
        }
        String[] values = (String[])new M(this.hV.vf0).stream().map(entry -> TournamentMatchmakingCalendar.xW((bf0_0)entry)).filter(value -> ((String)value).startsWith(prefix)).toArray(TournamentMatchmakingCalendar::Fo);
        return new gj_2(prefix.length(), true, values);
    }

    public final void rv(int ignored) {
        this.Ho0(false);
    }

    public final void zo0() {
        this.oS = (byte)((YearMonth)this.CE.Vh0()).getMonthValue();
        this.XF0 = null;
        this.hV = null;
        tw0_0.rl.R5(this.oS, this.RL0.cOm4, this.RL0.EE0);
    }

    public final void r50() {
        if (this.b4 != null) {
            this.b4.em();
        }
        this.b4 = null;
        this.xx0.Au0.KL0 = new short[10];
        this.xx0.Au0.Pf = 0;
        this.GP.gn(this.Ho0(true));
        lg_0.k.lPT5(this::xJ);
    }

    public final void xJ() {
        this.xL0.FR(component -> this.fy0((le0_2)component));
    }

    public final boolean fy0(le0_2 component) {
        return component instanceof xe_1 && this.XF0 != null && ((xe_1)component).U4.equals(this.XF0.U4);
    }

    public final void Zy0(short pokemonId, short historyId) {
        tw0_0.rl.fk0.uQ(new Rr0(this.oS, this.RL0.cOm4.WW, this.RL0.EE0.yz, pokemonId));
        this.S3 = pokemonId;
        this.xx0.Au0.uo0(historyId);
    }

    public final void xn0(short pokemonId) {
        tw0_0.rl.fk0.uQ(new Rr0(this.oS, this.RL0.cOm4.WW, this.RL0.EE0.yz, pokemonId));
        this.S3 = pokemonId;
        yj_1 history = this.xx0.Au0;
        if (history.Pf <= 0) {
            throw new ArrayIndexOutOfBoundsException(history.Pf - 1);
        }
        history.Pf--;
    }

    private void clearDetail() {
        if (this.b4 != null) {
            this.b4.em();
        }
        if (this.ar != null) {
            this.ar.og.lo0();
        }
        I2 iterator = this.gp.ZD();
        while (iterator.hasNext()) {
            ((fy0_0)iterator.next()).dispose();
        }
        this.y2 = null;
        this.b4 = null;
    }

    private String statLine(int labelId, int value, int total) {
        String percentage = total > 0 ? kf0_2.xD.format((double)value / (double)total * 100.0d) : "0.00";
        return sm0_0.wa0(labelId, percentage) + "  " + value + " / " + total;
    }

    private void addStatSection(int labelId, qp_1[] entries, int total) {
        if (entries == null || entries.length == 0) {
            return;
        }
        tk0_0 section = new tk0_0(new A40());
        cn_0 heading = new cn_0((KG0)null, 0);
        heading.Sk(sm0_0.c0(labelId));
        heading.uf("/matchmaking-stats-frame.label-name-monster-tiering");
        section.gg0.vx0(heading);
        for (qp_1 entry : entries) {
            cn_0 value = new cn_0((KG0)null, 0);
            value.Sk(entry.sJ + " (" + this.percent(entry.tn, total) + "%)");
            value.yj0 = entry.tn + " / " + total;
            value.yB0();
            value.GH0 = 0;
            value.uf("/matchmaking-stats-frame.label-name-monster-tiering-value");
            section.gg0.Rg().Rr0.vx0(value);
        }
        this.b4.gg0.vx0(section).NA();
    }

    private void addOverviewHeader() {
        cn_0 sprite = I5.df((KG0)null, 0, "");
        cn_0 name = new cn_0((KG0)null, 0);
        name.Sk(sm0_0.c0(9155));
        xe_1 primary = new xe_1(this.RL0.EE0 == N2.b6 ? sm0_0.c0(59) : sm0_0.c0(5671));
        primary.RR(this.RL0.EE0 == N2.b6 ? this::xG : this::zg);
        xe_1 winRate = new xe_1(sm0_0.c0(5666));
        winRate.RR(this::Id);
        sprite.uf("/matchmaking-stats-frame.label-title-monster-sprite");
        name.uf("/matchmaking-stats-frame.label-name-tiering-overview");
        primary.uf("/matchmaking-stats-frame.label-winpercent");
        winRate.uf("/matchmaking-stats-frame.label-winpercent");
        this.Com9.gg0.vx0(sprite);
        this.Com9.gg0.vx0(name);
        this.Com9.gg0.vx0(primary);
        this.Com9.gg0.vx0(winRate);
    }

    private void addOverviewEntry(bf0_0 entry, cq_0 pokemon, boolean canRequestDetails, int totalAppearances) {
        cq_0 base = pokemon.kT == null ? pokemon : pokemon.kT;
        boolean alternateForm = base != pokemon;
        le0_2 name;
        if (canRequestDetails) {
            xe_1 button = new xe_1(pokemon.Ay(alternateForm));
            button.RR(() -> this.N60(button, entry.RX, entry));
            button.uf("/matchmaking-stats-frame.label-name-tiering-overview-button");
            name = button;
        } else {
            cn_0 label = new cn_0((KG0)null, 0);
            label.Sk(pokemon.Ay(alternateForm));
            label.uf("/matchmaking-stats-frame.label-name-tiering-overview-label");
            name = label;
        }

        cn_0 appearances = new cn_0((KG0)null, 0);
        if (this.RL0.EE0 == N2.b6) {
            appearances.Sk(entry.SF0 > 0 ? Integer.toString(entry.SF0) : "-");
        } else {
            appearances.Sk(this.percent(entry.lPt1, totalAppearances) + "%");
            appearances.yj0 = entry.lPt1 + " / " + totalAppearances;
            appearances.yB0();
            appearances.GH0 = 0;
        }
        cn_0 wins = new cn_0((KG0)null, 0);
        wins.Sk(kf0_2.xD.format(entry.Av0) + "%");
        wins.yj0 = entry.Kc0 + " / " + entry.lPt1;
        wins.yB0();
        wins.GH0 = 0;
        appearances.uf("/matchmaking-stats-frame.label-winpercent-value");
        wins.uf("/matchmaking-stats-frame.label-winpercent-value");
        this.Com9.gg0.Rg().Rr0.vx0(name);
        this.Com9.gg0.Rg().Rr0.vx0(appearances);
        this.Com9.gg0.Rg().Rr0.vx0(wins);
    }

    private String percent(int value, int total) {
        return total > 0 ? kf0_2.xD.format((double)value / (double)total * 100.0d) : "0.00";
    }

    private void toggleSort(Comparator comparator) {
        this.gr0 = this.gr0 == comparator ? comparator.reversed() : comparator;
        this.Ho0(false);
    }
}
