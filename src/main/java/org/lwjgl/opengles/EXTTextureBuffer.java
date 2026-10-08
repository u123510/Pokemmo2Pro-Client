/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTTextureBuffer {
    public static final int GL_TEXTURE_BUFFER_EXT = 35882;
    public static final int GL_TEXTURE_BUFFER_BINDING_EXT = 35882;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 35883;
    public static final int GL_TEXTURE_BINDING_BUFFER_EXT = 35884;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT_EXT = 37279;
    public static final int GL_SAMPLER_BUFFER_EXT = 36290;
    public static final int GL_INT_SAMPLER_BUFFER_EXT = 36304;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 36312;
    public static final int GL_IMAGE_BUFFER_EXT = 36945;
    public static final int GL_INT_IMAGE_BUFFER_EXT = 36956;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER_EXT = 36967;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 35885;
    public static final int GL_TEXTURE_BUFFER_OFFSET_EXT = 37277;
    public static final int GL_TEXTURE_BUFFER_SIZE_EXT = 37278;

    public EXTTextureBuffer() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexBufferEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2);

    public static native void glTexBufferRangeEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLintptr") long var3, @NativeType(value="GLsizeiptr") long var5);

    static {
        GLES.initialize();
    }
}

