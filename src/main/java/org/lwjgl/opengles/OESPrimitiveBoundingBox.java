/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class OESPrimitiveBoundingBox {
    public static final int GL_PRIMITIVE_BOUNDING_BOX_OES = 37566;

    public OESPrimitiveBoundingBox() {
        throw new UnsupportedOperationException();
    }

    public static native void glPrimitiveBoundingBoxOES(@NativeType(value="GLfloat") float var0, @NativeType(value="GLfloat") float var1, @NativeType(value="GLfloat") float var2, @NativeType(value="GLfloat") float var3, @NativeType(value="GLfloat") float var4, @NativeType(value="GLfloat") float var5, @NativeType(value="GLfloat") float var6, @NativeType(value="GLfloat") float var7);

    static {
        GLES.initialize();
    }
}

