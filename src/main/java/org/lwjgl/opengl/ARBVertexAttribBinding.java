/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.system.NativeType;

public class ARBVertexAttribBinding {
    public static final int GL_VERTEX_ATTRIB_BINDING = 33492;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 33493;
    public static final int GL_VERTEX_BINDING_DIVISOR = 33494;
    public static final int GL_VERTEX_BINDING_OFFSET = 33495;
    public static final int GL_VERTEX_BINDING_STRIDE = 33496;
    public static final int GL_VERTEX_BINDING_BUFFER = 36687;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 33497;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 33498;

    public ARBVertexAttribBinding() {
        throw new UnsupportedOperationException();
    }

    public static void glBindVertexBuffer(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2, @NativeType(value="GLintptr") long l, @NativeType(value="GLsizei") int n3) {
        GL43C.glBindVertexBuffer(n, n2, l, n3);
    }

    public static void glVertexAttribFormat(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLboolean") boolean bl, @NativeType(value="GLuint") int n4) {
        GL43C.glVertexAttribFormat(n, n2, n3, bl, n4);
    }

    public static void glVertexAttribIFormat(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLuint") int n4) {
        GL43C.glVertexAttribIFormat(n, n2, n3, n4);
    }

    public static void glVertexAttribLFormat(@NativeType(value="GLuint") int n, @NativeType(value="GLint") int n2, @NativeType(value="GLenum") int n3, @NativeType(value="GLuint") int n4) {
        GL43C.glVertexAttribLFormat(n, n2, n3, n4);
    }

    public static void glVertexAttribBinding(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2) {
        GL43C.glVertexAttribBinding(n, n2);
    }

    public static void glVertexBindingDivisor(@NativeType(value="GLuint") int n, @NativeType(value="GLuint") int n2) {
        GL43C.glVertexBindingDivisor(n, n2);
    }

    public static native void glVertexArrayBindVertexBufferEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2, @NativeType(value="GLintptr") long var3, @NativeType(value="GLsizei") int var5);

    public static native void glVertexArrayVertexAttribFormatEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLboolean") boolean var4, @NativeType(value="GLuint") int var5);

    public static native void glVertexArrayVertexAttribIFormatEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLuint") int var4);

    public static native void glVertexArrayVertexAttribLFormatEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLint") int var2, @NativeType(value="GLenum") int var3, @NativeType(value="GLuint") int var4);

    public static native void glVertexArrayVertexAttribBindingEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2);

    public static native void glVertexArrayVertexBindingDivisorEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLuint") int var1, @NativeType(value="GLuint") int var2);

    static {
        GL.initialize();
    }
}

