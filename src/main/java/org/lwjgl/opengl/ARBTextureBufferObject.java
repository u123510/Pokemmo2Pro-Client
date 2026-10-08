/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class ARBTextureBufferObject {
    public static final int GL_TEXTURE_BUFFER_ARB = 35882;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_ARB = 35883;
    public static final int GL_TEXTURE_BINDING_BUFFER_ARB = 35884;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 35885;
    public static final int GL_TEXTURE_BUFFER_FORMAT_ARB = 35886;

    public ARBTextureBufferObject() {
        throw new UnsupportedOperationException();
    }

    public static native void glTexBufferARB(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2);

    static {
        GL.initialize();
    }
}

