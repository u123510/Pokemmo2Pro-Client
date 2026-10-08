package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction026Packet extends ka_0 {
    public final fq_2 st0;

    public BattleAction026Packet(fq_2 fq_2Var, short s) {
        super(s);
        this.st0 = fq_2Var;
    }

    @Override
    public final byte BL0() {
        return 26;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1Var) {
        pf2.F(this.rA);
        switch (bi_0.fD0[this.st0.ZZ]) {
            case 1:
            case 2:
                String text1 = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(851, pf2), new String[] { pf2.A60() });
                ml0.wJ(text1, "", () -> Ot0(ml0, pf2));
                break;
            case 3:
            case 4:
                String text2 = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ml0.yd0.QX(854, pf2), new String[] { pf2.A60() });
                ml0.wJ(text2, "", () -> TL(ml0, pf2));
                break;
            case 5:
                String text3 = sm0_0.wa0(200594, pf2.Yp());
                ml0.wJ(text3, "", () -> M9(ml0, pf2));
                break;
            case 6:
                String text4 = sm0_0.wa0(200615, pf2.Yp());
                ml0.wJ(text4, "", () -> Ra(ml0, pf2));
                break;
            default:
                break;
        }
    }

    public final void Ra(ML0 ml0, PF pf) {
        ml0.lZ.add(new ii_1(pf, ml0.Hi(pf), null, false, false));
    }

    public final void M9(ML0 ml0, PF pf) {
        ml0.lZ.add(new ii_1(pf, ml0.Hi(pf), null, false, false));
    }

    public final void TL(ML0 ml0, PF pf) {
        ml0.lZ.add(new ii_1(pf, ml0.Hi(pf), null, false, false));
    }

    public final void Ot0(ML0 ml0, PF pf) {
        ml0.lZ.add(new ii_1(pf, ml0.Hi(pf), null, false, false));
    }
}
