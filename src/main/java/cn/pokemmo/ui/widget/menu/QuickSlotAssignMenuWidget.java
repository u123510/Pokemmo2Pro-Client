package cn.pokemmo.ui.widget.menu;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.menu.BasePopupMenuWidget;

import java.nio.ByteBuffer;
import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.TimeZone;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QuickSlotAssignMenuWidget extends BasePopupMenuWidget {
    public static final HashSet<Short> Om0;
    public final vi_0 H10;
    public final qd_0 f3;
    public final w7_0 GJ0;
    public final xe_1 COm8;
    public final xe_1 eP;
    public xe_1 Ew0;
    public X6 Wl;
    public pg0_2 wQ;
    public final boolean Zx0;
    public final fy_2 Br;
    public tk0_0 KO;
    public final lo0_0 Rv;

    static {
        Om0 = new HashSet<>();
        Om0.add((short) 1410);
        Om0.add((short) 1411);
        Om0.add((short) 1414);
    }

    public QuickSlotAssignMenuWidget(qd_0 type, vi_0 presets, es_1 filters, boolean editable, Runnable clear, Runnable search) {
        GJ0 = new w7_0();
        uf("advanced-search-dialog");
        H10 = presets;
        f3 = type;
        Zx0 = editable;
        kB0();
        fy_2 panel = new fy_2();
        Br = panel;
        panel.uf("advanced-search-dialog");
        panel.WQ(panel.lo0());
        panel.x40(panel.H10());
        lo0_0 scroll = new lo0_0();
        Rv = scroll;
        scroll.Qs0(2);
        scroll.AH0(panel);
        xe_1 clearButton = new xe_1(sm0_0.c0(8008));
        COm8 = clearButton;
        clearButton.uf("label-button-small2-centered");
        clearButton.RR(() -> Ca(filters, clear));
        xe_1 searchButton = new xe_1(sm0_0.c0(8112));
        eP = searchButton;
        searchButton.uf("label-button-small2-centered");
        searchButton.RR(() -> Sj(filters, search));
        if (type == qd_0.Vx0) MQ();
        else d3();
        bo();
        gg0.vx0(KO).goto$().im0();
        gg0.vx0(scroll).o(5.0F).im0();
        gg0.vx0(searchButton).o(5.0F).GD().im0();
    }

    public final void JI(byte id, byte[] data) {
        boolean create = (bx_0) H10.za.BM(id) == null;
        ox_1 dialog = new ox_1(sm0_0.c0(8080), 20, name -> eJ(id, data, create, name));
        String name = create ? "" : ((bx_0) ((eg_0) Wl.Vh0()).q90).pF0;
        dialog.Pw.Gv(name);
        dialog.Pw.LPt8("[ |\\p{L}|\\p{N}|\\p{P}]{1,20}");
        BU.T50.SL(dialog);
        lg_0.k.lPT5(dialog::Uj0);
    }

    public final void bo() {
        List<eg_0> presets = ((Collection<bx_0>) tw0_0.rl.sN.za.To()).stream()
                .filter(this::PG).map(QuickSlotAssignMenuWidget::ip0).collect(Collectors.toList());
        pg0_2 options = new pg0_2(presets);
        wQ = options;
        eg_0 empty = new eg_0(null, sm0_0.c0(8084));
        options.w7.add(0, empty);
        options.su(0, 0);
        if (H10.eC0(f3) < (byte) (tw0_0.rl.k0.Kk0 + 10)) {
            wQ.Ii(new eg_0(null, g7_0.Zx(8124, new StringBuilder("<"), ">")));
        }
        X6 selector = new X6();
        selector.r30(wQ);
        Wl = selector;
        selector.Bd(0);
        Wl.Rm0(this::ql);
        xe_1 save = new xe_1(sm0_0.c0(8083));
        Ew0 = save;
        save.uf("label-button-small2-centered");
        Ew0.RR(this::Rs);
        xe_1 remove = new xe_1(sm0_0.c0(8078));
        remove.uf("label-button-small2-centered");
        remove.RR(() -> DB(remove));
        tk0_0 panel = new tk0_0(new A40());
        KO = panel;
        if (Zx0) {
            panel.gg0.vx0(new le0_2(null, false)).goto$().Rr0.vx0(Wl).Rr0.vx0(Ew0)
                    .Rr0.vx0(remove).Rr0.vx0(new le0_2(null, false)).goto$().Rr0.vx0(COm8).Rr0.Rg();
        } else {
            j1_0 cell = panel.gg0.vx0(new le0_2(null, false)).goto$().Rr0.vx0(COm8);
            cell.Yg = new vl0_0(5.0F);
            cell.Rr0.Rg();
        }
    }

    public final void nF(short first, short second) {
        if (second == -1) {
            fy_2 panel = Br;
            panel.pJ0.X20(panel.C7(((hd_0) GJ0.f5(first)).JH0()).Ze0());
            panel = Br;
            panel.L4.X20(panel.hb(((hd_0) GJ0.f5(first)).JH0()));
        } else {
            fy_2 panel = Br;
            panel.pJ0.X20(panel.C7(((hd_0) GJ0.f5(first)).JH0()).LPt3(((hd_0) GJ0.f5(second)).JH0()));
            panel = Br;
            panel.L4.X20(panel.hb(((hd_0) GJ0.f5(first)).JH0()).LPt3(((hd_0) GJ0.f5(second)).JH0()));
        }
    }

    public final void MQ() {
        if (Zx0) nF((short) 9, (short) 10);
        else nF((short) 34, (short) -1);
        nF((short) 1, (short) 8);
        nF((short) 2, (short) 7);
        if (Zx0) nF((short) 12, (short) 16);
        nF((short) 13, (short) 14);
        nF((short) 3, (short) 4);
        for (gc_2 stat : gc_2.fe0) {
            if (!stat.j8) nF((short) (stat.v10 | 1280), (short) (stat.v10 | 1536));
        }
        nF((short) 19, (short) 21);
        if (!Zx0) nF((short) 12, (short) 16);
        nF((short) 11, (short) 15);
        for (gc_2 stat : gc_2.fe0) {
            if (!stat.j8) nF((short) (stat.v10 | 4352), (short) (stat.v10 | 4608));
        }
        nF((short) 20, (short) 22);
        if (Zx0) nF((short) 0, (short) 23);
        nF((short) 24, (short) -1);
    }

    public final void d3() {
        nF((short) 9, (short) 10);
        nF((short) 32, (short) 33);
        nF((short) -32768, (short) 23);
    }

    public final byte[] Eg() {
        ByteBuffer data = ByteBuffer.allocate(255);
        byte count = 0;
        w7_0 controls = GJ0;
        controls.getClass();
        int size = controls.size();
        int cursor = controls.uT();
        for (;;) {
            if (size != controls.Rv) throw new ConcurrentModificationException();
            byte[] states = controls.Ut;
            int next = cursor;
            while (next-- > 0 && states[next] != 1) {
            }
            if (next < 0) break;
            if (size != controls.Rv) throw new ConcurrentModificationException();
            states = controls.Ut;
            while (cursor-- > 0 && states[cursor] != 1) {
            }
            if (cursor < 0) throw new NoSuchElementException();
            hd_0 control = (hd_0) controls.BS[cursor];
            if (!control.vt()) continue;
            if (!control.Bj0()) return null;
            count++;
            data.putShort(controls.L1[cursor]);
            control.bh0(data);
        }
        data.flip();
        int length = data.limit();
        byte[] result = new byte[length + 1];
        result[0] = count;
        data.get(result, 1, length);
        return result;
    }

    public final void DB(xe_1 button) {
        bx_0 preset = (bx_0) ((eg_0) Wl.Vh0()).q90;
        if (preset == null) return;
        Qy0.yI0.sr0(new lpt3__4(sm0_0.wa0(8125, preset.pF0), () -> fv(preset), button));
    }

    public final void fv(bx_0 preset) {
        byte id = v40_0.lo0(preset, H10);
        if (id == -1) return;
        int selected = Wl.mu0.Mw0;
        Wl.Bd(0);
        wQ.Va(selected);
        if (H10.eC0(f3) == (byte) (tw0_0.rl.k0.Kk0 + 10)) {
            wQ.Ii(new eg_0(null, g7_0.Zx(8124, new StringBuilder("<"), ">")));
        }
        vi_0 manager = H10;
        IG0 previous = manager.za;
        int size = previous.size();
        bm0_1 updated = new bm0_1(previous.SK(), size);
        updated.o70(previous);
        updated.lz0(id);
        manager.za = new Nm(updated);
        manager.qq.YE0(id);
        tw0_0.rl.fk0.uQ(new PQ(id));
    }

    public final void Rs() {
        byte[] data = Eg();
        if (data == null) return;
        if (data[0] == 0) {
            tw0_0.rl.qK(sm0_0.c0(8082));
            return;
        }
        bx_0 selected = (bx_0) ((eg_0) Wl.Vh0()).q90;
        Optional<String> duplicate = ((Collection<bx_0>) H10.za.To()).stream()
                .filter(preset -> BW(data, preset)).filter(preset -> yc0(selected, preset))
                .map(bx_0::Yd0).findFirst();
        if (duplicate.isPresent()) {
            tw0_0.rl.qK(sm0_0.wa0(8126, duplicate.get()));
            return;
        }
        byte limit = (byte) (tw0_0.rl.k0.Kk0 + 10);
        boolean full = H10.eC0(f3) >= limit;
        byte id = v40_0.lo0(selected, H10);
        if (id == -1) return;
        if (selected == null) {
            if (full) {
                tw0_0.rl.qK(sm0_0.wa0(8079, String.valueOf(limit)));
                return;
            }
            JI(id, data);
        } else {
            xe_1 overwrite = new xe_1(sm0_0.c0(8128));
            overwrite.RR(() -> cU(id, data));
            xe_1 create = new xe_1(sm0_0.c0(8129));
            create.RR(() -> z30(full, limit, selected, data));
            xe_1 cancel = new xe_1(sm0_0.c0(nf0_0.Bq0));
            Qy0 root = Qy0.yI0;
            cn_0 label = new cn_0(null, 0);
            label.Sk(sm0_0.c0(8127));
            root.sr0(new lpt3__4(label, overwrite, create, cancel, Ew0));
        }
    }

    public final void z30(boolean full, byte limit, bx_0 selected, byte[] data) {
        if (full) {
            tw0_0.rl.qK(sm0_0.wa0(8079, String.valueOf(limit)));
            return;
        }
        if (Arrays.equals(selected.G80, data)) {
            tw0_0.rl.qK(sm0_0.wa0(8126, selected.pF0));
            return;
        }
        JI(v40_0.lo0(null, H10), data);
    }

    public final void cU(byte id, byte[] data) {
        JI(id, data);
    }

    public final void ql() {
        w7_0 controls = GJ0;
        controls.getClass();
        ((Collection<hd_0>) new M(controls)).stream().forEach(hd_0::bL);
        bx_0 selected = (bx_0) ((eg_0) Wl.Vh0()).q90;
        if (selected == null) return;
        ByteBuffer data = ByteBuffer.wrap(selected.G80);
        byte count = data.get();
        for (int i = 0; i < count; i++) {
            short id = data.getShort();
            ((hd_0) GJ0.f5(id)).Y5(data);
        }
    }

    public final boolean PG(bx_0 preset) {
        return preset.W30 == f3;
    }

    public final void eJ(byte id, byte[] data, boolean create, String name) {
        boolean duplicate = ((Collection<bx_0>) H10.za.To()).stream().filter(preset -> Qq(id, preset))
                .map(bx_0::Yd0).anyMatch(existing -> Vb(name, existing));
        if (duplicate) {
            tw0_0.rl.qK(sm0_0.c0(8130));
            return;
        }
        bx_0 preset = new bx_0(id, name, f3, data);
        vi_0 manager = H10;
        manager.getClass();
        System.currentTimeMillis();
        IG0 previous = manager.za;
        int size = previous.size();
        bm0_1 updated = new bm0_1(previous.SK(), size);
        updated.o70(previous);
        updated.gE0(id, preset);
        manager.za = new Nm(updated);
        Iq0 free = manager.qq;
        int freeIndex = free.Q80(id);
        if (freeIndex >= 0) free.dx0(freeIndex);
        ol0_2 selection = Wl.mu0;
        int index = selection.Mw0;
        if (create) index = selection.KB.ul0() - 1;
        wQ.w7.set(index, new eg_0(preset, name));
        if (create && H10.eC0(f3) < (byte) (tw0_0.rl.k0.Kk0 + 10)) {
            wQ.Ii(new eg_0(null, g7_0.Zx(8124, new StringBuilder("<"), ">")));
        }
        Wl.Bd(Wl.mu0.Mw0);
        tw0_0.rl.fk0.uQ(new FR(id, preset));
        tw0_0.rl.qK(sm0_0.c0(8081));
        lg_0.k.lPT5(this::nv0);
    }

    public final void nv0() {
        lpt6__0.v90(Ew0);
    }

    public final boolean Qq(byte id, bx_0 preset) {
        return preset != (bx_0) H10.za.BM(id);
    }

    public final void Sj(es_1 filters, Runnable callback) {
        filters.clear();
        byte[] data = Eg();
        if (data == null) return;
        v40_0.nc(data, tw0_0.rl.k0.il).stream().forEach(filters::Ue0);
        callback.run();
    }

    public final void kB0() {
        xt_2 minimumPrice = new xt_2(0, Integer.MAX_VALUE, 0, true, sm0_0.c0(8113));
        minimumPrice.ls.SJ = "$";
        minimumPrice.ls.mH();
        minimumPrice.ls.TK(0, " -- ");
        GJ0.coM4((short) 9, minimumPrice);
        xt_2 maximumPrice = new xt_2(0, Integer.MAX_VALUE, 0, true, sm0_0.c0(8114));
        maximumPrice.ls.SJ = "$";
        maximumPrice.ls.mH();
        maximumPrice.ls.TK(0, " -- ");
        GJ0.coM4((short) 10, maximumPrice);
        GJ0.coM4((short) 1, new nd_0(sm0_0.c0(8100), new String[] { sm0_0.c0(8101), sm0_0.c0(8102) }));
        String[] genders = { sm0_0.c0(49), sm0_0.c0(10996), sm0_0.c0(5614), sm0_0.c0(nf0_0.Po) };
        GJ0.coM4((short) 8, new nd_0(sm0_0.c0(8103), genders));
        GJ0.coM4((short) 2, new nd_0(sm0_0.c0(8106), rz_0.lpT5,
                value -> ((rz_0) value).e8(), (data, value) -> wK0((ByteBuffer) data, (rz_0) value),
                data -> Pq0((ByteBuffer) data)));
        GJ0.coM4((short) 7, new nd_0(sm0_0.c0(8107), au_1.Pw0,
                value -> ((au_1) value).rm(), (data, value) -> Ej((ByteBuffer) data, (au_1) value),
                data -> Hi0((ByteBuffer) data)));
        String yearLabel = sm0_0.c0(8097);
        xt_2 year = new xt_2(2011, Year.now().getValue(), 2011, false, yearLabel);
        year.Vg0 = (data, value) -> ps((ByteBuffer) data, value);
        year.C = data -> LL0((ByteBuffer) data);
        year.ls.TK(2011, "--");
        GJ0.coM4((short) 15, year);
        List<Short> moves = ((Collection<vk0_1>) ec0_2.Sx().Com6()).stream()
                .filter(vk0_1::be).map(vk0_1::oC0).collect(Collectors.toList());
        GJ0.coM4((short) 16, new ji0_1(sm0_0.c0(8096), moves, 8095,
                value -> By0((Short) value), (data, value) -> ((ByteBuffer) data).putShort((Short) value),
                data -> ((ByteBuffer) data).getShort()));
        GJ0.coM4((short) 13, new nd_0(sm0_0.c0(8099), new String[] { sm0_0.c0(8104), sm0_0.c0(8105) }));
        GJ0.coM4((short) 14, new nd_0(sm0_0.c0(8119), new String[] { sm0_0.c0(8104), sm0_0.c0(8105), sm0_0.c0(8098) }));
        GJ0.coM4((short) 11, new nd_0(sm0_0.c0(8115), N2.HP,
                value -> ((N2) value).wI(), (data, value) -> So((ByteBuffer) data, (N2) value),
                data -> Xr0((ByteBuffer) data)));
        QL[] flags = Stream.of(QL.ZO).filter(QuickSlotAssignMenuWidget::yg0).toArray(QuickSlotAssignMenuWidget::bu0);
        GJ0.coM4((short) 12, new nd_0(sm0_0.c0(8116), flags,
                value -> ((QL) value).toString(), (data, value) -> Om0((ByteBuffer) data, (QL) value),
                data -> pH0((ByteBuffer) data)));
        xt_2[] levels = new xt_2[2];
        for (int i = 0; i < 2; i++) {
            levels[i] = new xt_2(1, 100, i * 99 + 1, false, sm0_0.c0(i + 8108));
            levels[i].Zj();
            GJ0.coM4((short) (i == 0 ? 3 : 4), levels[i]);
        }
        gc_2[] stats = gc_2.fe0;
        xt_2[][] ivs = new xt_2[stats.length][2];
        xt_2[][] evs = new xt_2[stats.length][2];
        for (gc_2 stat : stats) {
            if (stat.j8) continue;
            for (int i = 0; i < 2; i++) {
                ivs[stat.v10][i] = new xt_2(0, 31, i * 31, false, sm0_0.wa0(i + 8110, stat.toString()));
                ivs[stat.v10][i].cQ();
                GJ0.coM4((short) ((i == 0 ? 5 : 6) << 8 | stat.v10), ivs[stat.v10][i]);
                evs[stat.v10][i] = new xt_2(0, 252, i * 252, false, sm0_0.wa0(i + 8093, stat.toString()));
                evs[stat.v10][i].cQ();
                GJ0.coM4((short) ((i == 0 ? 17 : 18) << 8 | stat.v10), evs[stat.v10][i]);
            }
        }
        xt_2 perfect = new xt_2(0, 6, 0, false, sm0_0.c0(8092));
        perfect.Zj();
        perfect.ls.TK(0, " -- ");
        GJ0.coM4((short) 19, perfect);
        GJ0.coM4((short) 23, new AB0(sm0_0.c0(8091)));
        GJ0.coM4((short) 21, new AB0(sm0_0.c0(8086)));
        GJ0.coM4((short) 34, new mx_0(sm0_0.c0(8131)));
        GJ0.coM4((short) 22, new AB0(sm0_0.c0(8085)));
        GJ0.coM4((short) 24, new AB0(sm0_0.c0(1922)));
        Stream.Builder<cq_0> builder = Stream.builder();
        ((Collection<cq_0>) mp_1.vf0().k2.values()).stream().filter(QuickSlotAssignMenuWidget::Kg0).forEach(builder::add);
        IntStream.range(0, h50_0.im.length).mapToObj(QuickSlotAssignMenuWidget::ea0).forEach(builder::add);
        IntStream.range(0, h50_0.av0.length).mapToObj(QuickSlotAssignMenuWidget::D60).forEach(builder::add);
        List<Short> abilities = builder.build().map(cq_0::kC0).flatMap(QuickSlotAssignMenuWidget::t2).distinct().collect(Collectors.toList());
        GJ0.coM4((short) 20, new ji0_1(sm0_0.c0(8088), abilities, 8087,
                value -> WQ((Short) value), (data, value) -> ((ByteBuffer) data).putShort((Short) value),
                data -> ((ByteBuffer) data).getShort()));
        GJ0.coM4((short) 32, new nd_0(sm0_0.c0(8120), l5_0.tC0,
                value -> JG0((l5_0) value), (data, value) -> nc((ByteBuffer) data, (l5_0) value),
                data -> j7((ByteBuffer) data)));
        GJ0.coM4((short) 33, new nd_0(sm0_0.c0(8121), q10_0.QR,
                value -> Bb((q10_0) value), (data, value) -> Ro((ByteBuffer) data, (q10_0) value),
                data -> Lo((ByteBuffer) data)));
        List<cq_0> species = ((Collection<cq_0>) mp_1.vf0().k2.values()).stream().filter(QuickSlotAssignMenuWidget::p1).collect(Collectors.toList());
        GJ0.coM4((short) 0, new ji0_1(sm0_0.c0(0), species, 8122,
                value -> pRN((cq_0) value), (data, value) -> yO((ByteBuffer) data, (cq_0) value),
                data -> VC0((ByteBuffer) data)));
        List<mc0_1> items = ((Collection<mc0_1>) gu0.l2.Pd0.values()).stream().filter(mc0_1::TL)
                .filter(QuickSlotAssignMenuWidget::yL0).collect(Collectors.toList());
        GJ0.coM4((short) -32768, new ji0_1(sm0_0.c0(8005), items, 8123,
                value -> ((mc0_1) value).getName(), (data, value) -> e00((ByteBuffer) data, (mc0_1) value),
                data -> Va((ByteBuffer) data)));
    }

    @Override
    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int key = event.finally$;
            rp_0 initialized = rp_0.sJ0;
            if ((key & 256) == 0 && K() instanceof cg_0) {
                if (event.finally$ == 66) {
                    if (!tw0_0.Xy0()) {
                        Uz(1, true);
                        Uz(1, true);
                    }
                    return true;
                }
                if (!rp_0.JI()) return super.nd0(event);
            }
            key = event.finally$;
            rp_0 binding = rp_0.kC0;
            int settings = dw_2.ff;
            if (binding != null && binding.Ov(key)) {
                if (Br.Of()) {
                    Uz(-1, true);
                    Uz(-1, true);
                    if (!Br.Of()) COm8.BL();
                    else Rv.Rn(K());
                } else if (eP.Of()) {
                    Br.Uz(-1, false);
                }
                return true;
            }
            key = event.finally$;
            binding = rp_0.synchronized$;
            if (binding != null && binding.Ov(key)) {
                if (KO.Of()) {
                    Br.Uz(1, false);
                    return true;
                }
                if (Br.Of()) {
                    Uz(1, true);
                    Uz(1, true);
                    if (!Br.Of()) eP.BL();
                    else Rv.Rn(K());
                }
                return true;
            }
            key = event.finally$;
            rp_0 previous = rp_0.cB;
            for (rp_0 candidate : new rp_0[] { rp_0.I90, previous }) {
                if (candidate != null && candidate.Ov(key)) {
                    if (KO.Of()) {
                        KO.Uz(-1, true);
                        return true;
                    }
                    break;
                }
            }
            key = event.finally$;
            rp_0 next = rp_0.Aq0;
            for (rp_0 candidate : new rp_0[] { rp_0.Ni, next }) {
                if (candidate != null && candidate.Ov(key)) {
                    if (KO.Of()) {
                        KO.Uz(1, true);
                        return true;
                    }
                    break;
                }
            }
            key = event.finally$;
            if (previous != null && previous.Ov(key)) {
                Uz(-1, true);
                if (Br.Of()) Rv.Rn(K());
                return true;
            }
            key = event.finally$;
            if (next != null && next.Ov(key)) {
                Uz(1, true);
                if (Br.Of()) Rv.Rn(K());
                return true;
            }
        }
        return super.nd0(event);
    }

    @Override
    public final void C(zk0_1 context) {
        Br.Uz(1, false);
    }

    public static mc0_1 Va(ByteBuffer data) {
        return gu0.l2.lPT6(data.getShort());
    }

    public static void e00(ByteBuffer data, mc0_1 item) {
        data.putShort(item.Z8);
    }

    public static boolean yL0(mc0_1 item) {
        return !Om0.contains(item.Z8);
    }

    public static cq_0 VC0(ByteBuffer data) {
        return mp_1.vf0().W50(data.getShort());
    }

    public static void yO(ByteBuffer data, cq_0 species) {
        data.putShort(species.dR);
    }

    public static String pRN(cq_0 species) {
        return species.Ay(true);
    }

    public static boolean p1(cq_0 species) {
        return !species.jD && !species.J4;
    }

    public static q10_0 Lo(ByteBuffer data) {
        return q10_0.Pt0(data.get());
    }

    public static void Ro(ByteBuffer data, q10_0 category) {
        data.put(category.iL);
    }

    public static String Bb(q10_0 category) {
        return sm0_0.c0(category.iL + 2871).toUpperCase();
    }

    public static l5_0 j7(ByteBuffer data) {
        return l5_0.Hv0(data.get());
    }

    public static void nc(ByteBuffer data, l5_0 category) {
        data.put(category.xS);
    }

    public static String JG0(l5_0 category) {
        return sm0_0.c0(category.ni).toUpperCase();
    }

    public static String WQ(Short id) {
        return sm0_0.c0(id.shortValue() + 210000);
    }

    public static Stream<Short> t2(short[] values) {
        return IntStream.range(0, values.length).mapToObj(index -> DR(values, index));
    }

    public static Short DR(short[] values, int index) {
        return values[index];
    }

    public static cq_0 D60(int index) {
        return mp_1.vf0().W50(h50_0.av0[index]);
    }

    public static cq_0 ea0(int index) {
        return mp_1.vf0().W50(h50_0.im[index]);
    }

    public static boolean Kg0(cq_0 species) {
        return !species.jD && !species.J4;
    }

    public static QL pH0(ByteBuffer data) {
        return QL.Q8(data.get());
    }

    public static void Om0(ByteBuffer data, QL flag) {
        data.put(flag.D7);
    }

    public static QL[] bu0(int length) {
        return new QL[length];
    }

    public static boolean yg0(QL flag) {
        for (byte excluded : h50_0.Yu) if (flag.D7 == excluded) return false;
        return flag.Nw();
    }

    public static N2 Xr0(ByteBuffer data) {
        return N2.FW(data.get());
    }

    public static void So(ByteBuffer data, N2 tier) {
        data.put(tier.yz);
    }

    public static String By0(Short id) {
        return sm0_0.c0(id.shortValue() + 110000);
    }

    public static int LL0(ByteBuffer data) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis((long) data.getInt() * 1000L);
        data.getInt();
        return calendar.get(Calendar.YEAR);
    }

    public static void ps(ByteBuffer data, int year) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(year, 0, 1, 0, 0, 0);
        data.putInt((int) (calendar.getTimeInMillis() / 1000L));
        calendar.set(year, 11, 31, 23, 59, 59);
        data.putInt((int) (calendar.getTimeInMillis() / 1000L));
    }

    public static au_1 Hi0(ByteBuffer data) {
        byte id = data.get();
        return (au_1) au_1.Ty.BM(id);
    }

    public static void Ej(ByteBuffer data, au_1 group) {
        data.put(group.zc);
    }

    public static rz_0 Pq0(ByteBuffer data) {
        byte id = data.get();
        return (rz_0) rz_0.RM.BM(id);
    }

    public static void wK0(ByteBuffer data, rz_0 nature) {
        data.put(nature.f10);
    }

    public static boolean yc0(bx_0 selected, bx_0 candidate) {
        return candidate != selected;
    }

    public static boolean BW(byte[] data, bx_0 preset) {
        return Arrays.equals(preset.G80, data);
    }

    public static eg_0 ip0(bx_0 preset) {
        return new eg_0(preset, preset.pF0);
    }

    public static boolean Vb(String name, String existing) {
        return existing.equalsIgnoreCase(name);
    }

    public static void Ca(es_1 filters, Runnable callback) {
        filters.clear();
        callback.run();
    }
}
