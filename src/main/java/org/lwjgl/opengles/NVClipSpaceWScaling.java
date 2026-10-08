/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVClipSpaceWScaling {
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 37756;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF = 37757;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF = 37758;

    public NVClipSpaceWScaling() {
        throw new UnsupportedOperationException();
    }

    public static native void glViewportPositionWScaleNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2);

    static {
        GLES.initialize();
    }
}

