/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTMultisampledRenderToTexture {
    public static final int GL_RENDERBUFFER_SAMPLES_EXT = 36011;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 36182;
    public static final int GL_MAX_SAMPLES_EXT = 36183;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_SAMPLES_EXT = 36204;

    public EXTMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    public static native void glRenderbufferStorageMultisampleEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4);

    public static native void glFramebufferTexture2DMultisampleEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLuint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLsizei") int var5);

    static {
        GLES.initialize();
    }
}

