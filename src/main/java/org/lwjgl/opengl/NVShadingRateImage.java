/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVShadingRateImage {
    public static final int GL_SHADING_RATE_IMAGE_NV = 38243;
    public static final int GL_SHADING_RATE_NO_INVOCATIONS_NV = 38244;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV = 38245;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 38246;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 38247;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 38248;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 38249;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 38250;
    public static final int GL_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 38251;
    public static final int GL_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV = 38252;
    public static final int GL_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV = 38253;
    public static final int GL_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV = 38254;
    public static final int GL_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV = 38255;
    public static final int GL_SHADING_RATE_IMAGE_BINDING_NV = 38235;
    public static final int GL_SHADING_RATE_IMAGE_TEXEL_WIDTH_NV = 38236;
    public static final int GL_SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV = 38237;
    public static final int GL_SHADING_RATE_IMAGE_PALETTE_SIZE_NV = 38238;
    public static final int GL_MAX_COARSE_FRAGMENT_SAMPLES_NV = 38239;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV = 38318;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV = 38319;
    public static final int GL_SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV = 38320;

    public NVShadingRateImage() {
        throw new UnsupportedOperationException();
    }

    public static native void glBindShadingRateImageNV(@NativeType(value="GLuint") int var0);

    public static native void nglShadingRateImagePaletteNV(int var0, int var1, int var2, long var3);

    public static void glShadingRateImagePaletteNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum const *") IntBuffer intBuffer) {
        int n3 = n;
        IntBuffer intBuffer2 = intBuffer;
        n = intBuffer2.remaining();
        long l = MemoryUtil.memAddress(intBuffer2);
        NVShadingRateImage.nglShadingRateImagePaletteNV(n3, n2, n, l);
    }

    public static native void nglGetShadingRateImagePaletteNV(int var0, int var1, long var2);

    public static void glGetShadingRateImagePaletteNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        NVShadingRateImage.nglGetShadingRateImagePaletteNV(n, n2, l);
    }

    public static native void glShadingRateImageBarrierNV(@NativeType(value="GLboolean") boolean var0);

    public static native void glShadingRateSampleOrderNV(@NativeType(value="GLenum") int var0);

    public static native void nglShadingRateSampleOrderCustomNV(int var0, int var1, long var2);

    public static void glShadingRateSampleOrderCustomNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint const *") IntBuffer intBuffer) {
        long l = MemoryUtil.memAddress(intBuffer);
        NVShadingRateImage.nglShadingRateSampleOrderCustomNV(n, n2, l);
    }

    public static native void nglGetShadingRateSampleLocationivNV(int var0, int var1, int var2, long var3);

    public static void glGetShadingRateSampleLocationivNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 3);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        NVShadingRateImage.nglGetShadingRateSampleLocationivNV(n, n2, n3, l);
    }

    public static void glShadingRateImagePaletteNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum const *") int[] nArray) {
        long l = GL.getICD().glShadingRateImagePaletteNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, nArray.length, nArray, l);
    }

    public static void glGetShadingRateImagePaletteNV(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLenum *") int[] nArray) {
        long l = GL.getICD().glGetShadingRateImagePaletteNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glShadingRateSampleOrderCustomNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLint const *") int[] nArray) {
        long l = GL.getICD().glShadingRateSampleOrderCustomNV;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetShadingRateSampleLocationivNV(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetShadingRateSampleLocationivNV;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 3);
        }
        JNI.callPV(n, n2, n3, nArray, l);
    }

    static {
        GL.initialize();
    }
}

