package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class TreadmillTileBehavior extends BaseTileBehavior {
    public TreadmillTileBehavior() {
        super();
    }

    public final boolean xB(LT v1, LT v2, bi0_1 v3, byte i4) {
        int i0 = 150;
        if (v3.oI0()) {
            i0 = 75;
        } else if (v3.uv()) {
            i0 = 100;
        }
        if (v3.ba0.Y30 == 1) {
            i0 += 50;
        }
        int i2 = 0;
        if (v3.il0.BQ) {
            i2 = 500;
        }
        if (v3.vx0() && !tw0_0.LD0.nv()) {
            v1.ZD0(new z70_0(i2, i0, v1));
        }
        return false;
    }
}
