package f;

import cn.pokemmo.constant.SevenByteOffsetRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.xj_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.SevenByteOffsetRegistry}
 */
public final class xj_0 extends SevenByteOffsetRegistry {
    public static final xj_0 Jr;
    public static final xj_0 HH0;
    public static final xj_0 oG;
    public static final SQ yz0;
    public static final xj_0[] Su0;

    public xj_0(int i1, int i2, int i3) {
        super(i1, i2, i3);
    }

    static {

        xj_0 v0 = new xj_0(0, 0, 2150);
        Jr = v0;
        xj_0 v1 = new xj_0(1, 1, 2151);
        HH0 = v1;
        xj_0 v2 = new xj_0(2, 2, 2152);
        xj_0 v3 = new xj_0(3, 3, 2153);
        xj_0 v4 = new xj_0(4, 4, 2154);
        xj_0 v5 = new xj_0(5, 5, 2155);
        xj_0 v6 = new xj_0(6, 6, 2156);
        oG = v6;

        xj_0[] arr = new xj_0[]{v0, v1, v2, v3, v4, v5, v6};
        Su0 = arr;

        xj_0[] clone = (xj_0[]) arr.clone();
        yz0 = new SQ();
        for (xj_0 item : clone) {
            yz0.j10(yz0.yw0(item.YD), item);
        }
    
        SevenByteOffsetRegistry.Jr = Jr;
        SevenByteOffsetRegistry.HH0 = HH0;
        SevenByteOffsetRegistry.oG = oG;
        SevenByteOffsetRegistry.yz0 = yz0;
        SevenByteOffsetRegistry.Su0 = Su0;
    }
}
