/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OVRMultiviewMultisampledRenderToTexture {
    public OVRMultiviewMultisampledRenderToTexture() {
        throw new UnsupportedOperationException();
    }

    public static native void glFramebufferTextureMultisampleMultiviewOVR(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLint") int var3, @NativeType(value="GLsizei") int var4, @NativeType(value="GLint") int var5, @NativeType(value="GLsizei") int var6);

    static {
        GLES.initialize();
    }
}

