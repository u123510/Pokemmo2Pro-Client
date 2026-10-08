/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL31C;
import org.lwjgl.system.NativeType;

public class ARBCopyBuffer {
    public static final int GL_COPY_READ_BUFFER = 36662;
    public static final int GL_COPY_WRITE_BUFFER = 36663;

    public ARBCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    public static void glCopyBufferSubData(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="GLintptr") long l2, @NativeType(value="GLsizeiptr") long l3) {
        GL31C.glCopyBufferSubData(n, n2, l, l2, l3);
    }

    static {
        GL.initialize();
    }
}

