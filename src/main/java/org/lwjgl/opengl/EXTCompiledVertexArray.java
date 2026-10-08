/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTCompiledVertexArray {
    public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 33192;
    public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 33193;

    public EXTCompiledVertexArray() {
        throw new UnsupportedOperationException();
    }

    public static native void glLockArraysEXT(@NativeType(value="GLint") int var0, @NativeType(value="GLsizei") int var1);

    public static native void glUnlockArraysEXT();

    static {
        GL.initialize();
    }
}

