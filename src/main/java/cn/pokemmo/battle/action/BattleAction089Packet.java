package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction089Packet extends Nt implements eb0_0 {
    public final short wf;
    public final boolean ix;

    public BattleAction089Packet(short s, boolean z) {
        this.wf = s;
        this.ix = z;
    }

    @Override
    public final byte BL0() {
        return 89;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1) {
        if (this.wf < 1) {
            if (this.ix) {
                String str = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(565, pf2), new String[]{pf2.A60()});
                ml0.I1(str, "", HL(ml0, pf2));
                ml0.lZ.add(new kw_0((byte) 0, new zw_1(pf2)));
            } else {
                String str = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(565, pf2), new String[]{pf2.A60()});
                ml0.wJ(str, "", HL(ml0, pf2));
            }
        } else if (this.wf == 152) {
            String str = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(463, pf2), new String[]{pf2.A60()});
            ml0.wJ(str, "", HL(ml0, pf2));
        } else {
            String str = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(405, pf2), new String[]{pf2.A60(), sm0_0.c0(this.wf + 210000)});
            ml0.wJ(str, "", HL(ml0, pf2));
        }
    }

    public final Runnable HL(ML0 ml0, PF pf) {
        return () -> Qu0(pf, ml0);
    }

    public final void Qu0(PF pf, ML0 ml0) {
        pf.Sk0 = this.wf;
        ml0.Hi(pf).XO();
        if (this.wf > 0) {
            byte b = pf.cD0;
            String str = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 103, new String[]{
                pf.A60(),
                "       " + sm0_0.c0(this.wf + 210000)
            });
            ml0.z70[b].fl0(str);
        }
    }
}
