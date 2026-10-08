/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTSparseTexture {
    public static final int GL_TEXTURE_SPARSE_EXT = 37286;
    public static final int GL_VIRTUAL_PAGE_SIZE_INDEX_EXT = 37287;
    public static final int GL_NUM_SPARSE_LEVELS_EXT = 37290;
    public static final int GL_NUM_VIRTUAL_PAGE_SIZES_EXT = 37288;
    public static final int GL_VIRTUAL_PAGE_SIZE_X_EXT = 37269;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_EXT = 37270;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_EXT = 37271;
    public static final int GL_TEXTURE_2D = 3553;
    public static final int GL_TEXTURE_2D_ARRAY = 35866;
    public static final int GL_TEXTURE_CUBE_MAP = 34067;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY_OES = 36873;
    public static final int GL_TEXTURE_3D = 32879;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_EXT = 37272;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_EXT = 37273;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_EXT = 37274;
    public static final int GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_EXT = 37289;

    public EXTSparseTexture() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexPageCommitmentARB(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLint") int var4, @NativeType(value="GLsizei") int var5, @NativeType(value="GLsizei") int var6, @NativeType(value="GLsizei") int var7, @NativeType(value="GLboolean") boolean var8);

    static {
        GLES.initialize();
    }
}

