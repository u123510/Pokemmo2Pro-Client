package f;

import cn.pokemmo.constant.ShopTabDescriptorRegistry;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.cr_0
 * 核心实现已迁移至 {@link cn.pokemmo.constant.ShopTabDescriptorRegistry}
 */
public final class cr_0 extends ShopTabDescriptorRegistry {
    public static final cr_0 u90;
    public static final cr_0 Lk0;
    public static final cr_0 l3;
    public static final cr_0 Xz0;
    public static final cr_0[] QD0;

    public static final bm0_1 i10;
    public cr_0(int var1, int var2, int var3, int var4, int var5, int var6) {
        super(var1, var2, var3, var4, var5, var6);
    }

    static {

        cr_0 var0 = new cr_0(0, 0, 1925, 1926, 1928, 1927);
        u90 = var0;
        cr_0 var1 = new cr_0(1, 1, 1939, 1940, 1941, 1942);
        Lk0 = var1;
        cr_0 var2 = new cr_0(2, 2, 1944, 1945, 1946, 1947);
        l3 = var2;
        cr_0 var3 = new cr_0(3, 3, 0, 0, 0, 1949);
        Xz0 = var3;
        cr_0[] var4 = new cr_0[]{var0, var1, var2, var3};
        QD0 = var4;
        i10 = new bm0_1();
        for (cr_0 var5 : (cr_0[]) var4.clone()) {
            i10.gE0(var5.az, var5);
        }
        ShopTabDescriptorRegistry.u90 = u90;
        ShopTabDescriptorRegistry.Lk0 = Lk0;
        ShopTabDescriptorRegistry.l3 = l3;
        ShopTabDescriptorRegistry.Xz0 = Xz0;
        ShopTabDescriptorRegistry.i10 = i10;
        ShopTabDescriptorRegistry.QD0 = QD0;
    }
}
