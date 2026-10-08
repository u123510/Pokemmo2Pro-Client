/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class IMGMultisampledRenderToTexture {
    public static final int GL_RENDERBUFFER_SAMPLES_IMG = 37171;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG = 37172;
    public static final int GL_MAX_SAMPLES_IMG = 37173;
    public static final int GL_TEXTURE_SAMPLES_IMG = 37174;

    public IMGMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    public static native void glRenderbufferStorageMultisampleIMG(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4);

    public static native void glFramebufferTexture2DMultisampleIMG(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLuint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLsizei") int var5);

    static {
        GLES.initialize();
    }
}

