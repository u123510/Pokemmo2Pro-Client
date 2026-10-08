package f;

import cn.pokemmo.graphics.render.TextRenderingGlyphMetrics;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.zp_0
 * 核心实现已迁移至 {@link cn.pokemmo.graphics.render.TextRenderingGlyphMetrics}
 */
public final class zp_0 extends TextRenderingGlyphMetrics {
    public static final boolean[] Wk;
    public static final boolean[] rx;
    public static final bm0_1 PY;
    public static final zp_0[] EO;

    public zp_0(byte key, int value) {
        super(key, value);
    }

    static {
        zp_0 v0 = new zp_0((byte) 0, 0);
        zp_0 v1 = new zp_0((byte) 1, 1);
        zp_0 v2 = new zp_0((byte) 2, 2);
        zp_0 v3 = new zp_0((byte) 3, 3);
        zp_0 v4 = new zp_0((byte) 4, 4);
        zp_0 v5 = new zp_0((byte) 5, 5);
        zp_0 v6 = new zp_0((byte) 6, 6);
        zp_0 v7 = new zp_0((byte) 7, 7);
        zp_0 v8 = new zp_0((byte) 8, 8);
        zp_0 v9 = new zp_0((byte) 9, 9);
        zp_0 v10 = new zp_0((byte) 10, 10);
        zp_0 v11 = new zp_0((byte) 12, 11);
        zp_0 v12 = new zp_0((byte) 13, 12);
        zp_0 v13 = new zp_0((byte) 14, 13);
        zp_0 v14 = new zp_0((byte) 15, 14);
        zp_0 v15 = new zp_0((byte) 16, 15);
        zp_0 v16 = new zp_0((byte) 17, 16);
        zp_0 v17 = new zp_0((byte) 18, 17);
        zp_0 v18 = new zp_0((byte) 19, 18);
        zp_0 v19 = new zp_0((byte) 20, 19);
        zp_0 v20 = new zp_0((byte) 21, 20);
        zp_0 v21 = new zp_0((byte) 22, 21);
        EO = new zp_0[]{v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10,
                v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21};
        Wk = new boolean[]{false, false, true, false, false, false, false, false, false, true};
        rx = new boolean[]{true, true, true, false, false, false, true, false};
        PY = new bm0_1();
        for (zp_0 value : EO) {
            PY.gE0(value.Br, value);
        }

        TextRenderingGlyphMetrics.EO = EO;
        TextRenderingGlyphMetrics.Wk = Wk;
        TextRenderingGlyphMetrics.rx = rx;
        TextRenderingGlyphMetrics.PY = PY;
    }
}
