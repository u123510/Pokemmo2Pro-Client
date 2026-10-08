package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BikeSlopeTileBehavior extends BaseTileBehavior {
    public nk_0 LpT3;

    public BikeSlopeTileBehavior() {
        super();
    }

    public final BikeSlopeTileBehavior fv0(nk_0 v1) {
        this.LpT3 = v1;
        return this;
    }

    public final boolean aH(LT v1, bi0_1 v2, byte i3, byte i4) {
        if (i3 == 2) {
            nk_0[] arr = new nk_0[] { nk_0.GJ, nk_0.GJ };
            return v2.il0.Zw(v1, false, arr);
        } else if (i3 == 3) {
            nk_0[] arr = new nk_0[] { nk_0.d5, nk_0.d5 };
            return v2.il0.Zw(v1, false, arr);
        }
        return false;
    }

    public final nk_0 new$() {
        return this.LpT3;
    }
}
