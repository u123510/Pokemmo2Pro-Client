/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class ARBDrawBuffersBlend {
    public ARBDrawBuffersBlend() {
        throw new UnsupportedOperationException();
    }

    public static native void glBlendEquationiARB(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static native void glBlendEquationSeparateiARB(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2);

    public static native void glBlendFunciARB(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2);

    public static native void glBlendFuncSeparateiARB(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLenum") int var4);

    static {
        GL.initialize();
    }
}

