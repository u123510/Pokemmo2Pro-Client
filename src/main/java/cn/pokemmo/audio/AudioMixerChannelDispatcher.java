package cn.pokemmo.audio;

import f.*;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedList;

public class AudioMixerChannelDispatcher {
    public static final short[][] Fk0;
    public final Cq nf;
    public av_1 p10;
    public final rh0_1 tB0;
    public final XA0 Sv;
    public final _volatile DF0;
    public final boolean dJ;
    public final byte qn0;
    public final byte fD0;
    public final boolean ci0;
    public boolean m2;
    public final lq0[] hl;
    public final N2[] Zj;
    public zg0_0 j6;
    public final byte K80;
    public final byte AD;
    public final boolean mW;
    public final O8[] eG;
    public PF[][] wI0;
    public final boolean[] Ql0;
    public final oj_2[] zr;
    public boolean oC0;
    public final LinkedList Tk0;
    public final LinkedList lPt9;
    public boolean zL0;
    public boolean uq;
    public boolean rg0;
    public int p1;
    public boolean vy0;
    public final wx_2 R60;
    public short Pl0;
    public final long V20;
    public final byte S0;
    public short pk;
    public byte LPt4;
    public dl_2[][] I60;
    public d70_0 O00;
    public int Xe0;
    public final HashMap l2;
    public dy_1 rU;
    public final byte WY;
    public final Oy0 xy0;
    public final gc_2[] pH0;
    public boolean iv0;
    public boolean a40;
    public final boolean m40;
    public PF Nv0;
    public final HashMap qQ;

    static {
        Fk0 = new short[][] {
            new short[] { 265, 266, 296, 297, 299 },
            new short[] { 471, 475, 476, 477, 478, 481, 483, 508, 509, 511 },
            new short[] { 1130, 1131, 1132, 1133, 1134, 1135, 1136, 1137, 1138, 1139, 1145 },
            new short[] { 1115, 1117, 1120, 1123, 1124, 1134, 1136, 1202 },
            new short[] { 1117, 1118, 1119, 1120, 1124, 1126, 1127, 1147 }
        };
    }

    public static byte Vp0(byte b) {
        return (byte) (b == 0 ? 1 : 0);
    }

    public static void GD(b30_0 b30) {
        Oz0 he0;
        if (tw0_0.LD0 != null && (he0 = tw0_0.LD0.he0) != null) {
            ML0 ml = he0.N10;
            byte pp0 = b30.Pp0;
            byte b6 = b30.B6;
            ml.Tb0[pp0][b6].up();
        }
    }

    public AudioMixerChannelDispatcher(Cq cq, zg0_0 zg, int i3, byte b4, byte b5, rh0_1 rh0, XA0 xa0, byte b8, short s9, _volatile volatileVar, boolean z11, byte b12, byte b13, N2[] n2Arr, lq0[] lq0Arr, Oy0 oy0, gc_2[] gc2Arr, byte b18, byte b19, boolean z20, O8[] o8Arr, PF[][] pfArr, boolean z23) {
        this.p10 = null;
        this.j6 = zg0_0.ot;
        this.oC0 = false;
        this.Tk0 = new LinkedList();
        this.lPt9 = new LinkedList();
        this.zL0 = false;
        this.uq = false;
        this.rg0 = false;
        this.p1 = 0;
        this.vy0 = false;
        this.R60 = new wx_2();
        this.Pl0 = 0;
        this.pk = 0;
        this.LPt4 = -1;
        this.I60 = null;
        this.O00 = d70_0.Do;
        this.l2 = new HashMap();
        this.rU = null;
        this.qQ = new HashMap();
        this.nf = cq;
        this.j6 = zg;
        this.V20 = System.currentTimeMillis() - (long) i3 * 1000L;
        this.S0 = b4;
        this.tB0 = rh0;
        this.Sv = xa0;
        this.LPt4 = b8;
        this.pk = s9;
        this.DF0 = volatileVar;
        this.dJ = z11;
        this.qn0 = b12;
        this.fD0 = b13;
        this.ci0 = z23;
        this.Zj = n2Arr;
        this.hl = lq0Arr;
        this.xy0 = oy0;
        this.pH0 = gc2Arr;
        this.K80 = b18;
        this.AD = b19;
        this.mW = z20;
        this.eG = o8Arr;
        this.wI0 = pfArr;
        this.WY = b5;
        this.Ql0 = new boolean[cq.Un(b18)];
        this.zr = new oj_2[cq.Un(b18)];
        byte len = (byte) this.wI0.length;
        boolean allUt = true;
        for (byte i = 0; i < len; i = (byte) (i + 1)) {
            o8Arr[i].dj((a10_0) this);
            if (!o8Arr[i].Td0().Ut()) {
                allUt = false;
            }
        }
        this.m40 = allUt;
    }

    public final void H30() {
        if (this.a40) {
            return;
        }
        Mj mj;
        if (kd0()) {
            mj = tw0_0.rl.r1(this.DF0);
        } else {
            mj = tw0_0.rl.PC0;
        }
        if (mj == null) {
            return;
        }
        tb0_1[] tbArr = this.eG[this.K80].NC(this.eG[this.K80].L40(this.AD));
        int len = tbArr.length;
        for (int i = 0; i < len; i++) {
            tb0_1 tb = tbArr[i];
            VU vu = mj.sF(tb.tz0());
            if (vu != null && tb.gQ()) {
                se_0 se = tb.B3;
                se.getClass();
                se.Bn = vu.I8;
                short yb0 = se.Bn.Yb0;
                se.ZE0 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(yb0));
                se.D4 = vu.Dg0();
                se.Sj = vu.Ps.BL0(gc_2.RC);
                se.Oq0 = true;
                CE ce = se.Bn;
                se.nF0 = ce.ZF0;
                short t0 = se.T0;
                if (t0 == -1) {
                    se.T0 = ce.rh0();
                } else if (t0 != ce.rh0()) {
                    se.Bn.ZE0 = se.T0;
                }
                tb.Wb();
            }
        }
    }

    public final Cq eu() {
        return this.nf;
    }

    public final av_1 JT() {
        return this.p10;
    }

    public final XA0 yK() {
        return this.Sv;
    }

    public final byte Ez0() {
        byte b = this.K80;
        if (b == -128) {
            return 0;
        }
        return b;
    }

    public final byte zn0() {
        return this.AD;
    }

    public final byte eI() {
        return (byte) (Ez0() == 1 ? 0 : 1);
    }

    public final byte abstract$() {
        return (byte) this.wI0.length;
    }

    public final byte J80(byte b) {
        return (byte) this.wI0[b].length;
    }

    public final PF[][] QY() {
        return this.wI0;
    }

    public final PF[] Yc(byte b) {
        return this.wI0[b];
    }

    public PF Ce(byte b, byte b2) {
        if (b < 0 || b > 1) {
            return null;
        }
        PF[] arr = this.wI0[b];
        if (b2 >= arr.length) {
            return null;
        }
        return arr[b2];
    }

    public final int ni0(byte b) {
        int count = 0;
        PF[] arr = this.wI0[b];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            PF pf = arr[i];
            if (pf != null && !pf.zi0.hf0() && pf.zi0.Bn.I()) {
                count++;
            }
        }
        return count;
    }

    public final O8 mn(byte b) {
        if (b < 0 || b >= this.eG.length) {
            return null;
        }
        return this.eG[b];
    }

    public final b30_0 D0() {
        if (this.oC0) {
            return null;
        }
        for (byte i = 0; i < this.Ql0.length; i = (byte) (i + 1)) {
            if (this.Ql0[i] && this.zr[i] == null) {
                return b30_0.U5(this.K80, i);
            }
        }
        return null;
    }

    public final int gc0() {
        int lastIdx = -1;
        for (int i = 0; i < this.zr.length; i++) {
            if (this.zr[i] != null) {
                lastIdx = i;
            }
        }
        return lastIdx;
    }

    public final void p0(ML0 ml, byte b) {
        PF[] arr = this.wI0[b];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            PF pf = arr[i];
            if (pf != null && !pf.zi0.hf0()) {
                ml.Hi(pf).XO();
            }
        }
    }

    public final void YP(TC0 tc) {
        try {
            for (Object obj : this.Tk0) {
                if (tc.equals(obj)) {
                    return;
                }
            }
        } catch (ConcurrentModificationException ignored) {
        }
        this.Tk0.add(tc);
    }

    public final PF nd0(CH0 ch0) {
        for (byte i = 0; i < (byte) this.wI0.length; i = (byte) (i + 1)) {
            PF[] row = this.wI0[i];
            int len = row.length;
            for (int j = 0; j < len; j++) {
                PF pf = row[j];
                if (pf != null && pf.Zo0().equals(ch0)) {
                    return pf;
                }
            }
        }
        return null;
    }

    public final void Jm(PF pf) {
        for (byte i = 0; i < (byte) this.wI0.length; i = (byte) (i + 1)) {
            for (byte j = 0; j < this.wI0[i].length; j = (byte) (j + 1)) {
                if (this.wI0[i][j] == pf) {
                    if (pf.ok0 != null) {
                        pf.ok0.run();
                    }
                    pf.c20();
                    this.wI0[i][j] = null;
                }
            }
        }
    }

    public final void F2(byte b, SZ[] szArr, SZ[] szArr2, int i, int i2, SZ[] szArr3, byte b2) {
        if (this.Sv == XA0.PRN) {
            this.zL0 = true;
            return;
        }
        if (this.j6 == zg0_0.ef0) {
            this.zL0 = true;
            return;
        }
        if ((b2 & 1) != 0) {
            this.uq = true;
            this.Tk0.clear();
        }
        this.Tk0.add(new Ve0(b, szArr, szArr2, i, i2, szArr3));
        this.zL0 = true;
    }

    public byte cOM1() {
        byte b = this.LPt4;
        if (b != -1) {
            return b;
        }
        return this.eG[eI()].f90();
    }

    public short QA() {
        short s = this.pk;
        if (s > 0) {
            return s;
        }
        return this.eG[eI()].WK0();
    }

    public final boolean gD0(gw0_0 gw) {
        if (this.l2.containsKey(gw)) {
            return ((bj0_2) this.l2.get(gw)).Cw0 >= 1;
        }
        return false;
    }

    public final boolean s80() {
        return this.a40;
    }

    public final boolean mo() {
        return this.K80 == -128;
    }

    public final boolean m60() {
        return this.mW;
    }

    public final boolean ii() {
        return this.m40;
    }

    public final PF Ol0() {
        return this.Nv0;
    }

    public final boolean Cd0() {
        return this.j6 == zg0_0.ku0;
    }

    public final boolean kd0() {
        return this.DF0 != null;
    }

    public final short Kx0() {
        return this.Pl0;
    }

    public final long yE() {
        return this.V20;
    }

    public final zg0_0 dc() {
        return this.j6;
    }

    public final boolean T2() {
        return this.I60 != null;
    }

    public final dl_2 Qt0(byte b, byte b2) {
        dl_2[][] arr = this.I60;
        if (arr == null) {
            return null;
        }
        dl_2[] row = arr[b];
        if (row.length <= b2) {
            return null;
        }
        return row[b2];
    }

    public final int QX(int i, PF pf) {
        if (pf == null) {
            return i;
        }
        byte cd0 = pf.cD0;
        if (cd0 == Ez0()) {
            return i;
        }
        O8 o8 = mn(cd0);
        o8.getClass();
        if (o8 instanceof ux_0) {
            return i + 1;
        }
        return i + 2;
    }

    public final int eH0(int i, PF pf, PF pf2) {
        if (pf != null && pf.cD0 != Ez0()) {
            O8 o8 = mn(pf.cD0);
            o8.getClass();
            if (o8 instanceof ux_0) {
                if (pf2.cD0 == pf.cD0) {
                    return i + 4;
                }
                return i + 3;
            }
            if (pf2.cD0 == pf.cD0) {
                return i + 6;
            }
            return i + 5;
        }
        return QX(i, pf2);
    }

    public final tb0_1 yD0(CH0 ch0) {
        if (ch0.Uz0()) {
            return null;
        }
        O8[] arr = this.eG;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            tb0_1[] tbArr = arr[i].zz();
            int tbLen = tbArr.length;
            for (int j = 0; j < tbLen; j++) {
                tb0_1 tb = tbArr[j];
                if (tb.gQ() && tb.tz0().equals(ch0)) {
                    return tb;
                }
            }
        }
        return null;
    }

    public final void N8(b30_0 b30, kt_2 kt, short s) {
        if (kt != null && kt != kt_2.UR) {
            O8 o8 = mn(b30.Pp0);
            byte b6 = b30.B6;
            PF pf = Ce(b30.Pp0, b6);
            this.qQ.put(b30, new V00(o8, b6, kt, pf, s));
        } else {
            this.qQ.put(b30, null);
        }
        lg_0.k.lPT5(() -> GD(b30));
    }

    public final int Vs0(byte b, int i) {
        if (b == Ez0()) {
            return i;
        }
        return i + 1;
    }
}
