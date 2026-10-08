/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVDepthBufferFloat {
    public static final int GL_DEPTH_COMPONENT32F_NV = 36267;
    public static final int GL_DEPTH32F_STENCIL8_NV = 36268;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 36269;
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 36271;

    public NVDepthBufferFloat() {
        throw new UnsupportedOperationException();
    }

    public static native void glDepthRangedNV(@NativeType(value="GLdouble") double var0, @NativeType(value="GLdouble") double var2);

    public static native void glClearDepthdNV(@NativeType(value="GLdouble") double var0);

    public static native void glDepthBoundsdNV(@NativeType(value="GLdouble") double var0, @NativeType(value="GLdouble") double var2);

    static {
        GL.initialize();
    }
}

