package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction120Packet extends Nt implements eb0_0 {
    public final short lPt4;

    public StatAction120Packet(short value) {
        super();
        this.lPt4 = value;
    }

    @Override
    public final byte BL0() {
        return 120;
    }

    @Override
    public final void IE0(PF p1, PF p2, boolean b1, boolean b2, short s,
                          boolean b3, ML0 model, qn_1 qn) {
        int count = model.yd0.QX(782, p1);
        String[] args = {p1.A60(), sm0_0.c0(110000 + this.lPt4)};
        model.wJ("", sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, count, args), null);
        a10_0 state = tw0_0.PK0;
        if (state == null) {
            return;
        }
        Oz0 overlay = tw0_0.LD0.he0;
        for (byte i = 0; i < state.wI0.length; i++) {
            O8 row = state.mn(i);
            ek_0 effects = row.zI;
            if (effects == null || overlay == null) {
                continue;
            }
            fq_2[] kinds = {fq_2.ue0, fq_2.KJ0, fq_2.pz};
            for (byte j = 0; j < kinds.length; j++) {
                effects.Ka0(kinds[j], (byte) 0);
            }
            overlay.Z8(i, (short) 191);
            overlay.Z8(i, (short) 390);
            overlay.Z8(i, (short) 446);
        }
    }
}
