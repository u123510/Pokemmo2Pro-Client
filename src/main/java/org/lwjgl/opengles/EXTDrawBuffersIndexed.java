/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTDrawBuffersIndexed {
    public EXTDrawBuffersIndexed() {
        throw new UnsupportedOperationException();
    }

    public static native void glEnableiEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glDisableiEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glBlendEquationiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static native void glBlendEquationSeparateiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2);

    public static native void glBlendFunciEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2);

    public static native void glBlendFuncSeparateiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLenum") int var4);

    public static native void glColorMaskiEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLboolean") boolean var1, @NativeType(value="GLboolean") boolean var2, @NativeType(value="GLboolean") boolean var3, @NativeType(value="GLboolean") boolean var4);

    @NativeType(value="GLboolean")
    public static native boolean glIsEnablediEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    static {
        GLES.initialize();
    }
}

