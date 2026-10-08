/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESTextureBuffer {
    public static final int GL_TEXTURE_BUFFER_OES = 35882;
    public static final int GL_TEXTURE_BUFFER_BINDING_OES = 35882;
    public static final int GL_SAMPLER_BUFFER_OES = 36290;
    public static final int GL_INT_SAMPLER_BUFFER_OES = 36304;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_OES = 36312;
    public static final int GL_IMAGE_BUFFER_OES = 36945;
    public static final int GL_INT_IMAGE_BUFFER_OES = 36956;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER_OES = 36967;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_OES = 35885;
    public static final int GL_TEXTURE_BUFFER_OFFSET_OES = 37277;
    public static final int GL_TEXTURE_BUFFER_SIZE_OES = 37278;

    public OESTextureBuffer() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexBufferOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2);

    public static native void glTexBufferRangeOES(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLintptr") long var3, @NativeType(value="GLsizeiptr") long var5);

    static {
        GLES.initialize();
    }
}

