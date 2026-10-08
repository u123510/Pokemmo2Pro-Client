package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatActionNeg005Packet extends Nt implements eb0_0 {
    public final byte dd;

    public StatActionNeg005Packet(byte b) {
        this.dd = b;
    }

    public static void c1(PF pf) {
        boolean z = pf.cD0 == tw0_0.PK0.Ez0();
        pf.wb0(z);
        pf.ZI(pf.COm2(), true);
    }

    @Override
    public final byte BL0() {
        return -5;
    }

    @Override
    public final void IE0(PF v1, PF v2, boolean z3, boolean z4, short s5, boolean z6, ML0 v7, qn_1 v8) {
        switch (this.dd) {
            case 0:
                v7.I1(sm0_0.wa0(200421, v2.A60()), "", null);
                v7.lZ.add(new kw_0((byte) 2, new ho0_0(v1).vv(v2)));
                break;
            case 1:
                v7.wJ(sm0_0.Bx(200422, new String[]{v1.A60(), v2.A60()}), "", null);
                break;
            case 2:
                v7.wJ(sm0_0.Bx(200423, new String[]{v1.A60(), v2.A60()}), "", null);
                break;
            case 3:
                v7.wJ(sm0_0.Bx(200424, new String[]{v1.A60(), v2.A60()}), "", null);
                v2.LpT9.CQ.v50.set(1.0f, 1.0f, 1.0f, 1.0f);
                break;
            case 4:
                v7.I1(sm0_0.Bx(200423, new String[]{v1.A60(), v2.A60()}), "", null);
                v7.lZ.add(new kw_0((byte) 0, new ho0_0(v1).vv(v2)));
                break;
            case 5:
                v7.wJ(sm0_0.wa0(200425, v2.A60()), "", null);
                v7.lZ.add(new kw_0((byte) 0, new ds_1(v2).vv(v2)));
                break;
            case 6:
                v7.wJ(sm0_0.wa0(200426, v2.A60()), "", null);
                v7.lZ.add(new kw_0((byte) 2, new ds_1(v2).vv(v2)));
                break;
            case 7:
                v2.rm0 = 570;
                v2.Z10 = mp_1.vf0().W50((short) 570);
                v7.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, v7.yd0.QX(478, v2), new String[]{v2.A60()}), "", () -> c1(v2));
                break;
            case 8:
                v7.wJ(sm0_0.wa0(16805045, v2.A60()), "", null);
                break;
        }
    }
}
