/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVFramebufferBlit {
    public static final int GL_READ_FRAMEBUFFER_NV = 36008;
    public static final int GL_DRAW_FRAMEBUFFER_NV = 36009;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING_NV = 36006;
    public static final int GL_READ_FRAMEBUFFER_BINDING_NV = 36010;

    public NVFramebufferBlit() {
        throw new UnsupportedOperationException();
    }

    public static native void glBlitFramebufferNV(@NativeType(value="GLint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLint") int var6, @NativeType(value="GLint") int var7, @NativeType(value="GLbitfield") int var8, @NativeType(value="GLenum") int var9);

    static {
        GLES.initialize();
    }
}

