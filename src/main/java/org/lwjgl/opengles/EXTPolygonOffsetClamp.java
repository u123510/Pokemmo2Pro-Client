/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTPolygonOffsetClamp {
    public static final int GL_POLYGON_OFFSET_CLAMP_EXT = 36379;

    public EXTPolygonOffsetClamp() {
        throw new UnsupportedOperationException();
    }

    public static native void glPolygonOffsetClampEXT(@NativeType(value="GLfloat") float var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2);

    static {
        GLES.initialize();
    }
}

