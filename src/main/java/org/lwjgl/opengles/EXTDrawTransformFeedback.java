/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import org.lwjgl.opengles.GLES;
import org.lwjgl.system.NativeType;

public class EXTDrawTransformFeedback {
    public EXTDrawTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    public static native void glDrawTransformFeedbackEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glDrawTransformFeedbackInstancedEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLsizei") int var2);

    static {
        GLES.initialize();
    }
}

