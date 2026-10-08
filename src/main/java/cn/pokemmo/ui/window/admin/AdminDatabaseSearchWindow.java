package cn.pokemmo.ui.window.admin;

import f.*;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 后台道具/技能/地图/文本全库搜索窗口
 *
 * 原混淆类: f.Lt0
 */
public class AdminDatabaseSearchWindow extends R90 {
    public final cg_0 ao0;
    public final fy_2 Hf;
    public final W9 qP;
    public final W9 XE0;
    public final W9 Pj;
    public final W9 RH0;
    public final W9 jh0;
    public final W9 UP;

    public AdminDatabaseSearchWindow(xn0_0 owner) {
        this.qP = new W9();
        this.XE0 = new W9();
        this.Pj = new W9();
        this.RH0 = new W9();
        this.jh0 = new W9();
        this.UP = new W9();

        tk0_0 content = new tk0_0();
        this.ff0(1);
        this.uf("adminframe-nontab");
        this.Hy("Search");
        this.Pb0(() -> owner.u3(this));

        this.ao0 = new cg_0();
        this.ao0.I7();
        this.ao0.Ii(value -> this.Pi());

        xe_1 search = new xe_1("Search");
        search.RR(this::Pi);

        this.Hf = new fy_2();
        this.Hf.WQ(this.Hf.lo0());
        this.Hf.x40(this.Hf.H10());

        this.qP.k50(true);
        this.XE0.k50(true);
        this.Pj.k50(true);
        this.RH0.k50(false);
        this.jh0.k50(false);

        cn_0 items = new cn_0("ITEMS");
        cn_0 moves = new cn_0("MOVES");
        cn_0 monsters = new cn_0(sm0_0.c0(0));
        cn_0 maps = new cn_0("MAPS");
        cn_0 decorations = new cn_0("DECO");
        cn_0 strings = new cn_0("STRINGS");

        this.qP.RR(this::Pi);
        this.XE0.RR(this::Pi);
        this.Pj.RR(this::Pi);
        this.RH0.RR(this::Pi);
        this.jh0.RR(this::Pi);
        this.UP.RR(this::Pi);
        this.UP.k50(false);

        lo0_0 scroll = new lo0_0();
        scroll.AH0(this.Hf);

        tk0_0 tabs = new tk0_0();
        tabs.uw().Xs(5.0F);
        A40 tabLayout = tabs.gg0;
        tabLayout.vx0(this.qP).yi0(items).Yt().im0();
        tabLayout.vx0(this.XE0).yi0(moves).Yt().im0();
        tabLayout.vx0(this.Pj).yi0(monsters).Yt().im0();
        tabLayout.vx0(this.RH0).yi0(maps).Yt().im0();
        tabLayout.vx0(this.jh0).yi0(decorations).Yt().im0();
        tabLayout.vx0(this.UP).yi0(strings).Yt();

        A40 layout = content.gg0;
        content.gg0.yI().ys0(5.0F);
        layout.rx0(45.0F);
        layout.qE0(5.0F);
        layout.Dr0(5.0F);
        layout.qf(5.0F);
        layout.vx0(new le0_2()).yi0(this.ao0).goto$().yi0(search).Pt(150.0F).im0();
        layout.vx0(tabs).Wa0().NA().yi0(scroll).ae0(2).Pt(530.0F).VN(400.0F).pJ0();

        this.SL(content);
        this.Pi();
    }

    public static void fQ(Object value) {
        Z50 map = (Z50) value;
        BR client = tw0_0.rl;
        client.Cp(zo_0.Pk, "//moveto2 " + map.lU.Tz() + " " + map.O60, "", true);
    }

    public static void dh0(byte level, Object value) {
        ZT map = (ZT) value;
        int offset = level == 1 ? 50 : 0;
        String command = CO.go("//moveto ", level, " ")
                .append(map.XL0 + offset).append(" ").append(map.eW).append(" 0 0").toString();
        tw0_0.rl.Cp(zo_0.Pk, command, "", true);
    }

    public static void Qd0(cq_0 pokemon) {
        ox_1 dialog = new ox_1("Whats the level, please?", 3, level -> mB0(pokemon, level));
        dialog.Pw.Gv("100");
        BU.T50.SL(dialog);
        lg_0.k.lPT5(dialog::Uj0);
    }

    public static void mB0(cq_0 pokemon, String level) {
        tw0_0.rl.Cp(zo_0.Pk,
                "//addmonster " + tw0_0.rl.k0.Nw0 + " " + pokemon.dR + " " + level, "", true);
    }

    public static void aB(mc0_1 item) {
        if (item.sh0 > 1 && item.Yt0 != l5_0.Jy) {
            ox_1 dialog = new ox_1("Heh, how much do you want, cheater?", 3, amount -> bc(item, amount));
            dialog.Pw.Gv("100");
            BU.T50.SL(dialog);
            lg_0.k.lPT5(dialog::Uj0);
        } else {
            tw0_0.rl.Cp(zo_0.Pk,
                    "//createitem " + tw0_0.rl.k0.Nw0 + " " + item.Z8 + " 1", "", true);
        }
    }

    public static void bc(mc0_1 item, String amount) {
        tw0_0.rl.Cp(zo_0.Pk,
                "//createitem " + tw0_0.rl.k0.Nw0 + " " + item.Z8 + " " + amount, "", true);
    }

    public static void cS(vk0_1 move, boolean playerIsCaster, boolean allTargets) {
        a10_0 battle = tw0_0.PK0;
        if (battle == null) {
            return;
        }

        byte caster = playerIsCaster ? battle.Ez0() : battle.eI();
        byte target = playerIsCaster ? battle.eI() : battle.Ez0();
        PF attacker = battle.Ce(caster, (byte) 0);
        PF[] targets;
        if (allTargets) {
            targets = battle.wI0[target];
        } else {
            targets = new PF[] {battle.Ce(target, (byte) 0)};
        }

        Oz0 scene = tw0_0.LD0.he0;
        if (scene instanceof vr_1) {
            vr_1 battleScene = (vr_1) scene;
            battleScene.OB0.pZ();
            battleScene.Ow0();
        }

        ML0 renderer = scene.N10;
        MU animation = qk_2.cR.import$(attacker, move.hC0);
        animation.kA0(targets);
        renderer.lZ.add(new kw_0((byte) 0, animation));
    }

    public static xe_1 Jg(Object value) {
        xe_1 button = new xe_1("\u25b8\u25b8");
        if (value instanceof ZT) {
            button.RR(() -> dh0(((ZT) value).OF0, value));
        } else if (value instanceof Z50) {
            button.RR(() -> fQ(value));
        }
        button.uf("button-symbol");
        return button;
    }

    public final void Pi() {
        this.Hf.em();
        Hm0 left = D5.fE0(this.Hf, this.Hf);
        I7 right = XN.sA(this.Hf, this.Hf);

        cn_0 typeHeader = I5.df(null, 0, "Type");
        cn_0 regionHeader = I5.df(null, 0, "Region");
        cn_0 idHeader = I5.df(null, 0, "Id");
        cn_0 nameHeader = new cn_0(null, 0);
        nameHeader.Sk("Name");
        typeHeader.uf("hr-1");
        regionHeader.uf("hr-1");
        idHeader.uf("hr-1");
        nameHeader.uf("hr-5");
        left.X20(new I7(this.Hf).Kn0(typeHeader).Kn0(regionHeader).Kn0(idHeader).Kn0(nameHeader));
        right.X20(D5.fE0(this.Hf, this.Hf).LPt3(new le0_2[] {typeHeader, regionHeader, idHeader, nameHeader}));

        String query = tx_1.J10(((wn0_0) this.ao0.dI0).YA.toString(), true);
        int numericQuery = 0;
        try {
            numericQuery = Integer.parseInt(query);
        } catch (NumberFormatException ignored) {
        }

        if (this.qP.ER.U20()) {
            Iterator iterator = gu0.l2.Pd0.values().iterator();
            while (iterator.hasNext()) {
                mc0_1 item = (mc0_1) iterator.next();
                if (tx_1.qp0(tx_1.J10(sm0_0.c0(item.Nl), false), query) || item.Z8 == numericQuery) {
                    qj_2 addButton = null;
                    if (tw0_0.Yw(8)) {
                        addButton = new qj_2("\u25b6 ADD", 0, 0);
                        addButton.tp0.Nk(new Wr[] {gh_1.aH0.Jg(item.Z8, false)});
                        addButton.RR(() -> aB(item));
                    }
                    this.JG(left, right, "Item", item.PX,
                            fp0_0.uD(new StringBuilder(), item.Z8, ""), sm0_0.c0(item.Nl), addButton);
                }
            }
        }

        if (this.XE0.ER.U20()) {
            M moves = ec0_2.Sx().Com6();
            Iterator iterator = moves.iterator();
            while (iterator.hasNext()) {
                vk0_1 move = (vk0_1) iterator.next();
                if (tx_1.qp0(tx_1.J10(sm0_0.c0(move.bt), false), query) || move.hC0 == numericQuery) {
                    cn_0 type = I5.df(null, 0, "MOVE");
                    cn_0 blank = I5.df(null, 0, "");
                    cn_0 id = new cn_0(null, 0);
                    id.Sk(fp0_0.uD(new StringBuilder(), move.hC0, ""));
                    cn_0 name = new cn_0(null, 0);
                    name.Sk(sm0_0.c0(move.bt));
                    type.uf("tr-1");
                    blank.uf("tr-1");
                    id.uf("tr-1");
                    name.uf("tr-2");
                    name.yj0 = s2_0.Fl0(move, null, -1);
                    name.yB0();

                    if (qk_2.cR.com1.bL0(move.hC0)) {
                        xe_1 playerOne = new xe_1("\u25b8");
                        xe_1 enemyOne = new xe_1("\u25c2");
                        playerOne.uf("button-symbol");
                        enemyOne.uf("button-symbol");
                        playerOne.yj0 = "Plays the battle animation where player is caster and enemy is target.";
                        playerOne.yB0();
                        playerOne.GH0 = 120;
                        enemyOne.yj0 = "Plays the battle animation where enemy is caster and player is target.";
                        enemyOne.yB0();
                        enemyOne.GH0 = 120;
                        enemyOne.RR(() -> cS(move, false, false));
                        playerOne.RR(() -> cS(move, true, false));

                        xe_1 playerAll = new xe_1("\u25b8\u25b8");
                        xe_1 enemyAll = new xe_1("\u25c2\u25c2");
                        playerAll.uf("button-symbol");
                        enemyAll.uf("button-symbol");
                        enemyAll.RR(() -> cS(move, false, true));
                        playerAll.RR(() -> cS(move, true, true));

                        left.X20(XN.sA(this.Hf, this.Hf).LPt3(new le0_2[] {
                                type, playerOne, enemyOne, playerAll, enemyAll, id, name}));
                        right.X20(D5.fE0(this.Hf, this.Hf).LPt3(new le0_2[] {
                                type, playerOne, enemyOne, playerAll, enemyAll, id, name}));
                    } else {
                        left.X20(XN.sA(this.Hf, this.Hf).LPt3(new le0_2[] {type, blank, id, name}));
                        right.X20(D5.fE0(this.Hf, this.Hf).LPt3(new le0_2[] {type, blank, id, name}));
                    }
                }
            }
        }

        if (this.Pj.ER.U20()) {
            Iterator iterator = mp_1.vf0().k2.values().iterator();
            while (iterator.hasNext()) {
                cq_0 pokemon = (cq_0) iterator.next();
                if (tx_1.qp0(tx_1.J10(pokemon.Ay(true), false), query) || pokemon.dR == numericQuery) {
                    qj_2 addButton = null;
                    if (tw0_0.Yw(8)) {
                        addButton = new qj_2("\u25b6 ADD", 0, 0);
                        addButton.RR(() -> Qd0(pokemon));
                    }
                    this.JG(left, right, sm0_0.c0(0), -1,
                            fp0_0.uD(new StringBuilder(), pokemon.dR, ""), pokemon.Ay(true), addButton);
                }
            }
        }

        if (this.RH0.ER.U20()) {
            Iterator iterator = Z0.rb.Oe0().iterator();
            while (iterator.hasNext()) {
                ZT map = (ZT) iterator.next();
                if (tx_1.qp0(tx_1.J10(map.Nw0(), false), query)) {
                    this.JG(left, right, "MAP", map.OF0,
                            map.OF0 * 50 + map.XL0 + "." + map.eW, map.Nw0(), Jg(map));
                }
            }

            Ts townMaps = tw0_0.Ll0.nC0;
            if (townMaps != null) {
                Ao0[] maps = (Ao0[]) townMaps.hJ.Sx0;
                for (Ao0 map : maps) {
                    if (tx_1.qp0(tx_1.J10(map.mn(), false), query)) {
                        this.JG(left, right, "MAP", 3,
                                fp0_0.uD(new StringBuilder(), map.O60, ""), map.mn(), Jg(map));
                    }
                }
            }

            nj0_0 johtoMaps = tw0_0.Ll0.Qz0;
            if (johtoMaps != null) {
                ug_0[] maps = (ug_0[]) johtoMaps.Pq.Sx0;
                for (ug_0 map : maps) {
                    if (tx_1.qp0(tx_1.J10(map.mn(), false), query)) {
                        this.JG(left, right, "MAP", 2,
                                fp0_0.uD(new StringBuilder(), map.O60, ""), map.mn(), Jg(map));
                    }
                }
            }

            UY hoennMaps = tw0_0.Ll0.t1;
            if (hoennMaps != null) {
                Ao0[] maps = (Ao0[]) hoennMaps.Za0.Sx0;
                for (Ao0 map : maps) {
                    if (tx_1.qp0(tx_1.J10(map.mn(), false), query)) {
                        this.JG(left, right, "MAP", 4,
                                fp0_0.uD(new StringBuilder(), map.O60, ""), map.mn(), Jg(map));
                    }
                }
            }
        }

        if (this.jh0.ER.U20()) {
            Iterator iterator = QO.NX.Cs.values().iterator();
            while (iterator.hasNext()) {
                yj_2 decoration = (yj_2) iterator.next();
                if (tx_1.qp0(tx_1.J10(decoration.FL0(), false), query)) {
                    this.JG(left, right, "DECO", 1,
                            fp0_0.uD(new StringBuilder(), decoration.su, ""), decoration.FL0(), null);
                }
            }
        }

        if (this.UP.ER.U20()) {
            int[] ids = sm0_0.cU.Zw0();
            int[] sorted = Arrays.copyOf(ids, ids.length);
            Arrays.sort(sorted);
            for (int id : sorted) {
                String value = (String) sm0_0.cU.get(id);
                if (value == null) {
                    value = yr_1.pG("STRING_", id);
                }
                if (tx_1.qp0(tx_1.J10(value, false), query) || id == numericQuery) {
                    this.JG(left, right, "STRING", -1, id + "", value, null);
                }
            }
        }

        this.Hf.WQ(left);
        this.Hf.x40(right);
    }

    public final void JG(Hm0 left, I7 right, String typeText, int region, String idText,
            String nameText, xe_1 action) {
        cn_0 type = I5.df(null, 0, typeText);
        cn_0 regionText = I5.df(null, 0, "");
        if (region == -1) {
            regionText.Sk("--");
        } else if (region == 10) {
            regionText.Sk("Custom");
        } else {
            regionText.Sk(N50.k10((byte) region));
        }

        cn_0 id = I5.df(null, 0, idText);
        cn_0 name = I5.df(null, 0, nameText);
        if (nameText.length() > 40 && !nameText.contains("\n")) {
            name.yj0 = nameText.replace("|br|", "\n");
            name.yB0();
            name.GH0 = 200;
            name.Sk(nameText.substring(0, 40) + " ...");
        }

        type.uf("tr-1");
        regionText.uf("tr-1");
        id.uf("tr-1");
        name.uf("tr-4");
        if (action != null) {
            left.X20(XN.sA(this.Hf, this.Hf).LPt3(new le0_2[] {type, regionText, id, action})
                    .k5(pa0_0.Vp0, name));
            right.X20(D5.fE0(this.Hf, this.Hf).LPt3(new le0_2[] {type, regionText, id, action, name}));
        } else {
            left.X20(XN.sA(this.Hf, this.Hf).LPt3(new le0_2[] {type, regionText, id, name}));
            right.X20(D5.fE0(this.Hf, this.Hf).LPt3(new le0_2[] {type, regionText, id, name}));
        }
    }

    public final void V10(vk0_1 move) {
        cS(move, true, true);
    }

    public final void yc0(vk0_1 move) {
        cS(move, false, true);
    }

    public final void XG0(vk0_1 move) {
        cS(move, true, false);
    }

    public final void Bf(vk0_1 move) {
        cS(move, false, false);
    }

    public final void uh(int ignored) {
        this.Pi();
    }

    public final void ao0(xn0_0 owner) {
        owner.u3(this);
    }
}
