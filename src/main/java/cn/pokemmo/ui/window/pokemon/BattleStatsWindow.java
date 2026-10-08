package cn.pokemmo.ui.window.pokemon;

import f.*;

/**
 * 战斗数值/属性统计对比窗口
 *
 * 原混淆类: f.WG0
 */
public class BattleStatsWindow extends R90 implements tr_1  {
    public final WG0 asBridge() {
        return (WG0) (Object) this;
    }

    public final BU ws;
    public final P8 LpT2;
    public final fy_2 gU;
    public final fy_2 h2;

    public BattleStatsWindow(BU window, byte mode, AU[] entries) {
        super();
        this.ws = window;
        this.uf("mm-stats-window");
        this.Hy("");
        this.ff0(1);
        this.Pb0(window::Is0);

        P8 tabs = new P8();
        this.LpT2 = tabs;
        tabs.I6(false);

        fy_2 header = new fy_2();
        this.gU = header;
        header.x40(header.lo0().Xq(new ya_1[]{
                header.H10().qd(10).LPt3(new le0_2[]{tabs})
        }));

        lo0_0 statsTitle = new lo0_0();
        statsTitle.uf("stats");
        fy_2 stats = new fy_2();
        this.h2 = stats;
        stats.WQ(stats.hb(new le0_2[]{statsTitle}));
        stats.x40(stats.C7(new le0_2[]{statsTitle}));

        fy_2 table = new fy_2();
        table.WQ(table.lo0());
        table.x40(table.H10());

        int length = entries.length;
        for (int index = 0; index < length; index++) {
            byte currentMode = mode;
            AU entry = entries[index];
            StringBuilder prefixBuilder = new StringBuilder();
            String prefix = g7_0.Zx(12003, prefixBuilder, ":");
            String suffix = "";
            boolean compact = false;
            switch (currentMode) {
                case 17:
                    prefix = g7_0.Zx(12005, new StringBuilder(), ":");
                    compact = true;
                    break;
                case 16:
                    prefix = g7_0.Zx(12007, new StringBuilder(), ":");
                    compact = true;
                    break;
                case 15:
                    suffix = g7_0.Zx(12004, new StringBuilder(), ":");
                    break;
                case 14:
                    prefix = g7_0.Zx(12006, new StringBuilder(), ":");
                    break;
                case 13:
                    compact = true;
                    break;
                case 12:
                case 11:
                default:
                    break;
            }

            String labelText = new StringBuilder()
                    .append(entry.Om() + 100).append(" - ")
                    .append(sm0_0.c0(entry.Fp0() + 5551)).toString();
            if (compact) {
                labelText = sm0_0.c0(entry.Fp0() + 5551);
            }
            cn_0 label = new cn_0(labelText);
            label.uf("label-title-small");
            table.kl0().X20(table.H10().LPt3(new le0_2[]{label}));
            table.nt0().X20(table.lo0().LPt3(new le0_2[]{label}));

            for (int statIndex = 0; statIndex < 2; statIndex++) {
                int titleId;
                if (statIndex == 1) {
                    titleId = 12002;
                } else if (entry.tl() == 1) {
                    titleId = 12000;
                } else {
                    titleId = 12001;
                }
                cn_0 title = new cn_0(sm0_0.wa0(titleId, prefix));
                title.uf("label-title-stat");
                short value = statIndex == 1 ? entry.Hj0() : entry.p();
                cn_0 valueLabel = new cn_0(fp0_0.uD(new StringBuilder(), value, ""));
                valueLabel.uf("label-value-stat");
                table.kl0().X20(table.H10().LPt3(new le0_2[]{title, valueLabel}));
                table.nt0().X20(table.lo0().LPt3(new le0_2[]{title, valueLabel}));

                if (currentMode == 14) {
                    cn_0 extraTitle = new cn_0(sm0_0.wa0(titleId, suffix));
                    extraTitle.uf("label-title-stat");
                    short extraValue = statIndex == 1 ? entry.sR() : entry.IR();
                    cn_0 extraLabel = new cn_0(fp0_0.uD(new StringBuilder(), extraValue, ""));
                    extraLabel.uf("label-value-stat");
                    table.kl0().X20(table.H10().LPt3(new le0_2[]{extraTitle, extraLabel}));
                    table.nt0().X20(table.lo0().LPt3(new le0_2[]{extraTitle, extraLabel}));
                }
            }

            if (mode == 16 || mode == 12) {
                int titleId = mode == 16 ? 12009 : 12010;
                cn_0 title = new cn_0(g7_0.Zx(titleId, new StringBuilder(), ":"));
                title.uf("label-title-stat");
                cn_0 value = new cn_0(new StringBuilder().append(entry.tr()).append("").toString());
                value.uf("label-value-stat");
                table.kl0().X20(table.H10().LPt3(new le0_2[]{title, value}));
                table.nt0().X20(table.lo0().LPt3(new le0_2[]{title, value}));
            }
        }

        statsTitle.AH0(table);
        this.LpT2.Wq(this.h2, nJ0(mode));
        this.gU.SL(table);
    }

    public static String nJ0(int mode) {
        if (mode == 0 || mode == 1 || mode == 2) {
            return sm0_0.c0(12011);
        }
        switch (mode) {
            case 10: return _case.P0.tG((byte) 1, (byte) 121, 0);
            case 11: return _case.P0.tG((byte) 1, (byte) 121, 1);
            case 12: return _case.P0.tG((byte) 1, (byte) 121, 2);
            case 13: return _case.P0.tG((byte) 1, (byte) 121, 3);
            case 14: return _case.P0.tG((byte) 1, (byte) 121, 4);
            case 15: return _case.P0.tG((byte) 1, (byte) 121, 5);
            case 16: return _case.P0.tG((byte) 1, (byte) 121, 6);
            case 17: return _case.P0.tG((byte) 1, (byte) 121, 7);
            default: return "";
        }
    }

    @Override
    public final void K8() {
        this.RY(450, 355);
        this.LpT2.RY(450, 355);
        super.K8();
    }

    @Override
    public final void C(zk0_1 value) {
        lpt6__0.v90(this);
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int id = event.finally$;
            rp_0 state = rp_0.I90;
            if (state != null && state.Ov(id)) {
                this.LpT2.Lb(-1);
                return true;
            }
            state = rp_0.Ni;
            if (state != null && state.Ov(id)) {
                this.LpT2.Lb(1);
                return true;
            }
            state = rp_0.nK0;
            if (state != null && state.Ov(id)) {
                this.ws.Is0();
                return true;
            }
        }
        return super.nd0(event);
    }
}
