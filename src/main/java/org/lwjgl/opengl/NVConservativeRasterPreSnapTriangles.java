/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.NativeType;

public class NVConservativeRasterPreSnapTriangles {
    public static final int GL_CONSERVATIVE_RASTER_MODE_NV = 38221;
    public static final int GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV = 38222;
    public static final int GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV = 38223;

    public NVConservativeRasterPreSnapTriangles() {
        throw new UnsupportedOperationException();
    }

    public static native void glConservativeRasterParameteriNV(@NativeType(value="GLenum") int var0, @NativeType(value="GLint") int var1);

    static {
        GL.initialize();
    }
}

