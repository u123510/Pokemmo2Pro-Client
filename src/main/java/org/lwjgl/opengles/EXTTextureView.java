/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTTextureView {
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL_EXT = 33499;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS_EXT = 33500;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER_EXT = 33501;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS_EXT = 33502;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 33503;

    public EXTTextureView() {
        throw new UnsupportedOperationException();
    }

    public static native void glTextureViewEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLuint") int var4, @NativeType(value="GLuint") int var5, @NativeType(value="GLuint") int var6, @NativeType(value="GLuint") int var7);

    static {
        GLES.initialize();
    }
}

