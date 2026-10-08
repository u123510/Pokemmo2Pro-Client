package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleWeatherAction extends Nt implements eb0_0 {
    public final byte RK;

    public BattleWeatherAction(byte value) {
        super();
        this.RK = value;
    }

    @Override
    public final byte BL0() {
        return (byte) 48;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        switch (this.RK) {
            case 0:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(703, first), new String[]{first.A60()}), "", null);
                return;
            case 1:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(715, first), new String[]{first.A60()}), "", null);
                return;
            case 2:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(718, first), new String[]{first.A60()}), "", null);
                return;
            case 3:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(712, second), new String[]{second.A60()}), "", null);
                return;
            case 4:
                battle.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14,
                        battle.yd0.QX(706, second), new String[]{second.A60()}), "", null);
                battle.lZ.add(new fk_0(battle, second, (byte) 0));
                return;
            default:
                return;
        }
    }
}
