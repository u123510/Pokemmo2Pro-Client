/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVMemoryObjectSparse {
    public NVMemoryObjectSparse() {
        throw new UnsupportedOperationException();
    }

    public static native void glBufferPageCommitmentMemNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLintptr") long var1, @NativeType(value="GLsizeiptr") long var3, @NativeType(value="GLuint") int var5, @NativeType(value="GLuint64") long var6, @NativeType(value="GLboolean") boolean var8);

    public static native void glNamedBufferPageCommitmentMemNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLintptr") long var1, @NativeType(value="GLsizeiptr") long var3, @NativeType(value="GLuint") int var5, @NativeType(value="GLuint64") long var6, @NativeType(value="GLboolean") boolean var8);

    public static native void glTexPageCommitmentMemNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLsizei") int var7, @NativeType(value="GLsizei") int var8, @NativeType(value="GLuint") int var9, @NativeType(value="GLuint64") long var10, @NativeType(value="GLboolean") boolean var12);

    public static native void glTexturePageCommitmentMemNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLsizei") int var7, @NativeType(value="GLsizei") int var8, @NativeType(value="GLuint") int var9, @NativeType(value="GLuint64") long var10, @NativeType(value="GLboolean") boolean var12);

    static {
        GLES.initialize();
    }
}

