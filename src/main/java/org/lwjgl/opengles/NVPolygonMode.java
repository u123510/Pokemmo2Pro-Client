/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVPolygonMode {
    public static final int GL_POLYGON_MODE_NV = 2880;
    public static final int GL_POLYGON_OFFSET_POINT_NV = 10753;
    public static final int GL_POLYGON_OFFSET_LINE_NV = 10754;
    public static final int GL_POINT_NV = 6912;
    public static final int GL_LINE_NV = 6913;
    public static final int GL_FILL_NV = 6914;

    public NVPolygonMode() {
        throw new UnsupportedOperationException();
    }

    public static native void glPolygonModeNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLenum") int var1);

    static {
        GLES.initialize();
    }
}

