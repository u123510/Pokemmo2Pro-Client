package f;

import cn.pokemmo.graphics.image.TexturePaletteColorTransformer;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.lpt6__1
 * 核心实现已迁移至 {@link cn.pokemmo.graphics.image.TexturePaletteColorTransformer}
 */
public final class lpt6__1 extends TexturePaletteColorTransformer {
    public static final lpt6__1[] N0;
    public static final SQ kx0;
    public static final lpt6__1[] xh;

    public lpt6__1(int key, int value) {
        super(key, value);
    }

    static {
        lpt6__1 v0 = new lpt6__1(0, 0);
        lpt6__1 v1 = new lpt6__1(1, 1);
        lpt6__1 v2 = new lpt6__1(2, 2);
        lpt6__1 v3 = new lpt6__1(3, 3);
        lpt6__1 v4 = new lpt6__1(4, 4);
        lpt6__1 v5 = new lpt6__1(5, 5);
        lpt6__1 v6 = new lpt6__1(6, 6);
        lpt6__1 v7 = new lpt6__1(7, 7);
        lpt6__1 v8 = new lpt6__1(8, 8);
        lpt6__1 v9 = new lpt6__1(9, 9);
        lpt6__1 v10 = new lpt6__1(10, 10);
        lpt6__1 v11 = new lpt6__1(11, 11);
        xh = new lpt6__1[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11};
        kx0 = new SQ();
        N0 = xh.clone();
        for (lpt6__1 value : N0) {
            kx0.j10(kx0.yw0(value.jK0), value);
        }

        TexturePaletteColorTransformer.xh = xh;
        TexturePaletteColorTransformer.kx0 = kx0;
        TexturePaletteColorTransformer.N0 = N0;
    }
}
