package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode182Packet extends GH {

    public byte De;
    public byte ER;
    public short[] yP;

    public ServerOpcode182Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    @Override
    public final void Oj0() {
        this.De = this.Rj.get();
        this.ER = this.Rj.get();
        int len = this.Rj.get() & 0xFF;
        this.yP = new short[len];
        for (int i1 = 0; i1 < this.yP.length; i1++) {
            this.yP[i1] = this.Rj.getShort();
        }
    }

    @Override
    public final void os0() {
        jn_0 v1 = tw0_0.LD0;
        if (v1.KJ0 != null) {
            lpt5__5.hL.ZD(new gn_1((k10_0) this), 100L);
            return;
        }

        byte de = this.De;
        if (de == 32) {
            sr0().SQ(this.ER);
        } else if (de == 33) {
            Ge0 v1_ge = sr0();
            byte i2 = (byte) jI(0);
            ry_0 v2 = (i2 >= 0 && i2 < ry_0.da.length) ? ry_0.da[i2] : ry_0.hq;
            ((BR) v1_ge).lZ.da0(v2, CH0.j1, this.ER);
        } else {
            switch (de) {
                case 0: {
                    af0_0 v1_af = af0_0.SS;
                    short i2 = jI(0);
                    short i3 = jI(1);
                    short i4 = jI(2);
                    short i5 = jI(3);
                    v1_af.P10 = 0L;
                    v1_af.Lu0 = 0;
                    v1_af.fq0 = i3;
                    v1_af.mr = i2;
                    v1_af.De = hk0_1.KG + (long) (i4 * 60);
                    v1_af.jL0 = i5 * 15;
                    int i1_delay = jI(2) * 60;
                    if (this.ER != -1) {
                        lpt5__5.hL.ZD(new vA((k10_0) this), (long) i1_delay);
                    }
                    break;
                }
                case 1: {
                    if (jI(0) != 54) {
                        int i1_delay = 0;
                        if (this.ER != -1) {
                            lpt5__5.hL.ZD(new vA((k10_0) this), (long) i1_delay);
                        }
                    } else {
                        short i1 = jI(1);
                        short i2 = jI(2);
                        int i3_delay = 600;
                        if (this.ER != -1) {
                            lpt5__5.hL.ZD(new vA((k10_0) this), (long) i3_delay);
                        }
                        cf0_1 v3_cf = new cf0_1();
                        _else n60 = sr0().cJ0.N60();
                        if (n60 != null) {
                            LT fn = n60.Fn(i1, i2, 0);
                            if (fn != null) {
                                fn.ZD0(v3_cf);
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    short i1 = jI(0);
                    short i2 = jI(1);
                    E90 v3_e90 = tw0_0.e60.jB0;
                    int i4_delay = 0;
                    if (!v3_e90.LH0() && !v3_e90.oI0() && !sr0().xn(i1, i2, false)) {
                        i4_delay = 900;
                        v3_e90.il0.LE(new nk_0[]{nk_0.mZ});
                    }
                    lpt5__5.hL.ZD(() -> Jx(i1, i2), (long) i4_delay);
                    break;
                }
                case 3: {
                    byte i1 = this.ER;
                    short i0 = jI(0);
                    BR v2_br = (BR) sr0();
                    BU v3_bu = v2_br.lZ.zK0;
                    if (v3_bu == null) {
                        v2_br.ze0(i1, (byte) 0);
                    } else {
                        v3_bu.SL(new s_0(i1, i0));
                    }
                    break;
                }
                case 4: {
                    byte i1 = (byte) jI(0);
                    oc_2 v1_oc = oc_2.CL0.dg(i1) ? (oc_2) oc_2.CL0.BM(i1) : oc_2.w80;
                    short i0 = jI(1);
                    switch (ik_1.Mk[v1_oc.He0]) {
                        case 1:
                            nf_0.zo0().w30(i0, true);
                            break;
                        case 2: {
                            nf_0 nf = nf_0.zo0();
                            int maxKl = Math.max(nf.COn.kl0, nf.TK.kl0);
                            nf.TK.m(maxKl, 0, i0);
                            nf.COn.kl0 = 0;
                            nf.COn.xP = 0;
                            break;
                        }
                        case 3:
                            nf_0.zo0().COn.m(0, 255, i0);
                            break;
                        case 4:
                            nf_0.zo0().TK.m(0, 255, i0);
                            break;
                        case 5: {
                            vt_1 qq = nf_0.zo0().QQ;
                            qq.qk0 = i0 / qq.ss;
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    BR br = (BR) sr0();
                    tl0_0 v2_tl = new tl0_0((k10_0) this);
                    BU bu = br.lZ.zK0;
                    if (bu != null) {
                        bu.Iz(true, v2_tl);
                    }
                    break;
                }
                case 6: {
                    vo_2 sc = tw0_0.LD0.Sc;
                    if (sc == null) {
                        lg_0.k.lPT5(new qc_2((k10_0) this));
                    } else {
                        sc.yd(this.yP);
                    }
                    break;
                }
                case 7: {
                    E90 this_e90 = tw0_0.e60.jB0;
                    if (this_e90 != null) {
                        vo_2 sc = tw0_0.LD0.Sc;
                        if (sc instanceof cr0_0) {
                            zv_2 ba0 = this_e90.ba0;
                            ((cr0_0) sc).o7((byte) 1, new C8((float) ba0.Lq0, 0.0f, (float) ba0.B5).Fg0(0.25f), 0, false, false, false);
                        }
                        this_e90.il0.LE(new nk_0[]{nk_0.Gw0});
                        LT v1_lt = this_e90.ba0.LPt1();
                        int i2_cnt = 0;
                        while (v1_lt.S80() > -1.0f && i2_cnt < 5) {
                            LT v3_best = null;
                            for (int i4 = -1; i4 < 2; i4++) {
                                for (int i5 = -1; i5 < 2; i5++) {
                                    LT fn = v1_lt.F2().Fn(v1_lt.Tz() + i4, v1_lt.HR() + i5, 0);
                                    if (fn != null) {
                                        if (v3_best == null || fn.S80() < v3_best.S80()) {
                                            v3_best = fn;
                                        }
                                    }
                                }
                            }
                            if (v3_best == null) {
                                break;
                            }
                            i2_cnt++;
                            v1_lt = v3_best;
                        }
                        jo0_0 v4_jo = new jo0_0(this_e90, i2_cnt, v1_lt);
                        synchronized (this_e90.il0.BH0) {
                            this_e90.il0.BH0.add(v4_jo);
                        }
                    }
                    break;
                }
                case 8: {
                    byte i1 = this.ER;
                    short i2 = jI(0);
                    jI(1);
                    BR br = (BR) sr0();
                    BU bu = br.lZ.zK0;
                    if (bu == null) {
                        br.ze0(i1, (byte) 0);
                    } else {
                        bu.SL(new nm0_0(i1, (int) i2));
                    }
                    break;
                }
                case 9:
                    sr0().LF0(this.ER, jI(0), jI(1));
                    break;
                case 10:
                    sr0().X60(jI(0), (short) 0, (short) 0, this.ER);
                    break;
                case 12: {
                    short i1 = jI(0);
                    boolean i2 = jI(1) == 1;
                    byte i3 = (byte) jI(2);
                    E90 v4_e90 = tw0_0.e60.jB0;
                    int i5_delay = 0;
                    if (!v4_e90.LH0() && !v4_e90.oI0()) {
                        i5_delay = 900;
                        v4_e90.il0.LE(new nk_0[]{nk_0.mZ});
                    }
                    lpt5__5.hL.ZD(() -> COM6(i1, i2, i3), (long) i5_delay);
                    break;
                }
                case 13:
                    sr0().Hf0(jI(0));
                    break;
                case 14: {
                    byte i1 = this.ER;
                    short i0 = jI(0);
                    BR v2_br = (BR) sr0();
                    BU v3_bu = v2_br.lZ.zK0;
                    if (v3_bu == null) {
                        v2_br.ze0(i1, (byte) 0);
                    } else {
                        v3_bu.SL(new sr_0(i1, i0));
                    }
                    break;
                }
                case 15: {
                    byte i1 = this.ER;
                    short i0 = jI(0);
                    BR v2_br = (BR) sr0();
                    BU v3_bu = v2_br.lZ.zK0;
                    if (v3_bu == null) {
                        v2_br.ze0(i1, (byte) 0);
                    } else {
                        v3_bu.SL(new JV(i1, i0));
                    }
                    break;
                }
            }
        }
    }

    public final short jI(int i1) {
        if (i1 >= 0 && i1 < this.yP.length) {
            return this.yP[i1];
        }
        return 0;
    }

    public final void COM6(short i1, boolean i2, byte i3) {
        lg_0.k.lPT5(() -> ou0(i1, i2, i3));
    }

    public final void ou0(short i1, boolean i2, byte i3) {
        sr0().KA0(this.ER, i1, i2, i3);
    }

    public final void Jx(short i1, short i2) {
        lg_0.k.lPT5(() -> Cz0(i1, i2));
    }

    public final void Cz0(short i1, short i2) {
        sr0().X60((short) 3, i1, i2, this.ER);
    }
}
