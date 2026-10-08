package f;

import cn.pokemmo.constant.ElevenByteFlagRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.xg_1
 * 核心实现已迁移至 {@link cn.pokemmo.constant.ElevenByteFlagRegistry}
 */
public final class xg_1 extends ElevenByteFlagRegistry {
    public static final xg_1 rv;
    public static final bm0_1 xk0;

    public xg_1(byte i1, boolean i2) {
        super(i1, i2);
    }

    static {

        xg_1 x0 = new xg_1((byte) 0, false);
        rv = x0;
        xg_1 x1 = new xg_1((byte) 1, false);
        xg_1 x2 = new xg_1((byte) 2, false);
        xg_1 x3 = new xg_1((byte) 3, false);
        xg_1 x4 = new xg_1((byte) 4, true);
        xg_1 x5 = new xg_1((byte) 5, true);
        xg_1 x6 = new xg_1((byte) 6, true);
        xg_1 x7 = new xg_1((byte) 7, true);
        xg_1 x8 = new xg_1((byte) 8, true);
        xg_1 x9 = new xg_1((byte) 9, true);
        xg_1 x10 = new xg_1((byte) 10, true);
        xg_1[] arr = new xg_1[]{x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10};
        xk0 = new bm0_1();
        xg_1[] clone = (xg_1[]) arr.clone();
        for (xg_1 elem : clone) {
            xk0.gE0(elem.vz0, elem);
        }
    
        ElevenByteFlagRegistry.rv = rv;
        ElevenByteFlagRegistry.xk0 = xk0;
    }
}
