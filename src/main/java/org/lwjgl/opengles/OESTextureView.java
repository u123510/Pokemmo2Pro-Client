/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESTextureView {
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL_OES = 33499;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS_OES = 33500;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER_OES = 33501;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS_OES = 33502;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 33503;

    public OESTextureView() {
        throw new UnsupportedOperationException();
    }

    public static native void glTextureViewOES(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLuint") int var4, @NativeType(value="GLuint") int var5, @NativeType(value="GLuint") int var6, @NativeType(value="GLuint") int var7);

    static {
        GLES.initialize();
    }
}

