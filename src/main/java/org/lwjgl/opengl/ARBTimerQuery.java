/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL33C;
import org.lwjgl.system.NativeType;

public class ARBTimerQuery {
    public static final int GL_TIME_ELAPSED = 35007;
    public static final int GL_TIMESTAMP = 36392;

    public ARBTimerQuery() {
        throw new UnsupportedOperationException();
    }

    public static void glQueryCounter(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        GL33C.glQueryCounter(n, n2);
    }

    public static void nglGetQueryObjecti64v(int n, int n2, long l) {
        GL33C.nglGetQueryObjecti64v(n, n2, l);
    }

    public static void glGetQueryObjecti64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        GL33C.glGetQueryObjecti64v(n, n2, longBuffer);
    }

    public static void glGetQueryObjecti64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") long l) {
        GL33C.glGetQueryObjecti64v(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetQueryObjecti64(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        return GL33C.glGetQueryObjecti64(n, n2);
    }

    public static void nglGetQueryObjectui64v(int n, int n2, long l) {
        GL33C.nglGetQueryObjectui64v(n, n2, l);
    }

    public static void glGetQueryObjectui64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") LongBuffer longBuffer) {
        GL33C.glGetQueryObjectui64v(n, n2, longBuffer);
    }

    public static void glGetQueryObjectui64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long l) {
        GL33C.glGetQueryObjectui64v(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetQueryObjectui64(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        return GL33C.glGetQueryObjectui64(n, n2);
    }

    public static void glGetQueryObjecti64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") long[] lArray) {
        GL33C.glGetQueryObjecti64v(n, n2, lArray);
    }

    public static void glGetQueryObjectui64v(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long[] lArray) {
        GL33C.glGetQueryObjectui64v(n, n2, lArray);
    }

    static {
        GL.initialize();
    }
}

