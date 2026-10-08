/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class AMDOcclusionQueryEvent {
    public static final int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 34639;
    public static final int GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD = 1;
    public static final int GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD = 2;
    public static final int GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD = 4;
    public static final int GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 8;
    public static final int GL_QUERY_ALL_EVENT_BITS_AMD = -1;

    public AMDOcclusionQueryEvent() {
        throw new UnsupportedOperationException();
    }

    public static native void glQueryObjectParameteruiAMD(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLenum") int var2, @NativeType(value="GLuint") int var3);

    static {
        GL.initialize();
    }
}

