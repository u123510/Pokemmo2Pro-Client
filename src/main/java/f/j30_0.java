package f;

import cn.pokemmo.constant.FourByteByteRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.j30_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.FourByteByteRegistry}
 */
public final class j30_0 extends FourByteByteRegistry {
    public static final j30_0 Hi;
    public static final j30_0 Z;
    public static final j30_0 th0;
    public static final j30_0 ee0;
    public static final bm0_1 v7;
    public static final j30_0[] Wg0;

    public j30_0(int i1, byte i2) {
        super(i1, i2);
    }

    static {

        j30_0 j0 = new j30_0(0, (byte) -1);
        Hi = j0;
        j30_0 j1 = new j30_0(1, (byte) 0);
        Z = j1;
        j30_0 j2 = new j30_0(2, (byte) 1);
        th0 = j2;
        j30_0 j3 = new j30_0(3, (byte) 2);
        ee0 = j3;
        Wg0 = new j30_0[]{j0, j1, j2, j3};
        j30_0[] clone = (j30_0[]) Wg0.clone();
        v7 = new bm0_1();
        for (j30_0 elem : clone) {
            v7.gE0(elem.pU, elem);
        }
    
        FourByteByteRegistry.Hi = Hi;
        FourByteByteRegistry.Z = Z;
        FourByteByteRegistry.th0 = th0;
        FourByteByteRegistry.ee0 = ee0;
        FourByteByteRegistry.v7 = v7;
        FourByteByteRegistry.Wg0 = Wg0;
    }
}
