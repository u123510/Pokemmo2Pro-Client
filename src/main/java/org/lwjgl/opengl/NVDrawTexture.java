/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVDrawTexture {
    public NVDrawTexture() {
        throw new UnsupportedOperationException();
    }

    public static native void glDrawTextureNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLfloat") float var2, @NativeType(value="GLfloat") float var3, @NativeType(value="GLfloat") float var4, @NativeType(value="GLfloat") float var5, @NativeType(value="GLfloat") float var6, @NativeType(value="GLfloat") float var7, @NativeType(value="GLfloat") float var8, @NativeType(value="GLfloat") float var9, @NativeType(value="GLfloat") float var10);

    static {
        GL.initialize();
    }
}

