package cn.pokemmo.net.session;

import f.*;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* Draft derived only from the current Recaf JASM. Not a compilable source file yet. */
/**
 * 客户端主网络协议分发器与状态路由上下文 (Client Protocol Dispatcher & Session Context)
 * 原混淆类: f.Ge0
 */
public abstract class AbstractClientProtocolContext {
    public static final dl_1 XI0;
    public static final short[][][] wn;
    public static byte Vv0;
    public static short Fu0;
    public static final short[] Vl0;
    public static final boolean[] Dt;
    public int yE;
    public final byte[] hE0;
    public final np_0 CA;
    public k20_0 fk0;
    public TX Wz;
    public final ZY Cl;
    public e30_0 k0;
    public final yt_1 cJ0;
    public final Mj[] aG;
    public Mj PC0;
    public final HashMap fW;
    public final RJ0[] NC;
    public final ib_0[] lG;
    public final mw_1[] ja;
    public ap_0 tp0;
    public final LH y8;
    public final vi_0 sN;
    public lf0_2 Gp;
    public Dm0 bh;
    public final bk0_1 yh0;
    public final cq0_0 oY;
    public final fa0_0 q50;
    public final BB0 a8;
    public final td0_0 NF0;
    public pk_0 xI0;
    public yi_1 gd0;
    public boolean LD0;
    public boolean fw;
    public g2_0 xm;
    public boolean NA;
    public boolean nI;
    public final TT A20;
    public short cn;
    public short Sc0;
    public short CON;
    public boolean Qw;
    public fc0_0 Dv0;
    public boolean N3;
    public int c50;
    public boolean Sy;
    public short zA;
    public short qj0;
    public short Wv0;
    public final bm0_1 KE;
    public final bm0_1 mG;
    public A5 u40;
    public byte[] rx0;
    public final TE Ly;
    public final j_0 Ep;
    public final HY dh0;
    public boolean sf;
    public final long NQ;
    public short[] ML0;
    public CH0[] package$;
    public short[] Pa;
    public boolean[] Hf0;
    public final Y60 N40;
    public final Y60 Mr;
    public boolean H4;
    public boolean zm;
    public byte lt;
    public vh0_0 Eo0;
    public byte[] bq0;
    public lp_1[] w0;
    public int wc0;
    public final AtomicBoolean os0;
    public oa_0 ZE0;
    public final HashSet cb0;
    public zp0_0 LPt1;
    public CH0 BX;
    public byte[] om;

    static {
        XI0 = Cq0.E1(AbstractClientProtocolContext.class);
        wn = new short[][][] {
            { {360}, {259, 272}, {5450}, {8450}, {9450} },
            { {361}, {361}, {5442}, {8442}, {9442} },
            { {264}, {264}, {5447}, {8447}, {9447} },
            { {263}, {263}, {}, {8446}, {9446} },
            { {262}, {262}, {}, {8445}, {9445} },
            { {268}, {268}, {5448}, {8448}, {9448} },
            { {261}, {261}, {5471}, {5471}, {9471} },
            { {}, {1540}, {}, {}, {} }
        };
        Vv0 = 0;
        Fu0 = 95;
        Vl0 = new short[0];
        Dt = new boolean[0];
    }

    public AbstractClientProtocolContext(np_0 v1, int i2, byte[] v3) {
        this.k0 = null;
        this.cJ0 = new yt_1((Ge0) this);
        this.aG = new Mj[_volatile.pG0.length];
        this.PC0 = null;
        this.fW = new HashMap();
        this.NC = new RJ0[A5.B4.length];
        this.lG = new ib_0[gl_2.Wk0.length];
        this.ja = new mw_1[ur_0.sC0.length];
        this.tp0 = null;
        this.y8 = new LH();
        this.sN = new vi_0();
        this.Gp = null;
        this.bh = null;
        this.yh0 = new bk0_1();
        this.oY = new cq0_0();
        this.q50 = new fa0_0();
        this.a8 = new BB0();
        this.NF0 = new td0_0();
        this.xI0 = null;
        this.gd0 = null;
        this.LD0 = false;
        this.fw = false;
        this.xm = null;
        this.NA = false;
        this.nI = false;
        this.A20 = new TT();
        this.cn = 0;
        this.Sc0 = 0;
        this.CON = 0;
        this.Qw = false;
        this.Dv0 = fc0_0.i4;
        this.N3 = false;
        this.c50 = 0;
        this.Sy = false;
        this.qj0 = 0;
        this.Wv0 = 0;
        this.KE = new bm0_1();
        this.mG = new bm0_1();
        this.u40 = A5.PG0;
        this.Ly = new TE();
        this.Ep = new j_0();
        this.dh0 = new HY();
        this.sf = false;
        this.NQ = System.currentTimeMillis();
        this.ML0 = Vl0;
        this.package$ = new CH0[0];
        this.Pa = Vl0;
        this.Hf0 = Dt;
        this.N40 = new Y60();
        this.Mr = new Y60();
        this.H4 = false;
        this.zm = false;
        this.lt = 0;
        this.bq0 = null;
        this.w0 = new lp_1[0];
        this.wc0 = 0;
        this.os0 = new AtomicBoolean(false);
        this.ZE0 = null;
        this.cb0 = new HashSet();
        this.LPt1 = null;
        this.BX = CH0.j1;
        this.CA = v1;
        this.yE = i2;
        this.hE0 = v3;
        this.Cl = new ZY(i2);
        this.SJ(null, true);
        this.ax(new M1());
    }

    public static boolean X20(short i0, EK v1) { return v1.n2.I8.Yb0 == i0; }
    public static VU con(CH0 v0, Mj v1) { return v1.sF(v0); }
    public static tc_1[] JW(short i0) {
        if (i0 == 245 || (i0 >= 144 && i0 <= 147)) return new tc_1[] { tc_1.dX, tc_1.xm0 };
        return new tc_1[] { tc_1.dX };
    }
    public final void pF(byte i1) { ze0(i1, (byte) 0); }
    public final void LPt2(byte i1, short i2) {
        ze0(i1, (byte) 0);
        if (i2 == 15) tw0_0.e60.jB0.il0.LE(new nk_0[] { nk_0.Xs0 });
    }
    public final void w7(byte i1) { ze0(i1, (byte) 0); }
    public final void rf(byte i1) { ze0(i1, (byte) 0); }
    public final void Ho(short i1, byte i2) { if (i2 == 1) lg_0.k.lPT5(() -> bE0(i1)); }
    public final void bE0(short i1) { sn0(i1, CH0.j1, CH0.j1, (short) 1, (byte) -1); }
    public final void z7(short i1, byte i2) { if (i2 == 1) lg_0.k.lPT5(() -> uM(i1)); }
    public final void uM(short i1) { sn0(i1, CH0.j1, CH0.j1, (short) 1, (byte) -1); }
    public final void NG(TX v1) {
        if (!Qw && n2() == 5 && v1 == Wz) {
            Wz = null;
            jC(sm0_0.c0(1517), zo_0.rr0);
            lpt5__5.hL.ZD(this::NJ, 10000L);
        }
    }
    public final void Id() {
        TX v1 = Wz;
        if (v1 == null || !v1.volatile$) lpt5__5.hL.Com4.execute(this::NJ);
    }
    public final int yS() { return yE; }
    public final ZY XG0() { return Cl; }
    public final Mj r1(_volatile v1) {
        if (v1 == _volatile.Ch) return bh == null ? null : bh.COM3[bh.c80];
        return aG[v1.Go0];
    }
    public final void ax(Mj v1) { lm0(v1.Jn0, v1); }
    public final void lm0(_volatile v1, Mj v2) { aG[v1.Go0] = v2; }
    public final void nl() {
        for (_volatile v : _volatile.VA) {
            Mj m = aG[v.Go0];
            if (m != null) { PC0 = m; return; }
        }
    }
    public final Mj Wp() { return PC0; }
    public final RJ0 Ju() { return Bb(u40); }
    public final RJ0 Bb(A5 v1) { return NC[v1.ec0]; }
    public final ib_0 coM2(gl_2 v1) {
        ib_0 v2 = lG[v1.qH0];
        if (v2 == null) { v2 = new ib_0(v1, new ys_0[0]); lG[v1.qH0] = v2; }
        return v2;
    }
    public final void hc(CH0 v1, ed0_0 v2) {
        EK entry;
        synchronized (fW) {
            entry = (EK) fW.get(v1);
            if (entry != null) {
                entry.zD0 = v2;
            } else {
                VU value = null;
                for (_volatile type : new _volatile[] { _volatile.cN, _volatile.BV }) {
                    Mj m = r1(type);
                    if (m != null) {
                        value = m.sF(v1);
                        if (value != null) break;
                    }
                }
                if (value == null) {
                    XI0.error("Unable to find {}", v1);
                    return;
                }
                entry = new EK(value, v2);
                fW.put(v1, entry);
            }
        }
        BU bu = BU.T50;
        if (bu != null) lg_0.k.lPT5(new Q60(bu));
        short id = entry.n2.I8.Yb0 == 492 ? (short) 1004 : (short) 1003;
        if (v2.Dr) {
            Ep.k5((int) (v2.u7 - System.currentTimeMillis() / 1000L), "", id);
        } else {
            Ep.BW(id);
        }
    }
    public final EK DD(short i1) {
        synchronized (fW) {
            for (Object value : fW.values()) if (X20(i1, (EK) value)) return (EK) value;
            return null;
        }
    }
    public final ap_0 sm() { return tp0; }
    public final lf0_2 bj0() { return Gp; }
    public final bk0_1 hz() { return yh0; }
    public final fa0_0 U20() { return q50; }
    public final pk_0 t7() { return xI0; }
    public final yi_1 Qu() { return gd0; }
    public abstract void VI();
    public final e30_0 ex() { return k0; }
    public final byte yn() { return k0 == null ? 0 : k0.rQ; }
    public abstract boolean ug(sf0_2 v1);
    public final void jC(String v1, zo_0 v2) { ug(new sf0_2(v2, CH0.j1, "", null, (byte) 0, v1)); }
    public final int Cp(zo_0 v1, String v2, String v3, boolean z4) {
        v2 = v2.trim();
        if (v2.length() < 1) return 0;
        if (z4) {
            for (Object value : st_0.my.x5) {
                prn__2 command = (prn__2) value;
                if (command.fs) {
                    if (!tx_1.SC(v2, command.o1)) continue;
                } else {
                    E90 current = tw0_0.e60.jB0;
                    if (!v2.equalsIgnoreCase(command.o1) || current.fH0 < command.qo0()) continue;
                }
                try {
                    command.sr0(v2.split(" "));
                } catch (Throwable t) {
                    t.printStackTrace();
                }
                return 1;
            }
        }
        if (v1 == zo_0.kJ0 && xI0 == null && !v2.startsWith("/")) {
            qK(sm0_0.c0(1531));
            return 0;
        }
        fk0.uQ(new ex_1(v1, v2, v3));
        return 2;
    }
    public final void ze0(byte i1, byte i2) {
        NF0.TY.ng0();
        fk0.uQ(new on_0(i1, i2));
    }
    public final void hB(byte i1, byte... v2) {
        NF0.TY.ng0();
        fk0.uQ(new L7(i1, v2));
    }
    public final void m9() {
        if (fk0 != null) {
            BR self = (BR) this;
            lg_0.k.lPT5(new hh0_0(self));
            lg_0.k.lPT5(new bu_1((Ge0) this));
        }
        if (Wz != null) lg_0.k.lPT5(new x90_0((Ge0) this));
    }
    public final void Am(boolean z1) {
        LD0 = z1;
        yt0();
        if (!z1) {
            for (Object value : cJ0.pn0.values()) {
                bi0_1 item = (bi0_1) value;
                if (item.CI0()) {
                    MO move = (MO) item;
                    move.d40 = Math.max(move.d40, System.currentTimeMillis() + 500L);
                }
            }
            fw = false;
        }
    }
    public final boolean nz() {
        if (LD0) return true;
        return tw0_0.LD0.KJ0 != null;
    }
    public final void wF() {
        a10_0 current = tw0_0.PK0;
        if (current == null) return;
        boolean hadWindow = current.mo();
        boolean wasActive = current.a40;
        Yl view = Qy0.yI0.zK0.Vi0;
        if (current.m40 && current.a40 && view != null && view.Hn0.eE) {
            view.Yi0(false, true);
            byte id = view.D10;
            String text = ((wn0_0) view.aB.dI0).YA.toString();
            fk0.uQ(new ZI(id, text));
        }
        tw0_0.PK0 = null;
        if (hadWindow && tw0_0.Jp != null) {
            tw0_0.Jp.Dc0 = true;
            tw0_0.Jp = null;
        }
        fk0.uQ(wasActive ? new QE0() : new l00_0());
        tw0_0.lM.BO();
        Mj m = r1(_volatile.BV);
        if (m != null) {
            m.rr0 = true;
            m.jf = false;
            for (VU value : m.y0()) value.I8.ZE0 = -1;
        }
    }
    public final void NJ() {
        if (Qw || n2() != 5) return;
        short flags = qj0;
        if ((flags & zo_0.DI0.eN) == 0 && (flags & zo_0.Cj0.eN) == 0 && (flags & zo_0.Hl0.eN) == 0) return;
        if (w0.length < 1) return;
        TX tx = Wz;
        if (tx != null && !tx.volatile$) return;
        if (!os0.compareAndSet(false, true)) return;
        jC(sm0_0.c0(1514), zo_0.rr0);
        if (!yl0_2.G5((Ge0) this)) {
            int delay = wc0 == 0 ? rg0_2.j40(5, 20) : (int) Math.pow(wc0, 2) * 30;
            wc0++;
            jC(sm0_0.wa0(1515, Integer.toString(delay)), zo_0.rr0);
            lpt5__5.hL.ZD(this::NJ, delay * 1000L);
        }
        os0.set(false);
    }
    public final void sn0(short i1, CH0 v2, CH0 v3, short i4, byte i5) {
        I3(i1, v2, v3, i4, i5, (byte) 0, false);
    }
    public abstract void I3(short i1, CH0 v2, CH0 v3, short i4, byte i5, byte i6, boolean z7);
    public final void qn(jb0_0[] v1, jb0_0[] v2) {
        if (v1.length != v2.length || v1.length == 0 || v1.length > 127) return;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i].h80() == v2[i].h80() && v1[i].Xh0() == v2[i].Xh0()) return;
            if (v1[i].Xh0() < 0 || v2[i].Xh0() >= 0) continue;
            return;
        }
        fk0.uQ(new Rm0(v1, v2));
    }
    public final void N8(CH0 v1) { fk0.uQ(new sj0_1(v1)); }
    public final void p4(CH0 v1, short i2, CH0 v3, CH0 v4) {
        if (i2 == 19) {
            BU bu = ((BR) this).lZ.zK0;
            if (bu != null) bu.Iz(true, null);
            return;
        }
        fk0.uQ(new BW(v1, i2, v3, v4));
    }
    public final void Kv0(GI0 v1, byte i2) { fk0.uQ(new Si0(v1, i2, (short) 0)); }
    public final void da0() {
        if (fk0 != null) fk0.uQ(new Ti());
        TX tx = Wz;
        if (tx == null) {
            lpt5__5.hL.Com4.execute(this::NJ);
        } else if (tx.nV == 3) {
            tx.fl(new hi0_0());
        }
        Qy0 qy = Qy0.yI0;
        if (qy.zK0 != null && qy.zK0.BK != null && qy.zK0.BK.Ag0 != null) {
            Br0 br = qy.zK0.BK.Ag0.tp0;
            if (br != null) {
                int index = G50.Rw(dw_2.fP).Sf0;
                br.r8(new LPT6_[] { fn_0.qz0().jp[index] });
            }
        }
    }
    public final void SJ(HK v1, boolean z2) {
        if (z2) {
            ArrayList list = dw_2.pq0();
            if (list.isEmpty()) return;
            v1 = (HK) list.get(0);
            for (Object value : list) {
                HK candidate = (HK) value;
                if (dw_2.Jy0.equalsIgnoreCase(candidate.eC0)) v1 = candidate;
            }
        }
        HashSet requested = new HashSet();
        HashSet changed = new HashSet();
        for (zo_0 type : zo_0.JG) if (!v1.d4.contains(type)) requested.add(type);
        short mask = 0;
        for (zo_0 type : zo_0.JG) {
            if (type.lPt6) requested.add(type);
            mask = (short) (mask | type.eN);
        }
        for (Object value : requested) {
            zo_0 type = (zo_0) value;
            if (type.y80 >= 16) continue;
            if ((qj0 & type.eN) == 0) {
                qj0 = (short) (qj0 | type.eN);
                changed.add(type);
            }
        }
        Wv0 = (short) (~qj0 & mask);
        if (z2) return;
        for (Object value : changed) {
            zo_0 type = (zo_0) value;
            jC(sm0_0.wa0(1523, sm0_0.c0(type.Yf)), type);
        }
        if (!changed.isEmpty()) da0();
    }
    public final void lA() {
        E90 current = cJ0.jB0;
        if (current == null) return;
        e30_0 state = k0;
        state.Sq0 = (short) (state.Sq0 - 1);
        if (state.Sq0 < 0) state.Sq0 = 0;
        short kx = state.Kx;
        short ey = state.ey;
        if (kx > 0 || ey > 0) {
            if (!current.FI0) {
                short step = 1;
                if (kx < 1 && ey > 0) {
                    ey = (short) (ey - step);
                    state.ey = ey;
                    if (ey < 1) {
                        state.Uj = j30_0.Hi;
                        state.a = 0;
                        state.ey = 0;
                    }
                }
                if (kx > 0) state.Kx = (short) (kx - step);
            }
            if (kx - 1 == 1) {
                short id = state.yL0;
                if (id > 0) {
                    boolean available = NC[1].Dj0((byte) -1, id, (short) 1);
                    String text = id < 1 ? sm0_0.c0(245079) : sm0_0.c0(gu0.l2.lPT6(id).Nl);
                    if (available) {
                        pk0_0 menu = tw0_0.FL;
                        jm_1 action = jm_1.Np;
                        menu.iQ(new kt_0(sm0_0.wa0(6012, text), action, hg_2.BD, b -> z7(id, b)));
                    } else {
                        qK(sm0_0.wa0(6011, text));
                    }
                }
            } else if (ey - 1 == 1 && kx <= 0) {
                short id = state.a;
                if (id > 0) {
                    boolean available = NC[1].Dj0((byte) -1, id, (short) 1);
                    String text = id < 1
                        ? sm0_0.c0(gu0.l2.lPT6((short) 1041).Nl)
                        : sm0_0.c0(gu0.l2.lPT6(id).Nl);
                    if (available) {
                        pk0_0 menu = tw0_0.FL;
                        jm_1 action = jm_1.Np;
                        menu.iQ(new kt_0(sm0_0.wa0(6012, text), action, hg_2.BD, b -> Ho(id, b)));
                    } else {
                        qK(sm0_0.wa0(6011, text));
                    }
                }
            }
        }
    }
    public final void R5(byte i1, Cq v2, N2 v3) {
        dh0_1 root = dh0_1.V9;
        Map map = (Map) root.HA.get(Byte.valueOf(i1));
        if (map == null) {
            EnumMap<Cq, Map<N2, rs_1>> outer = new EnumMap<>(Cq.class);
            for (int i = 0; i < 4; i++) outer.put(Cq.NZ[i], new EnumMap<>(N2.class));
            root.HA.put(Byte.valueOf(i1), outer);
            map = outer;
        }
        Map<N2, rs_1> inner = (Map<N2, rs_1>) map.get(v2);
        rs_1 value = inner.get(v3);
        if (value != null && System.currentTimeMillis() >= value.Si0) {
            inner.put(v3, null);
            value = null;
        }
        if (value != null) {
            Ux(i1, v2, v3, value);
            return;
        }
        fk0.uQ(new am0_0(i1, v3.yz, v2.WW));
    }
    public final HY hq() { return dh0; }
    public abstract void qK(String v1);
    public abstract void jp0(String v1);
    public abstract void yt0();
    public abstract void lPt9();
    public final Fd0 Ob0() {
        if (KE.isEmpty()) return null;
        synchronized (KE) {
            new YL0(KE);
            YC0 iterator = new YC0(KE);
            return iterator.hasNext() ? (Fd0) iterator.ro() : null;
        }
    }
    public final A5 gh0() { return u40; }
    public abstract void Ux(byte i1, Cq v2, N2 v3, rs_1 v4);
    public abstract void GC(G50 v1, zo_0 v2, boolean z3, boolean z4);
    public abstract void CA(VU v1);
    public abstract void WK0(zp0_0 v1);
    public final vh0_0 xj() { return Eo0; }
    public abstract void FC0(GH v1);
    public final void kg0() {
        E90 view = cJ0.jB0;
        if (cJ0.N60() == null || view == null || fw) return;
        view.L8.Np0 = true;
        KF secondary = view.rd;
        if (secondary != null) ((Ai0) secondary.hj).Np0 = true;
        LT target = view.ba0.LPt1();
        if (target == null) return;
        if (target.Wb0()) tw0_0.LD0.Sc.wp(target, false, true);
        target.u40().tm(target, view, true);
    }
    public final void LF0(byte i1, short i2, short i3) {
        XD next = XD.Xv(i2, i3, false);
        if (next == null) { ze0(i1, (byte) 0); return; }
        next.zM = () -> rf(i1);
        jn_0 state = tw0_0.LD0;
        XD old = state.no0;
        if (old != null) {
            if (!old.bb0) { old.bb0 = true; old.c80(); }
            if (old.zr0()) BU.T50.Ll(true);
            old.dispose();
            Runnable callback = old.zM;
            if (callback != null) callback.run();
        }
        state.no0 = next;
    }
    public final void SQ(byte i1) {
        ys_2 value = new ys_2(cJ0.Com4);
        value.zM = () -> w7(i1);
        tw0_0.LD0.i20.Uk0(value);
    }
    public abstract void Hf0(short i1);
    public final void KA0(byte i1, short i2, boolean z3, byte i4) {
        CX request = new CX(i2, z3, i4);
        request.Rr0 = () -> pF(i1);
        tw0_0.LD0.Uk0(request);
    }
    public final boolean xn(short i1, short i2, boolean z3) {
        if (i2 < 0) i2 = (short) (i2 & 4095);
        else {
            Mj m = tw0_0.rl.r1(_volatile.BV);
            VU value = m == null ? null : m.Ry0(i2);
            i2 = value == null ? 0 : value.I8.Yb0;
        }
        boolean match = i2 != 0 && Ly.f5(i1) == i2;
        if (!match && z3) Ly.Dc0(i1, i2);
        return match;
    }
    public final void gr() {
        if (rx0 == null) return;
        String url = new StringBuilder("https://pokemmo.com/donate/?account_id=")
            .append(tw0_0.rl.yE)
            .append("&key=").append(tx_1.SH0(rx0))
            .append("&local=").append(dw_2.con)
            .append("&os=").append(qt_1.zm0.KI.toLowerCase(java.util.Locale.ROOT))
            .toString();
        if (!lg_0.lv0.Lf(url)) {
            BU bu = BU.T50;
            if (bu.x30 != null) { bu.x30.xe0(); bu.x30 = null; }
            in0_0 window = new in0_0(url);
            bu.x30 = window;
            bu.SL(window);
            window.lt0();
            window.E40(tw0_0.LD0.ew0() / 2 - window.Mx / 2,
                       tw0_0.LD0.Hv0() / 2 - window.OB / 2);
        }
    }
    public final void fP() {
        for (Object value : cJ0.pn0.values()) {
            if (value instanceof E90) ((E90) value).De0();
        }
        tw0_0.Tl0.nE0();
    }
    public final void RK0() {
        e30_0 value = k0;
        if (value == null) return;
        bm0_1 map = mz_1.D00;
        map.gE0((byte) 1, value.Nw0);
        _else state = cJ0.N60();
        if (state == null) return;
        byte kind = state.dw;
        if (kind == 1) {
            if (value.Gi0 == 0) {
                map.gE0((byte) 6, sm0_0.c0(260001));
                map.gE0((byte) 2, sm0_0.c0(260003));
            } else {
                map.gE0((byte) 6, sm0_0.c0(260000));
                map.gE0((byte) 2, sm0_0.c0(260002));
            }
        } else {
            map.gE0((byte) 6, sm0_0.CY(kind));
        }
    }
    public final long z00() { return NQ; }
    public final int uh0(int i1) {
        if (!H4) {
            String raw = lpt2__0.Da;
            if (!raw.isEmpty()) {
                String[] values = raw.split(",");
                if (values.length >= 2) {
                    int base = 0;
                    for (int i = 0; i < values.length; i++) {
                        if (values[i].isEmpty()) continue;
                        try {
                            int value = Integer.parseInt(values[i]);
                            if ((i & 1) == 0) base = value;
                            else N40.Y6(base, value);
                        } catch (NumberFormatException ex) {
                            lpt2__0.Ig(null);
                            N40.Rv = 0;
                            N40.YB0 = N40.uT();
                            java.util.Arrays.fill(N40.kQ, N40.Aa);
                            java.util.Arrays.fill(N40.IL0, N40.dJ);
                            java.util.Arrays.fill(N40.Ut, (byte) 0);
                            break;
                        }
                    }
                }
            }
            H4 = true;
        }
        int index = N40.IJ0(i1);
        return index < 0 ? N40.dJ : N40.IL0[index];
    }
    public final boolean U1(int i1) {
        if (!zm) {
            String[] values = lpt2__0.w00.split(",");
            if (values.length >= 2) {
                int base = 0;
                for (int i = 0; i < values.length; i++) {
                    if (values[i].isEmpty()) continue;
                    try {
                        int value = Integer.parseInt(values[i]);
                        if ((i & 1) == 0) base = value;
                        else Mr.Y6(base, value);
                    } catch (NumberFormatException ex) {
                        lpt2__0.pW(null);
                        Mr.Rv = 0;
                        Mr.YB0 = Mr.uT();
                        java.util.Arrays.fill(Mr.kQ, Mr.Aa);
                        java.util.Arrays.fill(Mr.IL0, Mr.dJ);
                        java.util.Arrays.fill(Mr.Ut, (byte) 0);
                        break;
                    }
                }
            }
            zm = true;
        }
        int index = Mr.IJ0(i1);
        return (index < 0 ? Mr.dJ : Mr.IL0[index]) == 1;
    }
    public final byte Xx0() { return lt; }
    public final void mU(byte[] v1, lp_1[] v2) {
        bq0 = v1;
        w0 = v2;
        TX tx = Wz;
        if (tx == null || tx.volatile$) {
            if (!dw_2.mi && !tw0_0.kz0()) lpt5__5.hL.Com4.execute(this::NJ);
        }
    }
    public final boolean Fb0() { return ML0.length > 0; }
    public final short[] jE() { return ML0; }
    public final CH0[] Ra0() { return package$; }
    public final short[] yI() { return Pa; }
    public final boolean IW(short i1) { int i = S.BA(i1, Pa); return i >= 0 && Hf0[i]; }
    public final VU FJ0(CH0 v1, _volatile... v2) {
        for (_volatile type : v2) {
            Mj m = r1(type);
            if (m != null) {
                VU value = m.sF(v1);
                if (value != null) return value;
            }
        }
        return null;
    }
    public final void f2(byte i1, byte i2, CH0 v3, short i4) {
        fk0.uQ(new E30(v3, i1, null, i4, i2));
    }
    public final void X60(short i1, short i2, short i3, byte i4) {
        boolean special = i1 == 3 && i2 != 19 && i2 != 70 && i2 != 91 && i2 != 100;
        if (special && xn(i2, i3, true)) {
            ze0((byte) i2, i4);
            if (i2 == 15) {
                EA0 ea = tw0_0.e60.jB0.il0;
                nk_0[] values = new nk_0[] { nk_0.Xs0 };
                synchronized (ea.BH0) {
                    if (values[0] != null) ea.BH0.add(new wz0_0(values[0], 0));
                }
            }
            return;
        }
        CX request = new CX(i1, i2, i3);
        request.Rr0 = () -> LPt2(i4, i2);
        tw0_0.LD0.Uk0(request);
    }
    public final void uh0(byte i1, boolean z2, boolean z3) {
        g2_0 motion = xm;
        if (motion != null) {
            if (motion.g00()) return;
            xm = null;
        }

        E90 current = cJ0.jB0;
        if (current.ba0.Y30 != i1 && i1 != -1) {
            EA0 pendingArea = current.il0;
            if (pendingArea.D()
                    && hk0_1.KG - pendingArea.gd > pendingArea.Kg + 100L
                    && pendingArea.BH0.isEmpty()
                    && pendingArea.qc0(i1)) {
                fk0.uQ(new Ut0(i1));
                if (!z3) return;
            }
        }

        zv_2 requestState = new zv_2(current.ba0);
        byte oldDirection = current.ba0.Y30;
        if (i1 != -1) requestState.Y30 = i1;

        EA0 area = current.il0;
        if (!area.D()) {
            if (oldDirection != current.ba0.Y30) fk0.uQ(new Ut0(current.ba0.Y30));
            return;
        }

        mg_0 movement = area.QM.uR();
        if (movement.R5 != -1) movement.R5 = -1;
        area.BQ = false;
        area.EL = false;

        bi0_1 actor = area.QM;
        zv_2 actorState = actor.ba0;
        short x = actorState.Lq0;
        short y = actorState.B5;
        byte layer = actorState.JT;
        float speed = actorState.Com6();

        _else map = (_else) tw0_0.e60.E6.get(J4.iA0(actorState.uS, actorState.o0, actorState.ID0));
        if (map == null) {
            if (oldDirection != current.ba0.Y30) fk0.uQ(new Ut0(current.ba0.Y30));
            return;
        }

        LT from = actorState.LPt1();
        if (i1 != -1 && from != null) from.u40().getClass();
        if (i1 != -1 && actorState.Y30 != i1) actorState.Y30 = i1;

        short targetX;
        short targetY;
        switch (i1) {
            case 0:
                targetX = x;
                targetY = (short) (y + 1);
                break;
            case 1:
                targetX = x;
                targetY = (short) (y - 1);
                break;
            case 2:
                targetX = (short) (x - 1);
                targetY = y;
                break;
            case 3:
                targetX = (short) (x + 1);
                targetY = y;
                break;
            default:
                targetX = x;
                targetY = y;
                break;
        }

        LT target;
        if (from != null && from.gr0()) {
            target = from.JG0(i1);
        } else {
            target = map.LB0(targetX, targetY, from == null ? 0.0f : from.S80());
        }

        if (from != null && from.u40() instanceof fh_0) {
            target = from.u40().a0(map, from, target, i1);
        }
        if (z2 && from != null && !from.u40().LI()) z2 = false;

        if (actor.iz0((byte) 4) && z3 && !area.BQ && i1 == -1) {
            area.EL = true;
            area.hw0(0L);
            actor.Xe = z2;
            area.ud();
            return;
        }

        if (z3
                && !actor.iz0((byte) 17)
                && actor.iz0((byte) 4)
                && !area.BQ
                && target != null
                && !target.u40().iI(i1)) {
            area.EL = true;
        } else {
            z3 = false;
        }

        int exitMode = 1;
        movementFlow: {
            while (target != null) {
                boolean wasBlocked = area.BQ;
                if (area.qm(from, target, i1, z2, z3, wasBlocked)) break;

                if (target.u40().iI(i1)) {
                    area.BQ = true;
                    z3 = false;
                    switch (i1) {
                        case 0:
                            targetY++;
                            break;
                        case 1:
                            targetY--;
                            break;
                        case 2:
                            targetX--;
                            break;
                        case 3:
                            targetX++;
                            break;
                        default:
                            break;
                    }
                    target = target.gr0() ? target.JG0(i1) : map.Fn(targetX, targetY, layer);
                    continue;
                }

                if (!tw0_0.e60.Vm0(layer, target)) {
                    byte collisionMode = se0_1.Ak0(z2, z3);
                    if (from != null && from.Og(from, actor, i1, collisionMode)) {
                        exitMode = 0;
                        break movementFlow;
                    }
                    if (target.lpT2(target, actor, i1, collisionMode)) {
                        exitMode = 0;
                        break movementFlow;
                    }
                }

                actor.Xe = z2;
                area.hw0(0L);
                area.ud();
                actorState.Y30 = i1;

                if (tw0_0.e60.Vm0(actorState.JT, target)) {
                    MO blocked = null;
                    for (Object value : tw0_0.e60.pn0.values()) {
                        bi0_1 item = (bi0_1) value;
                        if (item.CI0() && item.a1(actorState.JT, target)) {
                            blocked = (MO) item;
                            break;
                        }
                    }
                    if (blocked != null && QI.Py.kN(blocked.ok, blocked.Z4, false).Dc0 != 0) {
                        exitMode = 1;
                        break movementFlow;
                    }
                    if (target.u40().xx0(actor, i1) && hk0_1.KG - area.rl0 > 500L) {
                        tw0_0.RE0.d00(true, (byte) 2, (short) 1370, 0.0f);
                        area.rl0 = hk0_1.KG;
                    }
                    exitMode = 0;
                    break movementFlow;
                }

                if (target.u40().xx0(actor, i1) && hk0_1.KG - area.rl0 > 500L) {
                    tw0_0.RE0.d00(true, (byte) 2, (short) 1370, 0.0f);
                    area.rl0 = hk0_1.KG;
                }
                exitMode = 1;
                break movementFlow;
            }

            if (z2 && target != null && !target.u40().LI()) z2 = false;
            byte collisionMode = se0_1.Ak0(z2, z3);
            if (from != null && from.Og(from, actor, i1, collisionMode)) {
                exitMode = 0;
                break movementFlow;
            }
            if (target != null && target.lpT2(target, actor, i1, collisionMode)) {
                exitMode = 0;
                break movementFlow;
            }

            actor.Xe = z2;
            area.hw0(0L);
            if (target == null) {
                if (hk0_1.KG - area.rl0 > 500L) {
                    tw0_0.RE0.d00(true, (byte) 2, (short) 1370, 0.0f);
                    area.rl0 = hk0_1.KG;
                }
                area.ud();
                exitMode = 0;
                break movementFlow;
            }

            int distanceX = Math.abs(x - target.Tz());
            int distanceY = Math.abs(y - target.HR());
            if (from != null && from.gr0()) {
                area.g9.np(from.Ki());
                float oldY = area.g9.y;
                area.g9.y = area.g9.z;
                area.g9.z = oldY;
            } else if (from != null && from.Wb0()) {
                area.g9.x = x + 0.5f;
                area.g9.y = y + 0.5f;
                area.g9.z = speed;
            } else if (distanceX <= 2 && distanceY <= 2) {
                area.g9.x = x;
                area.g9.y = y;
                area.g9.z = speed;
            } else {
                area.g9.x = target.Tz() - targetX + x;
                area.g9.y = target.HR() - targetY + y;
                area.g9.z = speed;
            }

            area.np = true;
            area.lPT5(actor, from);

            _else targetMap = target.F2();
            if (targetMap.nn() && N50.Fc(targetMap.dw) && actor.Ou()) {
                XF0 tiledMap = (XF0) targetMap;
                int width = tiledMap.yd;
                int height = tiledMap.ie;
                Z50 cell;
                if (width >= 1 && height >= 1) {
                    cell = tiledMap.W4(target.Tz() / width, target.HR() / height);
                } else {
                    cell = tiledMap.W4(0, 0);
                }
                if (cell != null) tiledMap.jc0(cell);
            }

            actorState.o0 = targetMap.Bm0;
            actorState.ID0 = targetMap.case$;
            byte facing = target.Es();
            if (!target.Wb0() && facing < 0) facing = actorState.JT;
            actorState.PX(target.gr0(), target.Tz(), target.HR(), facing, i1);

            area.b60 = hk0_1.KG;
            area.ud();

            if (from != null) {
                int cost = from.u40().QK(from, target);
                if (cost > 0) area.Kg = cost;
            }

            if (actor.Ou()) {
                tw0_0.rl.lA();
                e30_0 state = tw0_0.rl.k0;
                state.kC = actorState.uS;
                state.Oq0 = actorState.o0;
                state.Zl0 = actorState.ID0;
                state.sL0 = actorState.Lq0;
                state.t60 = actorState.B5;
            }

            if (from != target) {
                target.u40().xB(target, from, actor, layer);
                if (from != null) {
                    from.u40().K40(actor, from);
                    area.zp0(from);
                }
            }

            actorState.Fc0 = actorState.Y30;
            exitMode = 1;
        }

        if (exitMode == 0) {
            if (oldDirection != current.ba0.Y30) fk0.uQ(new Ut0(current.ba0.Y30));
            return;
        }
        if (i1 != -1) fk0.uQ(new bw0_0(requestState, z2, z3));
    }
    public final ArrayList PO() {
        ArrayList result = new ArrayList();
        java.util.Iterator iterator = cb0.iterator();
        if (iterator.hasNext()) {
            iterator.next().getClass();
            throw new ClassCastException();
        }
        return result;
    }
    public final int n2() { return fk0 == null ? 6 : fk0.Co0; }
}
