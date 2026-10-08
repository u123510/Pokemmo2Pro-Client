/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.LongBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTTimerQuery {
    public static final int GL_TIME_ELAPSED_EXT = 35007;

    public EXTTimerQuery() {
        throw new UnsupportedOperationException();
    }

    public static native void nglGetQueryObjecti64vEXT(int var0, int var1, long var2);

    public static void glGetQueryObjecti64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        EXTTimerQuery.nglGetQueryObjecti64vEXT(n, n2, l);
    }

    public static void glGetQueryObjecti64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") long l) {
        EXTTimerQuery.nglGetQueryObjecti64vEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetQueryObjecti64EXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTTimerQuery.nglGetQueryObjecti64vEXT(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static native void nglGetQueryObjectui64vEXT(int var0, int var1, long var2);

    public static void glGetQueryObjectui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        EXTTimerQuery.nglGetQueryObjectui64vEXT(n, n2, l);
    }

    public static void glGetQueryObjectui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long l) {
        EXTTimerQuery.nglGetQueryObjectui64vEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static long glGetQueryObjectui64EXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTTimerQuery.nglGetQueryObjectui64vEXT(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static void glGetQueryObjecti64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") long[] lArray) {
        long l = GL.getICD().glGetQueryObjecti64vEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glGetQueryObjectui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long[] lArray) {
        long l = GL.getICD().glGetQueryObjectui64vEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    static {
        GL.initialize();
    }
}

