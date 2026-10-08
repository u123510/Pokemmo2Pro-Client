/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class ARBSparseBuffer {
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 1024;
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 33528;

    public ARBSparseBuffer() {
        throw new UnsupportedOperationException();
    }

    public static native void glBufferPageCommitmentARB(@NativeType(value="GLenum") int var0, @NativeType(value="GLintptr") long var1, @NativeType(value="GLsizeiptr") long var3, @NativeType(value="GLboolean") boolean var5);

    public static native void glNamedBufferPageCommitmentEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLintptr") long var1, @NativeType(value="GLsizeiptr") long var3, @NativeType(value="GLboolean") boolean var5);

    public static native void glNamedBufferPageCommitmentARB(@NativeType(value="GLuint") int var0, @NativeType(value="GLintptr") long var1, @NativeType(value="GLsizeiptr") long var3, @NativeType(value="GLboolean") boolean var5);

    static {
        GL.initialize();
    }
}

