package f;

import cn.pokemmo.constant.SixByteIdRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.oc_2
 * 核心实现已迁移至 {@link cn.pokemmo.constant.SixByteIdRegistry}
 */
public final class oc_2 extends SixByteIdRegistry {
    public static final oc_2 y70;
    public static final oc_2 TF;
    public static final oc_2 UJ;
    public static final oc_2 Yn;
    public static final oc_2 w80;
    public static final oc_2 pK;
    public static final bm0_1 CL0;
    public static final oc_2[] Ge;

    public oc_2(int i1, int i2) {
        super(i1, i2);
    }

    static {

        oc_2 v0 = new oc_2(0, 0);
        y70 = v0;
        oc_2 v1 = new oc_2(1, 1);
        TF = v1;
        oc_2 v2 = new oc_2(2, 2);
        UJ = v2;
        oc_2 v3 = new oc_2(3, 3);
        Yn = v3;
        oc_2 v4 = new oc_2(4, 4);
        w80 = v4;
        oc_2 v5 = new oc_2(5, 10);
        pK = v5;

        oc_2[] arr = new oc_2[]{v0, v1, v2, v3, v4, v5};
        Ge = arr;
        CL0 = new bm0_1();
        for (oc_2 item : (oc_2[]) arr.clone()) {
            CL0.gE0(item.ld0, item);
        }
    
        SixByteIdRegistry.y70 = y70;
        SixByteIdRegistry.TF = TF;
        SixByteIdRegistry.UJ = UJ;
        SixByteIdRegistry.Yn = Yn;
        SixByteIdRegistry.w80 = w80;
        SixByteIdRegistry.pK = pK;
        SixByteIdRegistry.CL0 = CL0;
        SixByteIdRegistry.Ge = Ge;
    }
}
