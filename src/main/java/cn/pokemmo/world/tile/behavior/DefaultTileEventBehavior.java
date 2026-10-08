package cn.pokemmo.world.tile.behavior;

import f.LT;
import f.bi0_1;
import f.tw0_0;
import f.up0_0;

public class DefaultTileEventBehavior extends up0_0 {
    public static final DefaultTileEventBehavior To = new DefaultTileEventBehavior();

    public DefaultTileEventBehavior() {
        super(new byte[0]);
    }

    public DefaultTileEventBehavior(byte... v1) {
        super(v1);
    }

    public boolean xB(LT v1, LT v2, bi0_1 v3, byte i4) {
        if (v1.F2() != null && v1.F2().dw == 1 && v1.F2().Bm0 == 65 && v1.F2().case$ == 0) {
            return false;
        }
        if ((i4 & 1) == 0 && tw0_0.rl != null && tw0_0.e60 != null && v3 == tw0_0.e60.jB0) {
            tw0_0.rl.fw = true;
        }
        return false;
    }
}
