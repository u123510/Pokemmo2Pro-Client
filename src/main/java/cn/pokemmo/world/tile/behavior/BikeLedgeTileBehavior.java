package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BikeLedgeTileBehavior extends BaseTileBehavior {
    public final byte cz;

    public BikeLedgeTileBehavior(byte i1) {
        super();
        this.cz = i1;
    }

    public final boolean xx0(bi0_1 v1, byte i2) {
        return this.cz != i2;
    }

    public final boolean aH(LT v1, bi0_1 v2, byte i3, byte i4) {
        if (this.cz == i3 && (i4 & 1) == 0 && tw0_0.rl != null && tw0_0.e60 != null) {
            if (v2 == tw0_0.e60.jB0 && v2.iz0((byte) 2)) {
                tw0_0.rl.fw = true;
            }
        }
        return ((Object) this) instanceof xm_2;
    }
}
