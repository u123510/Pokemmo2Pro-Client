/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class ANGLEFramebufferBlit {
    public static final int GL_READ_FRAMEBUFFER_ANGLE = 36008;
    public static final int GL_DRAW_FRAMEBUFFER_ANGLE = 36009;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING_ANGLE = 36006;
    public static final int GL_READ_FRAMEBUFFER_BINDING_ANGLE = 36010;

    public ANGLEFramebufferBlit() {
        throw new UnsupportedOperationException();
    }

    public static native void glBlitFramebufferANGLE(@NativeType(value="GLint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLint") int var6, @NativeType(value="GLint") int var7, @NativeType(value="GLbitfield") int var8, @NativeType(value="GLenum") int var9);

    static {
        GLES.initialize();
    }
}

