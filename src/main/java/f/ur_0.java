package f;

import cn.pokemmo.constant.TwoByteRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ur_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.TwoByteRegistry}
 */
public final class ur_0 extends TwoByteRegistry {
    public static final ur_0 YS;
    public static final ur_0[] sC0;

    public ur_0(byte i1) {
        super(i1);
    }

    public static ur_0 pv0(byte i0) {
        ur_0[] arr = sC0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            ur_0 v4 = arr[i];
            if (v4.yI == i0) {
                return v4;
            }
        }
        throw new RuntimeException(new StringBuilder().append((int) i0).append("").toString());
    }

    static {

        ur_0 u0 = new ur_0((byte) 0);
        YS = u0;
        ur_0 u1 = new ur_0((byte) 1);
        sC0 = (ur_0[]) new ur_0[]{u0, u1}.clone();
    
        TwoByteRegistry.YS = YS;
        TwoByteRegistry.sC0 = sC0;
    }
}
