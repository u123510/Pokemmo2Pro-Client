package cn.pokemmo.world.tile;

import f.J4;
import f._else;
import f.dn_1;
import f.tw0_0;

public class TilePositionCoordinateResolver {
    public final dn_1 Oo;
    public final int FA0;
    public final byte j6;
    public final byte U0;
    public final byte RT;

    public TilePositionCoordinateResolver(dn_1 owner, int value, byte x, byte y, byte z) {
        this.Oo = owner;
        this.FA0 = value;
        this.j6 = x;
        this.U0 = y;
        this.RT = z;
    }

    public _else I80() {
        return (_else) tw0_0.e60.E6.get(J4.iA0(this.j6, this.U0, this.RT));
    }
}
