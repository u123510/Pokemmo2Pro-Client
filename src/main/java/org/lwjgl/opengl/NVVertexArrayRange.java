/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_NV = 34077;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 34078;
    public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = 34079;
    public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 34080;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 34081;

    public NVVertexArrayRange() {
        throw new UnsupportedOperationException();
    }

    public static native void nglVertexArrayRangeNV(int var0, long var1);

    public static void glVertexArrayRangeNV(@NativeType(value="void *") ByteBuffer byteBuffer) {
        NVVertexArrayRange.nglVertexArrayRangeNV(byteBuffer.remaining(), MemoryUtil.memAddress(byteBuffer));
    }

    public static native void glFlushVertexArrayRangeNV();

    static {
        GL.initialize();
    }
}

