package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction082Packet extends Nt implements eb0_0 {
    public final short Ng;

    public StatAction082Packet(short value) { this.Ng = value; }

    public static void Hx(PF source, ML0 ui) {
        for (int i = 0; i < source.sL0.length; i++) {
            if (source.sL0[i] < 0) source.sL0[i] = 0;
        }
        ui.Hi(source).XO();
    }

    @Override
    public final byte BL0() { return 82; }

    @Override
    public final void IE0(PF a, PF b, boolean c, boolean d, short e, boolean f, ML0 ui, qn_1 q) {
        mc0_1 state = gu0.l2.lPT6(this.Ng);
        lpt6__2 message = lpt6__2.Q80;
        int code = ui.yd0.QX(1010, b);
        String[] args = { b.A60(), sm0_0.c0(state.Nl) };
        String text = sm0_0.fg0((byte) 2, message, 14, code, args);
        ui.wJ(text, "", () -> Hx(b, ui));
    }
}
