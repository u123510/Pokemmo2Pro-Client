package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction052Packet extends Nt implements eb0_0 {
    public final short Gw0;

    public BattleAction052Packet(short value) {
        super();
        this.Gw0 = value;
    }

    @Override
    public final byte BL0() {
        return 52;
    }

    @Override
    public final void IE0(PF first, PF second, boolean arg3, boolean arg4,
                          short arg5, boolean arg6, ML0 battle, qn_1 context) {
        boolean jD0 = second.jD0();
        boolean rq = second.rq();
        boolean wG0 = second.wG0();
        boolean zs = second.zs();
        boolean eq = second.Eq();
        boolean ky = second.Ky();
        mc0_1 type = gu0.l2.lPT6(this.Gw0);
        second.Ry0((byte)0);

        if (eq) {
            this.message(920, second, type, battle);
        }
        if (!rq && ky) {
            this.message(917, second, type, battle);
        }
        if (wG0) {
            this.message(929, second, type, battle);
        }
        if (zs) {
            this.message(926, second, type, battle);
        }
        if (jD0) {
            this.message(923, second, type, battle);
        }
        battle.lZ.add(new fk_0(battle, second, (byte)0));
    }

    private void message(int id, PF pokemon, mc0_1 type, ML0 battle) {
        int localized = battle.yd0.QX(id, pokemon);
        String[] args = {pokemon.A60(), sm0_0.c0(type.Nl)};
        String text = sm0_0.fg0((byte)14, lpt6__2.Q80, 14, localized, args);
        battle.wJ("", text, null);
    }
}
