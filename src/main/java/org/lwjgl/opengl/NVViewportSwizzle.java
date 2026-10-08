/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVViewportSwizzle {
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 37712;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 37713;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 37714;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 37715;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 37716;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 37717;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 37718;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 37719;
    public static final int GL_VIEWPORT_SWIZZLE_X_NV = 37720;
    public static final int GL_VIEWPORT_SWIZZLE_Y_NV = 37721;
    public static final int GL_VIEWPORT_SWIZZLE_Z_NV = 37722;
    public static final int GL_VIEWPORT_SWIZZLE_W_NV = 37723;

    public NVViewportSwizzle() {
        throw new UnsupportedOperationException();
    }

    public static native void glViewportSwizzleNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLenum") int var4);

    static {
        GL.initialize();
    }
}

