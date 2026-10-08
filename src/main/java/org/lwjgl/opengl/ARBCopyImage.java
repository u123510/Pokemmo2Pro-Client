/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.system.NativeType;

public class ARBCopyImage {
    public ARBCopyImage() {
        throw new UnsupportedOperationException();
    }

    public static void glCopyImageSubData(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint") int n3, @NativeType(value="GLint") int n4, @NativeType(value="GLint") int n5, @NativeType(value="GLint") int n6, @NativeType(value="GLuint") int n7, @NativeType(value="GLenum") int n8, @NativeType(value="GLint") int n9, @NativeType(value="GLint") int n10, @NativeType(value="GLint") int n11, @NativeType(value="GLint") int n12, @NativeType(value="GLsizei") int n13, @NativeType(value="GLsizei") int n14, @NativeType(value="GLsizei") int n15) {
        GL43C.glCopyImageSubData(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15);
    }

    static {
        GL.initialize();
    }
}

