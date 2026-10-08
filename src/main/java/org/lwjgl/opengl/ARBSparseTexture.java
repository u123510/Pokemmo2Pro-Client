/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class ARBSparseTexture {
    public static final int GL_TEXTURE_SPARSE_ARB = 37286;
    public static final int GL_VIRTUAL_PAGE_SIZE_INDEX_ARB = 37287;
    public static final int GL_NUM_SPARSE_LEVELS_ARB = 37290;
    public static final int GL_NUM_VIRTUAL_PAGE_SIZES_ARB = 37288;
    public static final int GL_VIRTUAL_PAGE_SIZE_X_ARB = 37269;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_ARB = 37270;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_ARB = 37271;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_ARB = 37272;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB = 37273;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB = 37274;
    public static final int GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB = 37289;

    public ARBSparseTexture() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexPageCommitmentARB(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLsizei") int var7, @NativeType(value="GLboolean") boolean var8);

    public static native void glTexturePageCommitmentEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLsizei") int var7, @NativeType(value="GLboolean") boolean var8);

    static {
        GL.initialize();
    }
}

