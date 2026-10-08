/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTBlendMinmax {
    public static final int GL_FUNC_ADD_EXT = 32774;
    public static final int GL_MIN_EXT = 32775;
    public static final int GL_MAX_EXT = 32776;
    public static final int GL_BLEND_EQUATION_EXT = 32777;

    public EXTBlendMinmax() {
        throw new UnsupportedOperationException();
    }

    public static native void glBlendEquationEXT(@NativeType(value="GLenum") int var0);

    static {
        GL.initialize();
    }
}

