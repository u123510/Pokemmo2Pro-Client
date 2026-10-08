/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVTextureMultisample {
    public static final int GL_TEXTURE_COVERAGE_SAMPLES_NV = 36933;
    public static final int GL_TEXTURE_COLOR_SAMPLES_NV = 36934;

    public NVTextureMultisample() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexImage2DMultisampleCoverageNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLboolean") boolean var6);

    public static native void glTexImage3DMultisampleCoverageNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLboolean") boolean var7);

    public static native void glTextureImage2DMultisampleNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLboolean") boolean var6);

    public static native void glTextureImage3DMultisampleNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLboolean") boolean var7);

    public static native void glTextureImage2DMultisampleCoverageNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLboolean") boolean var7);

    public static native void glTextureImage3DMultisampleCoverageNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLsizei") int var7, @NativeType(value="GLboolean") boolean var8);

    static {
        GL.initialize();
    }
}

