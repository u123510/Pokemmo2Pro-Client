/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVCopyBuffer {
    public static final int GL_COPY_READ_BUFFER_NV = 36662;
    public static final int GL_COPY_WRITE_BUFFER_NV = 36663;

    public NVCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    public static native void glCopyBufferSubDataNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLintptr") long var2, @NativeType(value="GLintptr") long var4, @NativeType(value="GLsizeiptr") long var6);

    static {
        GLES.initialize();
    }
}

