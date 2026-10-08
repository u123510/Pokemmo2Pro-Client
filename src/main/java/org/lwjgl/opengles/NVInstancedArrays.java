/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVInstancedArrays {
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_NV = 35070;

    public NVInstancedArrays() {
        throw new UnsupportedOperationException();
    }

    public static native void glVertexAttribDivisorNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1);

    static {
        GLES.initialize();
    }
}

