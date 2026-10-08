package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction114Packet extends Nt implements eb0_0 {
    public final byte Com4;
    public final short XK;

    public BattleAction114Packet(byte code, short value) {
        super();
        this.Com4 = code;
        this.XK = value;
    }

    @Override
    public final byte BL0() {
        return (byte) 114;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 model, qn_1 callback) {
        mc0_1 text = gu0.l2.lPT6(this.XK);
        if (text == null) {
            return;
        }
        short kind = this.Com4;
        if (kind == 1) {
            lpt6__2 format = lpt6__2.Q80;
            int slot = model.yd0.QX(1038, first);
            String[] args = {first.A60(), sm0_0.c0(text.Nl)};
            model.wJ(sm0_0.fg0((byte) 2, format, 14, slot, args), "", null);
        } else if (kind == 0) {
            lpt6__2 format = lpt6__2.Q80;
            int slot = model.yd0.eH0(1031, first, second);
            String[] args = {second.A60(), first.A60(), sm0_0.c0(text.Nl)};
            model.wJ(sm0_0.fg0((byte) 2, format, 14, slot, args), "", null);
        }
    }
}
