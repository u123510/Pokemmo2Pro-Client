package cn.pokemmo.constant.enums;

import f.*;

public enum TileCollisionType {
    W80(0),
    Wt0(1),
    PG0(2),
    IV(3);

    public final long kN;
    public final int Mg0;

    TileCollisionType(int var3) {
        int var4 = var3 << 4;
        this.Mg0 = 48 - var4;
        this.kN = -281474976710656L >>> var4;
    }

    public final int sR(long var1) {
        return (int)((var1 & this.kN) >>> this.Mg0);
    }

    public f.rm_1 toLegacy() {
        return f.rm_1.valueOf(name());
    }
}