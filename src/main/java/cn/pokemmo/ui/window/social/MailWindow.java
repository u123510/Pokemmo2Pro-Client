package cn.pokemmo.ui.window.social;

import f.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 游戏内邮件阅读与书写发送窗口
 *
 * 原混淆类: f.qu_2
 */
public class MailWindow extends cx_0 implements tr_1  {
    public final qu_2 asBridge() {
        return (qu_2) (Object) this;
    }

    public final P8 VL0;
    public final fy_2 BQ;
    public final Qm0 Dw;
    public final Qm0 j4;
    public final fy_2 Xf0;
    public final cg_0 T10;
    public final cg_0 SH0;
    public final cg_0 v10;
    public final VL0 qq0;
    public final ga0_1[] gT;
    public final mi_0[] au;
    public CH0 dw0;
    public cg_0 E7;
    public cg_0 gR;
    public cg_0 XH0;
    public JB0[] KA;
    public xe_1 uJ0;
    public xe_1 Y60;
    public xe_1 A7;
    public final xe_1 EJ0;
    public final cg_0 z8;
    public final boolean D7;
    public boolean F90;
    public l3_0 NW;

    public static int YC0(VU monster) {
        return monster.I8.ou0;
    }

    public static VU[] com2(int length) {
        return new VU[length];
    }

    public static void Se0(ga0_1 slot) {
        yo_0 filter = pv0_0.uR;
        UA.zd(pv0_0.S20(slot, filter, slot.wE0 > 0), slot);
    }

    public static KZ ps(HashSet<String> names, String prefix, int position, KZ previous) {
        String[] matches = names.stream().filter(name -> Hp0(prefix, name)).toArray(qu_2::kx0);
        return new gj_2(prefix.length(), true, matches);
    }

    public static String[] kx0(int length) {
        return new String[length];
    }

    public static boolean Hp0(String prefix, String name) {
        return name.toLowerCase().startsWith(prefix.toLowerCase());
    }

    public MailWindow(boolean attachments, VU initial) {
        super(tw0_0.kz0());
        dw0 = CH0.j1;
        uJ0 = null;
        Y60 = null;
        A7 = null;
        uf("mail-window");
        Hy(sm0_0.c0(5827));
        ff0(1);
        Pb0(this::close);
        P8 tabs = new P8();
        VL0 = tabs;
        tabs.I6(false);
        fy_2 frame = new fy_2();
        BQ = frame;
        I7 horizontal = XZ.BC0(frame.lo0(), new ya_1[] {
                frame.H10().qd(10).LPt3(new le0_2[] { tabs }) }, frame);
        frame.x40(horizontal.Xq(new ya_1[] { frame.hb(new le0_2[] { tabs }) }));
        if (!attachments) attachments = Qy0.Sq().MK().Qf() != null;
        D7 = attachments;
        Dw = new Qm0(asBridge(), false);
        j4 = new Qm0(asBridge(), true);
        f1();
        Xf0 = new fy_2();
        lo0_0 scroll = new lo0_0();
        scroll.uf("write-mail");
        cn_0 recipientLabel = new cn_0(sm0_0.c0(5828));
        recipientLabel.uf("label-title-small");
        T10 = new cg_0();
        T10.I7();
        recipientLabel.kl();
        T10.ef0(16);
        T10.T1();
        T10.LPt8("[a-zA-Z]");
        HashSet<String> names = new HashSet<>();
        for (Object value : tw0_0.rl.U20()) names.add(((GR) value).getName());
        if (tw0_0.rl.t7() != null) {
            for (ce0_0 member : tw0_0.rl.t7().UH()) names.add(member.getName());
        }
        T10.aO((prefix, position, previous) -> ps(names, prefix, position, previous));
        xe_1 contacts = new xe_1("+");
        contacts.RR(() -> ov0(contacts));
        cn_0 subjectLabel = new cn_0(sm0_0.c0(5829));
        subjectLabel.uf("label-title-small");
        SH0 = new cg_0();
        subjectLabel.kl();
        SH0.ef0(40);
        cn_0 bodyLabel = new cn_0(sm0_0.c0(5830));
        bodyLabel.uf("label-title-small");
        v10 = new cg_0();
        bodyLabel.kl();
        v10.ef0(2000);
        v10.c2();
        lo0_0 bodyScroll = new lo0_0(v10);
        cn_0 moneyLabel = new cn_0(sm0_0.c0(5831));
        moneyLabel.uf("label-title-small");
        Aj amount = new Aj(0, 2000000000, 0);
        qq0 = new VL0(amount);
        amount.Kj(this::SA0);
        qq0.j6();
        qq0.pw0(attachments);
        cn_0 itemsLabel = new cn_0(sm0_0.c0(5832));
        itemsLabel.uf("label-title-small");
        gT = new ga0_1[5];
        for (int i = 0; i < gT.length; i++) {
            ga0_1 slot = new ga0_1();
            slot.of(() -> Se0(slot));
            slot.RR(this::SA0);
            slot.pw0(attachments);
            if (!attachments) {
                slot.Xr0(sm0_0.c0(5846));
                slot.Bb(0);
            }
            gT[i] = slot;
        }
        cn_0 monstersLabel = new cn_0(sm0_0.c0(5833));
        monstersLabel.uf("label-title-small");
        au = new el_0[5];
        for (int i = 0; i < au.length; i++) {
            el_0 slot = new el_0();
            slot.Hv0();
            slot.pw0(attachments);
            slot.Mj0(slot.uo());
            slot.RR(this::SA0);
            slot.tD0(() -> ul(slot));
            if (!attachments) {
                slot.Xr0(sm0_0.c0(5846));
                slot.Bb(0);
            }
            au[i] = slot;
        }
        if (!attachments) {
            qq0.Xr0(sm0_0.c0(5846));
            qq0.Bb(0);
        }
        xe_1 send = new xe_1(sm0_0.c0(5834));
        EJ0 = send;
        pa0_0 alignment = pa0_0.Ol;
        send.qF0(alignment);
        send.RR(this::Bg);
        xe_1 clear = new xe_1(sm0_0.c0(5841));
        clear.qF0(alignment);
        clear.RR(this::UM);
        cn_0 feeLabel = new cn_0(sm0_0.c0(5840));
        feeLabel.uf("label-title-small");
        z8 = new cg_0();
        feeLabel.kl();
        z8.pw0(false);
        SA0();
        fy_2 form = new fy_2();
        form.WQ(form.Ou0(new ya_1[] {
                form.C7(new le0_2[] { recipientLabel, T10, contacts }),
                form.C7(new le0_2[] { subjectLabel, SH0 }),
                form.C7(new le0_2[] { bodyLabel, bodyScroll }),
                form.C7(new le0_2[] { moneyLabel, qq0 }),
                form.C7(new le0_2[] { itemsLabel }).LPt3(gT),
                form.C7(new le0_2[] { monstersLabel }).LPt3(au),
                form.C7(new le0_2[] { feeLabel, z8 }),
                form.C7(new le0_2[] { clear }).Ze0().Kn0(send)
        }));
        form.x40(form.bx0(new ya_1[] {
                form.hb(new le0_2[] { recipientLabel, T10, contacts }),
                form.hb(new le0_2[] { subjectLabel, SH0 }),
                form.hb(new le0_2[] { bodyLabel, bodyScroll }),
                form.hb(new le0_2[] { moneyLabel, qq0 }),
                form.hb(new le0_2[] { itemsLabel }).LPt3(gT),
                form.hb(new le0_2[] { monstersLabel }).LPt3(au),
                form.hb(new le0_2[] { feeLabel, z8 }),
                form.hb(new le0_2[] { clear, send })
        }));
        scroll.AH0(form);
        Xf0.WQ(Xf0.lo0().Xq(new ya_1[] { Xf0.C7(new le0_2[] { scroll }) }));
        Xf0.x40(Xf0.H10().qd(tw0_0.kz0() ? 0 : 30).Xq(new ya_1[] { Xf0.lo0().Kn0(scroll) }));
        Dw.um();
        j4.um();
        VL0.Wq(Dw.Ey, sm0_0.c0(5835)).Kj(this::f1);
        VL0.Wq(Xf0, sm0_0.c0(5834)).Kj(this::f1);
        VL0.Wq(j4.Ey, sm0_0.c0(5848)).Kj(this::f1);
        SL(BQ);
        Dw.RE0((short) 0);
        j4.RE0((short) 0);
        if (initial != null) Dg0(initial);
    }

    public final List<VU> Nq() {
        return Arrays.stream(tw0_0.rl.r1(_volatile.BV).y0()).filter(this::dM)
                .sorted(Comparator.comparingInt(qu_2::YC0)).collect(Collectors.toList());
    }

    public final boolean dM(VU monster) {
        return monster != null && !S.ZT(monster, Arrays.stream(au).map(mi_0::ol0)
                .filter(Objects::nonNull).toArray(qu_2::com2));
    }

    public final void mp0(List<JB0> attachments) {
        for (JB0 attachment : attachments) {
            o60_0 item = attachment.Uw;
            if (item.ww) continue;
            tw0_0.rl.f2(item.sA, (byte) 2, item.Uv0, Dw.GM);
            return;
        }
    }

    public final void Ge0(List<JB0> attachments) {
        for (JB0 attachment : attachments) {
            o60_0 item = attachment.Uw;
            if (item.ww) continue;
            tw0_0.rl.f2(item.sA, (byte) 1, item.Uv0, Dw.GM);
            return;
        }
    }

    public final void a7(List<JB0> attachments) {
        for (JB0 attachment : attachments) {
            o60_0 item = attachment.Uw;
            if (item.ww) continue;
            tw0_0.rl.f2(item.sA, (byte) 0, item.Uv0, Dw.GM);
            return;
        }
    }

    public final void q80(St0 mail) {
        VL0.Zd((com2__3) VL0.g6.get(1));
        T10.Gv(mail.lk0);
        SH0.Gv(ig_0.u9(5845, new StringBuilder(), " ").append(mail.DN).toString());
        lpt6__0.v90(v10);
    }

    public final void Kj0() {
        EJ0.pw0(true);
    }

    public final void pq(W9 checkbox) {
        if (checkbox.ER.U20() != dw_2.wL) {
            dw_2.wL = checkbox.ER.U20();
            dw_2.CY();
        }
        F00(true);
    }

    public final void ul(el_0 slot) {
        List<VU> available = Nq();
        UA.zd(pv0_0.instanceof$(slot, available, slot.AG != null), slot);
    }

    public final void ov0(xe_1 button) {
        UA.rL(pv0_0.yx0(T10), this, button.A20, button.SB0 + button.OB);
    }

    public final void SA0() {
        int fee = qq0.eB0 > 0 ? 400 : 100;
        HashSet<CH0> items = new HashSet<>();
        HashSet<CH0> monsters = new HashSet<>();
        for (ga0_1 slot : gT) {
            if (slot.wE0 < 1) continue;
            if (!items.add(slot.q0)) slot.UR(null);
            else fee += 300;
        }
        for (mi_0 slot : au) {
            VU monster = slot.AG;
            if (monster == null) continue;
            if (!monsters.add(monster.pu)) slot.Db(null);
            else fee += 300;
        }
        if (!lpt3__1.Qm && tw0_0.Eu(7)) fee = 0;
        else if (!lpt3__1.Qm && tw0_0.Eu(1)) fee -= 100;
        z8.mm(new StringBuilder("$").append(NumberFormat.getInstance().format((long) fee)).toString());
    }

    public final void F00(boolean confirmed) {
        if (T10.yy() < 2 || T10.yy() > 16) {
            tn(ez0_0.CoM3);
            return;
        }
        if (SH0.yy() < 1) SH0.Gv(sm0_0.c0(5905));
        if (SH0.yy() > 40) {
            tn(ez0_0.JC0);
            return;
        }
        if (v10.yy() < 1 || v10.yy() > 2000) {
            tn(ez0_0.kO);
            return;
        }
        EJ0.pw0(false);
        ArrayList<com1__3> attachments = new ArrayList<>();
        int money = qq0.eB0;
        if (money > 0) attachments.add(new com1__3((byte) 2, CH0.j1, money, (short) 0));
        for (ga0_1 slot : gT) {
            if (slot.wE0 > 0) attachments.add(new com1__3((byte) 0, slot.q0, 0, slot.ax));
        }
        for (mi_0 slot : au) {
            VU monster = slot.AG;
            if (monster != null) attachments.add(new com1__3((byte) 1, monster.pu, 0, (short) 0));
        }
        if (!confirmed && !attachments.isEmpty() && !dw_2.wL) {
            tk0_0 panel = new tk0_0(new A40());
            A40 layout = panel.gg0;
            layout.FU.ys0(5.0F);
            cn_0 warning = new cn_0(null, 0);
            warning.Sk(sm0_0.c0(5903));
            j1_0 cell = layout.vx0(warning);
            cell.d80 = 2;
            cell.Rr0.Rg();
            W9 checkbox = new W9();
            checkbox.ER.lK0(dw_2.wL);
            cn_0 label = new cn_0(null, 0);
            label.Sk(sm0_0.c0(5904));
            label.coM8(checkbox);
            layout.vx0(checkbox).Rr0.vx0(label);
            Qy0 root = Qy0.yI0;
            lpt3__4 dialog = new lpt3__4(panel, () -> pq(checkbox), null, xX.Bm);
            dialog.qp0.RR(this::Kj0);
            dialog.D80 = true;
            dialog.gY.SU(sm0_0.c0(5834));
            dialog.qp0.SU(sm0_0.c0(nf0_0.Bq0));
            root.sr0(dialog);
            return;
        }
        BR client = tw0_0.rl;
        String recipient = ((wn0_0) T10.dI0).YA.toString();
        String subject = ((wn0_0) SH0.dI0).YA.toString();
        String body = ((wn0_0) v10.dI0).YA.toString();
        com1__3[] values = attachments.toArray(new com1__3[0]);
        client.fk0.uQ(new cf0_0(recipient, subject, body, values));
        j4.RE0((short) 0);
    }

    public final void f1() {
        COm3();
        Dw.F5(null);
        j4.F5(null);
        if (!tw0_0.kz0()) lt0();
    }

    public final void A20(St0 mail) {
        if (mail == null) {
            dw0 = CH0.j1;
            tw0_0.rl.qK(sm0_0.c0(5820));
            f1();
            return;
        }
        St0[] inbox = Dw.re0;
        if (inbox != null) {
            for (St0 entry : inbox) {
                if (entry.Tp.equals(mail.Tp)) {
                    entry.Vf = 0;
                    Dw.um();
                    break;
                }
            }
        }
        yt_1 player = tw0_0.e60;
        boolean sent = player != null && !mail.O8.equals(player.dj0);
        dw0 = mail.Tp;
        cg_0 sender = new cg_0(null, new wn0_0());
        E7 = sender;
        String senderName;
        if (sent) senderName = mail.cr0;
        else senderName = mail.switch$.uI0() ? mail.lk0 : sm0_0.dd(mail.lk0);
        sender.Gv(senderName);
        E7.RD(true);
        cg_0 subject = new cg_0(null, new wn0_0());
        gR = subject;
        subject.Gv(mail.switch$.uI0() ? mail.DN : sm0_0.dd(mail.DN));
        gR.RD(true);
        new Date().setTime((long) mail.F6 * 1000L);
        int age = mail.F6 - (int) (System.currentTimeMillis() / 1000L);
        cn_0 time = new cn_0(null, 0);
        time.Sk(tx_1.HU(age, 1));
        time.uf("label-title-small");
        cn_0 bodyLabel = new cn_0(null, 0);
        bodyLabel.Sk(sm0_0.c0(5830));
        bodyLabel.uf("label-title-small");
        cg_0 body = new cg_0(null, new wn0_0());
        XH0 = body;
        body.gu = true;
        body.RD(true);
        ArrayList<JB0> attachments = new ArrayList<>();
        JB0 money = null;
        ArrayList<JB0> items = new ArrayList<>();
        ArrayList<JB0> monsters = new ArrayList<>();
        ArrayList<JB0> other = new ArrayList<>();
        for (Object value : mail.ej0.values()) {
            o60_0 attachment = (o60_0) value;
            if (attachment.ww && !sent) continue;
            JB0 widget = new JB0(asBridge(), attachment, sent);
            attachments.add(widget);
            switch (attachment.Q7) {
                case 0: items.add(widget); break;
                case 1: monsters.add(widget); break;
                case 2: money = widget; break;
                default: other.add(widget);
            }
        }
        KA = attachments.toArray(new JB0[0]);
        xe_1 reply = new xe_1(sm0_0.c0(5844));
        reply.RR(() -> q80(mail));
        reply.Ll(mail.switch$.uI0());
        fy_2 panel = new fy_2();
        zc0_1 tag = null;
        if (!sent) {
            String tagStyle = HS.k70(mail.m10, mail.switch$);
            if (mail.switch$.Sa == 0L) tagStyle = "tag-system";
            if (!tagStyle.isEmpty()) {
                tag = new zc0_1();
                tag.uf("label-title");
                cn_0 icon = new cn_0(null, 0);
                icon.uf(tagStyle);
                tag.qG0(new le0_2[] { icon });
                tag.yj0 = sm0_0.c0(5799);
                tag.yB0();
                icon.yj0 = sm0_0.c0(5799);
                icon.yB0();
            }
        }
        panel.tI0();
        panel.WQ(panel.Ou0(new ya_1[] {
                panel.C7(new le0_2[] { tag, E7, time }),
                panel.C7(new le0_2[] { gR }),
                panel.C7(new le0_2[] { XH0 })
        }));
        panel.x40(panel.bx0(new ya_1[] {
                panel.hb(new le0_2[] { tag, E7, time }),
                panel.hb(new le0_2[] { gR }),
                panel.hb(new le0_2[] { XH0 })
        }));
        if (money != null) {
            cn_0 label = new cn_0(null, 0);
            label.Sk(sm0_0.c0(5831));
            label.uf("label-title-small");
            panel.pJ0.X20(panel.C7(new le0_2[] { !tw0_0.kz0() && sent ? label : null,
                    money.Td, sent ? null : money.Gv }));
            panel.L4.X20(panel.hb(new le0_2[] { !tw0_0.kz0() && sent ? label : null,
                    money.Td, sent ? null : money.Gv }));
        }
        if (!items.isEmpty()) {
            zc0_1 grid = attachmentGrid(items);
            cn_0 label = new cn_0(null, 0);
            label.Sk(sm0_0.c0(5832));
            label.uf("label-title-small");
            uJ0 = new xe_1(sm0_0.c0(5899));
            uJ0.RR(() -> a7(items));
            uJ0.uf("button-small2");
            I7 horizontal = new I7(panel);
            Hm0 vertical = new Hm0(panel);
            if (!tw0_0.kz0() && sent) {
                horizontal.Kn0(label);
                vertical.Kn0(label);
            }
            horizontal.Kn0(grid);
            vertical.Kn0(grid);
            if (!sent) {
                horizontal.Ze0().Kn0(uJ0);
                vertical.Kn0(uJ0);
            }
            panel.pJ0.X20(horizontal);
            panel.L4.X20(vertical);
        }
        if (!monsters.isEmpty()) {
            zc0_1 grid = attachmentGrid(monsters);
            cn_0 label = new cn_0(null, 0);
            label.Sk(sm0_0.c0(5833));
            label.uf("label-title-small");
            Y60 = new xe_1(sm0_0.c0(5897));
            Y60.RR(() -> Ge0(monsters));
            Y60.uf("button-small2");
            A7 = new xe_1(sm0_0.c0(5898));
            A7.RR(() -> mp0(monsters));
            A7.uf("button-small2");
            I7 horizontal = new I7(panel);
            Hm0 vertical = new Hm0(panel);
            if (!tw0_0.kz0() && sent) {
                horizontal.Kn0(label);
                vertical.Kn0(label);
            }
            horizontal.Kn0(grid);
            vertical.Kn0(grid);
            if (!sent && !tw0_0.kz0()) {
                horizontal.Ze0().X20(panel.hb(new le0_2[] { Y60, A7 }));
                vertical.X20(panel.C7(new le0_2[] { Y60, A7 }));
            }
            panel.pJ0.X20(horizontal);
            panel.L4.X20(vertical);
            if (!sent && tw0_0.kz0()) {
                panel.pJ0.X20(panel.C7(new le0_2[] { Y60 }).Ze0().Kn0(A7));
                panel.L4.X20(panel.hb(new le0_2[] { Y60, A7 }));
            }
        }
        for (JB0 attachment : other) {
            panel.pJ0.X20(panel.C7(new le0_2[] { attachment.Td, attachment.Gv }));
            panel.L4.X20(panel.hb(new le0_2[] { attachment.Td, attachment.Gv }));
        }
        panel.pJ0.X20(!mail.switch$.Uz0() && !sent ? panel.C7(new le0_2[] { reply }) : new I7(panel));
        panel.L4.X20(!mail.switch$.Uz0() && !sent ? panel.hb(new le0_2[] { reply }) : new Hm0(panel));
        lo0_0 scroll = new lo0_0(panel);
        scroll.uf("read-mail");
        scroll.Qs0(2);
        fy_2 content = new fy_2();
        content.WQ(new Hm0(content).Xq(new ya_1[] { content.C7(new le0_2[] { scroll }) }));
        content.x40(new I7(content).Xq(new ya_1[] { content.hb(new le0_2[] { scroll }) }));
        String title = mail.DN;
        if (title.length() > 10) title = new StringBuilder().append(title.substring(0, 8)).append("...").toString();
        String text = mail.switch$.uI0() ? mail.LH0 : sm0_0.dd(mail.LH0);
        if (dw_2.U5) {
            bb0_0.Qs(title);
            text = bb0_0.Qs(text);
        }
        text = hx_1.w70(text, zb0_2.bigCJKFontSizes() ? 50 : 48);
        Dw.F5(sent ? null : content);
        j4.F5(sent ? content : null);
        COm3();
        XH0.Gv(text);
    }

    private static zc0_1 attachmentGrid(List<JB0> attachments) {
        zc0_1 grid = new zc0_1();
        byte count = 0;
        for (JB0 attachment : attachments) {
            grid.CZ.Ue0(attachment.Td);
            count++;
            if (count >= 5) {
                count = 0;
                grid.ps();
            }
        }
        grid.ps();
        return grid;
    }

    public final void tn(ez0_0 result) {
        EJ0.pw0(true);
        switch (wo_2.xz[result.fE0]) {
            case 1: lpt6__0.v90(T10); break;
            case 2: lpt6__0.v90(SH0); break;
            case 3: lpt6__0.v90(v10); break;
            case 4: Kd(false); break;
            default: break;
        }
    }

    public final void Kd(boolean confirm) {
        if (confirm && (v10.yy() > 10 || SH0.yy() > 5)) {
            Qy0.yI0.sr0(new lpt3__4(sm0_0.c0(5816), new US(asBridge()), asBridge()));
            return;
        }
        T10.Gv("");
        SH0.Gv("");
        v10.Gv("");
        qq0.case$(0);
        for (ga0_1 slot : gT) slot.UR(null);
        for (mi_0 slot : au) slot.Db(null);
    }

    public final void x00() {
        lpt6__0.v90(this);
    }

    @Override
    public final void K8() {
        super.K8();
        if (tw0_0.kz0()) kh0();
        else if (XH0 != null) XH0.RY(0, 150);
        if (F90) {
            VL0.Zd((com2__3) VL0.g6.get(1));
            F90 = false;
        }
    }

    public final void Dg0(VU monster) {
        for (mi_0 slot : au) if (slot.AG == monster) return;
        for (mi_0 slot : au) {
            if (slot.AG == null) {
                slot.Db(monster);
                break;
            }
        }
        if (r90 != 0) F90 = true;
        else VL0.Zd((com2__3) VL0.g6.get(1));
        BL();
    }

    public final void close() {
        xe_1 send = EJ0;
        if (send != null && !send.OI) return;
        BU owner = Qy0.yI0.zK0;
        if (owner.OJ == null && owner.Xf0 == null) tw0_0.rl.fk0.uQ(new re_2());
        Qy0.yI0.zK0.RG0(null, false, false);
    }

    public final void UM() {
        Kd(true);
    }

    public final void Bg() {
        F00(false);
    }
}
