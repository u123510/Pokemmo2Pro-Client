package cn.pokemmo.data;

import f.Cq0;
import f.Ct0;
import f.D;
import f.FI;
import f.HU;
import f.IH;
import f.Jv0;
import f.M3;
import f.OD;
import f.OJ;
import f.QI;
import f.VE;
import f.WM;
import f.Wx0;
import f.cq_0;
import f.mp_1;
import f.au_1;
import f.ba_2;
import f.bm0_1;
import f.com9__2;
import f.cq_0;
import f.dh0_0;
import f.dl_1;
import f.ec0_2;
import f.gc_2;
import f.gl0_2;
import f.gu0;
import f.hc_1;
import f.he0_1;
import f.hq_2;
import f.ht_0;
import f.i40_0;
import f.ib0_0;
import f.iz0_0;
import f.jx_2;
import f.kf0_0;
import f.l4_0;
import f.lg_0;
import f.mc0_1;
import f.mp_1;
import f.od0_1;
import f.pu0_0;
import f.st0_0;
import f.t_0;
import f.tc_1;
import f.to_0;
import f.tu_0;
import f.uf_2;
import f.vk0_1;
import f.xj0_1;
import f.yw_0;
import f.zm_2;
import f.zv_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 游戏核心数据包加载器 (data/data.pak Loader)
 * <p>
 * 原始混淆类: {@code f.uq0_0}
 */
public abstract class DataPackageLoader {
    public static final dl_1 zG0 = Cq0.E1(DataPackageLoader.class);

    protected DataPackageLoader() {
    }

    public static boolean ha0() {
        lg_0.I70.getClass();
        VE file = new VE("data/data.pak", zv_1.tt0);
        try {
            ByteBuffer buffer = ByteBuffer.wrap(FI.MH(file.kI0())).order(ByteOrder.LITTLE_ENDIAN);
            buffer.position(buffer.position() + 8);
            int version = buffer.getInt();
            if (version != 133) {
                zG0.error("Mismatched data.pak version. Expected 133 got {}", version);
                return false;
            }
            int count = buffer.get();
            for (int i = 0; i < count; i++) {
                if (!xu0(buffer)) {
                    return false;
                }
            }
            // 图鉴集合兜底: type10 注册的种族也纳入区域图鉴集合 (av)
            // ROM 加载时 av 只收 1-649, 此处把 data.pak 新注册的种族补进去
            // 650-667 为历史占位槽位, 跳过避免污染图鉴
            mp_1 db = mp_1.vf0();
            int before = db.av.size();
            for (Object value : db.k2.values()) {
                cq_0 species = (cq_0) value;
                if (species.dR >= 668 && !db.av.containsKey(Short.valueOf(species.dR))) {
                    db.av.put(Short.valueOf(species.dR), species);
                }
            }
            zG0.info("图鉴集合同步: k2={} 只, av 从 {} 补充到 {} 只", db.k2.size(), before, db.av.size());
            return true;
        } catch (Exception error) {
            zG0.error("Error loading data package", error);
            return false;
        }
    }

    public static boolean xu0(ByteBuffer buffer) {
        byte type = buffer.get();
        int length = buffer.getInt();
        switch (type) {
            case 1: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    int size = buffer.get() & 255;
                    ArrayList<pu0_0> moves = new ArrayList<>();
                    for (int j = 0; j < size; j++) {
                        short move = buffer.getShort();
                        byte level = buffer.get();
                        moves.add(new pu0_0(level, move));
                    }
                    cq_0 species = (cq_0) mp_1.vf0().k2.get(id);
                    if (species != null) {
                        species.WC = moves;
                    }
                }
                return true;
            }
            case 2: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    Wx0 category = (Wx0) Wx0.NH.BM(buffer.get());
                    int size = buffer.getShort();
                    short[] values = new short[10];
                    int used = 0;
                    for (int j = 0; j < size; j++) {
                        short value = buffer.getShort();
                        int next = used + 1;
                        if (next > values.length) {
                            values = Arrays.copyOf(values, Math.max(values.length << 1, next));
                        }
                        values[used] = value;
                        used = next;
                    }
                    cq_0 species = (cq_0) mp_1.vf0().k2.get(id);
                    if (species != null) {
                        species.r50[category.Jn] = Arrays.copyOf(values, used);
                    }
                }
                return true;
            }
            case 3: {
                uf_2 data = new uf_2(buffer);
                data.LI(buffer);
                return true;
            }
            case 4: {
                st0_0 input = new st0_0(buffer);
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    byte category = buffer.get();
                    bm0_1 categories = yw_0.vP;
                    yw_0 kind = categories.dg(category) ? (yw_0) categories.BM(category) : yw_0.c0;
                    int flags = buffer.getShort();
                    vk0_1 move = (vk0_1) ec0_2.Sx().f4.f5(id);
                    if (move == null) {
                        move = new vk0_1(id, i40_0.Gc);
                        ec0_2.Sx().f4.coM4(move.hC0, move);
                    }
                    move.EW = kind;
                    if ((flags & 1) != 0) {
                        move.mt0 = buffer.get();
                    }
                    if ((flags & 2) != 0) {
                        move.X00 = buffer.getShort();
                    }
                    if ((flags & 4) != 0) {
                        move.lE0 = buffer.get();
                    }
                    if ((flags & 8) != 0) {
                        move.Bn = i40_0.MG0(buffer.get());
                    }
                    if ((flags & 16) != 0) {
                        move.ej = buffer.getInt();
                    }
                    if ((flags & 32) != 0) {
                        move.Tp = buffer.get();
                    }
                    if ((flags & 64) != 0) {
                        move.g5 = buffer.get();
                    }
                    move.continue$ = (flags & 128) != 0;
                    if ((flags & 256) != 0) {
                        move.l10 = buffer.get();
                    }
                    if ((flags & 512) != 0) {
                        int size = buffer.get();
                        gc_2[] sourceStats = new gc_2[size];
                        for (int j = 0; j < size; j++) {
                            sourceStats[j] = (gc_2) gc_2.z80.BM(buffer.get());
                        }
                        byte sourceStage = buffer.get();
                        int targetSize = buffer.get();
                        gc_2[] targetStats = new gc_2[targetSize];
                        for (int j = 0; j < targetSize; j++) {
                            targetStats[j] = (gc_2) gc_2.z80.BM(buffer.get());
                        }
                        byte targetStage = buffer.get();
                        boolean enabled = buffer.get() == 1;
                        byte chance = buffer.get();
                        move.WK = sourceStats;
                        move.tD0 = targetStats;
                        move.zy0 = sourceStage;
                        move.yE = targetStage;
                        move.Gk = enabled;
                        move.qh0 = chance;
                    }
                    int effects = buffer.get();
                    od0_1[] values = new od0_1[effects];
                    for (int j = 0; j < effects; j++) {
                        int code = buffer.getInt();
                        int size = buffer.get();
                        iz0_0[] parameters = new iz0_0[size];
                        for (int k = 0; k < size; k++) {
                            parameters[k] = input.vG();
                        }
                        values[j] = new od0_1(code, parameters);
                    }
                    move.V6 = values;
                }
                return true;
            }
            case 5: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    hc_1 entries = new hc_1(id);
                    int size = buffer.getShort();
                    for (int j = 0; j < size; j++) {
                        byte first = buffer.get();
                        buffer.getShort();
                        byte second = buffer.get();
                        tc_1 kind = (tc_1) tc_1.rx0.BM(buffer.get());
                        OD entry = new OD(first, second, kind, buffer.get(), buffer.get(), buffer.get(),
                                buffer.getShort(), buffer.get(), buffer.get());
                        entries.hp0.add(entry);
                    }
                    dh0_0.FK0.r10.coM4(entries.eJ0, entries);
                }
                return true;
            }
            case 6: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    int flags = buffer.getShort();
                    cq_0 species = (cq_0) mp_1.vf0().k2.get(id);
                    if (species == null) {
                        species = new cq_0(id);
                    }
                    if ((flags & 1) != 0) {
                        byte first = buffer.get();
                        bm0_1 groups = au_1.Ty;
                        au_1 one = (au_1) groups.BM(first);
                        au_1 two = (au_1) groups.BM(buffer.get());
                        species.B2 = one;
                        species.Cw = two;
                    }
                    if ((flags & 2) != 0) {
                        species.jD = true;
                    }
                    if ((flags & 64) != 0) {
                        species.Hd = true;
                    }
                    if ((flags & 4) != 0) {
                        for (gc_2 stat : gc_2.ME) {
                            if (stat.j8) {
                                continue;
                            }
                            short value = buffer.getShort();
                            if (value != -1) {
                                setStat(species, stat, value);
                            }
                        }
                    }
                    if ((flags & 8) != 0) {
                        for (int j = 0; j < 3; j++) {
                            species.h5[j] = buffer.getShort();
                        }
                    }
                    if ((flags & 16) != 0) {
                        species.OR = buffer.getShort();
                        species.AB0();
                    }
                    if ((flags & 32) != 0) {
                        int size = buffer.get();
                        short[] forms = new short[size];
                        for (int j = 0; j < size; j++) {
                            forms[j] = buffer.getShort();
                        }
                        species.rA0 = forms;
                    }
                    if ((flags & 128) != 0) {
                        buffer.getShort();
                    }
                    if ((flags & 256) != 0) {
                        byte value = buffer.get();
                        species.uC = (he0_1) t_0.BI0(he0_1.oN.BM(value), he0_1.class, value);
                    }
                    if ((flags & 512) != 0) {
                        species.J4 = true;
                    }
                }
                return true;
            }
            case 7: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    int[] rates = new int[5];
                    for (int j = 0; j < 5; j++) {
                        rates[j] = buffer.get();
                    }
                    byte first = buffer.get();
                    byte second = buffer.get();
                    short third = buffer.getShort();
                    byte fourth = buffer.get();
                    byte fifth = buffer.get();
                    short sixth = buffer.getShort();
                    gu0 items = gu0.l2;
                    items.getClass();
                    ArrayList<mc0_1> matches = new ArrayList<>();
                    for (Object value : items.Pd0.values()) {
                        mc0_1 item = (mc0_1) value;
                        if (item.Z8 == id || (item.EX > 0 && item.EX == id)) {
                            matches.add(item);
                        }
                    }
                    for (mc0_1 item : matches) {
                        item.mK = rates;
                        item.xB0 = first;
                        item.vp = second;
                        item.ZX = third;
                        item.ia = fourth;
                        item.uL0 = fifth;
                        item.sh = sixth;
                    }
                }
                return true;
            }
            case 8: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    byte id = buffer.get();
                    byte second = buffer.get();
                    int value = buffer.getInt();
                    buffer.getInt();
                    byte firstFlag = buffer.get();
                    byte secondFlag = buffer.get();
                    short data = buffer.getShort();
                    byte eventId = buffer.get();
                    byte kindId = buffer.get();
                    hq_2 registry = hq_2.ZG;
                    tu_0 event = (tu_0) t_0.BI0(tu_0.MR.BM(eventId), tu_0.class, eventId);
                    D ignored = (D) t_0.BI0(D.q1.BM(kindId), D.class, kindId);
                    OJ entry = new OJ(id, second, value, firstFlag, secondFlag, data, event);
                    registry.kg.gE0(id, entry);
                }
                return true;
            }
            case 9: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    WM registry = WM.qu0;
                    Ct0 kind = (Ct0) Ct0.p70.BM(buffer.get());
                    buffer.getInt();
                    buffer.getShort();
                    float value = buffer.getFloat();
                    buffer.getShort();
                    ba_2 entry = new ba_2(id, kind, value);
                    registry.Nf.coM4(id, entry);
                }
                return true;
            }
            case 10: {
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    cq_0 species = new cq_0(id);
                    species.jD = true;
                    au_1 group = au_1.PI;
                    species.B2 = group;
                    species.Cw = group;
                    i40_0 first = i40_0.MG0(buffer.get());
                    i40_0 second = i40_0.MG0(buffer.get());
                    species.av0 = first;
                    species.aUx = second;
                    for (gc_2 stat : gc_2.Wp) {
                        setStat(species, stat, buffer.getShort());
                    }
                    for (int j = 0; j < 3; j++) {
                        species.h5[j] = buffer.getShort();
                    }
                    species.Ai = buffer.getShort();
                    mp_1.vf0().k2.put(species.dR, species);
                }
                return true;
            }
            case 11: {
                int count = buffer.get();
                for (byte i = 0; i < count; i++) {
                    byte region = buffer.get();
                    int size = buffer.getShort();
                    for (short rank = 1; rank < size + 1; rank++) {
                        short id = buffer.getShort();
                        cq_0 species = (cq_0) mp_1.vf0().k2.get(id);
                        if (species != null) {
                            if (region >= 0 && region < species.Dz.length) {
                                species.Dz[region] = rank;
                            } else {
                                species.Dz[species.Dz.length - 1] = rank;
                            }
                        }
                    }
                }
                return true;
            }
            case 12: {
                int count = buffer.getShort();
                for (short i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    short first = buffer.getShort();
                    short second = buffer.getShort();
                    int size = buffer.get();
                    xj0_1[] entries = kf0_0.H2;
                    if (size > 0) {
                        ArrayList<xj0_1> values = new ArrayList<>();
                        for (short j = 0; j < size; j++) {
                            values.add(new xj0_1(buffer.getShort(), buffer.getShort()));
                        }
                        entries = values.toArray(new xj0_1[0]);
                    }
                    zm_2 registry = zm_2.gH0;
                    kf0_0 entry = new kf0_0(id, entries, first, second);
                    registry.YA0.coM4(id, entry);
                }
                return true;
            }
            case 13: {
                dl_1 initialized = gl0_2.Iq;
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    short id = buffer.getShort();
                    l4_0 registry = l4_0.Py0;
                    M3 value = (M3) registry.Ij.f5(id);
                    if (value == null) {
                        value = new M3(ib0_0.sh, M3.f70);
                        registry.Ij.coM4(id, value);
                    }
                    int flags = buffer.get();
                    if ((flags & 1) != 0) {
                        value.V1 = buffer.get();
                    }
                    if ((flags & 2) != 0) {
                        value.throws$ = ib0_0.NV(buffer.get());
                    }
                    if ((flags & 4) != 0) {
                        buffer.get();
                    }
                    if ((flags & 8) != 0) {
                        int size = buffer.get();
                        byte[] data = new byte[size];
                        for (int j = 0; j < size; j++) {
                            data[j] = buffer.get();
                        }
                        value.iQ = data;
                    }
                }
                return true;
            }
            case 14: {
                dl_1 initialized = gl0_2.Iq;
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    byte id = buffer.get();
                    l4_0 registry = l4_0.Py0;
                    HU value = (HU) registry.Lk0.BM(id);
                    if (value == null) {
                        value = new HU(id);
                        registry.Lk0.gE0(id, value);
                    }
                    int flags = buffer.get();
                    if ((flags & 1) != 0) {
                        value.OA = buffer.get();
                    }
                    if ((flags & 2) != 0) {
                        value.VC = buffer.get();
                    }
                    if ((flags & 4) != 0) {
                        buffer.get();
                    }
                }
                return true;
            }
            case 15: {
                dl_1 initialized = gl0_2.Iq;
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    byte region = buffer.get();
                    short id = buffer.getShort();
                    to_0 sprites = (to_0) QI.Py.s10.BM(region);
                    ht_0 sprite = (ht_0) sprites.X80.get(id);
                    if (sprite == null) {
                        sprite = new IH();
                        sprites.Dp(id, sprite, false);
                    }
                    int flags = buffer.get();
                    if ((flags & 1) != 0) {
                        sprite.or = buffer.get();
                    }
                    if ((flags & 2) != 0) {
                        sprite.oP = buffer.get();
                    }
                    if ((flags & 4) != 0) {
                        sprite.Dc0 = buffer.get();
                    }
                }
                return true;
            }
            case 16: {
                int initialized = Jv0.el;
                int count = buffer.getShort();
                for (int i = 0; i < count; i++) {
                    tu_0 event = tu_0.BE0(buffer.get());
                    int start = buffer.getInt();
                    int end = buffer.getInt();
                    com9__2 registry = com9__2.Om;
                    jx_2 entry = new jx_2(event, start, end);
                    registry.go.put(event, entry);
                }
                com9__2 registry = com9__2.Om;
                if (!registry.go.isEmpty()) {
                    for (Object entry : registry.go.values()) {
                        jx_2 event = (jx_2) entry;
                        if (!event.Be()) {
                            continue;
                        }
                        tu_0 kind = event.RD;
                        if (kind == tu_0.ol || kind == tu_0.I9 || kind == tu_0.os) {
                            registry.mv = kind;
                            break;
                        }
                    }
                }
                return true;
            }
            default:
                buffer.position(buffer.position() + length);
                return true;
        }
    }

    private static void setStat(cq_0 species, gc_2 stat, short value) {
        switch (stat.ordinal()) {
            case 0:
                species.zq = value;
                break;
            case 1:
                species.sE0 = value;
                break;
            case 2:
                species.yi0 = value;
                break;
            case 3:
                species.ce0 = value;
                break;
            case 4:
                species.wL0 = value;
                break;
            case 5:
                species.this$ = value;
                break;
            default:
                break;
        }
    }
}
