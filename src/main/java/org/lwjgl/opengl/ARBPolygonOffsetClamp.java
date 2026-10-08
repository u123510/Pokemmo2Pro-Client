/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL46C;
import org.lwjgl.system.NativeType;

public class ARBPolygonOffsetClamp {
    public static final int GL_POLYGON_OFFSET_CLAMP = 36379;

    public ARBPolygonOffsetClamp() {
        throw new UnsupportedOperationException();
    }

    public static void glPolygonOffsetClamp(@NativeType(value="GLfloat") float f, @NativeType(value="GLfloat") float f2, @NativeType(value="GLfloat") float f3) {
        GL46C.glPolygonOffsetClamp(f, f2, f3);
    }

    static {
        GL.initialize();
    }
}

