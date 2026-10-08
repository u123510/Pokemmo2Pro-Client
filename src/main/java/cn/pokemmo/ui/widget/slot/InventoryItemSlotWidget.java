package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class InventoryItemSlotWidget extends lpt4__1 {
    public static boolean rD;
    public final IA te0;
    public final in_2 NF0;
    public final in_2 jJ;
    public int Pi;
    public boolean NK;
    public boolean zE0;

    public InventoryItemSlotWidget(IA owner, short id, CH0 context, short slot) {
        super(id, context, (short) 1, slot, true);
        NF0 = new in_2(500);
        jJ = new in_2(1000);
        Pi = -1;
        NK = false;
        zE0 = false;
        uf("item-slot");
        te0 = owner;
        Lu = slot;
        if (tw0_0.kz0()) {
            Gx().Dg(pa0_0.Ol);
            ka0();
            Hr(21, 6);
        } else {
            Hr(10, 10);
        }
        PF();
    }

    public static void Lq0(List<B9> options, LG0 menu, iw_1 dialog, K5 item,
            VU target, int move, byte selection) {
        rD = false;
        int index = selection - 1;
        if (index >= options.size()) {
            a20 registry = _case.P0.vm0[10];
            registry.cT.lz0(menu.w90);
            return;
        }
        B9 option = options.get(index);
        pk0_0 windows = tw0_0.FL;
        windows.lpT1.sj0(dialog, true);
        windows.KH = System.currentTimeMillis();
        BR client = tw0_0.rl;
        hl0_0 record = item.nn;
        short id = record.wQ;
        CH0 source = record.Br;
        CH0 destination = target.pu;
        short count = option.AV;
        client.I3(id, source, destination, count, (byte) move, (byte) 1, false);
        a20 registry = _case.P0.vm0[10];
        registry.cT.lz0(menu.w90);
    }

    public static int else$(mc0_1 item) {
        short id = X4.gA0(item.Z8);
        if (id == 5154) {
            return 0;
        }
        switch (id) {
            case 5038:
                return 1;
            case 5039:
                return 2;
            case 5040:
                return 3;
            case 5041:
                return 4;
            default:
                return Integer.MAX_VALUE;
        }
    }

    public static boolean ME(mc0_1 item) {
        return item.ia0 > 0 && item.dB0(false) == JU.hD;
    }

    @Override
    public final void Ez0() {
        if (wE0 == 0) {
            SU("");
            Pc("");
            return;
        }
        switch (Lu) {
            case 0:
                SU(tw0_0.iE.oO(dw_2.X60, null));
                break;
            case 1:
                SU(tw0_0.iE.oO(dw_2.Go, null));
                break;
            case 2:
                SU(tw0_0.iE.oO(dw_2.hS, null));
                break;
            case 3:
                SU(tw0_0.iE.oO(dw_2.hc, null));
                break;
            case 4:
                SU(tw0_0.iE.oO(dw_2.zn, null));
                break;
            case 5:
                SU(tw0_0.iE.oO(dw_2.DJ0, null));
                break;
            case 6:
                SU(tw0_0.iE.oO(dw_2.c3, null));
                break;
            case 7:
                SU(tw0_0.iE.oO(dw_2.xo, null));
                break;
            case 8:
                SU(tw0_0.iE.oO(dw_2.H, null));
                break;
            default:
                break;
        }
        String text = U4;
        if (text == null || text.isEmpty()) {
            SU(" ");
        }
        Pi = -1;
        if (wE0 != 0) {
            if (jJ != null) {
                jJ.ar = 0L;
            }
            mT();
        }
    }

    @Override
    public final void PF() {
        super.PF();
    }

    public final void Z8(short id, CH0 context, boolean persist) {
        if (NK) {
            return;
        }
        wE0 = id;
        if (id < 1) {
            context = CH0.j1;
        }
        lO = context;
        if (!zE0 && persist) {
            switch (Lu) {
                case 0:
                    lpt2__0.ER = id;
                    lpt2__0.Ix = context.Sa;
                    break;
                case 1:
                    lpt2__0.FP = id;
                    lpt2__0.br0 = context.Sa;
                    break;
                case 2:
                    lpt2__0.PG = id;
                    lpt2__0.TH0 = context.Sa;
                    break;
                case 3:
                    lpt2__0.hi0 = id;
                    lpt2__0.o40 = context.Sa;
                    break;
                case 4:
                    lpt2__0.E5 = id;
                    lpt2__0.XD0 = context.Sa;
                    break;
                case 5:
                    lpt2__0.jp0 = id;
                    lpt2__0.A80 = context.Sa;
                    break;
                case 6:
                    lpt2__0.bE0 = id;
                    lpt2__0.CY = context.Sa;
                    break;
                case 7:
                    lpt2__0.T0 = id;
                    lpt2__0.wg0 = context.Sa;
                    break;
                case 8:
                    lpt2__0.switch$ = id;
                    lpt2__0.mI = context.Sa;
                    break;
                default:
                    break;
            }
            lpt2__0.s5 = true;
        }
        Ez0();
        super.PF();
    }

    public final void UR(K5 item) {
        if (NK) {
            return;
        }
        if (item == null) {
            Z8((short) 0, CH0.j1, true);
        } else {
            if (item.cL.dB0(false) == JU.O4) {
                return;
            }
            hl0_0 record = item.nn;
            Z8(record.wQ, record.Br, true);
        }
    }

    public final boolean Yr0() {
        short id = wE0;
        if (id > 0 && NF0.ty0()) {
            mc0_1 item = gu0.l2.lPT6(id);
            if (item.Iq != null) {
                tw0_0.rl.sn0(id, lO, CH0.j1, (short) 1, (byte) -1);
                return true;
            }
            if (tw0_0.PK0 != null) {
                int action = hf_2.wV[item.dB0(true).Ap0];
                if (action != 1 && action != 2 && action != 3) {
                    return false;
                }
                Oz0 battle = tw0_0.LD0.he0;
                if (battle == null || battle.N10 == null) {
                    return true;
                }
                ML0 screen = battle.N10;
                q40_0 panel = screen.kX;
                if (panel == null) {
                    return true;
                }
                if (screen.nC0()) {
                    panel.Ll(true);
                    tf_1 previous = panel.QQ;
                    if (previous != null) {
                        panel.u3(previous);
                        panel.QQ = null;
                    }
                    panel.em();
                    tf_1 picker = new tf_1(panel, item, CH0.j1, false);
                    panel.QQ = picker;
                    lpt6__0.v90(picker.Ba0());
                    panel.x40(panel.C7(new le0_2[] { panel.QQ }));
                    panel.WQ(panel.hb(new le0_2[] { panel.QQ }));
                }
                return true;
            }
            if (tw0_0.rl.nz() || tw0_0.rl.fw) {
                return false;
            }
            int action = hf_2.wV[item.dB0(false).Ap0];
            if (action == 4) {
                tw0_0.rl.sn0(id, CH0.j1, CH0.j1, (short) 1, (byte) -1);
                return true;
            }
            if (action != 1 && action != 2 && action != 3) {
                return false;
            }
            K5 selected = null;
            BR client = tw0_0.rl;
            A5 initialization = A5.PG0;
            for (K5 candidate : client.NC[1].KL()) {
                if (candidate.nn.wQ == id) {
                    selected = candidate;
                }
            }
            if (selected == null) {
                return false;
            }
            BU root = BU.T50;
            jc_2 previous = root.Wf;
            if (previous != null) {
                previous.xe0();
                root.Wf = null;
            }
            jc_2 picker = new jc_2(root, true);
            root.Wf = picker;
            picker.RY(350, 200);
            root.Wf.oY(350, 200);
            root.Wf.E40(tw0_0.LD0.ew0() / 2 - root.Wf.Mx / 2,
                    tw0_0.LD0.Hv0() / 2 - root.Wf.OB / 2);
            root.SL(root.Wf);
            root.Wf.IC0(selected);
            return true;
        }
        if (id >= 0 || !NF0.ty0() || tw0_0.rl == null) {
            return false;
        }
        if (tw0_0.rl.nz()) {
            return false;
        }
        _else location = tw0_0.e60.N60();
        boolean specialLocation = location != null && location.Km();
        id = (short) (id * -1);
        if (!tx_1.H40(id, specialLocation)) {
            return false;
        }
        int bestValue = 0;
        VU selected = null;
        for (VU candidate : tw0_0.rl.PC0.y0()) {
            if (candidate == null || candidate.I8.vn()) {
                continue;
            }
            for (byte move = 0; move < 4; move++) {
                CE data = candidate.I8;
                if (data.Gu[move] == id) {
                    int value = data.TC0[move];
                    if (value > bestValue || bestValue == 0) {
                        selected = candidate;
                        bestValue = value;
                    }
                }
            }
        }
        if (selected == null) {
            tw0_0.rl.qK(sm0_0.wa0(6081, sm0_0.c0(id + 110000)));
            return false;
        }
        if (id == 230 && bestValue < h50_0.vB0 && tw0_0.PK0 == null) {
            if (rD) {
                return false;
            }
            int move = S.os0((short) 230, selected.I8.Gu);
            if (move == -1) {
                tw0_0.rl.qK(sm0_0.c0(200244));
                return false;
            }
            mc0_1 item = Arrays.stream(tw0_0.rl.Bb(tw0_0.rl.u40).KL())
                    .map(K5::LW).filter(qr_0::ME).distinct()
                    .min(Comparator.comparingInt(qr_0::else$)).orElse(null);
            if (item == null) {
                tw0_0.rl.qK(sm0_0.c0(200244));
                return false;
            }
            K5 stack = tw0_0.rl.Bb(tw0_0.rl.u40).mE(item);
            if (stack == null) {
                tw0_0.rl.qK(sm0_0.c0(200244));
                return false;
            }
            rD = true;
            int count = stack.nn.PA0;
            CE data = selected.I8;
            vk0_1 definition = (vk0_1) ec0_2.Sx().f4.f5((short) 230);
            int missing = data.Vd(definition.Gn(false), move) - selected.I8.TC0[move];
            if (stack.cL.rg) {
                count = Math.min(count, missing / item.ia0);
            } else {
                count = 1;
            }
            List<B9> options = new ArrayList<>();
            while (count > 0) {
                options.add(new B9(item, (byte) count));
                count--;
            }
            List<String> labels = options.stream().map(B9::toString).collect(Collectors.toList());
            labels.add(sm0_0.c0(nf0_0.Bq0));
            _case registry = _case.P0;
            LG0 menu = new LG0((byte) 0, labels.toArray(new String[0]));
            a20 menus = registry.vm0[10];
            for (byte menuId = -128; menuId < 0; menuId++) {
                if ((LG0) menus.cT.BM(menuId) != null) {
                    continue;
                }
                menu.w90 = menuId;
                a20.vh(registry.vm0[10], menu);
                String text = sm0_0.Bx(8600, new String[] { selected.na0(), sm0_0.c0(110230) });
                C dialog = new C(tw0_0.rl.k0.WN, jm_1.q10, text, menu.w90, new String[] { "" });
                VU target = selected;
                dialog.G3 = selection -> Lq0(options, menu, dialog, stack, target, move, selection);
                pk0_0 windows = tw0_0.FL;
                CH0 key = pk0_0.AA0;
                windows.F9(windows.fU(), dialog);
                windows.iE.put(key, dialog);
                ((iw_1) windows.iE.get(key)).E40(Integer.MIN_VALUE, Integer.MIN_VALUE);
                ((iw_1) windows.iE.get(key)).lt0();
                windows.u4.Qw0(windows);
                windows.Qw0(dialog);
                tw0_0.FL.lpT1.Ue0(dialog);
                return true;
            }
            throw new RuntimeException("Unable to allocate id");
        }
        if ((id == 505 || id == 1030) && specialLocation) {
            Qy0 menu = Qy0.yI0;
            int x = A20;
            int y = SB0;
            menu.getClass();
            Qy0.xi(this, selected, id, x, y, null);
        } else {
            tw0_0.rl.p4(selected.pu, id, CH0.j1, CH0.j1);
        }
        return true;
    }

    @Override
    public boolean nd0(i70_0 event) {
        if (!event.Li()) {
            return super.nd0(event);
        }
        if (!te0.fh0) {
            if (cj0) {
                if (event.LI0()) {
                    hc_0 handler = yN;
                    if (handler != null && cj0) {
                        IA owner = handler.YU;
                        qr_0 source = owner.Ex;
                        if (source != null) {
                            if (owner.er == null) {
                                source.Z8((short) 0, CH0.j1, true);
                            }
                            owner.kb0(event);
                            qr_0 destination = owner.er;
                            if (destination != null && destination != owner.Ex) {
                                source = owner.Ex;
                                short oldId = destination.wE0;
                                CH0 oldContext = destination.lO;
                                destination.Z8(source.wE0, source.lO, true);
                                owner.Ex.Z8(oldId, oldContext, true);
                            }
                            owner.d7(null);
                            owner.Ex = null;
                        }
                    }
                    cj0 = false;
                    M.j70(lpt4__1.Po, false);
                } else {
                    hc_0 handler = yN;
                    if (handler != null) {
                        handler.YU.kb0(event);
                    }
                }
            } else if (event.VP) {
                cj0 = true;
                M.j70(lpt4__1.Po, true);
                hc_0 handler = yN;
                if (handler != null) {
                    handler.YU.Ex = (qr_0)this;
                    handler.YU.kb0(event);
                }
            }
            if (!event.VP && event.nA0 == 1 && event.zu == 4) {
                Z8((short) 0, CH0.j1, true);
            }
        }
        if (event.nA0 == 0 && event.zu == 4) {
            if (event.VP && !tw0_0.kz0()) {
                return true;
            }
            if (yv0(event.f8, event.AN)) {
                return Yr0();
            }
        }
        return true;
    }

    @Override
    public final void Dw0(zk0_1 context) {
        super.Dw0(context);
        if (jJ.ty0()) {
            mT();
        }
    }

    @Override
    public final void Kp0(zk0_1 context, int x, int y, int unused) {
        if (!te0.fh0) {
            zW.mt0(x, y);
        }
    }

    @Override
    public final void HP(zk0_1 context) {
        super.HP(context);
        if (tw0_0.LD0.he0 != null) {
            pk0_0 windows = tw0_0.FL;
            CH0 key = pk0_0.AA0;
            iw_1 dialog = windows.iE.containsKey(key) ? (iw_1) windows.iE.remove(key) : null;
            if (dialog != null) {
                windows = tw0_0.FL;
                windows.lpT1.sj0(dialog, true);
                windows.KH = System.currentTimeMillis();
                dialog.wQ();
                rD = false;
            }
        }
    }

    public final void mT() {
        short id = wE0;
        if (id > 0) {
            int count = tw0_0.rl.Bb(tw0_0.rl.u40).a90(id);
            l5_0 category = gu0.l2.lPT6(id).Yt0;
            if (count != Pi) {
                if (category != l5_0.Jy) {
                    Pi = count;
                    Pc(Integer.toString(count));
                } else {
                    Pi = -1;
                    Pc("");
                }
            }
        } else if (id < 0) {
            short count = -1;
            short move = (short) (id * -1);
            _else location = tw0_0.e60.N60();
            boolean specialLocation = location != null && location.Km();
            if (move == 230 || specialLocation && tx_1.H40(move, specialLocation)) {
                count = 0;
                for (VU member : tw0_0.rl.PC0.y0()) {
                    if (member == null || member.I8.vn()) {
                        continue;
                    }
                    for (int i = 0; i < 4; i++) {
                        CE data = member.I8;
                        if (data.Gu[i] != move) {
                            continue;
                        }
                        if (move == 230) {
                            short value = data.TC0[i];
                            if (value > count) {
                                count = value;
                            }
                        } else {
                            count = (short) (count + data.TC0[i]);
                        }
                    }
                }
            }
            if (Pi != count) {
                Pi = count;
                Pc(Integer.toString(count));
            }
        }
    }
}
