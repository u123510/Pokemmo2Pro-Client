package cn.pokemmo.util.reflection;

import f.*;

public abstract class DynamicFieldAccessor {
    public static a10_0 Bm() {
        O8[] sides = new O8[2];
        sides[0] = new ux_0((byte) 0, (byte) 6);
        sides[1] = new ux_0((byte) 1, (byte) 6);

        PF[][] entities = new PF[2][];
        entities[0] = new PF[]{new PF(sides[0], sides[0].zz()[0], b30_0.U5((byte) 0, (byte) 0))};
        entities[1] = new PF[]{new PF(sides[1], sides[1].zz()[0], b30_0.U5((byte) 1, (byte) 0))};

        rh0_1 status = rh0_1.Ba;
        XA0 environment = XA0.Ct0;
        N2[] firstValues = N2.N60;
        lq0[] secondValues = lq0.CoM4;
        gc_2[] thirdValues = gc_2.Uu;
        j30_0 initialize = j30_0.Hi;
        a10_0 state = new a10_0(Cq.Jd, zg0_0.ns, 0, (byte) 0, (byte) 0, status, environment,
                (byte) -1, (short) 0, null, false, (byte) -1, (byte) 0, firstValues, secondValues,
                null, thirdValues, (byte) 0, (byte) 0, false, sides, entities, true);
        state.F2((byte) -1, null, null, 0, 0, null, (byte) 0);
        return state;
    }

    public static a10_0 km(QL layout) {
        short level = 6;
        yt_1 controller = tw0_0.e60;
        if (controller == null || controller.jB0 == null) {
            return null;
        }
        BR client = tw0_0.rl;
        if (client == null || client.nz() || tw0_0.PK0 != null || BU.T50 == null) {
            Qy0.yI0.dk(-1, sm0_0.c0(6002));
            return null;
        }

        ec0_1 definition = controller.jB0.J1;
        O8[] sides = new O8[2];
        sides[0] = new pi0_1((byte) 0, client.k0.Nw0, definition, null, (short) -1, (byte) 0, (byte) 6, (byte) 0);
        CH0 initialize = controller.dj0;
        sides[1] = new pi0_1((byte) 1, client.k0.Nw0, definition, null, (short) -1, (byte) 0, (byte) 6, (byte) 0);
        sides[0].zz()[0].eo0(CH0.Ab(1L), level, (byte) 50, "", (byte) 0, (byte) 0,
                (short) 0, (short) 0, (short) 1, (short) 1, layout, (byte) 0, (byte) 3);
        sides[1].zz()[0].eo0(CH0.Ab(2L), level, (byte) 50, "", (byte) 0, (byte) 0,
                (short) 0, (short) 0, (short) 1, (short) 1, layout, (byte) 0, (byte) 3);

        PF[][] entities = new PF[2][];
        entities[0] = new PF[]{new PF(sides[0], sides[0].zz()[0], b30_0.U5((byte) 0, (byte) 0))};
        entities[1] = new PF[]{new PF(sides[1], sides[1].zz()[0], b30_0.U5((byte) 1, (byte) 0))};

        rh0_1 status = rh0_1.Ba;
        XA0 environment = XA0.Ct0;
        N2[] firstValues = N2.N60;
        lq0[] secondValues = lq0.CoM4;
        gc_2[] thirdValues = gc_2.Uu;
        j30_0 initializeState = j30_0.Hi;
        a10_0 state = new a10_0(Cq.yL, zg0_0.ns, 0, (byte) 0, (byte) 0, status, environment,
                (byte) -1, (short) 0, null, false, (byte) -1, (byte) 0, firstValues, secondValues,
                null, thirdValues, (byte) -128, (byte) 0, false, sides, entities, true);
        state.F2((byte) -1, null, null, 0, 0, null, (byte) 0);
        state.YP(new pf0_2(0));
        return state;
    }
}
