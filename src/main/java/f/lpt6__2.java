package f;

import cn.pokemmo.constant.TwoByteIdRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.lpt6__2
 * 核心实现已迁移至 {@link cn.pokemmo.constant.TwoByteIdRegistry}
 */
public final class lpt6__2 extends TwoByteIdRegistry {
    public static final lpt6__2 Q80;
    public static final lpt6__2 YG0;
    public static final bm0_1 If;
    public static final lpt6__2[] Qm;

    public lpt6__2(int i1) {
        super(i1);
    }

    public static lpt6__2 rI0(byte i0) {
        return (lpt6__2) If.BM(i0);
    }

    static {
        lpt6__2 l0 = new lpt6__2(0);
        Q80 = l0;
        lpt6__2 l1 = new lpt6__2(1);
        YG0 = l1;
        Qm = new lpt6__2[]{l0, l1};
        If = new bm0_1();
        lpt6__2[] clone = (lpt6__2[]) Qm.clone();
        for (lpt6__2 elem : clone) {
            If.gE0(elem.UB0, elem);
        }
        TwoByteIdRegistry.Q80 = l0;
        TwoByteIdRegistry.YG0 = l1;
        TwoByteIdRegistry.Qm = Qm;
        TwoByteIdRegistry.If = If;
    }
}
