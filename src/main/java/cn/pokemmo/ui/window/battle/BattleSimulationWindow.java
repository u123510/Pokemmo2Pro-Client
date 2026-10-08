/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.window.battle;

import f.*;

import f.org.json.A70;
import f.org.json.ic_1;
import f.org.json.N7;

import f.A40;
import f.Aj;
import f.BR;
import f.CI;
import f.Cq;
import f.Cq0;
import f.Gh0;
import f.KZ;
import f.M30;
import f.P8;
import f.Qy0;
import f.R90;
import f.SQ;
import f.X6;
import f.ZA0;
import f.bt_0;
import f.cg_0;
import f.com2__3;
import f.con__6;
import f.cq_0;
import f.dl_1;
import f.ec0_2;
import f.er_0;
import f.gg_2;
import f.gj_2;
import f.gu0;
import f.hl_2;
import f.ia0_1;
import f.j1_0;
import f.jf0_0;
import f.jg0_1;
import f.kt_2;
import f.ld_2;
import f.le0_2;
import f.lg_0;
import f.mc0_1;
import f.mp_1;
import f.og_0;
import f.on0_0;
import f.pg0_2;
import f.sm0_0;
import f.tk0_0;
import f.tw0_0;
import f.uz0_0;
import f.vk0_1;
import f.vl0_0;
import f.wn0_0;
import f.ws_1;
import f.xe_1;
import f.xn0_0;
import f.yj_1;
import f.yk_0;
import f.yr_1;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;
import org.lwjgl.glfw.GLFW;
import java.lang.reflect.Field;

/**
 * 对战模拟器与技能测试窗口
 *
 * 原混淆类: f.kl0_0
 */
public class BattleSimulationWindow
extends R90 {
    public final kl0_0 asBridge() {
        return (kl0_0) (Object) this;
    }

    public static final dl_1 j60 = Cq0.E1(kl0_0.class);
    public final tk0_0 fm0;
    public bt_0 ti;

    public BattleSimulationWindow() {
        super();
        this.fm0 = new tk0_0();
        this.ti = new bt_0();
        this.fm0.mz0();
        ((A40)this.fm0.gg0.uc()).X0();
        this.ff0(1);
        this.uf("adminframe");
        this.Hy("Battle Simulation");
        this.Pb0(this::YW);
        this.na0();
        this.SL(this.fm0);
    }

    public final tk0_0 Po(int n) {
        on0_0 player = this.ti.XF0[n];
        tk0_0 root = new tk0_0(new A40());
        X6 mode = new X6();
        pg0_2 modes = new pg0_2(battleModes());
        mode.r30(modes);
        mode.hK(player.vx0);
        mode.Rm0(() -> kl0_0.UJ(player, mode));
        root.gg0.vx0(mode);
        root.gg0.Rg();

        og_0 party = new og_0();
        Object partyMode = jg0_1.wk;
        if (party.OA0 != partyMode) {
            party.OA0 = (jg0_1)partyMode;
            ia0_1 layout = party.ms0;
            if (layout.Ox != 1) {
                layout.Ox = 1;
                layout.COm3();
            }
            party.COm3();
        }
        for (int i = 0; i < 6; ++i) {
            final int slotIndex = i;
            if (player.TB0.l90(i)) {
                ((P8)party).Wq(kl0_0.aX((ZA0)player.TB0.get(i)), "Slot " + i);
            } else {
                tk0_0 slot = new tk0_0(new A40());
                xe_1 add = new xe_1("Add " + sm0_0.c0(0));
                add.RR(() -> this.Pt0((P8)party, slotIndex, player));
                le0_2 left = new le0_2(null, false);
                slot.gg0.vx0(left).jQ = new vl0_0(100.0f);
                slot.gg0.Rg();
                slot.gg0.vx0(add);
                slot.gg0.Rg();
                le0_2 right = new le0_2(null, false);
                slot.gg0.vx0(right).jQ = new vl0_0(100.0f);
                ((P8)party).Wq(slot, "Slot " + i);
            }
        }

        er_0 selection = new er_0();
        ld_2 choices = new ld_2();
        selection.private$(choices);
        for (Object value : player.ld) {
            choices.xf0((CI)value);
        }
        yk_0 cursor = new yk_0();
        jf0_0 selectionModel = new jf0_0(cursor);
        if (selection.G00 != selectionModel) {
            if (selection.G00 != null && selection.G00.w9 != null) {
                selection.G00.w9 = null;
                selection.G00.Vg0.cd();
                selection.G00.Vg0.rk = -1;
                selection.G00.Vg0.aW = -1;
            }
            selection.G00 = selectionModel;
            if (selectionModel.w9 != selection) {
                if (selectionModel.w9 != null) {
                    throw new IllegalStateException("selection manager still in use");
                }
                selectionModel.w9 = selection;
                cursor.cd();
                cursor.rk = -1;
                cursor.aW = -1;
            }
        }
        selection.lt0();

        xe_1 skill = new xe_1("Skill");
        xe_1 swap = uz0_0.nJ(skill, () -> this.SC0(cursor, choices, root, selection, player), "Swap");
        xe_1 item = uz0_0.nJ(swap, () -> this.we(cursor, choices, root, selection, player), "Item");
        xe_1 end = uz0_0.nJ(item, () -> this.HJ0(cursor, choices, root, selection, player), "End");
        xe_1 remove = uz0_0.nJ(end, () -> kl0_0.ux0(cursor, choices, root, selection, player), "-");
        remove.RR(() -> kl0_0.Sv0(cursor, choices, root, selection, player));

        root.gg0.vx0(party).Hb0 = 1;
        root.gg0.Rg();
        root.gg0.vx0(selection);
        root.gg0.Rg();
        tk0_0 actions = new tk0_0(new A40());
        actions.gg0.vx0(skill).Rr0.vx0(swap).Rr0.vx0(item).Rr0.vx0(end).Rr0.vx0(remove);
        root.gg0.vx0(actions);
        root.gg0.Rg();
        le0_2 spacer = new le0_2(null, false);
        root.gg0.vx0(spacer).jQ = new vl0_0(25.0f);
        return root;
    }

    public static /* synthetic */ void WB(Runnable runnable, R90 r90) {
        runnable.run();
        r90.xe0();
    }

    public static void Sv0(yk_0 yk_02, ld_2 ld_22, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        if (!yk_02.PI()) {
            return;
        }
        on0_0 on0_03 = on0_02;
        int n = yk_02.TW;
        ld_22.dY.remove(n);
        ld_22.fg0(n, 1);
        tk0_02.gg0.pz(er_02).Jq(er_02.rm0());
        er_02.COm3();
        on0_03.ld.clear();
        ld_22.Dm0(on0_03.ld::add);
    }

    public static void ux0(yk_0 yk_02, ld_2 object, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        int n = yk_02.PI() ? yk_02.TW : object.dY.size();
        object.dY.add(n, new CI());
        object.od0(n, 1);
        tk0_02.gg0.pz(er_02).Jq(er_02.rm0());
        er_02.COm3();
        on0_02.ld.clear();
        object.Dm0(on0_02.ld::add);
    }

    public final void HJ0(yk_0 object, ld_2 ld_22, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        cg_0 cg_02 = new cg_0(null, new wn0_0());
        int n = ((yk_0)object).PI() ? ((yk_0)object).TW : ld_22.dY.size();
        cg_02.aO(kl0_0::Ed);
        xn0_0.Lt.SL(kl0_0.U2(() -> kl0_0.Db0(cg_02, ld_22, n, tk0_02, er_02, on0_02), new String[]{"Item"}, new le0_2[]{cg_02}));
    }

    public static void Db0(cg_0 object, ld_2 object2, int n, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        String name = ((wn0_0)object.dI0).YA.toString();
        mc0_1 found = null;
        for (Object value : gu0.l2.Pd0.values()) {
            mc0_1 item = (mc0_1)value;
            if (sm0_0.c0(item.Nl).equalsIgnoreCase(name)) {
                found = item;
                break;
            }
        }
        if (found == null) {
            Qy0.yI0.dk(-1, "Item could not be found");
            return;
        }
        object2.dY.add(n, new CI(kt_2.IL0, found.Z8, 0));
        object2.od0(n, 1);
        tk0_02.gg0.pz(er_02).Jq(er_02.rm0());
        er_02.COm3();
        on0_02.ld.clear();
        object2.Dm0(on0_02.ld::add);
    }

    public static KZ Ed(String string, int n, KZ kZ) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        for (Object value : gu0.l2.Pd0.values()) {
            mc0_1 item = (mc0_1)value;
            if (item.ry() && item.getName().toLowerCase().startsWith(string.toLowerCase())) {
                names.add(item.getName());
            }
        }
        return new gj_2(string.length(), true, names.toArray(new String[0]));
    }

    public static String[] oz(int size) {
        return new String[size];
    }

    public static boolean MS(String prefix, String value) {
        return value.toLowerCase().startsWith(prefix.toLowerCase());
    }

    public final void we(yk_0 yk_02, ld_2 ld_22, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        cg_0 cg_02 = new cg_0(null, new wn0_0());
        int n = yk_02.PI() ? yk_02.TW : ld_22.dY.size();
        cg_0 cg_03 = cg_02;
        cg_03.f90 = Character::isDigit;
        xn0_0.Lt.SL(kl0_0.U2(() -> kl0_0.gx0(ld_22, n, cg_03, tk0_02, er_02, on0_02), new String[]{"Swap-Slot"}, new le0_2[]{cg_03}));
    }

    public static void gx0(ld_2 object, int n, cg_0 cg_02, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        object.dY.add(n, new CI(kt_2.Q5, Integer.parseInt(((wn0_0)cg_02.dI0).YA.toString()), -1));
        object.od0(n, 1);
        tk0_02.gg0.pz(er_02).Jq(er_02.rm0());
        er_02.COm3();
        on0_02.ld.clear();
        object.Dm0(on0_02.ld::add);
    }

    public final void SC0(yk_0 object, ld_2 ld_22, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        cg_0 cg_02 = new cg_0(null, new wn0_0());
        int n2 = ((yk_0)object).PI() ? ((yk_0)object).TW : ld_22.dY.size();
        cg_02.aO((string, n, kZ) -> {
            java.util.ArrayList<String> names = new java.util.ArrayList<>();
            for (Object value : ec0_2.Sx().Com6()) {
                vk0_1 skill = (vk0_1)value;
                if (skill.CoM2().toLowerCase().startsWith(string.toLowerCase())) names.add(skill.CoM2());
            }
            return new gj_2(string.length(), true, names.toArray(new String[0]));
        });
        xn0_0.Lt.SL(kl0_0.U2(() -> kl0_0.X90(cg_02, ld_22, n2, tk0_02, er_02, on0_02), new String[]{"Skill"}, new le0_2[]{cg_02}));
    }

    public static void X90(cg_0 object, ld_2 object2, int n, tk0_0 tk0_02, er_0 er_02, on0_0 on0_02) {
        vk0_1 skill = ec0_2.Sx().Pc0(((wn0_0)object.dI0).YA.toString());
        if (skill == null) {
            Qy0.yI0.dk(-1, "Skill could not be found");
            return;
        }
        object2.dY.add(n, new CI(kt_2.ue, skill.hC0, 0));
        object2.od0(n, 1);
        tk0_02.gg0.pz(er_02).Jq(er_02.rm0());
        er_02.COm3();
        on0_02.ld.clear();
        object2.Dm0(on0_02.ld::add);
    }

    public static KZ ZV(String string, int n, KZ kZ) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        for (Object value : ec0_2.Sx().Com6()) {
            vk0_1 skill = (vk0_1)value;
            if (MS(string, skill.CoM2())) names.add(skill.CoM2());
        }
        return new gj_2(string.length(), true, names.toArray(new String[0]));
    }

    public static String[] qX(int size) {
        return new String[size];
    }

    public static boolean Fq0(String prefix, String value) {
        return value.toLowerCase().startsWith(prefix.toLowerCase());
    }

    public final void Pt0(P8 p8, int n, on0_0 on0_02) {
        ZA0 choice = new ZA0();
        choice.nt0 = 1;
        choice.Oi = (byte)100;
        choice.CV = (short)-1;
        choice.Vq = 0;
        ((com2__3)p8.g6.get(n)).gn(kl0_0.aX(choice));
        SQ sQ = on0_02.TB0;
        sQ.j10(sQ.yw0(n), choice);
    }

    public static void UJ(on0_0 on0_02, X6 x6) {
        on0_02.vx0 = (con__6)x6.Vh0();
    }

    private static Object[] battleModes() {
        try {
            Field field = con__6.class.getDeclaredField("pc0");
            field.setAccessible(true);
            return (Object[])field.get(null);
        } catch (ReflectiveOperationException exception) {
            return new Object[]{con__6.Qs, con__6.pn0, con__6.tZ, con__6.Wt0, con__6.Ei};
        }
    }

    public static KZ Nf(ZA0 zA0, cg_0[] objectArray, String string, int n, KZ kZ) {
        cg_0[] cg_0Array = objectArray;
        java.util.ArrayList<String> skills = new java.util.ArrayList<>();
        for (Object value : ec0_2.Sx().Com6()) {
            vk0_1 skill = (vk0_1)value;
            if (skill.CoM2().toLowerCase().startsWith(string.toLowerCase())) {
                skills.add(skill.CoM2());
            }
        }
        yj_1 yj_12 = zA0.tn;
        yj_12.KL0 = new short[10];
        yj_12.Pf = 0;
        Arrays.stream(cg_0Array).map(cg_0::Np).map(ec0_2.Sx()::Pu0).filter(Objects::nonNull).map(vk0_1::oC0).forEach(zA0.tn::uo0);
        return new gj_2(string.length(), true, skills.toArray(new String[0]));
    }

    public static KZ km0(ZA0 zA0, String string, int n, KZ kZ) {
        short s;
        ZA0 zA02;
        java.util.ArrayList<mc0_1> items = new java.util.ArrayList<>();
        for (Object value : gu0.l2.Pd0.values()) {
            mc0_1 item = (mc0_1)value;
            if (item.ry() && kl0_0.pP(string, item)) {
                items.add(item);
            }
        }
        mc0_1[] mc0_1Array = items.toArray(new mc0_1[0]);
        if (mc0_1Array.length > 0 && !string.isEmpty()) {
            zA02 = zA0;
            s = mc0_1Array[0].Z8;
        } else {
            zA02 = zA0;
            s = 0;
        }
        zA02.Vq = s;
        String[] names = new String[mc0_1Array.length];
        for (int i = 0; i < mc0_1Array.length; ++i) names[i] = mc0_1Array[i].getName();
        return new gj_2(string.length(), true, names);
    }

    public static String[] uj(int size) {
        return new String[size];
    }

    public static boolean tK0(String prefix, String value) {
        return value.toLowerCase().startsWith(prefix.toLowerCase());
    }

    public static String[] AG(int size) {
        return new String[size];
    }

    public static mc0_1[] QH0(int size) {
        return new mc0_1[size];
    }

    public static boolean pP(String string, mc0_1 mc0_12) {
        return sm0_0.c0(mc0_12.Nl).toLowerCase().startsWith(string.toLowerCase());
    }

    public static KZ wa0(ZA0 zA0, String string, int n, KZ kZ) {
        int n2;
        ZA0 zA02;
        java.util.LinkedHashSet<Short> moveIds = new java.util.LinkedHashSet<>();
        for (Object value : mp_1.vf0().k2.values()) {
            short[] ids = ((cq_0)value).kC0();
            for (short id : ids) {
                if (sm0_0.c0(id + 210000).toLowerCase().startsWith(string.toLowerCase())) {
                    moveIds.add(id);
                }
            }
        }
        Short[] shortArray = moveIds.toArray(new Short[0]);
        if (shortArray.length > 0 && !string.isEmpty()) {
            zA02 = zA0;
            n2 = shortArray[0].shortValue();
        } else {
            zA02 = zA0;
            n2 = -1;
        }
        zA02.CV = (short)n2;
        String[] names = new String[shortArray.length];
        for (int i = 0; i < shortArray.length; ++i) names[i] = sm0_0.c0(shortArray[i] + 210000);
        return new gj_2(string.length(), true, names);
    }

    public static String[] h30(int size) {
        return new String[size];
    }

    public static String D5(Short value) {
        return sm0_0.c0(value.shortValue() + 210000);
    }

    public static Short[] TC0(int size) {
        return new Short[size];
    }

    public static boolean dl0(String prefix, Short value) {
        return D5(value).toLowerCase().startsWith(prefix.toLowerCase());
    }

    public static java.util.stream.Stream pi0(short[] values) {
        return java.util.stream.IntStream.range(0, values.length).mapToObj(i -> values[i]);
    }

    public static Short EH(short[] values, int index) {
        return Short.valueOf(values[index]);
    }

    public static void c5(ZA0 zA0, Gh0 gh0) {
        zA0.Oi = (byte)gh0.eB0;
    }

    public static KZ w5(ZA0 zA0, String string, int n, KZ kZ) {
        java.util.ArrayList<cq_0> moves = new java.util.ArrayList<>();
        for (Object value : mp_1.vf0().k2.values()) {
            cq_0 move = (cq_0)value;
            if (kl0_0.Mx0(string, move)) moves.add(move);
        }
        cq_0[] cq_0Array = moves.toArray(new cq_0[0]);
        if (cq_0Array.length > 0 && !string.isEmpty()) {
            zA0.nt0 = cq_0Array[0].dR;
        }
        String[] names = new String[cq_0Array.length];
        for (int i = 0; i < cq_0Array.length; ++i) names[i] = cq_0Array[i].zj();
        return new gj_2(string.length(), true, names);
    }

    public static String[] oc(int size) {
        return new String[size];
    }

    public static cq_0[] cd0(int size) {
        return new cq_0[size];
    }

    public static boolean Mx0(String string, cq_0 cq_02) {
        return cq_02.Ay(false).toLowerCase().startsWith(string.toLowerCase());
    }

    public final void E10() {
        BR server = tw0_0.rl;
        server.fk0.uQ(new gg_2(this.ti));
        Qy0.yI0.dk(-1, "Battle Simulation started - please wait - but you also won't hear back, if it failed");
    }

    public final void g9() {
        String json = this.ti.U40().toString();
        lg_0.k.E00.getClass();
        hl_2.Ja0(json);
        Qy0.yI0.dk(-1, "Successfully exported to Clipboard");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     */
    public final void Zu0() {
        lg_0.k.E00.getClass();
        String clipboard = GLFW.glfwGetClipboardString(lg_0.S4.rt0.hc0);
        A70 json;
        try {
            json = new A70(new StringReader(clipboard));
        }
        catch (ic_1 ic_12) {
            Qy0.yI0.dk(-1, "Failed to parse JSON");
            j60.error("Failed to parse JSON", ic_12);
            return;
        }
        this.ti = new bt_0(new N7(json));
        this.fm0.gg0.OO();
        this.na0();
        Qy0.yI0.dk(-1, "Battle import successful");
    }

    public final void Ym(Gh0 gh0) {
        this.ti.ot = (byte)gh0.eB0;
    }

    public final void vC0(X6 x6) {
        this.ti.Nw0 = (Cq)((Object)x6.Vh0());
    }

    public final void na0() {
        X6 mode = new X6();
        pg0_2 modeOptions = new pg0_2((Object[])Cq.values());
        mode.r30(modeOptions);
        mode.hK(this.ti.Nw0);
        mode.Rm0(() -> this.vC0(mode));

        Gh0 level = new Gh0(new Aj(-1, 127, this.ti.ot));
        level.TK(-1, "--");
        level.Da0(() -> this.Ym(level));

        tk0_0 header = new tk0_0(new A40());
        header.gg0.vx0(mode).mA = 1;
        header.gg0.vx0(level).mA = 1;

        tk0_0 actions = new tk0_0(new A40());
        xe_1 importButton = new xe_1("Import JSON from Clipboard");
        xe_1 exportButton = uz0_0.nJ(importButton, this::Zu0, "Export JSON to Clipboard");
        xe_1 simulateButton = uz0_0.nJ(exportButton, this::g9, "Simulate Battle");
        simulateButton.RR(this::E10);
        actions.gg0.vx0(importButton).Rr0.vx0(exportButton).Rr0.vx0(simulateButton);

        j1_0 headerCell = this.fm0.Xf0(header);
        headerCell.Hb0 = 1;
        headerCell.d80 = 3;
        this.fm0.gg0.Rg();
        this.fm0.gg0.es("Player 1").Hb0 = 1;
        this.fm0.gg0.es("Player 2").Hb0 = 1;
        this.fm0.gg0.Rg();
        this.fm0.Xf0(this.Po(0)).NA();
        this.fm0.Xf0(this.Po(1)).NA();
        this.fm0.gg0.Rg();
        this.fm0.Xf0(actions).goto$().d80 = 3;
    }

    public final void YW() {
        this.K20.u3(this);
    }

    public static tk0_0 aX(ZA0 zA0) {
        tk0_0 root = new tk0_0(new A40());
        cg_0 item = new cg_0(null, new wn0_0());
        if (zA0.nt0 != 0) {
            cq_0 selected = (cq_0)mp_1.vf0().k2.get(zA0.nt0);
            if (selected != null) item.Gv(selected.Ay(false));
        }
        item.aO((arg_0, arg_1, arg_2) -> kl0_0.w5(zA0, arg_0, arg_1, arg_2));
        Gh0 level = new Gh0(new Aj(0, 100, zA0.Oi));
        level.Da0(() -> kl0_0.c5(zA0, level));
        cg_0 move = new cg_0(null, new wn0_0());
        if (zA0.CV >= 0) {
            move.Gv(sm0_0.c0(zA0.CV + 210000));
        }
        move.aO((arg_0, arg_1, arg_2) -> kl0_0.wa0(zA0, arg_0, arg_1, arg_2));
        cg_0 ability = new cg_0(null, new wn0_0());
        if (zA0.Vq > 0) {
            ability.Gv(sm0_0.c0(gu0.l2.lPT6(zA0.Vq).Nl));
        }
        ability.aO((arg_0, arg_1, arg_2) -> kl0_0.km0(zA0, arg_0, arg_1, arg_2));
        cg_0[] skills = new cg_0[4];
        for (int i = 0; i < skills.length; ++i) {
            skills[i] = new cg_0(null, new wn0_0());
            if (zA0.tn.Pf > i) {
                short moveId = zA0.tn.KL0[i];
                vk0_1 moveData = (vk0_1)ec0_2.Sx().f4.f5(moveId);
                if (moveData != null) skills[i].Gv(sm0_0.c0(moveData.bt));
            }
            skills[i].aO((arg_0, arg_1, arg_2) -> kl0_0.Nf(zA0, skills, arg_0, arg_1, arg_2));
        }
        root.gg0.es(sm0_0.c0(0)).Rr0.vx0(item).Rr0.Rg();
        root.gg0.es("Level").Rr0.vx0(level).Rr0.Rg();
        root.gg0.es("Ability").Rr0.vx0(ability).Rr0.Rg();
        root.gg0.es("Held Item").Rr0.vx0(move).Rr0.Rg();
        for (int i = 0; i < skills.length; ++i) {
            root.gg0.es("Skill " + (i + 1)).Rr0.vx0(skills[i]).Rr0.Rg();
        }
        return root;
    }

    public static R90 U2(Runnable object, String[] object2, le0_2[] le0_2Array) {
        if (object2.length != le0_2Array.length) {
            throw new IllegalArgumentException();
        }
        R90 frame = new R90();
        frame.ff0(1);
        frame.uf("admin-small-frame");
        tk0_0 content = new tk0_0(new A40());
        le0_2 spacer = new le0_2(null, false);
        content.gg0.vx0(spacer).jQ = new vl0_0(25.0f);
        content.gg0.Rg();
        for (int i = 0; i < object2.length; ++i) {
            content.gg0.sw0(object2[i], "label-title").Rr0.vx0(le0_2Array[i]).Rr0.Rg();
        }
        xe_1 submit = new xe_1("Submit");
        xe_1 cancel = uz0_0.nJ(submit, () -> kl0_0.WB(object, frame), "Cancel");
        cancel.RR(frame::xe0);
        content.gg0.vx0(submit).Rr0.vx0(cancel);
        frame.F9(frame.fU(), content);
        return frame;
    }
}
