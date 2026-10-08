/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class EXTProvokingVertex {
    public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 36429;
    public static final int GL_LAST_VERTEX_CONVENTION_EXT = 36430;
    public static final int GL_PROVOKING_VERTEX_EXT = 36431;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 36428;

    public EXTProvokingVertex() {
        throw new UnsupportedOperationException();
    }

    public static native void glProvokingVertexEXT(@NativeType(value="GLenum") int var0);

    static {
        GL.initialize();
    }
}

