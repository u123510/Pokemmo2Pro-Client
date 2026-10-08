/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class QCOMTiledRendering {
    public static final int GL_COLOR_BUFFER_BIT0_QCOM = 1;
    public static final int GL_COLOR_BUFFER_BIT1_QCOM = 2;
    public static final int GL_COLOR_BUFFER_BIT2_QCOM = 4;
    public static final int GL_COLOR_BUFFER_BIT3_QCOM = 8;
    public static final int GL_COLOR_BUFFER_BIT4_QCOM = 16;
    public static final int GL_COLOR_BUFFER_BIT5_QCOM = 32;
    public static final int GL_COLOR_BUFFER_BIT6_QCOM = 64;
    public static final int GL_COLOR_BUFFER_BIT7_QCOM = 128;
    public static final int GL_DEPTH_BUFFER_BIT0_QCOM = 256;
    public static final int GL_DEPTH_BUFFER_BIT1_QCOM = 512;
    public static final int GL_DEPTH_BUFFER_BIT2_QCOM = 1024;
    public static final int GL_DEPTH_BUFFER_BIT3_QCOM = 2048;
    public static final int GL_DEPTH_BUFFER_BIT4_QCOM = 4096;
    public static final int GL_DEPTH_BUFFER_BIT5_QCOM = 8192;
    public static final int GL_DEPTH_BUFFER_BIT6_QCOM = 16384;
    public static final int GL_DEPTH_BUFFER_BIT7_QCOM = 32768;
    public static final int GL_STENCIL_BUFFER_BIT0_QCOM = 65536;
    public static final int GL_STENCIL_BUFFER_BIT1_QCOM = 131072;
    public static final int GL_STENCIL_BUFFER_BIT2_QCOM = 262144;
    public static final int GL_STENCIL_BUFFER_BIT3_QCOM = 524288;
    public static final int GL_STENCIL_BUFFER_BIT4_QCOM = 0x100000;
    public static final int GL_STENCIL_BUFFER_BIT5_QCOM = 0x200000;
    public static final int GL_STENCIL_BUFFER_BIT6_QCOM = 0x400000;
    public static final int GL_STENCIL_BUFFER_BIT7_QCOM = 0x800000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT0_QCOM = 0x1000000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT1_QCOM = 0x2000000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT2_QCOM = 0x4000000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT3_QCOM = 0x8000000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT4_QCOM = 0x10000000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT5_QCOM = 0x20000000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT6_QCOM = 0x40000000;
    public static final int GL_MULTISAMPLE_BUFFER_BIT7_QCOM = Integer.MIN_VALUE;

    public QCOMTiledRendering() {
        throw new UnsupportedOperationException();
    }

    public static native void glStartTilingQCOM(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLuint") int var3, @NativeType(value="GLbitfield") int var4);

    public static native void glEndTilingQCOM(@NativeType(value="GLbitfield") int var0);

    static {
        GLES.initialize();
    }
}

