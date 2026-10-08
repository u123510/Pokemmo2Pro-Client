package f;

import cn.pokemmo.constant.enums.TileCollisionType;

public enum rm_1 {
    W80(0),
    Wt0(1),
    PG0(2),
    IV(3);

    public final long kN;
    public final int Mg0;

    rm_1(int var3) {
        int var4 = var3 << 4;
        this.Mg0 = 48 - var4;
        this.kN = -281474976710656L >>> var4;
    }

    public final int sR(long var1) {
        return (int)((var1 & this.kN) >>> this.Mg0);
    }

    public TileCollisionType asModern() {
        return TileCollisionType.valueOf(name());
    }
}