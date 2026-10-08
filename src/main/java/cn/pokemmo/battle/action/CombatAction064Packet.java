package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CombatAction064Packet extends Nt implements eb0_0 {
    public final b30_0 et0;
    public final byte np0;
    public final boolean Uh0;

    public CombatAction064Packet(b30_0 value, byte slot, boolean enabled) {
        this.et0 = value;
        this.np0 = slot;
        this.Uh0 = enabled;
    }

    @Override
    public final byte BL0() {
        return 97;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 battle, qn_1 context) {
        a10_0 registry = battle.yd0;
        b30_0 sourceSlot = this.et0;
        PF source = registry.Ce(sourceSlot.Pp0, sourceSlot.B6);
        if (source == null || source.zi0.hf0()) {
            return;
        }

        PF target = registry.Ce(sourceSlot.Pp0, this.np0);
        battle.lZ.add(new eh0_1((jc_0) this, battle, source, target));
        if (!this.Uh0) {
            return;
        }

        if (registry.nf == Cq.Hs0 && this.np0 == 1) {
            tw0_0.RE0.Hq0((byte) 2, (short) 1403);
            lpt6__2 category = lpt6__2.Q80;
            int messageId = registry.QX(231, source);
            battle.wJ(sm0_0.fg0((byte) 2, category, 14, messageId,
                    new String[]{source.nz0(true)}), "", null);
            return;
        }

        if (target != null) {
            lpt6__2 category = lpt6__2.Q80;
            int messageId = registry.QX(1137, source);
            battle.wJ(sm0_0.fg0((byte) 2, category, 14, messageId,
                    new String[]{source.nz0(true), target.nz0(true)}), "", null);
        } else {
            battle.wJ(sm0_0.wa0(200364, source.nz0(true)), "", null);
        }
    }
}
