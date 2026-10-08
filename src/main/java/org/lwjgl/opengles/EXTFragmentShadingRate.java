/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTFragmentShadingRate {
    public static final int GL_SHADING_RATE_ATTACHMENT_EXT = 38609;
    public static final int GL_SHADING_RATE_1X1_PIXELS_EXT = 38566;
    public static final int GL_SHADING_RATE_1X2_PIXELS_EXT = 38567;
    public static final int GL_SHADING_RATE_1X4_PIXELS_EXT = 38570;
    public static final int GL_SHADING_RATE_2X1_PIXELS_EXT = 38568;
    public static final int GL_SHADING_RATE_2X2_PIXELS_EXT = 38569;
    public static final int GL_SHADING_RATE_2X4_PIXELS_EXT = 38573;
    public static final int GL_SHADING_RATE_4X1_PIXELS_EXT = 38571;
    public static final int GL_SHADING_RATE_4X2_PIXELS_EXT = 38572;
    public static final int GL_SHADING_RATE_4X4_PIXELS_EXT = 38574;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_EXT = 38610;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_EXT = 38611;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_EXT = 38612;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_EXT = 38613;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_EXT = 38614;
    public static final int GL_SHADING_RATE_EXT = 38608;
    public static final int GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT = 38615;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT = 38616;
    public static final int GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT = 38617;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT = 38618;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_ASPECT_RATIO_EXT = 38619;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_LAYERS_EXT = 38620;
    public static final int GL_FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_SUPPORTED_EXT = 38621;
    public static final int GL_FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_SUPPORTED_EXT = 38622;
    public static final int GL_FRAGMENT_SHADING_RATE_ATTACHMENT_WITH_DEFAULT_FRAMEBUFFER_SUPPORTED_EXT = 38623;
    public static final int GL_FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINERS_SUPPORTED_EXT = 36719;

    public EXTFragmentShadingRate() {
        throw new UnsupportedOperationException();
    }

    public static native void glShadingRateEXT(@NativeType(value="GLenum") int var0);

    public static native void glShadingRateCombinerOpsEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1);

    public static native void glFramebufferShadingRateEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6);

    public static native void nglGetFragmentShadingRatesEXT(int var0, int var1, long var2, long var4);

    public static void glGetFragmentShadingRatesEXT(@NativeType(value="GLsizei") int n, @NativeType(value="GLsizei *") IntBuffer intBuffer, @NativeType(value="GLenum *") IntBuffer intBuffer2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        int n2 = n;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer);
        long l2 = MemoryUtil.memAddress(intBuffer2);
        EXTFragmentShadingRate.nglGetFragmentShadingRatesEXT(n2, n, l, l2);
    }

    public static void glGetFragmentShadingRatesEXT(@NativeType(value="GLsizei") int n, @NativeType(value="GLsizei *") int[] nArray, @NativeType(value="GLenum *") int[] nArray2) {
        long l = GLES.getICD().glGetFragmentShadingRatesEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPPV(n, nArray2.length, nArray, nArray2, l);
    }

    static {
        GLES.initialize();
    }
}

