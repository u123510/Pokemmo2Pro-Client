package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatActionNeg032Packet extends Nt implements eb0_0 {
    public final CH0[] Rr;

    public StatActionNeg032Packet(CH0[] ids) {
        super();
        this.Rr = ids;
    }

    @Override
    public final void IE0(PF first, PF target, boolean b3, boolean b4, short s5,
                          boolean b6, ML0 context, qn_1 qn) {
        context.I1("", "", null);
        a10_0 state = context.yd0;
        for (CH0 id : this.Rr) {
            PF value = state.nd0(id);
            if (value == null) {
                continue;
            }
            MU action;
            if (state.mn(value.cD0) instanceof ux_0) {
                action = new X00(context, value, false);
                action.Tc0 = true;
                context.lZ.add(new kw_0(action));
            } else {
                action = new zb_1(value, value).vv(value);
                action.Tc0 = true;
                context.lZ.add(new kw_0((byte) 0, action));
            }
        }
    }

    @Override
    public final byte BL0() {
        return -32;
    }
}
