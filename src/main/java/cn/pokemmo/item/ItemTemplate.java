package cn.pokemmo.item;

import f.*;

import java.nio.ByteBuffer;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

/**
 * 物品原型/模板核心数据模型 (Item Template)
 * 管理物品编号、图标、名称与描述多语言文本、买卖价格、背包口袋分类、使用限制与排序规则
 * 原混淆类: f.mc0_1
 */
public class ItemTemplate implements Cloneable, Comparable {
    public static final od0_1[] MA = new od0_1[0];
    public static final cq_0[] mr = new cq_0[0];
    public static final byte[] uR;

    public byte PX;
    public int Nl;
    public short Z8;
    public int TD;
    public int d2;
    public int Fv;
    public Supplier<String>[] lpT9;
    public l5_0 Yt0;
    public short tX;
    public boolean CJ0;
    public byte Zp;
    public byte ia0;
    public j30_0 Mj0;
    public gc_2 dp0;
    public short nn;
    public short Yk0;
    public NL sE0;
    public byte Yl;
    public int Ye0;
    public byte Bk0;
    public short Yw;
    public short sh0;
    public short qm;
    public X90 Iq;
    public boolean eG;
    public boolean M80;
    public boolean n4;
    public boolean ii0;
    public tu_0 jq0;
    public byte lx;
    public short zK;
    public short EX;
    public JU lQ;
    public JU qy;
    public int[] mK;
    public byte xB0;
    public byte vp;
    public short ZX;
    public byte ia;
    public byte uL0;
    public short sh;
    public byte I90;
    public byte ci;
    public short wb0;
    public short pW;
    public boolean transient$;
    public QL g0;
    public byte PP;
    public i40_0 wa;
    public NA0 wX;
    public YearMonth Ui0;
    public tu_0 vJ0;
    public Us0 Zl0;
    public boolean rg;
    public od0_1[] Wj0;
    public boolean kr0;
    public boolean uK0;
    public byte hh;
    public byte Aw;
    public short QJ;
    public cq_0[] xC;
    public BiPredicate bb0;

    static {
        uR = new byte[25];
        uR[3] = -3;
        uR[2] = -2;
        uR[1] = -1;
        uR[0] = 10;
    }

    public ItemTemplate() {
        d2 = -1;
        tX = 0;
        CJ0 = false;
        Zp = 0;
        ia0 = 0;
        Mj0 = j30_0.Hi;
        dp0 = null;
        nn = 0;
        Yk0 = 0;
        sE0 = NL.g40;
        Yl = 0;
        Ye0 = 0;
        Bk0 = -1;
        Yw = 0;
        sh0 = 9999;
        qm = -1;
        eG = true;
        n4 = true;
        ii0 = true;
        jq0 = tu_0.M4;
        EX = -1;
        JU initial = JU.O4;
        lQ = initial;
        qy = initial;
        mK = null;
        xB0 = 0;
        vp = 0;
        ZX = 0;
        ia = 0;
        uL0 = 0;
        sh = 0;
        I90 = -1;
        ci = -1;
        wb0 = -1;
        pW = 0;
        transient$ = false;
        g0 = QL.lQ;
        PP = 0;
        wa = i40_0.Gc;
        wX = NA0.T70;
        Ui0 = null;
        vJ0 = null;
        Zl0 = null;
        Wj0 = MA;
        kr0 = false;
        uK0 = false;
        hh = -1;
        Aw = -1;
        QJ = -1;
        xC = mr;
    }

    public ItemTemplate(short id, short icon, int name, int description, short price, l5_0 category) {
        this();
        PX = 10;
        Z8 = id;
        qm = icon;
        Nl = name;
        Fv = description;
        TD = price;
        Yt0 = category;
        Yw = category != null ? category.Vq() : 0;
    }

    public static String[] UC0(int size) {
        return new String[size];
    }

    public final mc0_1 asBridge() {
        return ((Object) this) instanceof mc0_1 ? (mc0_1) (Object) this : null;
    }

    public final short getId() {
        return Z8;
    }

    public final short rX() {
        return getId();
    }

    public final short getIconId() {
        short explicit = qm;
        if (explicit > -1) {
            return explicit;
        }
        X90 item = Iq;
        if (item == null) {
            return Z8;
        }
        short base = (short) (30000 + item.SG.iL * 10);
        switch (tg0_1.W0[wX.g20]) {
            case 1:
            case 2:
                return (short) (base + 5);
            case 3:
            case 4:
            case 5:
            case 6:
                return (short) (base + 4);
            case 7:
                return (short) (base + 3);
            case 8:
            case 9:
            case 10:
            case 11:
                return (short) (base + 2);
            case 12:
            case 13:
                return (short) (base + 6);
            default:
                return !kr0 && !uK0 && item.wk(4) ? (short) (base + 1) : base;
        }
    }

    public final short V4() {
        return getIconId();
    }

    public final int getBuyPrice() {
        return TD;
    }

    public final int IH0() {
        return getBuyPrice();
    }

    public final int getSellPrice() {
        int value = d2;
        return value > 0 && value <= TD ? value : (short) (TD / 2);
    }

    public final int gQ() {
        return getSellPrice();
    }

    public final String getName() {
        return sm0_0.c0(Nl);
    }

    public final BagPocket getBagPocket() {
        return this.Yt0 != null ? this.Yt0.toDomain() : null;
    }

    public final l5_0 su0() {
        return Yt0;
    }

    public final void ca(short id, l50_0 format, ByteBuffer data) {
        PX = format.Tz();
        Z8 = id;
        Nl = id + 240000;
        Fv = id + 130000;
        TD = data.getShort() * 10;
        data.get();
        data.get();
        data.get();
        data.get();
        data.get();
        data.get();
        short flags = data.getShort();
        i40_0.COm3((byte) (flags & 31));
        int category = ((flags & 65535) >> 7) & 7;
        if (PX == 2) {
            l5_0 found = null;
            for (l5_0 candidate : l5_0.tC0) {
                if (candidate.LP == category) {
                    found = candidate;
                    break;
                }
            }
            Yt0 = found;
        } else if (PX == 3 || PX == 4) {
            if (category == 5) {
                Yt0 = l5_0.B9;
            } else {
                l5_0 found = null;
                for (l5_0 candidate : l5_0.tC0) {
                    if (candidate.cOm2 == category) {
                        found = candidate;
                        break;
                    }
                }
                Yt0 = found;
            }
        }
        byte usage = data.get();
        data.get();
        data.get();
        byte kind = data.get();
        if (kind == 4) {
            Yt0 = l5_0.hB;
        } else if (kind == 3) {
            Yt0 = l5_0.Ih;
        }
        data.get();
        data.get();
        if (kind == 4) {
            Bk0 = data.get();
        } else {
            data.get();
        }
        data.get();
        data.get();
        data.get();
        data.get();
        short modifiers = data.getShort();
        for (byte i = 0; i < 6; i++) {
            if ((modifiers & (8 << i)) != 0) {
                dp0 = (gc_2) gc_2.z80.BM(i);
            }
        }
        for (byte i = 0; i < 6; i++) {
            byte value = data.get();
            gc_2 modifier = dp0;
            if (modifier != null && modifier.v10 == i) {
                nn = value;
            }
        }
        tX = (short) (data.get() & 255);
        switch (tX) {
            case 253:
                tX = 25;
                CJ0 = true;
                break;
            case 254:
                tX = 50;
                CJ0 = true;
                break;
            case 255:
                tX = 100;
                CJ0 = true;
                break;
            default:
                break;
        }
        ia0 = data.get();
        data.get();
        data.get();
        data.get();
        if (usage > 0 && usage != 7) {
            lQ = JU.xj;
        }
        l5_0 current = Yt0;
        if (current == l5_0.YW) {
            lQ = JU.NA;
        }
        Yw = current != null ? current.EF : 0;
    }

    public final JU dB0(boolean alternate) {
        if (Iq != null) {
            return alternate ? JU.O4 : JU.xj;
        }
        return alternate ? qy : lQ;
    }

    public final void nO(Supplier<String>... arguments) {
        lpT9 = arguments;
    }

    public String Com4(byte variant, int width) {
        if (Fv < 0) {
            return "";
        }
        Supplier<String>[] suppliers = lpT9;
        String[] arguments = suppliers == null ? new String[0]
                : Arrays.stream(suppliers).map(Supplier::get).toArray(ItemTemplate::UC0);
        String result;
        if (variant == 1 && sm0_0.cU.l90(Fv + variant * 500)) {
            result = sm0_0.Bx(Fv + variant * 500, arguments);
        } else {
            result = sm0_0.Bx(Fv, arguments);
        }
        if (width > 0) {
            result = hx_1.oO(result, width, null, false, 0);
        }
        return result;
    }

    public final String Nt0(byte variant, tu_2 detail) {
        String name = sm0_0.c0(Nl);
        short id = Z8;
        if (detail != null && (id >= 2431 && id <= 2451
                || id >= 4576 && id <= 4578 || id >= 4624 && id <= 4626)) {
            return AN.nK0(name, " - ").append(sm0_0.wa0(5496, String.valueOf(detail.he))).toString();
        }
        switch (id) {
            case 3342:
            case 3343:
            case 3344:
            case 3361:
            case 3362:
            case 3363:
            case 3373:
            case 3374:
            case 4611:
            case 4636:
            case 4647:
                if (detail != null) {
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    calendar.setTimeInMillis((long) detail.bs * 1000L);
                    return new StringBuilder().append(name).append(" - ").append(calendar.get(1)).toString();
                }
                break;
            default:
                break;
        }
        X90 item = Iq;
        if (item != null && item.yt()) {
            name = AN.nK0(name, " (").append(yb_1.f9(variant).Xe()).append(")").toString();
        }
        return name;
    }

    public final int GL0() {
        return Nl;
    }

    public final void gd0(int name) {
        Nl = name;
    }

    public final byte UH0() {
        return Bk0;
    }

    public final byte YI0() {
        return ia0;
    }

    public final int AK() {
        return Ye0;
    }

    public final void gc(BiPredicate predicate) {
        bb0 = predicate;
    }

    public final boolean com5(vk0_1 first, yw_0 second) {
        BiPredicate predicate = bb0;
        return predicate != null && predicate.test(first, second);
    }

    public final boolean ol() {
        return xC != null && xC.length > 0;
    }

    public final cq_0[] uq() {
        return xC;
    }

    public final short Zq() {
        return wb0;
    }

    public final boolean nI() {
        if (wb0 < 1) {
            return false;
        }
        short id = Z8;
        return id >= 339 && id <= 346 || id >= 5420 && id <= 5425
                || id >= 8420 && id <= 8427 || id >= 1297 && id <= 1298
                || id >= 9420 && id <= 9427;
    }

    public final void Zx0(X90 item) {
        Iq = item;
    }

    public final X90 jc() {
        return Iq;
    }

    public final boolean TL() {
        if (Yt0 == l5_0.Jy || nI()) {
            return false;
        }
        return eG;
    }

    public final boolean To0(boolean restricted) {
        if (restricted) {
            if (Yt0 == l5_0.Jy || nI()) {
                return false;
            }
            if (wX != null && !wX.CP) {
                return false;
            }
            if (!kr0 && Iq != null) {
                return false;
            }
        }
        return n4;
    }

    public final boolean ry() {
        return ii0;
    }

    public final byte vy() {
        return lx;
    }

    public final int pe() {
        X90 item = Iq;
        return item != null ? l5_0.Hj.xS * 100 + item.SG.iL : Yw;
    }

    public final mc0_1 dm(short id) {
        try {
            mc0_1 copy = (mc0_1) super.clone();
            copy.Z8 = id;
            copy.qm = V4();
            copy.EX = Z8;
            return copy;
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public final boolean X80() {
        return mK != null;
    }

    public final void ga(byte first, byte second) {
        I90 = first;
        ci = second;
    }

    public final void fA0(byte first, byte second) {
        hh = first;
        Aw = second;
    }

    public final int t30(mc0_1 other) {
        if (other == null) {
            return 0;
        }
        if (pe() != other.pe()) {
            return pe() - other.pe();
        }
        if (Yt0 == l5_0.YW && other.Yt0 == l5_0.YW && nI() != other.nI()) {
            return (nI() ? 1 : 0) - (other.nI() ? 1 : 0);
        }
        if (Yt0 == l5_0.hB && other.Yt0 == l5_0.hB) {
            byte[] order = uR;
            int result = order[Bk0] - order[other.Bk0];
            if (result != 0) {
                return result;
            }
        }
        int result = sm0_0.c0(Nl).toLowerCase().compareTo(sm0_0.c0(other.Nl).toLowerCase());
        if (result != 0) {
            return result;
        }
        result = Boolean.compare(other.eG, eG);
        if (result != 0) {
            return result;
        }
        return Integer.compare(Z8, other.Z8);
    }

    @Override
    public int compareTo(Object other) {
        return t30((mc0_1) other);
    }

    public final void mq0(j30_0 value) {
        Mj0 = value;
    }

    public final void o90() {
        sh0 = 1;
    }
}
