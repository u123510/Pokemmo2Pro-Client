package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;

public class SwitchActionNeg003Packet extends Nt implements eb0_0 {
    public final byte iJ;

    public SwitchActionNeg003Packet(byte value) {
        this.iJ = value;
    }

    @Override
    public final byte BL0() {
        return -3;
    }

    @Override
    public final void IE0(PF first, PF second, boolean firstFlag, boolean secondFlag,
                          short ignored, boolean thirdFlag, ML0 battle, qn_1 context) {
        if (second == null || second.LpT9 == null) {
            return;
        }
        switch (this.iJ) {
            case 1:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.Vs0(second.cD0, 1125),
                        new String[]{second.A60()}), "", null);
                second.LpT9.CQ.v50.set(Color.WHITE);
                return;
            case 2:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.Vs0(second.cD0, 1128),
                        new String[]{second.A60()}), "", null);
                return;
            case 3:
                battle.wJ(sm0_0.wa0(200417, second.A60()), "", null);
                return;
            default:
                return;
        }
    }
}
