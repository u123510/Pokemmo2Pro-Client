package f;

import cn.pokemmo.constant.SevenByteIdRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.gw0_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.SevenByteIdRegistry}
 */
public final class gw0_0 extends SevenByteIdRegistry {
    public static final gw0_0 cZ;
    public static final gw0_0 U4;
    public static final gw0_0 sm0;
    public static final gw0_0 cOm9;
    public static final gw0_0 lV;
    public static final gw0_0 vz;
    public static final bm0_1 S0;
    public static final gw0_0[] oH;

    public gw0_0(byte i1, int i2) {
        super(i1, i2);
    }

    static {

        gw0_0 v0 = new gw0_0((byte) 0, 0);
        cZ = v0;
        gw0_0 v1 = new gw0_0((byte) 1, 1);
        U4 = v1;
        gw0_0 v2 = new gw0_0((byte) 2, 2);
        sm0 = v2;
        gw0_0 v3 = new gw0_0((byte) 3, 3);
        cOm9 = v3;
        gw0_0 v4 = new gw0_0((byte) 4, 4);
        lV = v4;
        gw0_0 v5 = new gw0_0((byte) 5, 5);
        vz = v5;
        gw0_0 v6 = new gw0_0((byte) 6, 6);

        gw0_0[] arr = new gw0_0[]{v0, v1, v2, v3, v4, v5, v6};
        oH = arr;

        gw0_0[] clone = (gw0_0[]) arr.clone();
        S0 = new bm0_1();
        for (gw0_0 item : clone) {
            S0.gE0(item.Dz, item);
        }
    
        SevenByteIdRegistry.cZ = cZ;
        SevenByteIdRegistry.U4 = U4;
        SevenByteIdRegistry.sm0 = sm0;
        SevenByteIdRegistry.cOm9 = cOm9;
        SevenByteIdRegistry.lV = lV;
        SevenByteIdRegistry.vz = vz;
        SevenByteIdRegistry.S0 = S0;
        SevenByteIdRegistry.oH = oH;
    }
}
