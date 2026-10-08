package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BarrierTileBehavior extends BaseTileBehavior {
    public final byte ZN;
    public final byte Mi;
    public final gf_1 VW;

    public BarrierTileBehavior(gf_1 owner, byte first, byte second) {
        super();
        this.VW = owner;
        this.ZN = first;
        this.Mi = second;
    }

    @Override
    public final boolean aH(LT target, bi0_1 battle, byte slot, byte flags) {
        if (slot != this.Mi || battle != tw0_0.e60.jB0) {
            return false;
        }
        zv_2 state = battle.ba0.Xr();
        state.Y30 = slot;
        Ou0 model = this.VW.qo0[this.ZN];
        model.PE0 = 1.0f;
        model.sC0(slot ^ 1, false, null);
        tw0_0.rl.fw = true;
        float delay = (slot == 3 || slot == 2) ? 1.0f : 0.5f;
        _finally.HG().dH0(new ci0_0(slot, battle), delay);
        _finally.HG().dH0(new mp_0((j5_0)(Object)this, slot, battle), delay + 0.6f);
        this.VW.af = new he0_2((j5_0)(Object)this, state, slot, battle);
        return true;
    }
}
