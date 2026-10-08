/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVConservativeRaster {
    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 37702;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV = 37703;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV = 37704;
    public static final int GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 37705;

    public NVConservativeRaster() {
        throw new UnsupportedOperationException();
    }

    public static native void glSubpixelPrecisionBiasNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1);

    static {
        GLES.initialize();
    }
}

