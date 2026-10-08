/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class ARBColorBufferFloat {
    public static final int GL_RGBA_FLOAT_MODE_ARB = 34848;
    public static final int GL_CLAMP_VERTEX_COLOR_ARB = 35098;
    public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = 35099;
    public static final int GL_CLAMP_READ_COLOR_ARB = 35100;
    public static final int GL_FIXED_ONLY_ARB = 35101;

    public ARBColorBufferFloat() {
        throw new UnsupportedOperationException();
    }

    public static native void glClampColorARB(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1);

    static {
        GL.initialize();
    }
}

