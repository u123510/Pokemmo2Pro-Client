/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTMemoryObjectFD {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 38278;

    public EXTMemoryObjectFD() {
        throw new UnsupportedOperationException();
    }

    public static native void glImportMemoryFdEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint64") long var1, @NativeType(value="GLenum") int var3, @NativeType(value="GLint") int var4);

    static {
        GL.initialize();
    }
}

