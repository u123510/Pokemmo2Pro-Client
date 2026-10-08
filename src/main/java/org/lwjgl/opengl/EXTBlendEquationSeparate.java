/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTBlendEquationSeparate {
    public static final int GL_BLEND_EQUATION_RGB_EXT = 32777;
    public static final int GL_BLEND_EQUATION_ALPHA_EXT = 34877;

    public EXTBlendEquationSeparate() {
        throw new UnsupportedOperationException();
    }

    public static native void glBlendEquationSeparateEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1);

    static {
        GL.initialize();
    }
}

