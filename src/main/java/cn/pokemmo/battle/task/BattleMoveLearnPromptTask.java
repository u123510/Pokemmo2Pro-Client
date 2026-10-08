package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleMoveLearnPromptTask extends N60 {
    public final jd0_1 Sm0;
    public final short KJ0;
    public final PF Dq0;
    public boolean bQ;
    public boolean auX;
    public final MU mR;

    public BattleMoveLearnPromptTask(PF value, jd0_1 owner) {
        int current = owner.bf();
        this.KJ0 = value.uk();
        this.auX = current <= this.KJ0;
        this.Sm0 = owner;
        this.Dq0 = value;
        this.mR = new u60_0(value).vv(value);
    }

    @Override
    public final boolean lPt1() {
        if (!this.bQ) {
            return false;
        }
        ea0_0 state = this.Sm0.ZC;
        if (state.Cm0 != state.fM && !state.eE) {
            return false;
        }
        return this.mR.bL();
    }

    @Override
    public final void ii() {
        this.mR.us();
        tw0_0.LD0.he0.aY = this.mR;
        this.Sm0.le0(this.Dq0, true, this.KJ0);

        BR service = tw0_0.rl;
        if (service != null) {
            Mj previous = service.r1(_volatile.BV);
            Mj current = service.PC0;
            if (current != null && previous != current) {
                previous.rr0 = true;
                previous.jf = false;
            }
            if (current != null) {
                current.rr0 = true;
                current.jf = false;
            }
        }

        this.bQ = true;
        if (this.auX) {
            com3__3 shape = this.Dq0.kc ? this.Dq0.RZ() : this.Dq0.LpT9;
            ii0_2.Zv0(shape);
            this.auX = false;
        }
    }

    @Override
    public final NU gJ0() {
        return NU.K50;
    }
}
