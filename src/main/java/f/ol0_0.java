package f;

import cn.pokemmo.constant.ColorChannelFormatRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ol0_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.ColorChannelFormatRegistry}
 */
public final class ol0_0 extends ColorChannelFormatRegistry {
    public static final ol0_0 Wd0;
    public static final ol0_0 Jk0;
    public static final ol0_0 wi;
    public static final ol0_0 lA0;
    public static final ol0_0[] L60;

    public ol0_0(int i1, byte i2, byte i3, int i4) {
        super(i1, i2, i3, i4);
    }

    static {

        ol0_0 v0 = new ol0_0(0, (byte) 1, (byte) 8, 64);
        ol0_0 v1 = new ol0_0(1, (byte) 2, (byte) 2, 8);
        Wd0 = v1;
        ol0_0 v2 = new ol0_0(2, (byte) 3, (byte) 4, 32);
        Jk0 = v2;
        ol0_0 v3 = new ol0_0(3, (byte) 4, (byte) 8, 512);
        ol0_0 v4 = new ol0_0(4, (byte) 5, (byte) 2, 512);
        wi = v4;
        ol0_0 v5 = new ol0_0(5, (byte) 6, (byte) 8, 16);
        ol0_0 v6 = new ol0_0(6, (byte) 7, (byte) 16, 0);
        lA0 = v6;
        L60 = new ol0_0[] { v0, v1, v2, v3, v4, v5, v6 };
    
        ColorChannelFormatRegistry.Wd0 = Wd0;
        ColorChannelFormatRegistry.Jk0 = Jk0;
        ColorChannelFormatRegistry.wi = wi;
        ColorChannelFormatRegistry.lA0 = lA0;
        ColorChannelFormatRegistry.L60 = L60;
    }
}
