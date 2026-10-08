package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction024Packet extends ka_0 {
    public final byte kO;
    public final short NO;

    public BattleAction024Packet(byte b, short s, short s2) {
        super(s2);
        this.kO = b;
        this.NO = s;
    }

    @Override
    public final byte BL0() {
        return 24;
    }

    @Override
    public final void IE0(PF v1, PF v2, boolean z3, boolean z4, short s5, boolean z6, ML0 v7, qn_1 v8) {
        vk0_1 vk0_12 = (vk0_1) ec0_2.Sx().f4.f5(this.NO);
        byte b = this.kO;
        if (b == 0) {
            boolean z = false;
            int n;
            switch (this.NO) {
                case 35:
                    n = 810;
                    break;
                case 83:
                    n = 827;
                    z = true;
                    break;
                case 128:
                    n = 817;
                    break;
                case 250:
                    n = 824;
                    z = true;
                    break;
                case 328:
                    n = 833;
                    z = true;
                    break;
                case 463:
                    n = 830;
                    z = true;
                    break;
                default:
                    n = 803;
                    break;
            }
            int n2;
            if (z) {
                n2 = v7.yd0.QX(n, v2);
            } else {
                n2 = v7.yd0.eH0(n, v2, v1);
            }
            String string = this.NO == 1003 ? sm0_0.c0(vk0_12.bt) : v1.A60();
            String[] arrstring = new String[]{v2.A60(), string};
            v7.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, n2, arrstring), "", null);
        } else if (b == 1) {
            int n = v7.yd0.QX(372, v2);
            String string = vk0_12 == null ? "" : sm0_0.c0(vk0_12.bt);
            String[] arrstring = new String[]{v2.A60(), string};
            v7.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, n, arrstring), "", null);
            MU mu;
            switch (this.NO) {
                case 83:
                    mu = new bs_0(v1).vv(v2);
                    break;
                case 128:
                    mu = new rd_2(v1).vv(v2);
                    break;
                case 250:
                    mu = new iz_0(v1).vv(v2);
                    break;
                case 328:
                    mu = new pa_1(v1).vv(v2);
                    break;
                case 463:
                case 3463:
                    mu = new t60_0(v1).vv(v2);
                    break;
                default:
                    mu = new ee0_0(v1).vv(v2);
                    break;
            }
            v7.lZ.add(new kw_0((byte) 0, mu));
            v2.F(this.rA);
            v7.lZ.add(new ii_1(v2, v7.Hi(v2), null, false, false));
        } else if (b == 2) {
            int n = v7.yd0.QX(375, v2);
            String string = vk0_12 == null ? "" : sm0_0.c0(vk0_12.bt);
            String[] arrstring = new String[]{v2.A60(), string};
            v7.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, n, arrstring), "", null);
        }
    }
}
