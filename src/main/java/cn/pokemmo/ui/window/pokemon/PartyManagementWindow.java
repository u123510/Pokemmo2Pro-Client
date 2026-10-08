package cn.pokemmo.ui.window.pokemon;

import f.*;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * 队伍排列与电脑互移窗口
 *
 * 原混淆类: f.wg0_0
 */
public class PartyManagementWindow extends R90 implements sp0_0  {
    public final wg0_0 asBridge() {
        return (wg0_0) (Object) this;
    }

    public final jb0_0[] dz;
    public final BU AA0;
    public jb0_0 e5;
    public sg_2 coM5;
    public final fy_2 Com6;
    public final qj_2 Z4;
    public final qj_2 mh;
    public boolean ws = true;
    public boolean K4 = false;
    public int Ri = 0;
    public boolean wm = false;
    public final boolean t50;
    public Consumer p;

    public PartyManagementWindow(BU root, boolean storage) {
        Hy("");
        uf("monster-party-frame-locked");
        Com6 = new fy_2();
        Com6.uf("content");
        AA0 = root;
        ff0(1);
        t50 = storage;
        dz = new jb0_0[6];
        zi0_1 drag = new zi0_1(asBridge(), storage, root);
        for (short i = 0; i < dz.length; i++) {
            dz[i] = new sv0_0(i, storage);
            dz[i].Ag0(drag);
            if (storage) {
                if (tw0_0.kz0()) {
                    dz[i].xf0(80, 80);
                    dz[i].sl().Gy0(4, 0);
                } else {
                    dz[i].sl().Gy0(12, 4);
                }
            }
            short index = i;
            dz[i].tD0(() -> Tl0(index));
            Com6.SL(dz[i]);
        }
        Z4 = new qj_2("", 12, 12);
        Z4.RR(this::fr);
        mh = new qj_2("", 12, 12);
        mh.uf("button-move");
        mh.RR(this::Wv0);
        ya_1 horizontal = Com6.lo0().LPt3(dz);
        ya_1 vertical = Com6.H10().LPt3(dz);
        if (tw0_0.H30() && !storage) {
            vertical.X20(Com6.hb(new le0_2[]{Z4, mh}));
            horizontal.X20(Com6.C7(new le0_2[]{Z4, mh}));
        }
        Com6.WQ(horizontal);
        Com6.x40(vertical);
        RY(30, 30);
        SL(Com6);
    }

    public static void vs(VU monster, jb0_0 slot) {
        Qy0 root = Qy0.yI0;
        String name = monster.k30();
        cq_0 species = monster.f60;
        if (species.kT != null) species = species.kT;
        String text = sm0_0.Bx(1924, new String[]{name, species.FZ()});
        lpt3__4 dialog = new lpt3__4(text, () -> WY(monster), slot);
        root.sr0(dialog);
    }

    public static void WY(VU monster) {
        BR connection = tw0_0.rl;
        CH0 id = monster.pu;
        connection.fk0.uQ(new Ma(id, false));
    }

    public static void Zs(Ge0 connection, jb0_0 slot) {
        long index = slot.Xh0();
        connection.fk0.uQ(new _for((byte) 0, index));
    }

    public static void Pg(Ge0 connection, VU monster) {
        CH0 id = monster.pu;
        connection.getClass();
        long value = id.Sa;
        connection.fk0.uQ(new _for((byte) 1, value));
    }

    public static void Z0(Ge0 connection) {
        connection.getClass();
        connection.fk0.uQ(new _for((byte) 2, 0L));
    }

    public static void xt(jb0_0 slot) {
        Qy0 root = Qy0.yI0;
        jb0_0[] slots = {slot};
        int x = slot.A20 - 174;
        int y = slot.SB0;
        root.getClass();
        UA.rL(Qy0.m60(slots, null), slot, x, y);
    }

    public static void tH(jb0_0 slot) {
        int x = slot.A20 + slot.e80;
        x = slot.a3() / 2 + x;
        int y = slot.SB0 + slot.y9;
        y = slot.k5() / 2 + y;
        BU.T50.OJ.vu0(slot, Collections.emptyList());
        BU.T50.OJ.fx0(x, y);
    }

    public static void p60(di0_1 breeding, jb0_0 slot) {
        breeding.FF[0].G9(slot);
    }

    public static void Gg(di0_1 breeding, jb0_0 slot) {
        breeding.FF[2].G9(slot);
    }

    public static nq_1 N6(le0_2 widget) {
        if (widget instanceof nq_1) return (nq_1) widget;
        le0_2 parent = widget.K20;
        return parent != null ? N6(parent) : null;
    }

    public final void kB(sg_2 target) {
        sg_2 previous = coM5;
        if (target == previous) return;
        if (previous != null) previous.ad(false, false);
        coM5 = target;
        if (target != null) target.ad(true, target == e5 || target.tp0.AU());
    }

    public final void kn0(boolean refresh) {
        if (Ri < 0) Ri = 0;
        while (Ri >= dz.length || (Ri > 0 && dz[Ri].ol0() == null && !t50)) Ri--;
        if (refresh) GA0();
        if (t50) lpt6__0.v90(dz[Ri]);
        Consumer listener = p;
        if (listener != null) listener.accept(dz[Ri].ol0());
        setStyle(dz[Ri], t50 ? "monster-slot-pc-selected" : "monster-slot-selected");
    }

    public final void fw(short move, boolean specialMap, VU monster, Ge0 connection) {
        dl_1 initialized = tx_1.Sy0;
        if ((move == 505 || move == 1030) && specialMap) {
            Qy0 root = Qy0.yI0;
            int x = A20;
            int y = SB0;
            Runnable callback = this::Wf;
            root.getClass();
            Qy0.xi(this, monster, move, x, y, callback);
        } else {
            connection.p4(monster.pu, move, CH0.j1, CH0.j1);
            GA0();
            f00();
        }
    }

    public final void Wf() {
        GA0();
        f00();
    }

    public final void w3() {
        dz[0].G9(dz[Ri]);
        Ri = 0;
        lpt6__0.v90(dz[0]);
    }

    public final void gA0() {
        dz[Ri + 1].G9(dz[Ri]);
        Ri++;
        lpt6__0.v90(dz[Ri]);
    }

    public final void nI() {
        dz[Ri - 1].G9(dz[Ri]);
        Ri--;
        lpt6__0.v90(dz[Ri]);
    }

    public final void Ei(Ge0 connection, VU monster) {
        GA0();
        CH0 id = monster.pu;
        _volatile category = monster.I8.JF;
        connection.fk0.uQ(new SF0(category, id, (short) -1));
    }

    public final void vJ(VU monster) {
        BU root = BU.T50;
        cq_0 species = monster.f60;
        byte form = monster.I8.ZF0;
        fd0_0 codex = root.le;
        if (codex == null) root.QS();
        else lpt6__0.v90(codex);
        root.le.y0(form, species);
        GA0();
    }

    public final void TT(VU monster, jb0_0 slot) {
        BU.T50.FI(monster, slot, qo_1.DL, false);
        GA0();
    }

    public final void Wv0() {
        if (K4) {
            K4 = false;
            setStyle(this, "monster-party-frame-locked");
        } else {
            K4 = true;
            setStyle(this, "monster-party-frame");
        }
    }

    public final void fr() {
        if (ws) {
            ws = false;
            Com6.WQ(XN.sA(Com6, Com6).LPt3(dz)
                    .X20(Com6.hb(new le0_2[]{Z4, mh})));
            Com6.x40(D5.fE0(Com6, Com6).LPt3(dz)
                    .X20(Com6.C7(new le0_2[]{Z4, mh})));
        } else {
            ws = true;
            Com6.WQ(D5.fE0(Com6, Com6).LPt3(dz)
                    .X20(Com6.C7(new le0_2[]{Z4, mh})));
            Com6.x40(XN.sA(Com6, Com6).LPt3(dz)
                    .X20(Com6.hb(new le0_2[]{Z4, mh})));
        }
    }

    public final void a80(Jn0 theme) {
    }

    public final jb0_0 S80() {
        for (short i = 0; i < 6; i++) {
            if (dz[i].ol0() == null) return dz[i];
        }
        return null;
    }

    public final void K8() {
        Com6.lt0();
        lt0();
        if (A20 + Mx > tw0_0.LD0.ew0() - Mx) {
            E40(tw0_0.LD0.ew0() - Mx, SB0);
        }
        if (SB0 + OB > tw0_0.LD0.Hv0()) {
            E40(A20, tw0_0.LD0.Hv0() - OB);
        }
        super.K8();
    }

    public final void AD(boolean visible) {
        if (visible && !eE) GA0();
        super.AD(visible);
    }

    public final void GA0() {
        cz_0.iL.getClass();
        for (Object entry : cz_0.z1(wg0_0.class)) {
            wg0_0 frame = (wg0_0) entry;
            frame.getClass();
            BR connection = tw0_0.rl;
            if (connection == null) continue;
            Mj party = connection.PC0;
            yh_0 sprites = yh_0.Xm0;
            for (short i = 0; i < 6; i++) {
                frame.dz[i].iV(party);
                VU monster = party.Ry0(i);
                if (monster != null) {
                    short species = monster.I8.Kr();
                    byte gender = monster.Dg0();
                    frame.dz[i].E1(sprites.qC0(species, gender, monster.I8.aR())[0]);
                    float health = (float) monster.I8.VD / (float) monster.Ps.BL0(gc_2.RC);
                    if (monster.I8.H1 != 0) frame.dz[i].QJ();
                    frame.dz[i].GH0 = 200;
                    if (frame.t50) {
                        setStyle(frame.dz[i], "monster-slot-pc");
                    } else if (monster.I8.vn() || (double) health > 0.5D) {
                        setStyle(frame.dz[i], "monster-slot");
                    } else if ((double) health > 0.2D) {
                        setStyle(frame.dz[i], "monster-slot-orange");
                    } else if (health > 0.0F) {
                        setStyle(frame.dz[i], "monster-slot-red");
                    } else if (health == 0.0F) {
                        setStyle(frame.dz[i], "monster-slot-purple");
                    }
                    frame.dz[i].yj0 = lb0_2.Ky(monster, true, false, false);
                    frame.dz[i].yB0();
                } else {
                    frame.dz[i].E1(null);
                    setStyle(frame.dz[i], frame.t50 ? "monster-slot-pc-empty" : "monster-slot-empty");
                    frame.dz[i].yj0 = null;
                    frame.dz[i].yB0();
                    frame.dz[i].QJ();
                }
            }
            if (frame.wm && frame.Of()) frame.kn0(false);
        }
    }

    public final boolean JL() {
        return wm;
    }

    public final void nL(Consumer listener) {
        p = listener;
    }

    public final boolean nd0(i70_0 event) {
        if (!wm) return super.nd0(event);
        if (E00.ZU(event.zu) && event.iT()) {
            int key = event.finally$;
            rp_0 binding = rp_0.kC0;
            boolean configurationInitialized = dw_2.Va;
            if (binding != null && binding.Ov(key)) {
                if (Ri > 0) {
                    Ri--;
                    kn0(true);
                }
                return true;
            }
            binding = rp_0.synchronized$;
            if (binding != null && binding.Ov(key)) {
                Ri++;
                kn0(true);
                return true;
            }
            binding = rp_0.Ni;
            if (binding != null && binding.Ov(key)) {
                di0_1 breeding = BU.T50.vs0;
                if (breeding != null) {
                    lpt6__0.v90(breeding.A30());
                    return true;
                }
            }
            binding = rp_0.sJ0;
            if (binding != null && binding.Ov(key)) {
                if (t50 && BU.T50.OJ.W70 != null) return super.nd0(event);
                wl(true);
                return true;
            }
            binding = rp_0.nK0;
            if (binding != null && binding.Ov(key) && !t50) {
                f00();
                return true;
            }
        }
        return super.nd0(event);
    }

    public final void wl(boolean keyboard) {
        Ge0 connection = tw0_0.rl;
        if (connection == null) return;
        jb0_0 slot = dz[Ri];
        VU monster = slot.ol0();
        if (monster == null) return;
        di0_1 breeding = BU.T50.vs0;
        Vt0 menu = new Vt0();
        if (breeding != null) {
            if (breeding.FF[0].AG != null) {
                at_0 second = new at_0(sm0_0.wa0(2518, "2"));
                second.eu0 = () -> Gg(breeding, slot);
                menu.hx.add(second);
            }
            at_0 first = new at_0(sm0_0.wa0(2518, "1"));
            first.eu0 = () -> p60(breeding, slot);
            menu.hx.add(first);
        }
        at_0 move = new at_0(sm0_0.c0(2317), () -> tH(slot));
        if (t50 && keyboard) menu.hx.add(move);
        menu.hx.add(new at_0(sm0_0.c0(1801), () -> TT(monster, slot)));
        menu.hx.add(new at_0(sm0_0.c0(1729), () -> vJ(monster)));
        mc0_1 item = gu0.l2.lPT6(monster.I8.rh0());
        if (monster.I8.rh0() > 0) {
            menu.hx.add(new at_0(sm0_0.wa0(1421, sm0_0.c0(item.Nl)), () -> Ei(connection, monster)));
        }
        if (AA0.OJ != null) menu.hx.add(new at_0(sm0_0.c0(2301), () -> xt(slot)));
        if (Ri > 0) menu.hx.add(new at_0(sm0_0.c0(2303), this::nI));
        int next = Ri + 1;
        if (next < dz.length && dz[next].ol0() != null) {
            menu.hx.add(new at_0(sm0_0.c0(2304), this::gA0));
        }
        if (Ri > 0) menu.hx.add(new at_0(sm0_0.c0(2313), this::w3));
        _else map = tw0_0.e60.N60();
        boolean specialMap = map != null && map.Km();
        for (int i = 0; i < 4; i++) {
            short moveId = monster.I8.Gu[i];
            if (!tx_1.H40(moveId, specialMap)) continue;
            String text = sm0_0.wa0(1422, sm0_0.c0(moveId + 110000));
            menu.hx.add(new at_0(text, () -> fw(moveId, specialMap, monster, connection)));
        }
        E90 player = tw0_0.e60.jB0;
        boolean matching = false;
        if (player != null && player.mI0() == monster.I8.Yb0) {
            byte avatar = player.QL();
            byte flags = 0;
            byte form = monster.I8.ZF0;
            if (form != 0) flags = form;
            if (monster.Dg0() == 1) flags = (byte) (flags | 32);
            if (monster.I8.I()) flags = (byte) (flags | 64);
            if (monster.I8.aR()) flags = (byte) (flags | -128);
            matching = avatar == flags;
        }
        if (matching) {
            menu.hx.add(new at_0(sm0_0.c0(2256), () -> Z0(connection)));
        } else {
            if (!monster.I8.vn()) {
                String text = sm0_0.wa0(2262, monster.na0());
                menu.hx.add(new at_0(text, () -> Pg(connection, monster)));
            }
            String text = new StringBuilder()
                    .append(sm0_0.wa0(2263, NumberFormat.getInstance().format((long) (slot.Xh0() + 1))))
                    .append(" Slot").toString();
            menu.hx.add(new at_0(text, () -> Zs(connection, slot)));
        }
        if (monster.I8.TH()) {
            menu.hx.add(new at_0(sm0_0.c0(2264), () -> vs(monster, slot)));
        }
        menu.hx.add(new at_0(sm0_0.c0(nf0_0.Bq0), null));
        UA.Xy0(dw_2.Lm ? 16 : 8, menu, slot);
    }

    public final void f00() {
        wm = false;
        GA0();
        super.f00();
        QT storage = AA0.OJ;
        if (storage != null) lpt6__0.v90(storage);
    }

    public final void HP(zk0_1 context) {
        if (tw0_0.rl != null) {
            for (_volatile category : _volatile.VA) {
                Mj party = tw0_0.rl.r1(category);
                if (party != null && party.rr0) {
                    party.rr0 = false;
                    GA0();
                    break;
                }
            }
        }
        if (!Of()) {
            for (jb0_0 slot : dz) {
                if ("monster-slot-selected".equals(slot.gW)) GA0();
            }
        }
        super.HP(context);
    }

    public final void C(zk0_1 context) {
        cz_0.iL.IT(this);
        GA0();
    }

    public final void N00(zk0_1 context) {
        synchronized (cz_0.iL) {
            ConcurrentHashMap registry = cz_0.kD0;
            if (registry.containsKey(wg0_0.class)) {
                ((List) registry.get(wg0_0.class)).remove(this);
            }
        }
    }

    public final void Tl0(short index) {
        Ri = index;
        wl(false);
    }

    public final void aG0(i70_0 event) {
        if (e5 == null) return;
        le0_2 target = AA0;
        int x = event.f8;
        int y = event.AN;
        le0_2 hit = target.dh0(x, y);
        if (hit != null) target = hit.BQ(x, y);
        if (!(target instanceof sg_2)) target = target.K20;
        if (target instanceof sg_2 && ((sg_2) target).JA) {
            kB((sg_2) target);
            return;
        }
        kB(null);
        x = event.f8;
        y = event.AN;
        hit = dh0(x, y);
        target = hit != null ? hit.BQ(x, y) : this;
        if (!(target instanceof sg_2)) target = target.K20;
        if (target instanceof sg_2 && ((sg_2) target).JA) kB((sg_2) target);
        else kB(null);
    }

    private static void setStyle(le0_2 widget, String style) {
        if (!style.equals(widget.gW)) {
            widget.uf(style);
            widget.yI();
        }
    }
}
