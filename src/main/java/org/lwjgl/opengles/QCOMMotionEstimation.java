/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class QCOMMotionEstimation {
    public static final int GL_MOTION_ESTIMATION_SEARCH_BLOCK_X_QCOM = 35984;
    public static final int GL_MOTION_ESTIMATION_SEARCH_BLOCK_Y_QCOM = 35985;

    public QCOMMotionEstimation() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexEstimateMotionQCOM(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2);

    public static native void glTexEstimateMotionRegionsQCOM(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLuint") int var3);

    static {
        GLES.initialize();
    }
}

