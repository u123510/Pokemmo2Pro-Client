package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ItemAction096Packet extends Nt implements eb0_0 {
    public final short t8;

    public ItemAction096Packet(short value) {
        super();
        this.t8 = value;
    }

    public final byte BL0() {
        return (byte) 96;
    }

    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
            boolean flag3, ML0 window, qn_1 unused) {
        mc0_1 item = gu0.l2.lPT6(this.t8);
        lpt6__2 category = lpt6__2.Q80;
        int effect = 14;
        int amount = window.yd0.QX(1108, second);
        String[] args = new String[2];
        args[0] = second.A60();
        args[1] = sm0_0.c0(item.Nl);
        window.wJ(sm0_0.Bw((byte) 2, category, effect, amount, args), "", null);
    }
}
