package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class MachBikeTileBehavior extends BaseTileBehavior {
    public final boolean Z90;
    public final nk_0 aUX;

    public MachBikeTileBehavior(boolean value) {
        this(false, value, null);
    }

    public MachBikeTileBehavior(boolean value, boolean ignored, nk_0 kind) {
        super();
        this.Z90 = value;
        this.aUX = kind;
    }

    @Override
    public boolean aH(LT action, bi0_1 entity, byte type, byte ignored) {
        nk_0 selected;
        if (type == 0) {
            selected = nk_0.t20;
        } else if (type == 1) {
            selected = nk_0.cOM9;
        } else if (type == 3) {
            selected = nk_0.lpT8;
        } else {
            selected = nk_0.pM;
        }

        _else state = action.F2();
        if (action.LPt1() && state.dw == 1 && state.Bm0 == 76
                && state.case$ >= 35 && state.case$ <= 39) {
            return false;
        }
        state = action.F2();
        if (state.dw == 0 && state.Bm0 == 30 && state.case$ == 0) {
            return false;
        }
        return entity.il0.Zw(action, this.Z90, new nk_0[]{selected});
    }

    @Override
    public final boolean tm(LT action, bi0_1 entity, boolean value) {
        db0_2 data = action.B3();
        if (data == null || data.zC == null || !this.Z90) {
            return false;
        }
        if (!action.lW()) {
            action.ZD0(new ye0_1(action.F2(), action, data, value, false, false));
        }
        return true;
    }

    @Override
    public final nk_0 new$() {
        return this.aUX;
    }
}
