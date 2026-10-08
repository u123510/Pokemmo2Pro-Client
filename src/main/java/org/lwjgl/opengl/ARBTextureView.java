/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.system.NativeType;

public class ARBTextureView {
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 33499;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 33500;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER = 33501;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 33502;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 33503;

    public ARBTextureView() {
        throw new UnsupportedOperationException();
    }

    public static void glTextureView(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLenum") int n4, @NativeType(value="GLuint") int n5, @NativeType(value="GLuint") int n6, @NativeType(value="GLuint") int n7, @NativeType(value="GLuint") int n8) {
        GL43C.glTextureView(n, n2, n3, n4, n5, n6, n7, n8);
    }

    static {
        GL.initialize();
    }
}

