/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.window.pokemon;

import f.*;

import f.BU;
import f.E00;
import f.P8;
import f.QA;
import f.R90;
import f.V0;
import f.WG0;
import f.XZ;
import f.cn_0;
import f.fy_2;
import f.i70_0;
import f.le0_2;
import f.lo0_0;
import f.lpt6__0;
import f.rp_0;
import f.sm0_0;
import f.tr_1;
import f.ya_1;
import f.zk0_1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from f.b40
 */
/**
 * 队伍与单场战斗能力/回合统计窗口
 *
 * 原混淆类: f.b40_0
 */
public class PartyStatsWindow
extends R90
implements tr_1  {
    public final b40_0 asBridge() {
        return (b40_0) (Object) this;
    }

    public static final SimpleDateFormat i60 = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
    public final BU e7;
    public final P8 bK;
    public final fy_2 KH;
    public final fy_2[] zu;

    public PartyStatsWindow(BU le0_22, int n, V0[] v0Array) {
        this.e7 = le0_22;
        this.uf("mm-stats-window");
        this.Hy("");
        this.ff0(1);
        this.Pb0(le0_22::XV);
        this.bK = new P8();
        this.bK.I6(false);
        this.KH = new fy_2();
        this.KH.x40(XZ.BC0(this.KH.lo0(),
                new ya_1[]{this.KH.H10().qd(10).LPt3(this.bK)}, this.KH)
                .Xq(this.KH.lo0().LPt3(this.bK)));
        this.zu = new fy_2[v0Array.length];
        for (int j = 0; j < v0Array.length; ++j) {
            V0 value = v0Array[j];
            lo0_0 stats = new lo0_0();
            stats.uf("stats");
            cn_0 timestamp = new cn_0(sm0_0.wa0(5650, i60.format((long)n * 1000L)));
            fy_2 row = new fy_2();
            this.zu[j] = row;
            row.WQ(row.hb(stats, timestamp));
            row.x40(row.C7(stats, timestamp));
            fy_2 table = new fy_2();
            table.WQ(table.lo0());
            table.x40(table.H10());
            String turnTitle = sm0_0.c0(12003);
            String valueTitle = null;
            String turnValueTitle = null;
            boolean bl = false;
            switch (value.XT()) {
                case 16: {
                    turnTitle = sm0_0.c0(12005);
                    turnValueTitle = sm0_0.c0(12009);
                    bl = true;
                    break;
                }
                case 15: {
                    turnTitle = sm0_0.c0(12007);
                    bl = true;
                    break;
                }
                case 14: {
                    valueTitle = sm0_0.c0(12004);
                    break;
                }
                case 12: {
                    turnTitle = sm0_0.c0(12008);
                    turnValueTitle = sm0_0.c0(12010);
                    break;
                }
                case 11: {
                    bl = true;
                    break;
                }
            }
            String string = sm0_0.c0(value.a50() + 5540) + " - " + sm0_0.c0(value.FL() + 5571);
            if (bl) {
                string = sm0_0.c0(value.FL() + 5571);
            }
            if (j == 0 || v0Array.length < 3) {
                string = WG0.nJ0(value.XT()) + " " + string;
            }
            cn_0 titleSmall = new cn_0(sm0_0.c0(5663));
            cn_0 title = new cn_0(sm0_0.c0(9155));
            cn_0 turn = new cn_0(turnTitle);
            String secondaryTitle = valueTitle == null ? turnValueTitle : valueTitle;
            cn_0 secondary = new cn_0(secondaryTitle);
            titleSmall.uf("label-title-smallest");
            title.uf("label-title");
            turn.uf("label-turn");
            secondary.uf("label-title-small2");
            table.kl0().X20(table.H10().LPt3(new le0_2[]{titleSmall, title, turn, secondary}));
            table.nt0().X20(table.lo0().LPt3(new le0_2[]{titleSmall, title, turn, secondary}));
            ArrayList<QA> entries = new ArrayList<>(Arrays.asList(value.Cq()));
            for (QA qA : entries) {
                cn_0 count = new cn_0(qA.Cc() + "");
                cn_0 name = new cn_0(qA.x());
                cn_0 turnCount = new cn_0(qA.Hj0() + "");
                cn_0 extra = new cn_0("");
                if (valueTitle != null) {
                    extra.Sk(qA.sR() + "");
                }
                if (turnValueTitle != null) {
                    extra.Sk(qA.tr() + "");
                }
                count.uf("label-value-smallest");
                name.uf("label-name-value");
                turnCount.uf("label-turn-value");
                extra.uf("label-value-small2");
                table.kl0().X20(table.H10().LPt3(new le0_2[]{count, name, turnCount, extra}));
                table.nt0().X20(table.lo0().LPt3(new le0_2[]{count, name, turnCount, extra}));
            }
            if (entries.isEmpty()) {
                cn_0 emptyCount = new cn_0("-");
                cn_0 emptyName = new cn_0(sm0_0.c0(77));
                cn_0 emptyTurn = new cn_0("-");
                cn_0 emptyExtra = new cn_0("");
                if (valueTitle != null) {
                    emptyExtra.Sk("-");
                }
                emptyCount.uf("label-value-smallest");
                emptyName.uf("label-name");
                emptyTurn.uf("label-turn-value");
                emptyExtra.uf("label-value-small2");
                table.kl0().X20(table.H10().LPt3(new le0_2[]{emptyCount, emptyName, emptyTurn, emptyExtra}));
                table.nt0().X20(table.lo0().LPt3(new le0_2[]{emptyCount, emptyName, emptyTurn, emptyExtra}));
            }
            stats.AH0(table);
            this.bK.Wq(this.zu[j], string);
        }
        PartyStatsWindow b40_04 = this;
        b40_04.SL(b40_04.KH);
    }

    @Override
    public final void K8() {
        PartyStatsWindow b40_02 = this;
        b40_02.RY(670, 500);
        b40_02.bK.RY(670, 500);
        super.K8();
    }

    @Override
    public final void C(zk0_1 zk0_12) {
        lpt6__0.v90(this);
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        if (E00.ZU(i70_02.zu) && i70_02.iT()) {
            int n = i70_02.finally$;
            rp_0 rp_02 = rp_0.I90;
            if (rp_02 != null && rp_02.Ov(n)) {
                this.bK.Lb(-1);
                return true;
            }
            rp_02 = rp_0.Ni;
            if (rp_02 != null && rp_02.Ov(n)) {
                this.bK.Lb(1);
                return true;
            }
            rp_02 = rp_0.nK0;
            if (rp_02 != null && rp_02.Ov(n)) {
                this.e7.XV();
                return true;
            }
        }
        return super.nd0(i70_02);
    }
}
