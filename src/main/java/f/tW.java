package f;

import cn.pokemmo.constant.ThreeByteIdRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.tW
 * 核心实现已迁移至 {@link cn.pokemmo.constant.ThreeByteIdRegistry}
 */
public final class tW extends ThreeByteIdRegistry {
    public static final tW cH;
    public static final tW RN;
    public static final bm0_1 N8;

    public tW(int i1) {
        super(i1);
    }

    public static void hL0(byte i0) {
        tW unused = (tW) N8.BM(i0);
    }

    static {

        tW t0 = new tW(0);
        cH = t0;
        tW t1 = new tW(1);
        tW t2 = new tW(2);
        RN = t2;
        tW[] arr = new tW[]{t0, t1, t2};
        N8 = new bm0_1();
        tW[] clone = (tW[]) arr.clone();
        for (tW elem : clone) {
            N8.gE0(elem.Hz, elem);
        }
    
        ThreeByteIdRegistry.cH = cH;
        ThreeByteIdRegistry.RN = RN;
        ThreeByteIdRegistry.N8 = N8;
    }
}
