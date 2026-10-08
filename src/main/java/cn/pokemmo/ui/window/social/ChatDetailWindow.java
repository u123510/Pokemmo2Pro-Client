package cn.pokemmo.ui.window.social;

import f.*;

import java.beans.PropertyChangeEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/**
 * 聊天历史与玩家快捷交互详情面板
 *
 * 原混淆类: f.XH
 */
public class ChatDetailWindow extends cx_0 {
    public final XH asBridge() {
        return (XH) (Object) this;
    }

    public final BU P0;
    public final xe_1 g80;
    public boolean jj0;
    public boolean bO;
    public final dd0_0 OC0;
    public final lpt1__1 abstract$;
    public final lo0_0 Na0;
    public final xe_1 Hy;
    public final o20_0 b5;
    public final Jm0 bi0;
    public final W9 hS;
    public final xe_1 x70;
    public final xe_1 Qp;
    public zo_0 oU;
    public String dG0;
    public final ArrayList uJ;
    public boolean dd0;
    public wl0_2 OF;
    public wl0_2 Z30;
    public boolean ul0;
    public int JU;
    public int Ew;
    public final ArrayList ac;
    public int DB0;
    public final SimpleDateFormat Y90;
    public final ArrayList n6;
    public final ArrayList WA;
    public fy_2 K00;
    public tk0_0 GR;
    public fy_2 zy0;
    public qj_2 Ag0;
    public lo0_0 he;
    public final AtomicInteger sW;
    public boolean Lj0;

    public ChatDetailWindow(xe_1 toggle, BU owner) {
        super(tw0_0.kz0());
        jj0 = false;
        bO = false;
        zo_0 channel = zo_0.Pk;
        oU = channel;
        dG0 = "";
        uJ = new ArrayList();
        dd0 = false;
        ul0 = true;
        ac = new ArrayList();
        DB0 = -1;
        Y90 = new SimpleDateFormat("HH:mm:ss");
        n6 = dw_2.pq0();
        WA = new ArrayList();
        sW = new AtomicInteger(0);
        Lj0 = false;
        P0 = owner;
        if (tw0_0.rl != null) {
            Vv0.w9().vY(tw0_0.rl.yS());
        }
        Hy("");
        uf("chatframe");
        g80 = toggle;
        dd0_0 document = new dd0_0();
        OC0 = document;
        lpt1__1 area = new lpt1__1(document);
        abstract$ = area;
        area.uf("textarea");
        new P8().I6(true);
        area.ir(XH::uL);
        area.ir(new vy_0(asBridge()));
        area.i90(new s7_0(asBridge()));
        lo0_0 scroll = new lo0_0(area);
        Na0 = scroll;
        DB0 input = lg_0.lW;
        JC discardedKeyboardListener = new JC() {
            public void onKeyboardHeightChanged(int height) {
                ChatDetailWindow.this.jh0(height);
            }
        };
        input.getClass();
        scroll.Qs0(2);
        scroll.Xr0(99999);
        xe_1 link = new xe_1(sm0_0.c0(1511));
        x70 = link;
        link.uf("button-link");
        link.RR(this::UW);
        xe_1 send = new xe_1(sm0_0.c0(1525));
        Qp = send;
        send.RR(this::mx0);
        xe_1 selector = new xe_1(sm0_0.c0(channel.Bq0()));
        Hy = selector;
        selector.RY(100, 0);
        selector.RR(this::gE);
        o20_0 field = new o20_0();
        b5 = field;
        ((wn0_0) field.cg0()).qk0(this::aD0);
        field.gW();
        field.ef0(lpt3__1.VB0);
        field.Ii(this::ip);
        int size = tw0_0.kz0() ? 60 : 24;
        int scale = tw0_0.kz0() ? 3 : 1;
        Jm0 lock = new Jm0(size, size, 0);
        bi0 = lock;
        lock.l10().r8(fn_0.qz0().LK0());
        lock.l10().Gy0(8, 9);
        lock.l10().dA((float) scale);
        lock.RR(this::ep0);
        W9 hide = new W9();
        hS = hide;
        hide.uf("hideButton");
        hide.RR(() -> x6(owner));
        lL0();
        ax0(dw_2.Jy0);
        u5(this::ve);
        Nd0(dw_2.WY);
        lpt6__0.mG(field);
    }

    public static void rK0(mc0_1 item, byte variant) {
        BU owner = BU.T50;
        U60 window = new U60(owner, item, variant);
        owner.SL(window);
    }

    public static void Ba(CH0 source, CH0 target) {
        BR client = tw0_0.rl;
        client.getClass();
        if (source.Uz0()) {
            source = client.cJ0.dj0;
        }
        client.fk0.uQ(new tg0_0(source, target));
    }

    public static void y(String value) {
        lg_0.lv0.Lf(value);
    }

    public static void bw(String value) {
        II0.ZN(value);
    }

    public static void Xb(String value) {
        BR client = tw0_0.rl;
        String command = new StringBuilder("//teleportto ").append(value).toString();
        client.getClass();
        client.Cp(zo_0.Pk, command, "", true);
    }

    public static void G7() {
        Qy0.yI0.tM();
    }

    public static void Jt0() {
        BU owner = BU.T50;
        zs_2 existing = owner.Mr;
        if (existing != null) {
            existing.xe0();
            owner.Mr = null;
        } else {
            zs_2 window = new zs_2(owner);
            owner.Mr = window;
            owner.SL(window);
            owner.Mr.lt0();
            owner.Mr.vf(pa0_0.Ol);
        }
    }

    public static void H4() {
        BU.T50.gI();
    }

    public static void uL(String value) {
        lg_0.lv0.Lf(value);
    }

    public static Vt0 jV(byte type, String name, String target) {
        Vt0 menu = new Vt0();
        if (type == 1 && tw0_0.Eu(5)) {
            menu.mA0("Teleport", () -> Xb(name));
        }
        menu.mA0("Copy", () -> bw(name));
        menu.mA0("ACP", () -> y(target));
        return menu;
    }

    public final void k3() {
        boolean whisper = jj0;
        if (whisper && bO) {
            g80.kx0("chatframe-hidden-whisper-team");
        } else if (whisper) {
            g80.kx0("chatframe-hidden-whisper");
        } else if (bO) {
            g80.kx0("chatframe-hidden-team");
        } else {
            g80.kx0("chatframe-hidden");
        }
    }

    public final boolean oe0(ge_0 view, short id, byte gender, byte form, boolean shiny,
            boolean variant, CH0 source, CH0 target, StringBuilder output, boolean plain) {
        cq_0 species = (cq_0) mp_1.vf0().k2.get(Short.valueOf(id));
        if (species == null) {
            return false;
        }
        if (plain) {
            output.append(new StringBuilder("[").append(species.Ay(false)).append("]").toString());
            return true;
        }
        String name = species.Ay(false);
        S70 icon = null;
        if (dw_2.Sp0) {
            icon = new S70(32, 18, 0);
            Br0 sprite = icon.og;
            int offset = tw0_0.kz0() ? -16 : -10;
            sprite.gY = 0;
            sprite.a4 = offset;
            icon.og.o60(new AG0[] { yh_0.Xm0.qC0(species.Qz(form), gender, variant)[0] });
            icon.og.OA0 = true;
            icon.og.IF = 36;
            icon.og.gx0 = 36;
        }
        xe_1 button = new xe_1(xq_1.pz0("[", name, "]"));
        button.uf(shiny ? "chat-monster-info-shiny" : "chat-monster-info");
        button.RR(() -> Ba(source, target));
        int index = sW.getAndAdd(1);
        if (dw_2.Sp0) {
            if (view != null) view.wR(icon, new StringBuilder("icon").append(index).toString());
            else abstract$.hY(icon, new StringBuilder("icon").append(index).toString());
        }
        if (view != null) view.wR(button, new StringBuilder("btn").append(index).toString());
        else abstract$.hY(button, new StringBuilder("btn").append(index).toString());
        String style = "margin: 0px;";
        if (dw_2.Sp0) {
            output.append("<button name=\"icon").append(index).append("\" style=\"").append(style)
                    .append("\"/><button name=\"btn").append(index).append("\" style=\"").append(style).append("\"/> ");
        } else {
            output.append("<button name=\"btn").append(index).append("\" style=\"").append(style).append("\"/> ");
        }
        return true;
    }

    public final boolean ML(ge_0 view, short id, byte variant, StringBuilder output, boolean plain) {
        mc0_1 item = gu0.l2.lPT6(id);
        if (plain) {
            output.append(new StringBuilder("[").append(sm0_0.c0(item.Nl)).append("]").toString());
            return true;
        }
        String name = sm0_0.c0(item.Nl);
        S70 icon = null;
        if (dw_2.Sp0) {
            icon = new S70(24, 24, 0);
            Br0 sprite = icon.og;
            int offset = tw0_0.kz0() ? 0 : 5;
            sprite.gY = 0;
            sprite.a4 = offset;
            icon.og.Nk(new Wr[] { gh_1.aH0.F10(item, false) });
            icon.og.OA0 = true;
            icon.og.IF = 24;
            icon.og.gx0 = 24;
        }
        xe_1 button = new xe_1(xq_1.pz0("[", name, "]"));
        button.uf("chat-monster-info");
        button.RR(() -> rK0(item, variant));
        int index = sW.getAndAdd(1);
        if (dw_2.Sp0) {
            if (view != null) view.wR(icon, new StringBuilder("icon").append(index).toString());
            else abstract$.hY(icon, new StringBuilder("icon").append(index).toString());
        }
        if (view != null) view.wR(button, new StringBuilder("btn").append(index).toString());
        else abstract$.hY(button, new StringBuilder("btn").append(index).toString());
        if (dw_2.Sp0) {
            output.append("<button name=\"icon").append(index).append("\" style=\"margin: 0px\"/><button name=\"btn")
                    .append(index).append("\" style=\"margin: 0px\"/> ");
        } else {
            output.append("<button name=\"btn").append(index).append("\" style=\"margin: 0px\"/> ");
        }
        return true;
    }

    public final void NH(byte type, String target, String name, xe_1 button) {
        if (type == 5) {
            lg_0.lv0.Lf(target);
        } else {
            UA.zd(jV(type, name, target), button);
        }
    }

    public final void pp0(zo_0 channel) {
        D20(channel);
    }

    public final void Q90(W9 button, HK filter) {
        if (button.ER.U20()) {
            BT(button, filter);
        }
        dw_2.Jy0 = filter.eC0;
        dw_2.Va = true;
    }

    public final void ve(PropertyChangeEvent event) {
        if (("x".equals(event.getPropertyName()) || "y".equals(event.getPropertyName())
                || "width".equals(event.getPropertyName()) || "height".equals(event.getPropertyName()))
                && Lj0 && !hS.ER.U20()) {
            dw_2.BY = a3();
            dw_2.Qy0 = k5();
            dw_2.nE0 = A20;
            dw_2.W6 = 0;
            dw_2.Va = true;
        }
    }

    public final void x6(BU owner) {
        boolean hidden = hS.ER.U20();
        owner.BK.Ll(!hidden);
        owner.W3.Ll(hidden);
        owner.Qw0(owner.BK);
    }

    public final void ip(int key) {
        if (key == 66) mx0();
        else if (key == 19) OB0(1);
        else if (key == 20) OB0(-1);
        String text = ((wn0_0) b5.dI0).YA.toString();
        String prefix = "/r ";
        dl_1 initialization = tx_1.Sy0;
        if (text.regionMatches(true, 0, prefix, 0, 3)) {
            String recipient = Vv0.GU.ZG(dG0);
            if (recipient != null) {
                iX(recipient);
                b5.Gv(text.substring(3));
            }
            return;
        }
        for (zo_0 channel : zo_0.JG) {
            if (channel.fJ == null) {
                continue;
            }
            for (String alias : channel.Rk) {
                if (!tx_1.SC(text, alias)) {
                    continue;
                }
                if (channel == zo_0.YL) {
                    if (!text.contains(" ")) {
                        continue;
                    }
                    String[] pieces = text.split(" ");
                    if (pieces.length < 3 || pieces[1].trim().length() < 1) {
                        continue;
                    }
                    dG0 = pieces[1];
                    D20(channel);
                    b5.Gv(text.substring(alias.length() + dG0.length() + 1));
                } else {
                    D20(channel);
                    b5.Gv(text.substring(alias.length()));
                }
                return;
            }
        }
    }

    public final void jh0(int keyboardHeight) {
        if (keyboardHeight == 0) {
            Na0.vi(0, 0, 0, 0);
            return;
        }
        lo0_0 scroll = Na0;
        if (scroll.r90 != 0) {
            return;
        }
        int bottom = scroll.SB0 + scroll.OB - scroll.Cz + 1;
        if (Em0 == null) {
            return;
        }
        float scale = (float) Em0.OB / (float) lg_0.S4.sD0();
        float available = (float) Em0.OB - (float) keyboardHeight * scale;
        if (available <= 0.0F) {
            return;
        }
        float edge = bottom;
        int offset = edge > available ? (int) (edge - available) : 0;
        lg_0.k.lPT5(() -> ZQ(offset));
    }

    public final void ZQ(int offset) {
        Na0.vi(0, 0, offset, 0);
        Na0.Iu();
        lg_0.k.lPT5(this::sc0);
    }

    public final boolean gy0(i70_0 event, String name) {
        if (name.isEmpty() || name.contains(" ")) {
            return false;
        }
        int modifiers = event.J30;
        if ((modifiers & 4) != 0 || (modifiers & 32) != 0) {
            II0.ZN(name);
            return true;
        }
        int button = event.nA0;
        if (button == 0) {
            dG0 = name;
            D20(zo_0.YL);
            return true;
        }
        if (button == 1) {
            Qy0.yI0.p2(name, event.f8, event.AN);
            return true;
        }
        return false;
    }

    public final void hs() {
        gn_0 white = gn_0.WHITE;
        L40(white, g);
        if (GR != null && !tw0_0.kz0()) {
            tk0_0 grid = GR;
            if (grid.z70 == null) {
                grid.z70 = new N1(new t5_0(K00), white);
            }
            GR.z70.bT(white, 150);
        }
    }

    @Override
    public final void Bt() {
        super.Bt();
        if (GR != null && !sO && eE && !tw0_0.kz0()) {
            tk0_0 grid = GR;
            if (grid.z70 == null) {
                grid.z70 = new N1(new t5_0(K00), gn_0.WHITE);
            }
            GR.z70.iG0(150);
        }
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT() && event.finally$ == 61) {
            if (oU != zo_0.YL) {
                dG0 = "";
            }
            int modifiers = event.J30;
            String recipient;
            if ((modifiers & 1) == 0 && (modifiers & 8) == 0) {
                recipient = Vv0.GU.ZG(dG0);
            } else {
                Vv0 history = Vv0.GU;
                String current = dG0;
                synchronized (history.rc) {
                    if (history.AE0.isEmpty()) {
                        recipient = null;
                    } else {
                        recipient = null;
                        boolean found = false;
                        if (current != null && !current.trim().isEmpty()) {
                            for (int i = 1; i < history.AE0.size(); i++) {
                                if (((String) history.AE0.get(i)).equalsIgnoreCase(current)) {
                                    recipient = (String) history.AE0.get(i - 1);
                                    found = true;
                                    break;
                                }
                            }
                        }
                        if (!found) {
                            recipient = (String) history.AE0.get(history.AE0.size() - 1);
                        }
                    }
                }
            }
            if (recipient != null && !recipient.isEmpty()) {
                iX(recipient);
            }
            return true;
        }
        return super.nd0(event);
    }

    @Override
    public final void C(zk0_1 context) {
        super.C(context);
        if (!tw0_0.kz0()) {
            Lj0 = false;
            int y = tw0_0.LD0.Hv0() - OB + dw_2.W6;
            gC0(dw_2.BY, dw_2.Qy0);
            E40(dw_2.nE0, y);
            Lj0 = true;
        }
    }

    @Override
    public final void K8() {
        super.K8();
        if (tw0_0.kz0()) {
            ff0(1);
            oY(tw0_0.LD0.ew0(), tw0_0.LD0.Hv0());
            E40(0, 0);
            I2 children = he.t30.ZD();
            while (children.hasNext()) {
                ((le0_2) children.next()).lt0();
            }
            he.RY(670, 60);
            GR.RY(670, 60);
            he.lt0();
            GR.lt0();
        }
    }

    public final void gE() {
        Vt0 menu = new Vt0();
        for (zo_0 channel : zo_0.JG) {
            if (!channel.g3 || channel == zo_0.YL || channel.fJ == null || channel.fJ.length < 1) {
                continue;
            }
            String label = VG.Mq(ig_0.u9(channel.Yf, new StringBuilder(), " ["), channel.fJ[0], "]");
            menu.hx.add(new at_0(label, () -> pp0(channel)));
        }
        UA.zd(menu, Hy);
    }

    public final void D20(zo_0 channel) {
        oU = channel;
        if (channel == zo_0.YL) {
            Hy.SU(ig_0.u9(1526, new StringBuilder(), " ").append(dG0).toString());
        } else {
            Hy.SU(sm0_0.c0(channel.Yf));
        }
        String ignored = Hy.U4;
        b5.getClass();
        if (!tw0_0.kz0() && !b5.Of()) {
            lpt6__0.v90(b5);
        }
    }

    public final void Nd0(boolean locked) {
        bi0.ER.lK0(locked);
        Yc0 = !locked;
        if (hS.ER.U20()) {
            return;
        }
        if (bi0.ER.U20()) {
            uf("chatframe-locked");
            ff0(1);
            yI();
        } else {
            uf("chatframe");
            ff0(4);
            yI();
            f00();
        }
        if (dw_2.WY != locked) {
            dw_2.WY = locked;
            dw_2.Va = true;
        }
    }

    public final void mx0() {
        if (tw0_0.rl != null) {
            if (((wn0_0) b5.dI0).YA.toString().trim().isEmpty()) {
                b5.f00();
                f00();
                return;
            }
            if (tw0_0.rl.Cp(oU, ((wn0_0) b5.dI0).YA.toString(), dG0, true) > 0) {
                if (ac.isEmpty() || !((wn0_0) b5.dI0).YA.toString().equals(ac.get(ac.size() - 1))) {
                    ac.add(((wn0_0) b5.dI0).YA.toString());
                }
                if (ac.size() >= lpt3__1.Pm) {
                    ac.remove(0);
                }
            }
            DB0 = -1;
        }
        b5.Gv("");
        if (!Ey && b5.Of()) {
            b5.f00();
            le0_2 previous = lpt6__0.bF0;
            if (previous != null) {
                previous.BL();
            }
        }
    }

    public final void OB0(int direction) {
        if (ac.isEmpty()) {
            return;
        }
        int index = DB0 + direction;
        DB0 = index;
        if (index < 0) {
            DB0 = 0;
        } else if (index >= ac.size()) {
            DB0 = ac.size() - 1;
        }
        b5.Gv((String) ac.get(ac.size() - 1 - DB0));
    }

    @Override
    public final boolean Of() {
        return b5.Of();
    }

    public final void IY() {
        OC0.hm("");
        abstract$.zQ();
        Vv0 history = Vv0.GU;
        ArrayList<sf0_2> copy;
        synchronized (history.rc) {
            copy = new ArrayList<>();
            for (Object message : history.rc) {
                copy.add((sf0_2) message);
            }
        }
        for (sf0_2 message : copy) {
            mp(message, true);
        }
    }

    @Override
    public final void yI() {
        super.yI();
        OF = null;
        Z30 = null;
        ul0 = true;
    }

    @Override
    public final void Ib(Jn0 style) {
        super.Ib(style);
        OF = null;
        Z30 = null;
        ul0 = true;
    }

    @Override
    public final void HP(zk0_1 context) {
        if (dd0) {
            dd0 = false;
            Na0.Iu();
            Na0.Xr0(Na0.g1.hm);
        }
        if (!tw0_0.kz0()) {
            if (dw_2.kt0 != JU) {
                ul0 = true;
            }
            if (OF == null && Na0.Jj0 != null) {
                OF = Na0.Jj0;
            }
            if (Z30 == null && zy0.Jj0 != null) {
                Z30 = zy0.Jj0;
            }
            wl0_2 background = OF;
            if (background != null && Z30 != null && ul0) {
                byte alpha = (byte) ((float) dw_2.kt0 / 100.0F * 255.0F);
                Na0.Jj0 = background.so(new gn_0((byte) -1, (byte) -1, (byte) -1, alpha));
                alpha = (byte) ((float) dw_2.kt0 / 100.0F * 255.0F);
                zy0.Jj0 = Z30.so(new gn_0((byte) -1, (byte) -1, (byte) -1, alpha));
                ul0 = false;
                JU = dw_2.kt0;
            }
        }
        super.HP(context);
    }

    public final void iX(String recipient) {
        if (!b5.Of()) {
            lpt6__0.v90(b5);
        }
        if (recipient != null && !recipient.isEmpty()) {
            dG0 = recipient;
            D20(zo_0.YL);
            if (tw0_0.kz0() && !eE) {
                P0.BK.Ll(true);
                P0.W3.Ll(false);
                P0.Qw0(P0.BK);
            }
        }
    }

    public final void ax0(String name) {
        Iterator filters = n6.iterator();
        Iterator buttons = WA.iterator();
        while (filters.hasNext() && buttons.hasNext()) {
            HK filter = (HK) filters.next();
            W9 button = (W9) buttons.next();
            if (name.equalsIgnoreCase(filter.eC0)) {
                BT(button, filter);
                return;
            }
        }
    }

    public final void H6(VU member) {
        if (member == null || member.I8.vn()) {
            return;
        }
        b5.Gv(new StringBuilder().append(((wn0_0) b5.dI0).YA.toString()).append("{M:").append(member.pu).append("}").toString());
        lpt6__0.v90(b5);
    }

    public final void HA0(K5 item) {
        if (item == null) {
            return;
        }
        b5.Gv(new StringBuilder().append(((wn0_0) b5.dI0).YA.toString()).append("{I:").append(item.nn.Br).append("}").toString());
        lpt6__0.v90(b5);
    }

    @Override
    public final void Mq0(Jn0 style) {
        super.Mq0(style);
    }

    @Override
    public final void Ll(boolean visible) {
        boolean hidden = !visible;
        hS.ER.lK0(hidden);
        super.Ll(visible);
        if (visible && tw0_0.kz0() && (jj0 || bO)) {
            jj0 = false;
            bO = false;
            k3();
        }
        if (visible) {
            tw0_0.rl.Id();
        }
        if (!tw0_0.kz0() && dw_2.mi != hidden) {
            dw_2.mi = hidden;
            dw_2.Va = true;
            ul0 = true;
        }
    }

    public final void ep0() {
        Nd0(bi0.ER.U20());
    }

    public final void UW() {
        k_0 monsterSelected = value -> H6((VU) value);
        k_0 itemSelected = value -> HA0((K5) value);
        yo_0 initialization = pv0_0.zy0;
        Vt0 menu = new Vt0();
        Mj roster = tw0_0.rl.PC0;
        ArrayList<VU> members = new ArrayList<>();
        for (short i = 0; i < roster.V2(); i++) {
            VU member = roster.Ry0(i);
            if (member != null) {
                members.add(member);
            }
        }
        menu.hx.add(pv0_0.ce(monsterSelected, members, false));
        menu.hx.add(pv0_0.De0(itemSelected, null, false));
        UA.zd(menu, x70);
    }

    public final void sc0() {
        Na0.Xr0(99999);
    }

    public final void BT(W9 selected, HK filter) {
        for (Object value : WA) {
            W9 button = (W9) value;
            button.pw0(true);
            button.ER.lK0(button == selected);
        }
        uJ.clear();
        uJ.addAll(filter.d4);
        IY();
        BR client = tw0_0.rl;
        if (client != null) {
            client.SJ(filter, false);
        }
    }

    public final void Ld(ge_0 view, byte type, String name, String target, StringBuilder output) {
        xe_1 button = new xe_1(xq_1.pz0("[", name, "]"));
        button.uf("chat-playername");
        button.RR(() -> NH(type, target, name, button));
        int index = sW.getAndAdd(1);
        if (view != null) view.wR(button, new StringBuilder("btn").append(index).toString());
        else abstract$.hY(button, new StringBuilder("btn").append(index).toString());
        output.append("<button name=\"btn").append(index).append("\" style=\"")
                .append("margin: 0px;").append("\"/> ");
    }

    public final void aD0(int first, int second, int third) {
        rk_2 text = b5.dI0;
        int start = -1;
        for (int i = 0; i < ((wn0_0) text).YA.length(); i++) {
            wn0_0 current = (wn0_0) text;
            char character = current.YA.charAt(i);
            if (character == '{') {
                start = i;
            } else if (character == '}') {
                if (start >= 0) {
                    String token = current.YA.subSequence(start, i + 1).toString();
                    if (token.startsWith("{M:")) {
                        CH0 id = CH0.j1;
                        try {
                            id = CH0.Ab(Long.parseLong(token.substring(3, token.length() - 1)));
                        } catch (NumberFormatException ignored) {
                        }
                        VU member = null;
                        if (id.uI0()) {
                            BR client = tw0_0.rl;
                            client.getClass();
                            member = client.FJ0(id, _volatile.COm9);
                        }
                        if (member != null && !member.I8.vn()) {
                            int length = Long.toString(member.pu.Sa).length() + 4;
                            StringBuilder display = new StringBuilder();
                            display.append('[');
                            display.append(member.na0());
                            display.append(']');
                            while (display.length() < length) {
                                display.append('\u2800');
                            }
                            int displayLength = display.length();
                            StringBuilder replacement = new StringBuilder();
                            replacement.append("{M:");
                            while (length < displayLength) {
                                replacement.append('0');
                                length++;
                            }
                            replacement.append(member.pu);
                            replacement.append("}");
                            wn0_0 editor = (wn0_0) b5.dI0;
                            editor.b1(replacement.toString(), display.toString());
                            if (replacement.length() != token.length()) {
                                current.sb(start, token.length(), replacement.toString());
                                return;
                            }
                        }
                    } else if (token.startsWith("{I:")) {
                        CH0 id = CH0.j1;
                        try {
                            id = CH0.Ab(Long.parseLong(token.substring(3, token.length() - 1)));
                        } catch (NumberFormatException ignored) {
                        }
                        BR client = tw0_0.rl;
                        K5 item = client.Bb(client.u40).zg(id);
                        if (item != null) {
                            int length = Long.toString(item.nn.Br.Sa).length() + 4;
                            StringBuilder display = new StringBuilder();
                            display.append('[');
                            display.append(item.Fh0());
                            display.append(']');
                            while (display.length() < length) {
                                display.append('\u2800');
                            }
                            int displayLength = display.length();
                            StringBuilder replacement = new StringBuilder();
                            replacement.append("{I:");
                            while (length < displayLength) {
                                replacement.append('0');
                                length++;
                            }
                            replacement.append(item.nn.Br);
                            replacement.append("}");
                            wn0_0 editor = (wn0_0) b5.dI0;
                            editor.b1(replacement.toString(), display.toString());
                            if (replacement.length() != token.length()) {
                                current.sb(start, token.length(), replacement.toString());
                                return;
                            }
                        }
                    }
                }
                start = -1;
            }
        }
    }

    public final void lL0() {
        if (!eE) {
            return;
        }
        fy_2 content = K00;
        if (content != null) {
            content.em();
            u3(K00);
        }
        tk0_0 top = GR;
        if (top != null) {
            top.em();
        }
        fy_2 bottom = zy0;
        if (bottom != null) {
            bottom.em();
        }
        WA.clear();
        for (Object value : n6) {
            HK filter = (HK) value;
            W9 button = new W9();
            button.SU(filter.eC0);
            button.uf("togglebutton-normal");
            button.RR(() -> Q90(button, filter));
            if (dw_2.Jy0.equalsIgnoreCase(filter.eC0)) {
                button.ER.lK0(true);
            }
            WA.add(button);
        }
        W9[] buttons = (W9[]) WA.toArray(new W9[0]);
        content = new fy_2();
        K00 = content;
        content.uf("content");
        top = new tk0_0(new A40());
        GR = top;
        top.uf("top");
        bottom = new fy_2();
        zy0 = bottom;
        bottom.uf("bottom");
        int size = tw0_0.kz0() ? 60 : 24;
        int scale = tw0_0.kz0() ? 3 : 1;
        qj_2 settings = new qj_2("", size, size);
        if (!tw0_0.kz0()) {
            settings.tp0.r8(new LPT6_[] { fn_0.qz0().g80 });
        }
        settings.tp0.gY = 5;
        settings.tp0.a4 = 5;
        settings.tp0.EJ0 = (float) scale;
        settings.uf("togglebutton-settings");
        settings.RR(XH::H4);
        qj_2 notifications = new qj_2("", size, size);
        if (!tw0_0.kz0()) {
            notifications.tp0.r8(new LPT6_[] { fn_0.qz0().ij });
        }
        notifications.tp0.gY = 5;
        notifications.tp0.a4 = 5;
        notifications.tp0.EJ0 = (float) scale;
        notifications.uf("togglebutton-notification");
        notifications.RR(XH::Jt0);
        qj_2 language = new qj_2("", size, size);
        Ag0 = language;
        Br0 flag = language.tp0;
        int offset = scale == 3 ? 14 : 8;
        flag.gY = 5;
        flag.a4 = offset;
        flag.EJ0 = (float) scale;
        language.uf("togglebutton-normal");
        Ag0.RR(XH::G7);
        language = Ag0;
        if (language != null) {
            fn_0 images = fn_0.qz0();
            byte index = G50.Rw(dw_2.fP).Sf0;
            language.tp0.r8(new LPT6_[] { images.jp[index] });
        }
        if (hS.ER.U20()) {
            K00.WQ(D5.fE0(K00, K00).Xq(new ya_1[] {
                    XN.sA(K00, K00).LPt3(new le0_2[] { hS })
            }));
            K00.x40(XN.sA(K00, K00).Xq(new ya_1[] {
                    D5.fE0(K00, K00).LPt3(new le0_2[] { hS })
            }));
        } else {
            if (!tw0_0.kz0()) {
                for (W9 button : buttons) {
                    GR.gg0.vx0(button);
                }
                le0_2 spacer = new le0_2(null, false);
                GR.gg0.vx0(spacer).goto$();
                GR.gg0.vx0(Ag0).Rr0.vx0(settings).Rr0.vx0(notifications)
                        .Rr0.vx0(bi0).Rr0.vx0(hS);
            } else {
                ia0_1 tabs = new ia0_1(1);
                for (W9 button : buttons) {
                    button.lt0();
                    tabs.F9(tabs.fU(), button);
                }
                lo0_0 scroll = new lo0_0(null);
                he = scroll;
                scroll.AH0(tabs);
                GR.gg0.FU.Jq(60.0F);
                GR.gg0.vx0(he).goto$().Rr0.vx0(Ag0).Rr0.vx0(settings)
                        .Rr0.vx0(notifications).Rr0.vx0(hS);
            }
            zy0.WQ(zy0.C7(new le0_2[] { Hy, b5, x70, Qp }));
            zy0.x40(zy0.hb(new le0_2[] { Hy, b5, x70, Qp }));
            K00.WQ(D5.fE0(K00, K00).Xq(new ya_1[] {
                    K00.hb(new le0_2[] { GR }),
                    K00.hb(new le0_2[] { Na0 }),
                    K00.C7(new le0_2[] { zy0 })
            }));
            K00.x40(XN.sA(K00, K00).Xq(new ya_1[] {
                    K00.C7(new le0_2[] { GR }),
                    K00.hb(new le0_2[] { Na0 }),
                    K00.C7(new le0_2[] { zy0 })
            }));
        }
        fy_2 panel = K00;
        F9(fU(), panel);
    }

    public final void mp(sf0_2 message, boolean replay) {
        zo_0 channel = message.hB0;
        zo_0 whisper = zo_0.YL;
        if (channel != whisper || message.Zy < 1) {
            if (uJ.contains(channel)) {
                return;
            }
            channel = message.hB0;
            if (channel != whisper && channel != zo_0.kJ0 && channel != zo_0.m5
                    && dw_2.U70().contains(message.Ww)) {
                return;
            }
        }
        int count = ++Ew;
        int configured = dw_2.dk;
        int limit = configured == 1 ? 300 : configured == 2 ? 1050 : configured == 3 ? 2500 : 150;
        int override = lpt3__1.oo;
        if (override > 0) {
            limit = override;
        }
        if (count > limit) {
            Ew = 0;
            IY();
            return;
        }
        boolean sounded = false;
        if (!replay && dw_2.He0 && message.hB0 == whisper && message.Mp0.uI0()) {
            tw0_0.RE0.P7((short) 1616);
            sounded = true;
        }
        String text = wq_0.P60(message.lw);
        if (message.de) {
            text = g7_0.Zx(6079, new StringBuilder("<span style=\"font: default; color: #888;margin:0; padding:0;\">"), "</span>");
        }
        if (text.contains("\n")) {
            text = text.replaceAll("\\n", message.hB0 == zo_0.n4 ? " " : "<br/>");
        }
        if (!replay && !sounded && dw_2.Zd && message.hB0 != whisper && message.hB0 != zo_0.n4) {
            if (dw_2.FB == null) {
                dw_2.FB = dw_2.lL0.split(";");
            }
            for (String keyword : dw_2.FB) {
                if (!keyword.isEmpty() && keyword.trim().length() != 0 && text.contains(keyword)) {
                    tw0_0.RE0.P7((short) 1615);
                    sounded = true;
                    break;
                }
            }
            String playerName = null;
            yt_1 world = tw0_0.e60;
            if (world != null) {
                E90 player = world.jB0;
                if (player != null) {
                    playerName = player.oc0.toLowerCase();
                }
            }
            if (!sounded && playerName != null && !message.At0.isEmpty()
                    && !playerName.equalsIgnoreCase(message.At0)
                    && message.lw.toLowerCase().contains(playerName)) {
                tw0_0.RE0.P7((short) 1615);
            }
        }
        StringBuilder output = new StringBuilder();
        output.append("<div style=\"display: inline; word-wrap: break-word;\">");
        if (dw_2.t90) {
            output.append(new StringBuilder("[").append(Y90.format(Long.valueOf((long) message.k6 * 1000L))).toString())
                    .append("] ");
        }
        boolean tagged = false;
        if (dw_2.YN) {
            output.append(new StringBuilder("[").append(sm0_0.c0(message.hB0.Yf)).toString()).append("]");
            tagged = true;
        }
        if (dw_2.QE && message.hB0.bJ && message.Ww != null) {
            output.append("[").append(message.Ww.na).append("]");
            output.append(" ");
        } else if (tagged) {
            output.append(" ");
        }
        byte rank = message.Zy;
        if (rank > 0) {
            long sender = message.Mp0.Sa;
            if (sender == 348339L) {
                output.append(new StringBuilder("<img src=\"icon-sm\" alt=\"")
                        .append(sm0_0.c0(1561)).append("\"/> ").toString());
            } else if (sender == 16413433L || sender == 16361786L) {
                output.append(new StringBuilder("<img src=\"icon-gd\" alt=\"")
                        .append(sm0_0.c0(1562)).append("\"/> ").toString());
            } else {
                String icon;
                switch (rank) {
                    case 1: icon = "cm"; break;
                    case 2:
                    case 3:
                    case 4: icon = "mod"; break;
                    case 5:
                    case 6: icon = "gm"; break;
                    case 7: icon = "sgm"; break;
                    case 8: icon = "hgm"; break;
                    case 9: icon = "dev"; break;
                    case 10: icon = "adm"; break;
                    default: icon = null; break;
                }
                if (icon != null) {
                    output.append(new StringBuilder("<img src=\"icon-").append(icon).append("\" alt=\"")
                            .append(sm0_0.c0(1550 + message.Zy)).append("\"/> ").toString());
                }
            }
        }
        fa0_0 friends = tw0_0.rl.q50;
        CH0 sender = message.Mp0;
        if (friends.lx.containsKey(sender)) {
            output.append(new StringBuilder("<img src=\"icon-friend\" alt=\"")
                    .append(sm0_0.c0(1599)).append("\"/> ").toString());
        }
        if (message.At0.length() > 0) {
            int type = message.hB0.ordinal();
            if (type == 8) {
                output.append(message.At0).append(": ");
            } else {
                if (type == 2) {
                    output.append(sm0_0.c0(message.Mp0.Uz0() ? 1549 : 1548));
                    output.append(" ");
                }
                output.append("<button name=\"player\" value=\"").append(message.At0).append("\"></button>: ");
            }
        }
        output.append("<chat style=\"font-family: ").append(message.hB0.Yb0).append("; \">");
        rank = message.Zy;
        if (rank > 0 || message.hB0 == zo_0.kJ0) {
            aL0(null, text, message.Mp0, output, true, false, rank >= 4);
        } else if (text.contains("{") && text.contains("}")) {
            aL0(null, text, message.Mp0, output, false, false, false);
        } else if (text.contains("[") && text.contains("]")
                && (message.hB0 == zo_0.n4 || message.Zy >= 4)) {
            aL0(null, text, message.Mp0, output, false, false, true);
        } else {
            output.append(text);
        }
        output.append("</chat>");
        output.append("</div>");
        KB scroll = Na0.g1;
        boolean atBottom = scroll.hm == scroll.VP;
        OC0.sV(output.toString());
        if (atBottom || replay) {
            dd0 = true;
        }
        if (!replay && tw0_0.kz0() && message.Mp0.uI0()) {
            channel = message.hB0;
            if (channel == zo_0.YL && !jj0) {
                jj0 = true;
                k3();
            } else if (channel == zo_0.kJ0 && !bO) {
                bO = true;
                k3();
            }
        }
    }

    public final void aL0(ge_0 view, String text, CH0 sender, StringBuilder output,
            boolean links, boolean plain, boolean colors) {
        int length = text.length();
        characters:
        for (int i = 0; i < length; i++) {
            char character = text.charAt(i);
            if (character == '{') {
                token:
                {
                    int end = text.indexOf('}', i);
                    if (end <= -1) {
                        break token;
                    }
                    String contents = text.substring(i + 1, end);
                    short species = -1;
                    byte form = 0;
                    byte gender = 0;
                    boolean shiny = false;
                    boolean variant = false;
                    CH0 target = CH0.j1;
                    short item = -1;
                    byte itemVariant = 0;
                    boolean valid = true;
                    for (String field : contents.split(";")) {
                        if (!field.contains(":")) {
                            continue;
                        }
                        String[] pair = field.split(":");
                        if (pair[0].isEmpty()) {
                            continue;
                        }
                        char key = pair[0].charAt(0);
                        try {
                            switch (key) {
                                case 'G': gender = Byte.parseByte(pair[1]); break;
                                case 'F': form = Byte.parseByte(pair[1]); break;
                                case 'S': shiny = "1".equalsIgnoreCase(pair[1]); break;
                                case 'O': target = CH0.Ab(Long.parseLong(pair[1])); break;
                                case 'M': species = Short.parseShort(pair[1]); break;
                                case 'I': item = Short.parseShort(pair[1]); break;
                                case 'C': itemVariant = Byte.parseByte(pair[1]); break;
                                case 'A': variant = "1".equalsIgnoreCase(pair[1]); break;
                                default: break;
                            }
                        } catch (Exception ignored) {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        boolean handled = false;
                        if (item > 0) {
                            if (species <= 0) {
                                handled = ML(view, item, itemVariant, output, plain);
                            }
                        } else if (species >= 1 && !target.Uz0()) {
                            handled = oe0(view, species, gender, form, shiny, variant, sender, target, output, plain);
                        }
                        if (handled) {
                            i += contents.length() + 1;
                            continue characters;
                        }
                    }
                    if (!contents.startsWith("ACP") || !tw0_0.Eu(1) || sender.uI0()) {
                        break token;
                    }
                    byte type = 0;
                    String url = "";
                    String name = "";
                    for (String field : contents.split(";")) {
                        if (!field.contains(":")) {
                            continue;
                        }
                        String[] pair = field.split(":");
                        if (pair[0].isEmpty()) {
                            continue;
                        }
                        try {
                            type = Byte.parseByte(pair[0]);
                        } catch (NumberFormatException ignored) {
                            break token;
                        }
                        String value = pair[1];
                        String base;
                        switch (type) {
                            case 1: base = "https://manage.pokemmo.com/players/by-name/"; break;
                            case 2: base = "https://manage.pokemmo.com/players/"; break;
                            case 3: base = "https://manage.pokemmo.com/accounts/by-name/"; break;
                            case 4: base = "https://manage.pokemmo.com/accounts/"; break;
                            case 5: base = "https://manage.pokemmo.com/watchlist/"; break;
                            default: break token;
                        }
                        url = jj0_0.hw0(base, value);
                        name = value;
                    }
                    Ld(view, type, name, url, output);
                    i += contents.length() + 1;
                    continue characters;
                }
            } else if (character == 'h') {
                if (!plain && links && (text.startsWith("http://", i) || text.startsWith("https://", i))) {
                    int end = i + 7;
                    if (text.startsWith("https://", i)) {
                        end = i + 8;
                    }
                    while (end < length) {
                        char value = text.charAt(end);
                        if ("./\\%?_-#()&@+=~$,;".indexOf(value) >= 0
                                || value >= '0' && value <= '9'
                                || value >= 'a' && value <= 'z'
                                || value >= 'A' && value <= 'Z') {
                            end++;
                        } else {
                            break;
                        }
                    }
                    String url = text.substring(i, end);
                    output.append("<a style=\"display: inline; float: left; font: link\" href=\"")
                            .append(url).append("\" >").append(url).append("</a>");
                    i = end - 1;
                    continue;
                }
            } else if (character == '[' && colors) {
                int close = text.indexOf(']', i);
                if (close > -1) {
                    int hash = text.indexOf('#', close);
                    String color = text.substring(i + 1, close);
                    if (hash > -1) {
                        int start = close + 1;
                        int end = hash - 1;
                        if (start < end) {
                            String value = text.substring(start, end);
                            if (Pattern.matches("#[A-Fa-f0-9]{3,6}", color)) {
                                output.append("<span style=\"font: default; color: ").append(color)
                                        .append(";margin:0; padding:0;\">");
                                output.append(value);
                                output.append("</span>");
                            }
                            i += value.length() + (color.length() + 2) + 2;
                            continue;
                        }
                    }
                }
            } else if (character == '%' && colors) {
                int space = text.indexOf(' ', i);
                if (space > -1) {
                    int close = text.indexOf('%', space);
                    String color = text.substring(i + 1, space);
                    if (gn_0.Er0(color) != null) {
                        if (close > -1) {
                            int start = space + 1;
                            int end = close - 1;
                            if (start >= end) {
                                i += close - i - 1;
                                continue;
                            }
                            String value = text.substring(start, end);
                            output.append("<span style=\"font: default; color: ").append(color)
                                    .append(";margin:0; padding:0;\">");
                            output.append(value);
                            output.append("</span>");
                            i += color.length() + (value.length() + 1);
                        } else {
                            String value = text.substring(space + 1);
                            output.append("<span style=\"font: default; color: ").append(color)
                                    .append(";margin:0; padding:0;\">");
                            output.append(value);
                            output.append("</span>");
                            i += color.length() + (value.length() + 1);
                        }
                        continue;
                    }
                }
            }
            output.append(character);
        }
    }
}
