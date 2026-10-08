package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Iterator;

public class BattleActionPromptModifier extends TC0 {
    public final byte sK;
    public final byte M6;
    public final byte ON;
    public final short X7;
    public final short fU;
    public final String lpT1;
    public final qn_1[] Oe0;

    public BattleActionPromptModifier(byte b, byte b2, short s, byte b3, short s2, String str, qn_1[] qn_1Arr) {
        this.sK = b;
        this.M6 = b2;
        this.X7 = s;
        this.ON = b3;
        this.fU = s2;
        this.lpT1 = str;
        this.Oe0 = qn_1Arr;
    }

    @Override
    public final void QC(ML0 v1) {
        a10_0 a10_02 = v1.yd0;
        O8 o8 = a10_02.mn(this.sK).L40(this.M6);
        mc0_1 mc0_12 = gu0.l2.lPT6(this.X7);
        switch (this.X7) {
            case 1488:
            case 1489:
            case 1490:
                break;
            default:
                v1.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 33, new String[]{o8.M2(), sm0_0.c0(mc0_12.Nl)}), "", null);
                break;
        }
        short s = this.X7;
        if (s == 5064 || s == 5063) {
            return;
        }
        o8.sR = this.ON;
        qn_1[] arrqn_1 = this.Oe0;
        if (arrqn_1.length == 0) {
            v1.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, 68, sm0_0.zb0), "", null);
            return;
        }
        for (int i = 0; i < arrqn_1.length; i++) {
            qn_1 qn_12 = arrqn_1[i];
            PF pf = v1.yd0.nd0(qn_12.EO);
            String string;
            if (pf == null) {
                VU vu = tw0_0.rl.r1(_volatile.BV).sF(qn_12.EO);
                if (vu != null) {
                    string = vu.na0();
                } else if (!this.lpT1.isEmpty()) {
                    string = this.lpT1;
                } else {
                    string = sm0_0.c0(this.fU + 150000);
                }
            } else {
                string = pf.A60();
            }
            if (pf != null) {
                switch (this.X7) {
                    case 1488:
                    case 1489:
                    case 1490:
                        break;
                    default:
                        v1.lZ.add(new kw_0((byte) 0, new KF0(pf).vv(pf)));
                        break;
                }
            }
            boolean bl = false;
            for (Iterator iterator = qn_12.XW.iterator(); iterator.hasNext(); ) {
                if (((Nt) iterator.next()).BL0() == 84) {
                    bl = true;
                    break;
                }
            }
            for (Iterator iterator2 = qn_12.XW.iterator(); iterator2.hasNext(); ) {
                Nt nt = (Nt) iterator2.next();
                if (pf == null && nt.Hm()) {
                    if (nt.BL0() == 0) {
                        if (bl) {
                            v1.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 14, a10_02.QX(3, pf), new String[]{string}), "", null);
                        } else {
                            v1.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 14, 387, new String[]{string}), "", null);
                        }
                    }
                } else {
                    v1.aa0(pf, pf, nt, false, false, (short) 0, true, qn_12);
                }
            }
        }
    }
}
