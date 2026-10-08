package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class OneWayLedgeTileBehavior extends BaseTileBehavior {
    public final byte pt;

    public OneWayLedgeTileBehavior(byte i1) {
        super();
        this.pt = i1;
    }

    public final boolean fu(LT v1, bi0_1 v2, byte i3) {
        _else el = v1.F2();
        if (el.dw == 0 && el.Bm0 == 1 && el.case$ == 8 && v1.HR() == 4) {
            return false;
        }
        if (i3 == this.pt) {
            return v2.il0.Zw(v1, false, new nk_0[0]);
        }
        return false;
    }
}
