package cn.pokemmo.constant;

import f.bm0_1;

public class ThirteenByteIdRegistry {
    public static final bm0_1 gD0;
    public static final ThirteenByteIdRegistry[] Ra;
    public final byte xy;
    public final int EE;
    public final int qF;

    public ThirteenByteIdRegistry(byte i1, int i2, int i3) {
        this.qF = i2;
        this.xy = i1;
        this.EE = i3;
    }

    static {
        ThirteenByteIdRegistry v0 = new ThirteenByteIdRegistry((byte) 0, 0, 6700);
        ThirteenByteIdRegistry v1 = new ThirteenByteIdRegistry((byte) 1, 1, 6701);
        ThirteenByteIdRegistry v2 = new ThirteenByteIdRegistry((byte) 2, 2, 16777230);
        ThirteenByteIdRegistry v3 = new ThirteenByteIdRegistry((byte) 3, 3, 6703);
        ThirteenByteIdRegistry v4 = new ThirteenByteIdRegistry((byte) 4, 4, 6704);
        ThirteenByteIdRegistry v5 = new ThirteenByteIdRegistry((byte) 5, 5, 5624);
        ThirteenByteIdRegistry v6 = new ThirteenByteIdRegistry((byte) 6, 6, 6705);
        ThirteenByteIdRegistry v7 = new ThirteenByteIdRegistry((byte) 7, 7, 6706);
        ThirteenByteIdRegistry v8 = new ThirteenByteIdRegistry((byte) 8, 8, 6707);
        ThirteenByteIdRegistry v9 = new ThirteenByteIdRegistry((byte) 9, 9, 6708);
        ThirteenByteIdRegistry v10 = new ThirteenByteIdRegistry((byte) 10, 10, 6709);
        ThirteenByteIdRegistry v11 = new ThirteenByteIdRegistry((byte) 11, 11, 6710);
        ThirteenByteIdRegistry v12 = new ThirteenByteIdRegistry((byte) 12, 12, 6711);

        Ra = new ThirteenByteIdRegistry[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12};
        gD0 = new bm0_1();
        for (ThirteenByteIdRegistry item : (ThirteenByteIdRegistry[]) Ra.clone()) {
            gD0.gE0(item.xy, item);
        }
    }
}
