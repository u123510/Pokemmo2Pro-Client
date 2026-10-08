package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction122Packet extends Nt implements eb0_0 {
    public final byte[] Mu;
    public BattleAction122Packet(byte[] values) { super(); this.Mu = values; }
    @Override public final byte BL0() { return 122; }
    @Override public final void IE0(PF source, PF target, boolean b3, boolean b4, short s5, boolean b6, ML0 context, qn_1 group) {
        if (target == null || target.zi0.hf0() || source == null || source.zi0.hf0()) return;
        lpt6__2 mode = lpt6__2.Q80;
        int messageId = context.yd0.QX(1047, source);
        context.wJ(sm0_0.fg0((byte)2, mode, 14, messageId, new String[]{source.A60(), target.A60()}), "", null);
        Oz0 effects = tw0_0.LD0.he0;
        for (int i = 0; i < gc_2.mi.length; i++) source.Mt(gc_2.mi[i], this.Mu[i]);
        if (effects != null) effects.N10.Hi(source).XO();
    }
}
