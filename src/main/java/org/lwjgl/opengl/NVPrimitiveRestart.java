/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVPrimitiveRestart {
    public static final int GL_PRIMITIVE_RESTART_NV = 34136;
    public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 34137;

    public NVPrimitiveRestart() {
        throw new UnsupportedOperationException();
    }

    public static native void glPrimitiveRestartNV();

    public static native void glPrimitiveRestartIndexNV(@NativeType(value="GLuint") int var0);

    static {
        GL.initialize();
    }
}

