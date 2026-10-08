package f;

import cn.pokemmo.constant.NineByteStateRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.hb_2
 * 核心实现已迁移至 {@link cn.pokemmo.constant.NineByteStateRegistry}
 */
public final class hb_2 extends NineByteStateRegistry {
    public static final hb_2 hd0;
    public static final hb_2 gE0;
    public static final hb_2 Rq0;
    public static final hb_2 lf0;
    public static final hb_2[] uG0;

    public hb_2(int i1, byte i2) {
        super(i1, i2);
    }

    static {

        hb_2 v0 = new hb_2(0, (byte) 0);
        hd0 = v0;
        hb_2 v1 = new hb_2(1, (byte) 1);
        gE0 = v1;
        hb_2 v2 = new hb_2(2, (byte) 2);
        Rq0 = v2;
        hb_2 v3 = new hb_2(3, (byte) 31);
        hb_2 v4 = new hb_2(4, (byte) 40);
        hb_2 v5 = new hb_2(5, (byte) 41);
        hb_2 v6 = new hb_2(6, (byte) 100);
        hb_2 v7 = new hb_2(7, (byte) 101);
        hb_2 v8 = new hb_2(8, (byte) 102);
        lf0 = v8;
        uG0 = new hb_2[] { v0, v1, v2, v3, v4, v5, v6, v7, v8 };
    
        NineByteStateRegistry.hd0 = hd0;
        NineByteStateRegistry.gE0 = gE0;
        NineByteStateRegistry.Rq0 = Rq0;
        NineByteStateRegistry.lf0 = lf0;
        NineByteStateRegistry.uG0 = uG0;
    }
}
