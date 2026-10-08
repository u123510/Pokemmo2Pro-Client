package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ShallowWaterTileBehavior extends BaseTileBehavior {
    public ShallowWaterTileBehavior() {
        super();
    }

    public final boolean xB(LT v1, LT v2, bi0_1 v3, byte i4) {
        if (v3.vx0() && !tw0_0.LD0.nv()) {
            int dur;
            if (v3.oI0()) {
                dur = 75;
            } else if (v3.uv()) {
                dur = 100;
            } else {
                dur = 150;
            }
            v1.ZD0(new ze0_1(dur));
            if (v3.Ou()) {
                tw0_0.RE0.d00(true, (byte) 2, (short) 1662, 0.0f);
            }
        }
        return false;
    }

    public final void K40(bi0_1 v1, LT v2) {
        if (v1.vx0() && !v2.lW() && !tw0_0.LD0.nv()) {
            v2.ZD0(new ze0_1(0));
        }
    }

    public final boolean Xc() {
        return false;
    }
}
