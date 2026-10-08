/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class QCOMFrameExtrapolation {
    public QCOMFrameExtrapolation() {
        throw new UnsupportedOperationException();
    }

    public static native void glExtrapolateTex2DQCOM(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLfloat") float var3);

    static {
        GLES.initialize();
    }
}

