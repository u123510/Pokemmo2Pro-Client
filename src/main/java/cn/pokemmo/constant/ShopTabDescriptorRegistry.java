package cn.pokemmo.constant;

import f.bm0_1;

public class ShopTabDescriptorRegistry {
    public static ShopTabDescriptorRegistry u90;
    public static ShopTabDescriptorRegistry Lk0;
    public static ShopTabDescriptorRegistry l3;
    public static ShopTabDescriptorRegistry Xz0;
    public static bm0_1 i10;
    public static ShopTabDescriptorRegistry[] QD0;
    public final byte az;
    public final int sQ;
    public final int Iy;
    public final int V1;
    public final int nn;
    public final int MM;

    public ShopTabDescriptorRegistry(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.MM = var6;
        this.az = (byte) var1;
        this.sQ = var2;
        this.Iy = var3;
        this.V1 = var4;
        this.nn = var5;
    }

        static {
        if (f.cr_0.u90 == null) {
            try {
                Class.forName(f.cr_0.class.getName());
            } catch (Throwable ignored) {}
        }
    }
}
