/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESDrawBuffersIndexed {
    public OESDrawBuffersIndexed() {
        throw new UnsupportedOperationException();
    }

    public static native void glEnableiOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glDisableiOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glBlendEquationiOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static native void glBlendEquationSeparateiOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2);

    public static native void glBlendFunciOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2);

    public static native void glBlendFuncSeparateiOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLenum") int var4);

    public static native void glColorMaskiOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLboolean") boolean var1, @NativeType(value="GLboolean") boolean var2, @NativeType(value="GLboolean") boolean var3, @NativeType(value="GLboolean") boolean var4);

    @NativeType(value="GLboolean")
    public static native boolean glIsEnablediOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    static {
        GLES.initialize();
    }
}

