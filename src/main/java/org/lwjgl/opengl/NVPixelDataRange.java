/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NVPixelDataRange {
    public static final int GL_WRITE_PIXEL_DATA_RANGE_NV = 34936;
    public static final int GL_READ_PIXEL_DATA_RANGE_NV = 34937;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 34938;
    public static final int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = 34939;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 34940;
    public static final int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = 34941;

    public NVPixelDataRange() {
        throw new UnsupportedOperationException();
    }

    public static native void nglPixelDataRangeNV(int var0, int var1, long var2);

    public static void glPixelDataRangeNV(@NativeType(value="GLenum") int n, @NativeType(value="void const *") ByteBuffer byteBuffer) {
        int n2 = n;
        ByteBuffer byteBuffer2 = byteBuffer;
        n = byteBuffer2.remaining();
        long l = MemoryUtil.memAddress(byteBuffer2);
        NVPixelDataRange.nglPixelDataRangeNV(n2, n, l);
    }

    public static native void glFlushPixelDataRangeNV(@NativeType(value="GLenum") int var0);

    static {
        GL.initialize();
    }
}

