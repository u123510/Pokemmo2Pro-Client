/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class NVConditionalRender {
    public static final int GL_QUERY_WAIT_NV = 36371;
    public static final int GL_QUERY_NO_WAIT_NV = 36372;
    public static final int GL_QUERY_BY_REGION_WAIT_NV = 36373;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 36374;

    public NVConditionalRender() {
        throw new UnsupportedOperationException();
    }

    public static native void glBeginConditionalRenderNV(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static native void glEndConditionalRenderNV();

    static {
        GLES.initialize();
    }
}

