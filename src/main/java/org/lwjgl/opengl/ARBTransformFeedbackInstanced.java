/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL42C;
import org.lwjgl.system.NativeType;

public class ARBTransformFeedbackInstanced {
    public ARBTransformFeedbackInstanced() {
        throw new UnsupportedOperationException();
    }

    public static void glDrawTransformFeedbackInstanced(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLsizei") int n3) {
        GL42C.glDrawTransformFeedbackInstanced(n, n2, n3);
    }

    public static void glDrawTransformFeedbackStreamInstanced(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLuint") int n3, @NativeType(value="GLsizei") int n4) {
        GL42C.glDrawTransformFeedbackStreamInstanced(n, n2, n3, n4);
    }

    static {
        GL.initialize();
    }
}

