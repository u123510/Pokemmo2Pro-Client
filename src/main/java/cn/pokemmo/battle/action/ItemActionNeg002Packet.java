package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ItemActionNeg002Packet extends Nt implements eb0_0 {
    public final short vU;

    public ItemActionNeg002Packet(short s) {
        this.vU = s;
    }

    @Override
    public final byte BL0() {
        return -2;
    }

    @Override
    public final void IE0(PF pF, PF object, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        mc0_1 item = gu0.l2.lPT6(this.vU);
        if (pF == null) {
            return;
        }
        String text = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                mL0.yd0.QX(1028, pF),
                new String[]{pF.A60(), sm0_0.c0(item.Nl)});
        mL0.wJ(text, "", null);
    }
}
