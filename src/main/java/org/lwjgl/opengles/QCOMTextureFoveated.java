/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class QCOMTextureFoveated {
    public static final int GL_TEXTURE_FOVEATED_FEATURE_BITS_QCOM = 35835;
    public static final int GL_TEXTURE_FOVEATED_MIN_PIXEL_DENSITY_QCOM = 35836;
    public static final int GL_TEXTURE_FOVEATED_FEATURE_QUERY_QCOM = 35837;
    public static final int GL_TEXTURE_FOVEATED_NUM_FOCAL_POINTS_QUERY_QCOM = 35838;
    public static final int GL_FOVEATION_ENABLE_BIT_QCOM = 1;
    public static final int GL_FOVEATION_SCALED_BIN_METHOD_BIT_QCOM = 2;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_FOVEATION_QCOM = 35839;

    public QCOMTextureFoveated() {
        throw new UnsupportedOperationException();
    }

    public static native void glTextureFoveationParametersQCOM(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, float var3, float var4, float var5, float var6, float var7);

    static {
        GLES.initialize();
    }
}

