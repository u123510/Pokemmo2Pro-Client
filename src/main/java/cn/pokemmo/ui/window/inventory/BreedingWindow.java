package cn.pokemmo.ui.window.inventory;

import f.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 培育屋孵蛋与携带道具窗口
 *
 * 原混淆类: f.di0_1
 */
public class BreedingWindow extends cx_0 implements tr_1  {
    public final di0_1 asBridge() {
        return (di0_1) (Object) this;
    }

    public static int ye0 = -1;
    public static final gn_0 lY;
    public final byte yz;
    public final tk0_0 ev;
    public final tk0_0[] coM1;
    public final tk0_0 BE0;
    public final mi_0[] FF;
    public final cn_0[] na0;
    public final S70[] p;
    public final cn_0[][] x70;
    public final qj_2[][] fh0;
    public final cn_0[][] xH;
    public final cn_0[] yi0;
    public final cn_0[][] Eb;
    public final qj_2[] Gg0;
    public final xe_1[] ny0;
    public final cn_0[] x;
    public final xe_1 Iz0;
    public final Qv0 f7;
    public final Qv0 ve;
    public final Qv0 Rk0;
    public final qj_2[] YW;
    public final X6 d5;
    public final S70 rm0;
    public boolean Ch0;
    public byte zE;
    public int Sk0;
    public int gu;
    public final le0_2[][] Kb;
    public boolean UK0;

    static {
        lY = new gn_0(822083583);
    }

    public BreedingWindow(byte region) {
        super(tw0_0.kz0());
        coM1 = new tk0_0[3];
        FF = new mi_0[3];
        na0 = new cn_0[3];
        p = new S70[3];
        x70 = new cn_0[3][6];
        fh0 = new qj_2[3][6];
        xH = new cn_0[3][4];
        yi0 = new cn_0[3];
        Eb = new cn_0[3][6];
        Gg0 = new qj_2[3];
        ny0 = new xe_1[3];
        x = new cn_0[3];
        Ch0 = false;
        zE = -1;
        Sk0 = 0;
        gu = 0;
        UK0 = false;
        yz = region;
        Pb0(this::qj);
        uf("breed-window");
        Hy(sm0_0.c0(2525));
        ff0(1);
        for (short i = 0; i < FF.length; i++) {
            FF[i] = new dg0_0();
            FF[i].Mj0(true);
            if (i != 1) {
                short index = i;
                FF[i].o60(value -> tk(index, (VU) value));
                FF[i].eL0(value -> rc((mi_0) value));
            }
            FF[i].pw0(i != 1);
            if (i != 1) {
                if (tw0_0.kz0()) FF[i].RR(this::Lp);
                FF[i].tD0(this::Lp);
            }
            Gg0[i] = new qj_2();
            Gg0[i].sl().nq0(24, 24);
            Gg0[i].uf("held-item-icon");
            ny0[i] = new xe_1();
            ny0[i].uf("held-item");
            if (i != 1) {
                short index = i;
                Gg0[i].RR(() -> S40(index));
                ny0[i].RR(() -> qE(index));
            }
            Gg0[i].sl().dA(2.0F);
            na0[i] = new Qv0();
            na0[i].uf("shared-value");
            p[i] = new S70();
            yi0[i] = new Qv0();
            yi0[i].uf("shared-value");
            yi0[i].Bb(150);
            for (int j = 0; j < x70[i].length; j++) {
                x70[i][j] = new Qv0();
                x70[i][j].uf("iv-value");
                x70[i][j].Bb(150);
                fh0[i][j] = new qj_2("", 16, 16);
                fh0[i][j].uf("tooltip-button2");
                fh0[i][j].Bb(0);
                if (tw0_0.kz0()) fh0[i][j].xf0(32, 32);
            }
            for (int j = 0; j < xH[i].length; j++) {
                xH[i][j] = new Qv0();
                xH[i][j].uf("shared-value");
                xH[i][j].Bb(150);
            }
            x[i] = new Qv0();
            x[i].uf("shared-value");
            x[i].Bb(150);
        }
        Iz0 = new xe_1();
        Iz0.Ll(false);
        Iz0.RR(this::G9);
        ev = new tk0_0();
        ev.uw().NA();
        int spacing = tw0_0.kz0() ? 8 : 12;
        for (int i = 0; i < FF.length; i++) {
            tk0_0 group = new tk0_0();
            group.uw().NA();
            group.uf(i == 1 ? "breed-group1" : "breed-group2");
            A40 layout = group.gg0;
            ((A40) ((A40) ((A40) layout.uc()).YI0()).qE0(5.0F)).Dr0(5.0F);
            tk0_0 stats = new tk0_0();
            for (int j = 0; j < Eb[i].length; j++) {
                Eb[i][j] = new Qv0(sm0_0.c0(j + 1830));
                Eb[i][j].uf("iv-slot");
                stats.Xf0(Eb[i][j]);
                stats.Xf0(x70[i][j]);
                if (i == 1) {
                    j1_0 cell = stats.Xf0(fh0[i][j]);
                    if (tw0_0.kz0()) {
                        cell.pJ0();
                        cell.pK0(8.0F);
                    } else {
                        cell.pK0(2.0F);
                    }
                }
                stats.Nu();
            }
            tk0_0 portrait = new tk0_0();
            portrait.Xf0(FF[i]).yi0(p[i]);
            j1_0 cell = layout.vx0(portrait).ru();
            cell = cell.o(tw0_0.kz0() ? 0.0F : 10.0F);
            cell.Wa(tw0_0.kz0() ? 0.0F : 10.0F).im0();
            layout.vx0(na0[i]).im0();
            float gap = (float) spacing;
            layout.vx0(stats).o(gap).Wa(gap).im0();
            for (int j = 0; j < xH[i].length; j++) layout.vx0(xH[i][j]).o(1.0F).im0();
            layout.vx0(yi0[i]).o(gap).im0();
            layout.vx0(x[i]).Wa(5.0F).im0();
            if (i != 1) {
                layout.vx0(Gg0[i]).ru().Wa(5.0F).im0();
                cell = layout.vx0(ny0[i]);
                tw0_0.kz0();
                cell.VN(60.0F).goto$().im0();
            }
            layout.vx0(new le0_2()).p20();
            coM1[i] = group;
            ev.Xf0(group).NA().pJ0();
        }
        dg0_0 spacer = new dg0_0();
        spacer.pw0(false);
        spacer.Ll(false);
        f7 = new Qv0(sm0_0.c0(2519));
        f7.uf("shared-value");
        ve = new Qv0("");
        ve.uf("shared-value");
        YW = new qj_2[3];
        for (byte i = 0; i < YW.length; i++) {
            qj_2 button = new qj_2("");
            button.ne0(new tq_0());
            button.uf("gender-button");
            if (i == 0) button.RR(this::bD);
            else if (i == 1) button.RR(this::op);
            else if (i == 2) button.RR(this::ZK);
            YW[i] = button;
            if (i != 1) {
                Br0 image = button.sl();
                LPT6_[] regions = new LPT6_[1];
                fn_0 icons = fn_0.qz0();
                regions[0] = icons.IE((byte) (i == 0 ? 0 : 1));
                image.r8(regions);
                if (tw0_0.kz0()) {
                    button.sl().dA(3.0F);
                    button.sl().Gy0(12, 10);
                } else {
                    button.sl().dA(2.0F);
                    button.sl().Gy0(7, 7);
                }
            } else {
                button.sl().r8(new LPT6_[] { fn_0.qz0().Ck0() });
                if (tw0_0.kz0()) {
                    button.sl().dA(2.0F);
                    button.sl().Gy0(10, 12);
                } else {
                    button.sl().dA(1.5F);
                    button.sl().Gy0(4, 2);
                }
            }
        }
        Rk0 = new Qv0(gu0.Az0().lPT6((short) 5004).getName());
        Rk0.uf("shared-value");
        d5 = new X6();
        ArrayList<ua_1> items = new ArrayList<>();
        Iq0 seen = new Iq0();
        for (K5 item : tw0_0.rl.Ju().KL()) {
            byte type = item.LW().UH0();
            if (type != -1 && S.J9(item.pm(), n70_0.l3) && seen.YE0(type)) {
                items.add(new ua_1(item.LW()));
            }
        }
        Collections.sort(items);
        int scale = tw0_0.kz0() ? 3 : 2;
        rm0 = new S70(scale * 24, scale * 24);
        pg0_2 options = new pg0_2(items);
        d5.r30(options);
        d5.Rm0(() -> UE0(options, scale));
        if (!items.isEmpty()) d5.Bd(0);
        BE0 = new tk0_0();
        BE0.uf("breed-group1");
        A40 layout = BE0.gg0;
        ((A40) ((A40) layout.uc()).qE0(5.0F)).Dr0(5.0F);
        int span = YW.length;
        layout.vx0(spacer).ae0(span).o(20.0F).im0();
        layout.vx0(f7).ae0(span).im0();
        for (qj_2 button : YW) layout.vx0(button);
        layout.Rg();
        layout.vx0(ve).ae0(span).Wa(100.0F).im0();
        layout.vx0(Rk0).ae0(span).im0();
        layout.vx0(rm0).ae0(span).ru().goto$().im0();
        layout.vx0(d5).goto$().Wa(15.0F).ae0(span).im0();
        layout.vx0(Iz0).goto$().ae0(span).im0();
        layout.vx0(new le0_2()).p20();
        ev.Xf0(BE0).NA().p20();
        SL(ev);
        Kb = new le0_2[][] {
                { FF[0], FF[2], YW[0], YW[1], YW[2] },
                { null, null, d5 },
                { null, null, Iz0 }
        };
    }

    public static boolean Eg(wx_2 items, K5 item) {
        return items.bL0(X4.gA0(item.nn.wQ));
    }

    public static void Xk0(VU monster, K5 item) {
        BR client = tw0_0.rl;
        CH0 id = monster.pu;
        short held = item == null ? 0 : item.nn.wQ;
        _volatile storage = monster.I8.JF;
        client.fk0.uQ(new SF0(storage, id, held));
    }

    public final void HC0(short index) {
        VU monster = FF[index].AG;
        if (monster == null) return;
        wx_2 items = new wx_2();
        items.W30(n70_0.Iz);
        Vt0 menu = pv0_0.De0(value -> Xk0(monster, (K5) value), value -> Eg(items, (K5) value), true);
        UA.zd(menu, ny0[index]);
    }

    public final void sa0() {
        mi_0[] slots = FF;
        mi_0 first = slots[0];
        VU monster = first.AG;
        if (monster != null && slots[2].AG == null) {
            slots[2].Ll(true);
            if (!mo()) Qy0.yI0.dk(-1, sm0_0.c0(2527));
            else Qy0.yI0.vk(FF[2], sm0_0.c0(2527), pa0_0.L00);
        } else if (monster == null) {
            Qy0.yI0.vk(first, sm0_0.c0(2526), pa0_0.L00);
        }
        if (FF[2].AG != null) {
            Qy0.yI0.zm0();
            BR client = tw0_0.rl;
            slots = FF;
            CH0 firstId = slots[0].AG.pu;
            CH0 secondId = slots[2].AG.pu;
            byte gender = zE;
            client.fk0.uQ(new cp_2(gender, firstId, secondId));
            SK();
        }
    }

    public final void lx(String message) {
        if (message != null && !message.isEmpty()) {
            if (tw0_0.kz0()) message = message.trim();
            na0[1].Sk(message);
            na0[1].Ll(true);
            Iz0.pw0(false);
            return;
        }
        Iz0.SU(sm0_0.c0(2528).trim());
        xe_1 button = Iz0;
        String style = "button";
        if (!style.equals(button.gW)) {
            button.uf(style);
            button.yI();
        }
    }

    public final boolean mo() {
        if (tw0_0.kz0()) return false;
        if (ye0 == -1) {
            QT storage = new QT(tw0_0.rl.y8);
            storage.Iu();
            storage.lt0();
            storage.lt0();
            ye0 = storage.Mx;
            storage.Cp0();
        }
        return Mx + ye0 + 10 < tw0_0.LD0.ew0();
    }

    public final void O30(int index, boolean visible) {
        if (index > 0 || visible) FF[index].Ll(visible);
        na0[index].Ll(visible);
        yi0[index].Ll(visible);
        if (!visible) yi0[index].Xr0(null);
        x[index].Ll(visible);
        if (!visible) x[index].Xr0(null);
        for (int i = 0; i < 6; i++) {
            Eb[index][i].Ll(visible);
            x70[index][i].Ll(visible);
            if (index == 1) fh0[index][i].Ll(visible);
            if (!visible) x70[index][i].Xr0(null);
        }
        for (int i = 0; i < 4; i++) {
            xH[index][i].Ll(visible);
            if (!visible) xH[index][i].Xr0(null);
        }
        Gg0[index].Ll(visible);
        ny0[index].Ll(visible);
    }

    public final void SI(boolean visible) {
        boolean previous = Iz0.eE;
        Iz0.Ll(visible);
        if (visible) lx(null);
        f7.Ll(visible && Ch0);
        for (qj_2 button : YW) button.Ll(visible && Ch0);
        ve.Ll(visible && Ch0);
        Rk0.Ll(visible);
        d5.Ll(visible);
        rm0.Ll(visible);
        if (visible && !previous) {
            tk0_0 panel = BE0;
            panel.z70 = new N1(new t5_0(panel), gn_0.TRANSPARENT_WHITE);
            BE0.z70.bT(gn_0.WHITE, 333);
        }
    }

    public final void SK() {
        FF[1].Db(null);
        p[1].og.lo0();
        tk0_0 panel = coM1[1];
        if (panel.z70 == null) panel.z70 = new N1(new t5_0(panel), gn_0.WHITE);
        coM1[1].z70.bT(lY, 50);
        Iz0.pw0(false);
    }

    public final void cn() {
        yi0[1].yI();
        x[1].yI();
    }

    public final void lp(int index) {
        xH[1][index].yI();
    }

    public final void PRN(gc_2 stat) {
        x70[1][stat.CoM2].yI();
    }

    public final void zF0() {
        QT storage = Qy0.yI0.zK0.OJ;
        if (mo()) {
            storage.A20(pa0_0.Ol, -Mx / 2, 0);
            E40(storage.A20 + storage.Mx + 5, storage.SB0);
            NK box = storage.Uc0();
            box.EP(box.yM);
        } else {
            storage.vf(pa0_0.Ol);
        }
    }

    public final void GD() {
        CH0[] parents = new CH0[2];
        mi_0[] slots = FF;
        VU first = slots[0].AG;
        if (first == null) {
            qj();
            return;
        }
        parents[0] = first.I8.YD0;
        VU second = slots[2].AG;
        if (second == null) {
            qj();
            return;
        }
        parents[1] = second.I8.YD0;
        byte gender = zE;
        byte item = -1;
        ol0_2 selection = d5.mu0;
        int index = selection.Mw0;
        if (index >= 0) item = ((ua_1) selection.KB.YS(index)).G9.Bk0;
        BR client = tw0_0.rl;
        byte region = yz;
        client.NF0.TY.ng0();
        client.fk0.uQ(new M60(region, parents, gender, item));
        BU owner = BU.T50;
        di0_1 frame = owner.vs0;
        if (frame != null) {
            frame.xe0();
            owner.vs0 = null;
        }
    }

    public final void UE0(pg0_2 options, int scale) {
        ua_1 item = (ua_1) options.w7.get(d5.mu0.Mw0);
        rm0.og.Nk(new Wr[] { gh_1.aH0.F10(item.G9, false) });
        rm0.og.EJ0 = (float) scale;
    }

    public final void qE(short index) {
        HC0(index);
    }

    public final void S40(short index) {
        HC0(index);
    }

    public final void rc(mi_0 slot) {
        update();
        QT storage = BU.T50.OJ;
        if (storage != null) storage.rt(true);
    }

    public final boolean tk(short index, VU monster) {
        if (monster == null) return true;
        if (monster.I8.vn()) return false;
        mi_0[] slots = FF;
        VU first = slots[0].AG;
        VU second = slots[2].AG;
        if ((index == 2 && first.pu.equals(monster.pu))
                || (index == 0 && second != null && second.pu.equals(monster.pu))) {
            Qy0.yI0.dk(-1, sm0_0.c0(2549));
            return false;
        }
        return true;
    }

    public final void qj() {
        tw0_0.rl.ze0(yz, (byte) 0);
        BU owner = BU.T50;
        di0_1 frame = owner.vs0;
        if (frame != null) {
            frame.xe0();
            owner.vs0 = null;
        }
    }

    public final void G9() {
        mi_0[] slots = FF;
        VU first = slots[0].AG;
        VU result = slots[1].AG;
        VU second = slots[2].AG;
        if (result == null || first == null || second == null) return;
        short species = result.I8.IB;
        if (species == first.I8.IB && species == second.I8.IB) {
            Oe0();
            return;
        }
        StringBuilder warnings = new StringBuilder();
        boolean firstWarning = !result.I8.ca() && (first.I8.ca() || second.I8.ca());
        boolean secondWarning = !result.I8.aR() && (first.I8.aR() || second.I8.aR());
        boolean thirdWarning = !result.I8.aUX() && (first.I8.aUX() || second.I8.aUX());
        if (!firstWarning && !secondWarning && !thirdWarning) {
            Oe0();
            return;
        }
        if (firstWarning) warnings.append("- ").append(sm0_0.c0(2521)).append("\n");
        if (secondWarning) warnings.append("- ").append(sm0_0.c0(2522)).append("\n");
        if (thirdWarning) warnings.append("- ").append(sm0_0.c0(2523)).append("\n");
        Qy0 root = Qy0.yI0;
        lpt3__4 dialog = new lpt3__4(sm0_0.Bx(2524, new String[] { result.na0(), warnings.toString() }), this::Oe0, Iz0);
        showWarning(root, dialog);
    }

    public final void Oe0() {
        mi_0[] slots = FF;
        VU first = slots[0].AG;
        VU second = slots[2].AG;
        if (first == null || second == null) return;
        CE other = second.I8;
        other.getClass();
        List<QL> shared = Arrays.stream(first.I8.bG0).filter(other::dO).collect(Collectors.toList());
        if (!shared.isEmpty()) {
            String names = shared.stream().map(QL::toString).collect(Collectors.joining(", "));
            Qy0 root = Qy0.yI0;
            lpt3__4 dialog = new lpt3__4(sm0_0.wa0(2543, names), this::HD, Iz0);
            showWarning(root, dialog);
        } else {
            HD();
        }
    }

    private static void showWarning(Qy0 root, lpt3__4 dialog) {
        dialog.D80 = true;
        dialog.vI0 = 2000;
        dialog.A00 = System.currentTimeMillis() + 2000L;
        ae0_1 progress = new ae0_1();
        dialog.yp0 = progress;
        dialog.u20.F9(dialog.u20.fU(), progress);
        dialog.gY.pw0(false);
        lpt3__4 previous = root.Ba0;
        if (previous != null) previous.xe0();
        root.Ba0 = dialog;
        dialog.uf("confirm-widget-warning");
        root.F9(root.fU(), dialog);
    }

    public final void HD() {
        Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(16779082), this::GD, Iz0));
    }

    @Override
    public final void C(zk0_1 context) {
        super.C(context);
        for (int i = 0; i < FF.length; i++) O30(i, false);
        SI(false);
    }

    public final void x00() {
        if (mo()) Lp();
        if (FF[0].AG == null) {
            lg_0.k.lPT5(this::sa0);
            lg_0.k.lPT5(this::ow);
        }
    }

    @Override
    public final void N00(zk0_1 context) {
        super.N00(context);
        Qy0.yI0.zm0();
        BU.T50.Nc0(false);
        Dt0 application = lg_0.k;
        wg0_0 panel = BU.T50.package$;
        panel.getClass();
        application.lPT5(panel::GA0);
    }

    public final void Lp() {
        if (Qy0.yI0.zK0.OJ == null) BU.T50.Nc0(true);
        if (!mo()) Qy0.yI0.zm0();
        lg_0.k.lPT5(this::zF0);
    }

    public final void update() {
        sa0();
        for (int i = 0; i < FF.length; i++) {
            if (i == 1) continue;
            VU monster = FF[i].AG;
            if (monster != null) {
                if (monster.I8.rh0() > 0) {
                    mc0_1 item = gu0.l2.lPT6(monster.I8.rh0());
                    xe_1 label = ny0[i];
                    label.kW = true;
                    if (label.Sf) label.Zl0 = true;
                    label.SU(sm0_0.wa0(5056, sm0_0.c0(item.Nl)));
                    ny0[i].yj0 = lb0_2.Sp0(item, true, false);
                    ny0[i].yB0();
                    ny0[i].GH0 = 200;
                    Gg0[i].tp0.Nk(new Wr[] { gh_1.aH0.F10(item, false) });
                    Gg0[i].yj0 = lb0_2.Sp0(item, true, false);
                    Gg0[i].yB0();
                    Gg0[i].GH0 = 200;
                } else {
                    xe_1 label = ny0[i];
                    label.kW = true;
                    if (label.Sf) label.Zl0 = true;
                    label.SU(sm0_0.wa0(5056, sm0_0.c0(nf0_0.Po)));
                    ny0[i].yj0 = null;
                    ny0[i].yB0();
                    Gg0[i].tp0.lo0();
                    Gg0[i].yj0 = null;
                    Gg0[i].yB0();
                }
                na0[i].Sk(monster.na0());
                if (monster.Dg0() != -1) {
                    p[i].og.r8(new LPT6_[] { fn_0.qz0().n50[monster.Dg0()] });
                    Br0 icon = p[i].og;
                    icon.EJ0 = 2.0F;
                    if (tw0_0.kz0()) {
                        icon.gY = 4;
                        icon.a4 = -33;
                    } else {
                        icon.gY = 0;
                        icon.a4 = -20;
                    }
                } else {
                    p[i].og.lo0();
                }
                for (gc_2 stat : gc_2.ME) {
                    if (!stat.j8) x70[i][stat.CoM2].Sk(new StringBuilder().append(monster.I8.RI(stat)).append("").toString());
                }
                for (int j = 0; j < 4; j++) {
                    if (monster.I8.Gu[j] == 0) xH[i][j].Sk("-");
                    else xH[i][j].Sk(sm0_0.c0(((vk0_1) ec0_2.Sx().f4.f5(monster.I8.Gu[j])).bt));
                }
                yi0[i].Sk(new StringBuilder().append(sm0_0.c0(monster.I8.yb.f10 + 180000)).append("").toString());
                x[i].Sk(sm0_0.wa0(2539, monster.I8.Ql0()));
                O30(i, true);
            } else {
                zE = -1;
                p[i].og.lo0();
                Gg0[i].yj0 = null;
                Gg0[i].yB0();
                ny0[i].yj0 = null;
                ny0[i].yB0();
            }
        }
    }

    public final void xJ0(CH0[] parents, boolean valid, short species, byte form, kb_0[] stats,
            rz_0[] natures, short[] moves, byte[] moveSources, byte ownerStatus, short heldItem,
            boolean chooseGender, int maleCost, int femaleCost) {
        VU first = FF[0].AG;
        if (first == null || !first.pu.equals(parents[0])) return;
        VU second = FF[2].AG;
        if (second == null || !second.pu.equals(parents[1])) return;
        if (!valid) {
            if (!mo()) {
                BU.T50.Nc0(false);
                if (!tw0_0.kz0()) vf(pa0_0.Ol);
                lpt6__0.v90(A30());
            }
            O30(1, false);
            SK();
            lx(sm0_0.c0(2529));
            na0[1].Ll(true);
            coM1[1].z70.bT(lY, 0);
            coM1[1].z70.bT(gn_0.WHITE, 300);
            return;
        }
        coM1[1].z70.bT(lY, 0);
        coM1[1].z70.bT(gn_0.WHITE, 300);
        Iz0.pw0(true);
        if (!mo()) {
            BU.T50.Nc0(false);
            if (!tw0_0.kz0()) vf(pa0_0.Ol);
        }
        lpt6__0.v90(A30());
        Ch0 = chooseGender;
        if (!chooseGender) zE = -1;
        f7.Ll(chooseGender);
        ve.Ll(chooseGender);
        for (qj_2 button : YW) {
            button.Ll(chooseGender);
            button.ER.lK0(false);
        }
        int cost = maleCost;
        byte gender = zE;
        if (gender == 0) {
            YW[0].ER.lK0(true);
        } else if (gender == 1) {
            YW[2].ER.lK0(true);
            cost = femaleCost;
        } else {
            YW[1].ER.lK0(true);
            cost = 0;
        }
        ve.Sk(sm0_0.wa0(2520, NumberFormat.getInstance().format((long) cost)));
        boolean bothSpecial = FF[0].AG.I8.I() && FF[2].AG.I8.I();
        CE preview = new CE(CH0.j1);
        preview.Yb0 = species;
        if (form > -1) preview.ZF0 = form;
        preview.n7(heldItem);
        if (FF[0].AG.I8.I() && FF[2].AG.I8.I()) {
            preview.IB = (short) (preview.IB | 1);
            preview.N00 = QL.N8;
        }
        for (QL flag : FF[0].AG.I8.bG0) preview.w40(flag);
        for (QL flag : FF[2].AG.I8.bG0) preview.w40(flag);
        VU result = new VU(preview);
        byte displayedGender = result.Dg0();
        if (chooseGender) displayedGender = zE;
        FF[1].Db(result);
        if (displayedGender == -1 && !chooseGender) {
            p[1].og.lo0();
        } else if (displayedGender == -1) {
            if (tw0_0.kz0()) {
                p[1].og.r8(new LPT6_[] { fn_0.qz0().bJ0 });
                Br0 icon = p[1].og;
                icon.EJ0 = 1.0F;
                icon.gY = 4;
                icon.a4 = -34;
            } else {
                p[1].og.r8(new LPT6_[] { fn_0.qz0().return$ });
                Br0 icon = p[1].og;
                icon.EJ0 = 2.0F;
                icon.gY = 0;
                icon.a4 = -24;
            }
        } else {
            p[1].og.r8(new LPT6_[] { fn_0.qz0().n50[displayedGender] });
            if (tw0_0.kz0()) {
                Br0 icon = p[1].og;
                icon.EJ0 = 2.0F;
                icon.gY = 4;
                icon.a4 = -33;
            } else {
                Br0 icon = p[1].og;
                icon.EJ0 = 2.0F;
                icon.gY = 0;
                icon.a4 = -20;
            }
        }
        cq_0 definition = (cq_0) mp_1.vf0().k2.get(species);
        if (definition == null) na0[1].Sk("???");
        else na0[1].Sk(definition.Ay(false));
        DecimalFormat valueFormat = new DecimalFormat("00.#");
        DecimalFormat probabilityFormat = new DecimalFormat("#.0");
        for (gc_2 stat : gc_2.fe0) {
            if (stat.j8) continue;
            x70[1][stat.CoM2].uf(stats[stat.v10].Dq ? "iv-value-green" : "iv-value");
            lg_0.k.lPT5(() -> PRN(stat));
            StringBuilder description = new StringBuilder();
            TreeSet<Byte> values = new TreeSet<>();
            ArrayList outcomes = stats[stat.v10].UH;
            Collections.sort(outcomes);
            zc0_1 tooltip = new zc0_1();
            String explanation = sm0_0.c0(bothSpecial ? 2548 : 2547);
            cn_0 heading = new cn_0(null, 0);
            heading.Sk(explanation);
            tooltip.qG0(new le0_2[] { heading });
            ha0_1 probabilities = new ha0_1();
            for (Object value : outcomes) {
                a40_0 outcome = (a40_0) value;
                byte iv = outcome.hV;
                float probability = outcome.mh;
                int index = probabilities.Lq0(iv);
                boolean inserted;
                if (index < 0) {
                    index = -index - 1;
                    probabilities.US[index] += probability;
                    inserted = false;
                } else {
                    probabilities.US[index] = probability;
                    inserted = true;
                }
                byte stored = probabilities.Ut[index];
                if (inserted) probabilities.OC0(probabilities.Uq);
            }
            boolean duplicates = probabilities.Rv != outcomes.size();
            for (Object value : outcomes) {
                a40_0 outcome = (a40_0) value;
                cn_0 origin = new cn_0(null, 0);
                origin.Sk(sm0_0.c0(outcome.bG));
                origin.uf("label-tooltip");
                cn_0 separator = new cn_0(null, 0);
                separator.Sk(" | ");
                int index = probabilities.bf0(outcome.hV);
                float total = index < 0 ? probabilities.DM : probabilities.US[index];
                String combined = LW.LH0(total, outcome.mh) ? "" : new StringBuilder(" (=")
                        .append(probabilityFormat.format((double) total)).append("%)").toString();
                cn_0 totalLabel = new cn_0(null, 0);
                totalLabel.Sk(combined);
                totalLabel.uf("label-tooltip");
                cn_0 chance = new cn_0(null, 0);
                chance.Sk(sm0_0.Bx(2546, new String[] { valueFormat.format((long) outcome.hV),
                        probabilityFormat.format((double) outcome.mh) }));
                if (duplicates) tooltip.qG0(new le0_2[] { origin, separator, chance, totalLabel });
                else tooltip.qG0(new le0_2[] { origin, separator, chance });
                values.add(outcome.hV);
                if (description.length() > 1) description.append("\n");
                int message = outcome.bG;
                if (message <= 0) message = 2546;
                description.append(sm0_0.Bx(message, new String[] { valueFormat.format((long) outcome.hV),
                        probabilityFormat.format((double) outcome.mh) }));
            }
            String range;
            if (values.size() == 1) range = new StringBuilder().append(values.first()).append("").toString();
            else if (values.size() > 1) range = new StringBuilder().append(values.first()).append(" - ").append(values.last()).toString();
            else range = "???";
            cn_0 label = x70[1][stat.CoM2];
            if (!range.equalsIgnoreCase(label.j50.toString())) {
                label.Sk(range);
                flash(label);
            }
            short itemId = stats[stat.v10].Qm0;
            if (itemId > 0) {
                mc0_1 item = gu0.l2.lPT6(itemId);
                description.append("\n");
                description.append(sm0_0.wa0(2530, sm0_0.c0(item.Nl)));
                cn_0 held = new cn_0(null, 0);
                held.Sk(new StringBuilder("\n").append(sm0_0.wa0(2530, sm0_0.c0(item.Nl))).toString());
                tooltip.qG0(new le0_2[] { held });
            }
            label.Xr0(tooltip);
            fh0[1][stat.CoM2].yj0 = tooltip;
            fh0[1][stat.CoM2].yB0();
        }
        for (int i = 0; i < 4; i++) {
            cn_0 label = xH[1][i];
            if (moves.length <= i || moves[i] == 0) {
                label.Sk("-");
                flash(label);
                continue;
            }
            ec0_2 definitions = ec0_2.Sx();
            vk0_1 move = (vk0_1) definitions.f4.f5(moves[i]);
            if (move == null) {
                label.Sk("-");
                flash(label);
                continue;
            }
            if (!label.j50.toString().equalsIgnoreCase(sm0_0.c0(move.bt))) {
                label.Sk(sm0_0.c0(move.bt));
                flash(label);
            }
            xH[1][i].uf(moveSources[i] == 0 ? "shared-value" : "shared-value-green");
            xH[1][i].Xr0(sm0_0.c0(moveSources[i] + 2533));
            int index = i;
            lg_0.k.lPT5(() -> lp(index));
        }
        cn_0 natureLabel = yi0[1];
        String natureText;
        if (natures.length < 1) {
            natureText = "???";
            natureLabel.Xr0(sm0_0.c0(2532));
            natureLabel.uf("shared-value");
        } else {
            StringBuilder names = new StringBuilder();
            StringBuilder explanation = new StringBuilder();
            for (int i = 0; i < natures.length; i++) {
                if (i > 0) {
                    names.append(" / ");
                    explanation.append("\n");
                }
                names.append(sm0_0.c0(natures[i].f10 + 180000));
                explanation.append(new StringBuilder().append(sm0_0.c0(natures[i].f10 + 180000)).append(" - ")
                        .append(probabilityFormat.format(1.0 / (double) natures.length * 100.0)).append("%").toString());
            }
            mc0_1 item = gu0.l2.lPT6((short) 195);
            explanation.append("\n");
            int message = natures.length > 1 ? 2531 : 2530;
            explanation.append(sm0_0.wa0(message, sm0_0.c0(item.Nl)));
            natureText = names.toString();
            natureLabel.Xr0(explanation.toString());
            natureLabel.uf("shared-value-green");
        }
        if (!natureText.equalsIgnoreCase(natureLabel.j50.toString())) {
            natureLabel.Sk(natureText);
            flash(natureLabel);
        }
        x[1].Xr0(null);
        if (ownerStatus == 0) {
            x[1].Sk(sm0_0.wa0(2539, tw0_0.e60.jB0.oc0));
            x[1].uf("shared-value-green");
        } else if (ownerStatus == 1) {
            x[1].Sk(sm0_0.wa0(2539, new StringBuilder().append(tw0_0.e60.jB0.oc0).append(" *").toString()));
            x[1].uf("shared-value");
            x[1].Xr0(sm0_0.c0(2538));
            x[1].GH0 = 150;
        } else {
            x[1].Sk(sm0_0.c0(2540));
            x[1].uf("shared-value");
        }
        lg_0.k.lPT5(this::cn);
        O30(1, true);
        SI(true);
    }

    private static void flash(cn_0 label) {
        N1 animation = new N1(new t5_0(label), gn_0.LIGHTGREEN);
        label.z70 = animation;
        animation.bT(gn_0.WHITE, 750);
    }

    public final void Xs(int row, int column) {
        if (row < 0) row = 0;
        le0_2[][] controls = Kb;
        if (row >= controls.length) row = controls.length - 1;
        if (column < 0) column = 0;
        le0_2[] selected = controls[row];
        if (column >= selected.length) column = selected.length - 1;
        le0_2 widget = selected[column];
        le0_2 target = null;
        if (widget != null && widget.eE) {
            Sk0 = column;
            gu = row;
            target = A30();
        }
        if (target == null) return;
        lpt6__0.v90(A30());
    }

    public final void ow() {
        lpt6__0.v90(A30());
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int key = event.finally$;
            rp_0 binding = rp_0.I90;
            int initialized = dw_2.ff;
            if (binding != null && binding.Ov(key)) {
                le0_2 current = A30();
                X6 selector = d5;
                if (current == selector && selector.OI) {
                    int index = selector.mu0.Mw0;
                    if (index > 0) {
                        selector.Bd(index - 1);
                        return true;
                    }
                }
                if (current == Kb[0][0]) {
                    QT storage = Qy0.yI0.zK0.OJ;
                    if (storage != null) {
                        NK box = storage.Uc0();
                        box.EP(box.yM);
                        return true;
                    }
                }
                Xs(gu, Sk0 - 1);
                return true;
            }
            binding = rp_0.Ni;
            if (binding != null && binding.Ov(key)) {
                if (A30() == d5 && d5.OI) {
                    ol0_2 selection = d5.mu0;
                    if (selection.Mw0 + 1 < selection.KB.ul0()) {
                        d5.Bd(d5.mu0.Mw0 + 1);
                        return true;
                    }
                }
                Xs(gu, Sk0 + 1);
                return true;
            }
            binding = rp_0.kC0;
            if (binding != null && binding.Ov(key)) {
                Xs(gu - 1, Sk0);
                return true;
            }
            binding = rp_0.synchronized$;
            if (binding != null && binding.Ov(key)) {
                Xs(gu + 1, Sk0);
                return true;
            }
            binding = rp_0.sJ0;
            if (binding != null && binding.Ov(key)) {
                if (A30() instanceof dg0_0) {
                    Lp();
                    return true;
                }
                if (A30() != null && A30() instanceof xe_1) {
                    a7_0.bH(((xe_1) A30()).ER.Fc0);
                    return true;
                }
            }
            binding = rp_0.nK0;
            if (binding != null && binding.Ov(key)) {
                mi_0[] slots = FF;
                if (slots[2].AG != null) {
                    Xs(0, 0);
                    SK();
                    FF[2].Db(null);
                    O30(2, false);
                    update();
                    return true;
                }
                if (slots[0].AG != null) {
                    Xs(0, 0);
                    FF[0].Db(null);
                    O30(0, false);
                    update();
                    return true;
                }
                qj();
                return true;
            }
        }
        return super.nd0(event);
    }

    @Override
    public final void aUX(zk0_1 context) {
        for (int i = 0; i < 3; i++) {
        }
        super.aUX(context);
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) kh0();
        super.K8();
        if (!tw0_0.kz0() && !UK0) {
            UK0 = true;
            vf(pa0_0.Ol);
        }
    }

    public final void ZK() {
        if (zE == 1) return;
        zE = 1;
        BR client = tw0_0.rl;
        mi_0[] slots = FF;
        CH0 first = slots[0].AG.pu;
        CH0 second = slots[2].AG.pu;
        client.fk0.uQ(new cp_2((byte) 1, first, second));
        SK();
    }

    public final void op() {
        if (zE == -1) return;
        zE = -1;
        BR client = tw0_0.rl;
        mi_0[] slots = FF;
        CH0 first = slots[0].AG.pu;
        CH0 second = slots[2].AG.pu;
        client.fk0.uQ(new cp_2((byte) -1, first, second));
        SK();
    }

    public final void bD() {
        if (zE == 0) return;
        zE = 0;
        BR client = tw0_0.rl;
        mi_0[] slots = FF;
        CH0 first = slots[0].AG.pu;
        CH0 second = slots[2].AG.pu;
        client.fk0.uQ(new cp_2((byte) 0, first, second));
        SK();
    }

    public final le0_2 A30() {
        return Kb[gu][Sk0];
    }
}
