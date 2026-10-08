/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class IMGFramebufferDownsample {
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_AND_DOWNSAMPLE_IMG = 37180;
    public static final int GL_NUM_DOWNSAMPLE_SCALES_IMG = 37181;
    public static final int GL_DOWNSAMPLE_SCALES_IMG = 37182;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_SCALE_IMG = 37183;

    public IMGFramebufferDownsample() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferTexture2DDownsampleIMG(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLuint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLint") int var6);

    public static native void glFramebufferTextureLayerDownsampleIMG(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLint") int var6);

    static {
        GLES.initialize();
    }
}

