package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction065Packet extends Nt implements eb0_0 {
    public final short cC;
    public final short Zn;

    public BattleAction065Packet(short first, short second) {
        this.cC = first;
        this.Zn = second;
    }

    @Override
    public final byte BL0() { return (byte) 65; }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        lpt6__2 format = lpt6__2.Q80;
        battle.wJ(sm0_0.fg0((byte) 2, format, 14,
                battle.yd0.QX(508, first), new String[]{first.A60()}), "", null);
        int firstId = this.cC;
        first.Sk0 = (short) firstId;
        String firstMove = sm0_0.c0(this.Zn + 210000);
        battle.z70[first.cD0].fl0(sm0_0.Bw((byte) 2, format, 15, 103,
                new String[]{first.A60(), jj0_0.hw0("       ", firstMove)}));
        String secondMove = sm0_0.c0(this.Zn + 210000);
        second.Sk0 = this.Zn;
        battle.z70[second.cD0].fl0(sm0_0.Bw((byte) 2, format, 15, 103,
                new String[]{second.A60(), jj0_0.hw0("       ", secondMove)}));
    }
}
