/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class ANGLEFramebufferMultisample {
    public static final int GL_RENDERBUFFER_SAMPLES_ANGLE = 36011;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE = 36182;
    public static final int GL_MAX_SAMPLES_ANGLE = 36183;

    public ANGLEFramebufferMultisample() {
        throw new UnsupportedOperationException();
    }

    public static native void glRenderbufferStorageMultisampleANGLE(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4);

    static {
        GLES.initialize();
    }
}

