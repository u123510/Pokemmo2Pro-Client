package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction023Packet extends Nt implements eb0_0 {
    public final short Fn0;
    public final byte ux;
    public final boolean EJ0;

    public BattleAction023Packet(short s, byte b, boolean z) {
        this.ux = b;
        this.Fn0 = s;
        this.EJ0 = z;
    }

    public final byte BL0() {
        return 23;
    }

    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1Var) {
        short s2 = this.Fn0;
        if (s2 == -1) {
            ml0.wJ(sm0_0.wa0(5006, pf.A60()), "", null);
            return;
        }
        mc0_1 mc0_1Var = gu0.l2.lPT6(s2);
        PF pf3 = null;
        PF pf4 = null;
        byte b = this.ux;
        if (b == 0) {
            pf3 = pf;
            pf4 = pf2;
        } else if (b == 1) {
            pf3 = pf2;
            pf4 = pf;
        }
        if (pf3 == null) {
            return;
        }
        int eH0 = ml0.yd0.eH0(1057, pf3, pf4);
        String fg0 = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, eH0, new String[] { pf3.A60(), pf4.A60(), sm0_0.c0(mc0_1Var.Nl) });
        Runnable gM = gM(pf3, ml0, pf4);
        if (this.EJ0) {
            ml0.I1(fg0, "", gM);
            ml0.lZ.add(new kw_0((byte) 0, new LF(pf3, pf4)));
        } else {
            ml0.wJ(fg0, "", gM);
        }
    }

    public final Runnable gM(PF pf, ML0 ml0, PF pf2) {
        return () -> pe(pf, ml0, pf2);
    }

    public final void pe(PF pf, ML0 ml0, PF pf2) {
        if (tw0_0.LD0.he0 != null) {
            pf.bv0((short) 0);
            ml0.Hi(pf).Ny();
            pf2.bv0(this.Fn0);
            ml0.Hi(pf2).Ny();
        }
    }
}
