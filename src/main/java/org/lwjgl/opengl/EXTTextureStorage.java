/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 37167;
    public static final int GL_ALPHA8_EXT = 32828;
    public static final int GL_LUMINANCE8_EXT = 32832;
    public static final int GL_LUMINANCE8_ALPHA8_EXT = 32837;
    public static final int GL_RGBA32F_EXT = 34836;
    public static final int GL_RGB32F_EXT = 34837;
    public static final int GL_ALPHA32F_EXT = 34838;
    public static final int GL_LUMINANCE32F_EXT = 34840;
    public static final int GL_LUMINANCE_ALPHA32F_EXT = 34841;
    public static final int GL_RGBA16F_EXT = 34842;
    public static final int GL_RGB16F_EXT = 34843;
    public static final int GL_ALPHA16F_EXT = 34844;
    public static final int GL_LUMINANCE16F_EXT = 34846;
    public static final int GL_LUMINANCE_ALPHA16F_EXT = 34847;
    public static final int GL_RGB10_A2_EXT = 32857;
    public static final int GL_RGB10_EXT = 32850;
    public static final int GL_BGRA8_EXT = 37793;
    public static final int GL_R8_EXT = 33321;
    public static final int GL_RG8_EXT = 33323;
    public static final int GL_R32F_EXT = 33326;
    public static final int GL_RG32F_EXT = 33328;
    public static final int GL_R16F_EXT = 33325;
    public static final int GL_RG16F_EXT = 33327;
    public static final int GL_RGB_RAW_422_APPLE = 35409;

    public EXTTextureStorage() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexStorage1DEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3);

    public static native void glTexStorage2DEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4);

    public static native void glTexStorage3DEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5);

    public static native void glTextureStorage1DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4);

    public static native void glTextureStorage2DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5);

    public static native void glTextureStorage3DEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLsizei") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6);

    static {
        GL.initialize();
    }
}

