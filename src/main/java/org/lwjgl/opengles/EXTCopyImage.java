/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTCopyImage {
    public EXTCopyImage() {
        throw new UnsupportedOperationException();
    }

    public static native void glCopyImageSubDataEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLuint") int var6, @NativeType(value="GLenum") int var7, @NativeType(value="GLint") int var8, @NativeType(value="GLint") int var9, @NativeType(value="GLint") int var10, @NativeType(value="GLint") int var11, @NativeType(value="GLsizei") int var12, @NativeType(value="GLsizei") int var13, @NativeType(value="GLsizei") int var14);

    static {
        GLES.initialize();
    }
}

