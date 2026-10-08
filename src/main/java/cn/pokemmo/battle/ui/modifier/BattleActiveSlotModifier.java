package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActiveSlotModifier extends TC0 {
    public final b30_0 tn0;
    public final PF pR;

    public BattleActiveSlotModifier(PF pR, b30_0 tn0) {
        super();
        this.tn0 = tn0;
        this.pR = pR;
    }

    public final void QC(ML0 screen) {
        if (tw0_0.PK0 == null) {
            return;
        }
        byte id = this.tn0.Pp0;
        byte form = this.tn0.B6;
        PF current = screen.yd0.Ce(id, form);
        con__6 handler = tw0_0.PK0.mn(id).Td0();
        if (handler != null && !current.zi0.hf0()) {
            current.Ah();
            screen.Hi(current).XO();
            if (handler == con__6.pn0) {
                screen.I1(sm0_0.wa0(16807031, current.nz0(true)), "", null);
            }
            kw_0 loading = new kw_0((byte) 0, new ds_1(current).vv(current));
            screen.lZ.add(loading);
        } else if (id == screen.yd0.Ez0()) {
            String[] arguments = new String[]{current.A60()};
            screen.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 15,
                    rg0_2.j40(25, 29), arguments), "", null);
            screen.lZ.add(new bv0_0(current));
        } else {
            a10_0 device = screen.yd0;
            O8 selected = null;
            if (id < 0) {
                device.getClass();
            } else {
                O8[] forms = device.eG;
                if (id <= forms.length) {
                    selected = forms[id].Sf(form);
                }
            }
            String title = selected.M2();
            String[] arguments = new String[2];
            arguments[0] = title;
            arguments[1] = current.nz0(true);
            screen.I1(sm0_0.fg0((byte) 2, lpt6__2.Q80, 15, 31, arguments), "", null);
            screen.lZ.add(new bv0_0(current));
        }
        screen.lZ.add(new ry_1(this.pR, this.tn0, handler));
    }
}
