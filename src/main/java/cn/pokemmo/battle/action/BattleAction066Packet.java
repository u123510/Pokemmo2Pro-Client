package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction066Packet extends Nt implements eb0_0 {
    public final short TE;

    public BattleAction066Packet(short value) {
        this.TE = value;
    }

    public final byte BL0() {
        return 66;
    }

    public final void IE0(PF first, PF second, boolean firstFlag, boolean secondFlag,
                          short ignored, boolean thirdFlag, ML0 battle, qn_1 context) {
        lpt6__2 category = lpt6__2.Q80;
        int effect = battle.yd0.eH0(619, first, second);
        battle.wJ(sm0_0.fg0((byte) 2, category, 14, effect, new String[]{
                first.A60(), second.A60(), sm0_0.c0(this.TE + 210000)
        }), "", null);

        String moveName = sm0_0.c0(this.TE + 210000);
        String firstLine = sm0_0.Bw((byte) 2, category, 15, 103, new String[]{
                first.A60(), jj0_0.hw0("       ", moveName)
        });
        battle.z70[first.cD0].fl0(firstLine);

        String secondLine = sm0_0.Bw((byte) 2, category, 15, 103, new String[]{
                second.A60(), jj0_0.hw0("       ", moveName)
        });
        battle.z70[second.cD0].fl0(secondLine);

        first.Sk0 = this.TE;
        second.Sk0 = this.TE;
        battle.Hi(first).XO();
        battle.Hi(second).XO();
    }
}
