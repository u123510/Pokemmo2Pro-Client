/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class APPLEFramebufferMultisample {
    public static final int GL_RENDERBUFFER_SAMPLES_APPLE = 36011;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE = 36182;
    public static final int GL_MAX_SAMPLES_APPLE = 36183;
    public static final int GL_READ_FRAMEBUFFER_APPLE = 36008;
    public static final int GL_DRAW_FRAMEBUFFER_APPLE = 36009;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING_APPLE = 36006;
    public static final int GL_READ_FRAMEBUFFER_BINDING_APPLE = 36010;

    public APPLEFramebufferMultisample() {
        throw new UnsupportedOperationException();
    }

    public static native void glRenderbufferStorageMultisampleAPPLE(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4);

    public static native void glResolveMultisampleFramebufferAPPLE();

    static {
        GLES.initialize();
    }
}

