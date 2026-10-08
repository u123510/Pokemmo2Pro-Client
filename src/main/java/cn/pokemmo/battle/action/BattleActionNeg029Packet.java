package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg029Packet extends Nt implements eb0_0 {
    public final byte P40;
    public final byte Mq;
    public final byte lm;
    public final boolean Wq;

    public BattleActionNeg029Packet(byte b, byte b2, byte b3, boolean z) {
        this.P40 = b;
        this.Mq = b2;
        this.lm = b3;
        this.Wq = z;
    }

    @Override
    public final byte BL0() {
        return -29;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1) {
        byte b = this.Mq;
        if (b == 0) {
            String str = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, ml0.yd0.Vs0(this.P40, 140), sm0_0.zb0);
            if (this.Wq && pf2 != null) {
                ml0.I1(str, "", fv(ml0, pf2));
            } else {
                ml0.wJ(str, "", fv(ml0, pf2));
            }
        } else if (b == 1) {
            String str = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, ml0.yd0.Vs0(this.P40, 142), sm0_0.zb0);
            ml0.wJ(str, "", () -> L5(ml0));
        }
    }

    @Override
    public final boolean Hm() {
        if (this.Wq) {
            return true;
        }
        return super.Hm();
    }

    public final Runnable fv(ML0 ml0, PF pf) {
        return () -> q8(ml0, pf);
    }

    public final void q8(ML0 ml0, PF pf) {
        Oz0 oz0 = tw0_0.LD0.he0;
        if (oz0 != null) {
            if (this.Wq) {
                ml0.lZ.add(new kw_0((byte) 0, qk_2.cR.import$(pf, (short) 366)));
            }
            ml0.yd0.mn(this.P40).zI.bB0 = this.lm;
            oz0.Z8(this.P40, (short) 366);
            ml0.yd0.p0(ml0, this.P40);
        }
    }

    public final void L5(ML0 ml0) {
        Oz0 oz0 = tw0_0.LD0.he0;
        if (oz0 != null) {
            ml0.yd0.mn(this.P40).zI.bB0 = (byte) 0;
            oz0.tt(this.P40, (short) 366);
            ml0.yd0.p0(ml0, this.P40);
        }
    }
}
