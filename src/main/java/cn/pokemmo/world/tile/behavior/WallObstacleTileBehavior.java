package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class WallObstacleTileBehavior extends BaseTileBehavior {

    public WallObstacleTileBehavior() {
    }

    public final boolean aH(LT v1, bi0_1 v2, byte i3, byte i4) {
        if (!(v2 instanceof E90)) {
            return false;
        }
        short i0 = (v1.xl0() == 566) ? (short) 567 : (short) 518;
        v1.HU(v1.uj(), i0);
        if (((E90) v2).iz0((byte) 8)) {
            return false;
        }
        nk_0 this_nk;
        if (i3 == 0) {
            this_nk = v2.oI0() ? nk_0.Ka0 : nk_0.t20;
        } else if (i3 == 1) {
            this_nk = v2.oI0() ? nk_0.Z3 : nk_0.cOM9;
        } else if (i3 == 3) {
            this_nk = v2.oI0() ? nk_0.qv0 : nk_0.lpT8;
        } else {
            this_nk = v2.oI0() ? nk_0.Ef : nk_0.pM;
        }
        return v2.il0.Zw(v1, false, new nk_0[]{this_nk});
    }
}
