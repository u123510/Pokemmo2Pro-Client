/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.stb;

import org.lwjgl.stb.LibSTB;
import org.lwjgl.system.NativeType;

public class STBPerlin {
    public STBPerlin() {
        throw new UnsupportedOperationException();
    }

    public static native float stb_perlin_noise3(float var0, float var1, float var2, int var3, int var4, int var5);

    public static native float stb_perlin_noise3_seed(float var0, float var1, float var2, int var3, int var4, int var5, int var6);

    public static native float stb_perlin_ridge_noise3(float var0, float var1, float var2, float var3, float var4, float var5, int var6);

    public static native float stb_perlin_fbm_noise3(float var0, float var1, float var2, float var3, float var4, int var5);

    public static native float stb_perlin_turbulence_noise3(float var0, float var1, float var2, float var3, float var4, int var5);

    public static native float stb_perlin_noise3_wrap_nonpow2(float var0, float var1, float var2, int var3, int var4, int var5, @NativeType(value="unsigned char") byte var6);

    static {
        LibSTB.initialize();
    }
}

