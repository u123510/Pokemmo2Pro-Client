package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction001Packet extends Nt implements eb0_0 {
    public final byte nw;
    public final gc_2 UX;
    public final byte DD0;
    public final byte vu;
    public final boolean LPT9;

    public StatAction001Packet(byte b, gc_2 gc_2, byte b2, byte b3, boolean z) {
        this.nw = b;
        this.UX = gc_2;
        this.DD0 = b2;
        this.vu = b3;
        this.LPT9 = z;
    }

    public static void qv(ML0 ml0, PF pf, gc_2 gc_2, byte b, byte b2, boolean z) {
        int i;
        if (b2 == 0) {
            int i2 = (gc_2.CoM2 - 1) * 3;
            if (b >= 0) {
                i = 153 + i2;
            } else {
                i = 174 + i2;
            }
        } else {
            i = 27 + (gc_2.CoM2 - 1) * 3 + (Math.min(3, Math.abs(b2)) - 1) * 21;
            if (b2 < 0) {
                i += 63;
            }
        }

        if (b2 != 0 && z) {
            ml0.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(i, pf), new String[] { pf.A60() }), "", null);
        } else {
            ml0.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(i, pf), new String[] { pf.A60() }), "", null);
        }
    }

    @Override
    public final byte BL0() {
        return 1;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1) {
        if (pf2 == null || pf2.uk() == 0) {
            return;
        }

        byte b = this.nw;
        if (b != 0) {
            if (b == 1 || b == 2) {
                String str = "";
                if (b == 2) {
                    str = sm0_0.Bx(200579, new String[] { pf2.Yp(), this.UX.toString() });
                } else if (b == 1) {
                    str = sm0_0.Bx(200488, new String[] { pf2.Yp(), this.UX.toString() });
                }

                if (this.vu != 0 && this.LPT9) {
                    ml0.I1(str, "", null);
                    ml0.lZ.add(new kw_0(new ZA(pf2).us()));
                } else {
                    ml0.wJ(str, "", null);
                }
            }
        } else {
            qv(ml0, pf2, this.UX, this.DD0, this.vu, this.LPT9);
        }

        boolean z4 = (this.nw == 0 && this.LPT9);
        ml0.lZ.add(new com2__4(ml0, pf, pf2, this.UX, this.vu, z4));
    }
}
