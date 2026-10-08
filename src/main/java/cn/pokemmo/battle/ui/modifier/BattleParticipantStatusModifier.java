package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.ArrayList;
import java.util.Collection;

public class BattleParticipantStatusModifier extends TC0 {
    public final CH0 t50;
    public final short Uj0;
    public final Collection JH;

    public BattleParticipantStatusModifier(CH0 attacker, short type, ArrayList targets) {
        this.t50 = attacker;
        this.Uj0 = type;
        this.JH = targets;
    }

    @Override
    public final void QC(ML0 context) {
        long timestamp = System.currentTimeMillis();
        a10_0 world = context.yd0;
        PF attacker = world.nd0(this.t50);
        if (attacker == null) {
            context.wJ("Error has occured, could not find\n attacker with object id: " + this.t50, "", null);
            return;
        }
        if (this.Uj0 >= 0) {
            attacker.qo0 = this.Uj0;
        }
        context.lZ.add(new ww0_0(attacker));
        for (Object item : this.JH) {
            if (((qn_1)item).nG0((short)16384)) {
                context.wJ(sm0_0.vs(310367, new byte[]{2}, new String[]{attacker.EG()}), "", null);
                return;
            }
        }
        String[] args = {attacker.EG(), sm0_0.c0(((vk0_1)ec0_2.Sx().f4.f5(this.Uj0)).bt)};
        context.wJ(sm0_0.vs(310268, new byte[]{2, 3}, args), "", null);
        for (Object item : this.JH) {
            qn_1 group = (qn_1)item;
            PF target = group.EO.Uz0() ? attacker : world.nd0(group.EO);
            if (target == null) {
                context.wJ("Error has occured, could not find\n target with object id: " + group.EO, "", null);
                return;
            }
            boolean hasFlag = false;
            for (Object check : this.JH) {
                if (((qn_1)check).nG0((short)8192)) {
                    hasFlag = true;
                    break;
                }
            }
            if (!hasFlag) {
                context.lZ.add(new af0_1(context, attacker, (byte)0));
            }
            for (Object action : group.XW) {
                context.aa0(attacker, target, (Nt)action, false, false, this.Uj0, false, group);
            }
        }
        context.ob("");
        context.lZ.add(new com3__4(attacker));
        context.lZ.add(new jj0_1((L5)context));
        if (lpt3__1.sk) {
            context.lZ.add(new ne_1((H8) this, timestamp));
        }
    }
}
