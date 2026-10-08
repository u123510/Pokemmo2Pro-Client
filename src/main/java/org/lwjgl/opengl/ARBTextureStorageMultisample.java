/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.system.NativeType;

public class ARBTextureStorageMultisample {
    public ARBTextureStorageMultisample() {
        throw new UnsupportedOperationException();
    }

    public static void glTexStorage2DMultisample(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLsizei") int n5, @NativeType(value="GLboolean") boolean bl) {
        GL43C.glTexStorage2DMultisample(n, n2, n3, n4, n5, bl);
    }

    public static void glTexStorage3DMultisample(@NativeType(value="GLenum") int n, @NativeType(value="GLsizei") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLsizei") int n4, @NativeType(value="GLsizei") int n5, @NativeType(value="GLsizei") int n6, @NativeType(value="GLboolean") boolean bl) {
        GL43C.glTexStorage3DMultisample(n, n2, n3, n4, n5, n6, bl);
    }

    public static native void glTextureStorage2DMultisampleEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLboolean") boolean var6);

    public static native void glTextureStorage3DMultisampleEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLboolean") boolean var7);

    static {
        GL.initialize();
    }
}

