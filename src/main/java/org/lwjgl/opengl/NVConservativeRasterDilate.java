/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVConservativeRasterDilate {
    public static final int GL_CONSERVATIVE_RASTER_DILATE_NV = 37753;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV = 37754;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 37755;

    public NVConservativeRasterDilate() {
        throw new UnsupportedOperationException();
    }

    public static native void glConservativeRasterParameterfNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLfloat") float var1);

    static {
        GL.initialize();
    }
}

