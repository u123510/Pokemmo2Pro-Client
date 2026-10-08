/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL42C;
import org.lwjgl.system.NativeType;

public class ARBTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 37167;

    public ARBTextureStorage() {
        throw new UnsupportedOperationException();
    }

    public static void glTexStorage1D(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4) {
        GL42C.glTexStorage1D(n, n2, n3, n4);
    }

    public static void glTexStorage2D(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLsizei") int n5) {
        GL42C.glTexStorage2D(n, n2, n3, n4, n5);
    }

    public static void glTexStorage3D(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLsizei") int n5, @NativeType(value="GLsizei") int n6) {
        GL42C.glTexStorage3D(n, n2, n3, n4, n5, n6);
    }

    public static native void glTextureStorage1DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4);

    public static native void glTextureStorage2DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5);

    public static native void glTextureStorage3DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6);

    static {
        GL.initialize();
    }
}

