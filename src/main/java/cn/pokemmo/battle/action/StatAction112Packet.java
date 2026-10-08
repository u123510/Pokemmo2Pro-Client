package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction112Packet extends Nt implements eb0_0 {
    public final byte kp0;

    public StatAction112Packet(byte value) {
        this.kp0 = value;
    }

    @Override
    public final byte BL0() {
        return 112;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 callback) {
        a10_0 mode = tw0_0.PK0;
        if (mode == null) {
            return;
        }
        O8 state = mode.mn(mode.Ez0());
        ek_0 data = state.zI;
        switch (this.kp0) {
            case 2:
                tu0_0.mk(second, 200426, battle, "", null);
                second.W1(true);
                return;
            case 1:
                tu0_0.mk(second, 200502, battle, "", null);
                second.W1(false);
                return;
            case 0:
                battle.wJ(sm0_0.c0(200500), "", null);
                data.Eo = true;
                tw0_0.LD0.he0.Z8(mode.Ez0(), (short) -551);
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean Hm() {
        switch (this.kp0) {
            case 0:
                return false;
            case 1:
            case 2:
                return true;
            default:
                return super.Hm();
        }
    }
}
