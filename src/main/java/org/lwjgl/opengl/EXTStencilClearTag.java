/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTStencilClearTag {
    public static final int GL_STENCIL_TAG_BITS_EXT = 35058;
    public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = 35059;

    public EXTStencilClearTag() {
        throw new UnsupportedOperationException();
    }

    public static native void glStencilClearTagEXT(@NativeType(value="GLsizei") int var0, @NativeType(value="GLuint") int var1);

    static {
        GL.initialize();
    }
}

