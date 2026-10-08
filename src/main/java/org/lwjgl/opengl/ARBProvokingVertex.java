/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.system.NativeType;

public class ARBProvokingVertex {
    public static final int GL_FIRST_VERTEX_CONVENTION = 36429;
    public static final int GL_LAST_VERTEX_CONVENTION = 36430;
    public static final int GL_PROVOKING_VERTEX = 36431;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 36428;

    public ARBProvokingVertex() {
        throw new UnsupportedOperationException();
    }

    public static void glProvokingVertex(@NativeType(value="GLenum") int n) {
        GL32C.glProvokingVertex(n);
    }

    static {
        GL.initialize();
    }
}

