package cn.pokemmo.world.tile;

import f.LT;
import f.bi0_1;
import f.hI;

public class TileCollisionFilter extends hI {
    @Override
    public boolean xB(LT lT, LT lT2, bi0_1 bi0_12, byte by) {
        if (bi0_12.iz0((byte) 8)) {
            return false;
        }
        return super.xB(lT, lT2, bi0_12, by);
    }
}
