package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction118Packet extends Nt implements eb0_0 {
    public final CH0 Ur0;
    public final short LH0;
    public final short i4;

    public BattleAction118Packet(CH0 cH0, short s, short s2) {
        this.Ur0 = cH0;
        this.LH0 = s;
        this.i4 = s2;
    }

    @Override
    public final byte BL0() {
        return 118;
    }

    @Override
    public final void IE0(PF pF, PF object, boolean bl, boolean bl2, short s, boolean bl3, ML0 mL0, qn_1 qn_12) {
        mc0_1 move = gu0.l2.lPT6(this.i4);
        PF target = this.Ur0.Uz0() ? null : mL0.yd0.nd0(this.Ur0);
        String targetName = target == null ? mp_1.vf0().W50(this.LH0).Ay(false) : target.nz0(true);
        if (this.i4 == -1) {
            String[] args = new String[2];
            args[0] = pF.nz0(true);
            args[1] = targetName;
            mL0.wJ(sm0_0.Bx(130120, args), "", null);
            if (target != null) {
                target.bv0((short) 1);
            }
        } else {
            String[] args = new String[3];
            args[0] = pF.nz0(true);
            args[1] = targetName;
            args[2] = sm0_0.c0(move.Nl);
            mL0.wJ(sm0_0.Bx(130119, args), "", null);
            if (target != null) {
                target.bv0(move.Z8);
            }
        }
    }
}
