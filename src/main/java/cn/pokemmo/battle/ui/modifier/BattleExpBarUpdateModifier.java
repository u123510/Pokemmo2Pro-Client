package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleExpBarUpdateModifier extends TC0 {
    public final VU L;
    public final byte Sg0;
    public final short s20;

    public BattleExpBarUpdateModifier(VU value, byte flag, short amount) {
        super();
        this.L = value;
        this.Sg0 = flag;
        this.s20 = amount;
    }

    public final VU Bh0() {
        return this.L;
    }

    public final short Ij() {
        return this.s20;
    }

    @Override
    public final void QC(ML0 ui) {
        if (ui.yd0.nf == Cq.Jd) {
            d3 replacement = new ZS(this.L).Y3();
            Oz0 state = tw0_0.LD0.he0;
            d3 current = state.tz0;
            if (current != null) {
                current.dispose();
            }
            state.tz0 = replacement;
        }
        if (this.Sg0 < 0) {
            String[] args = {this.L.na0(), sm0_0.c0(this.s20 + 110000)};
            ui.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 157, 32, args), "", null);
            ui.lZ.add(new CC0((ut_2) this));
        } else {
            String[] args = {this.L.na0(), sm0_0.c0(this.s20 + 110000)};
            ui.wJ(sm0_0.Bw((byte) 2, lpt6__2.Q80, 157, 41, args), "", null);
        }
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof BattleExpBarUpdateModifier)) {
            return false;
        }
        BattleExpBarUpdateModifier other = (BattleExpBarUpdateModifier) object;
        if (other.s20 != this.s20 || other.Sg0 != this.Sg0) {
            return false;
        }
        if (this.L == other.L) {
            return true;
        }
        if (this.L == null || other.L == null) {
            return false;
        }
        return this.L.pu.equals(other.L.pu);
    }
}
