package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public abstract class BaseBattleTeamInboundPacket extends GH {
    public BaseBattleTeamInboundPacket(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void cI0(O8 v1, Oy0 v2, gc_2[] v3) {
        byte b1 = this.Rj.get();
        byte b2 = this.Rj.get();
        byte b3 = this.Rj.get();
        tb0_1 tb0_1Var = v1.L40(b1).NC(v1)[b2];
        tb0_1Var.uG0 = b3;
        if (b3 == 1) {
            CH0 ch0 = pE();
            short s1 = this.Rj.getShort();
            byte b4 = this.Rj.get();
            String str = q60();
            byte b5 = this.Rj.get();
            byte b6 = this.Rj.get();
            short s2 = this.Rj.getShort();
            short s3 = this.Rj.getShort();
            short s4 = this.Rj.getShort();
            byte b7 = this.Rj.get();
            short s5 = this.Rj.getShort();
            QL ql = QL.Q8(this.Rj.get());
            byte b8 = this.Rj.get();
            short s6 = -1;
            short[] sArr = null;
            if (this.Rj.get() == 1) {
                s6 = this.Rj.getShort();
                sArr = new short[4];
                for (int i = 0; i < 4; i++) {
                    sArr[i] = this.Rj.getShort();
                }
            }
            tb0_1Var.eo0(ch0, s1, b4, str, b5, b6, s5, s2, s3, s4, ql, b7, b8);
            if (sArr != null) {
                for (int i = 0; i < sArr.length; i++) {
                    tb0_1Var.B3.Bn.Gu[i] = sArr[i];
                }
            }
            if (s6 != -1) {
                se_0 se0 = tb0_1Var.B3;
                cq_0 cq0 = se0.ZE0;
                byte foundIdx = -1;
                for (byte b = 0; b < cq0.h5.length; b = (byte) (b + 1)) {
                    if (cq0.h5[b] == s6) {
                        foundIdx = b;
                        break;
                    }
                }
                if (foundIdx >= 0) {
                    if (foundIdx < 0 || foundIdx > 2) {
                        foundIdx = 0;
                    }
                    se0.Bn.Xn0 = foundIdx;
                }
                se0.Oq0 = s6 > 0;
            }
            se_0 se0 = tb0_1Var.B3;
            for (gc_2 gc : v3) {
                int qx0 = AL0.Qg[v2.qx0];
                if (qx0 == 1) {
                    short[] sArr2 = new short[] { this.Rj.getShort() };
                    se0.U.put(gc, sArr2);
                } else if (qx0 == 2 || qx0 == 3) {
                    short[] sArr3 = new short[] { this.Rj.getShort(), this.Rj.getShort() };
                    se0.U.put(gc, sArr3);
                } else {
                    throw new UnsupportedOperationException("");
                }
            }
        }
    }

    public final PF ml(O8 v1, byte b, XA0 v3) {
        if (this.Rj.get() == 0) {
            return null;
        }
        b30_0 b30_0Var = b30_0.U5(v1.ZG0, b);
        byte b1 = this.Rj.get();
        byte b2 = this.Rj.get();
        O8 o8_sub = v1.L40(b1);
        tb0_1 tb0_1Var = o8_sub.NC(o8_sub)[b2];
        short s1 = this.Rj.getShort();
        byte b3 = this.Rj.get();
        String str = q60();
        short s2 = this.Rj.getShort();
        byte b4 = this.Rj.get();
        byte b5 = this.Rj.get();
        byte b6 = this.Rj.get();
        QL ql = QL.Q8(this.Rj.get());
        PF pf = new PF(o8_sub, tb0_1Var, b30_0Var);
        pf.s0(s1, b3, str, s2, b4, b5, b6, ql);
        int flags = this.Rj.getInt();
        boolean kc = (flags & 1) != 0;
        pf.kc = kc;
        if (pf.Sc0 != null && !kc) {
            pf.Sc0 = null;
            pf.ll0();
        }
        pf.cf0 = (flags & 4) != 0;
        pf.z40 = (flags & 2) != 0;
        int flag8 = flags & 8;
        pf.Yo = flag8 != 0;
        pf.G90 = (flags & 16) != 0;
        if ((flags & 1024) != 0) {
            pf.AF0 = this.Rj.get() == 1;
            pf.uV = this.Rj.get() == 1;
            pf.hS = this.Rj.get() == 1;
        }
        pf.fl0 = (flags & 2048) != 0;
        pf.f50 = (flags & 4096) != 0;
        if (flag8 != 0) {
            pf.qo0 = this.Rj.getShort();
        }
        if ((flags & 32) != 0) {
            pf.S20 = this.Rj.getShort();
        }
        if ((flags & 64) != 0) {
            pf.zr0 = this.Rj.getShort();
        }
        if ((flags & 128) != 0) {
            pf.EH0 = this.Rj.getShort();
            pf.FF = this.Rj.getShort();
        }
        if ((flags & 256) != 0) {
            short[] eu = new short[4];
            for (int i = 0; i < 4; i++) {
                eu[i] = this.Rj.getShort();
            }
            pf.Eu = eu;
        }
        if ((flags & 512) != 0) {
            short s_nd = this.Rj.getShort();
            byte b_nd = this.Rj.get();
            short[] sArr_nd = new short[4];
            byte[] bArr_nd = new byte[4];
            for (int i = 0; i < 4; i++) {
                sArr_nd[i] = this.Rj.getShort();
                bArr_nd[i] = this.Rj.get();
            }
            short sk0 = this.Rj.getShort();
            short s_nd2 = this.Rj.getShort();
            byte b_nd2 = this.Rj.get();
            pf.ND0(s_nd, b_nd, sArr_nd, bArr_nd, s_nd2, b_nd2);
            pf.Sk0 = sk0;
        }
        if ((flags & 8192) != 0) {
            pf.gp = i40_0.MG0(this.Rj.get());
            pf.Qj = i40_0.MG0(this.Rj.get());
        }
        if ((flags & 16384) != 0) {
            pf.Sk0 = this.Rj.getShort();
        }
        if ((flags & 65536) != 0) {
            pf.VI0 = this.Rj.getShort();
        }
        if ((flags & 131072) != 0) {
            pf.TF = true;
        }
        if ((flags & 262144) != 0) {
            byte xg_byte = this.Rj.get();
            pf.zi0.Bn.GK0 = (xg_1) t_0.BI0(xg_1.xk0.BM(xg_byte), xg_1.class, xg_byte);
        }
        if ((flags & 524288) != 0) {
            for (byte b_i = 0; b_i < 4; b_i = (byte) (b_i + 1)) {
                short s_x = this.Rj.getShort();
                byte b_x = this.Rj.get();
                pf.X70(b_i, b_x, s_x);
            }
        }
        if ((flags & 32768) != 0) {
            pf.Dv0 = false;
        }
        byte[] pr = gc_2.PR(this.Rj.getInt());
        for (int i = 0; i < pr.length; i++) {
            pf.yK0(gc_2.ME[i], pr[i]);
        }
        if (v3 == XA0.PRN) {
            pf.q40.nG = this.Rj.get();
            pf.q40.gS = this.Rj.get();
            pf.q40.jU = this.Rj.get();
            pf.q40.LX = this.Rj.getShort();
        } else if (v3 == XA0.Fz) {
            pf.Iw0(this.Rj.get());
            if (pf.zi0.Bn.GK0.WB0) {
                pf.zi0.Fe0(this.Rj.get());
            }
        }
        return pf;
    }
}
