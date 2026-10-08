/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESTextureStorageMultisample2DArray {
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY_OES = 37122;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY_OES = 37125;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = 37131;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = 37132;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY_OES = 37133;

    public OESTextureStorageMultisample2DArray() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexStorage3DMultisampleOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLsizei") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLsizei") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLboolean") boolean var6);

    static {
        GLES.initialize();
    }
}

