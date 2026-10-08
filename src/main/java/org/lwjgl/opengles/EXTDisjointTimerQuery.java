/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.opengles.EXTOcclusionQueryBoolean;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTDisjointTimerQuery {
    public static final int GL_QUERY_COUNTER_BITS_EXT = 34916;
    public static final int GL_CURRENT_QUERY_EXT = 34917;
    public static final int GL_QUERY_RESULT_EXT = 34918;
    public static final int GL_QUERY_RESULT_AVAILABLE_EXT = 34919;
    public static final int GL_TIME_ELAPSED_EXT = 35007;
    public static final int GL_TIMESTAMP_EXT = 36392;
    public static final int GL_GPU_DISJOINT_EXT = 36795;

    public EXTDisjointTimerQuery() {
        throw new UnsupportedOperationException();
    }

    public static void nglGenQueriesEXT(int n, long l) {
        EXTOcclusionQueryBoolean.nglGenQueriesEXT(n, l);
    }

    public static void glGenQueriesEXT(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        EXTOcclusionQueryBoolean.glGenQueriesEXT(intBuffer);
    }

    @NativeType(value="void")
    public static int glGenQueriesEXT() {
        return EXTOcclusionQueryBoolean.glGenQueriesEXT();
    }

    public static void nglDeleteQueriesEXT(int n, long l) {
        EXTOcclusionQueryBoolean.nglDeleteQueriesEXT(n, l);
    }

    public static void glDeleteQueriesEXT(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(intBuffer);
    }

    public static void glDeleteQueriesEXT(@NativeType(value="GLuint const *") int n) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(n);
    }

    @NativeType(value="GLboolean")
    public static boolean glIsQueryEXT(@NativeType(value="GLuint") int n) {
        return EXTOcclusionQueryBoolean.glIsQueryEXT(n);
    }

    public static void glBeginQueryEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLuint") int n2) {
        EXTOcclusionQueryBoolean.glBeginQueryEXT(n, n2);
    }

    public static void glEndQueryEXT(@NativeType(value="GLenum") int n) {
        EXTOcclusionQueryBoolean.glEndQueryEXT(n);
    }

    public static void nglGetQueryivEXT(int n, int n2, long l) {
        EXTOcclusionQueryBoolean.nglGetQueryivEXT(n, n2, l);
    }

    public static void glGetQueryivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        EXTOcclusionQueryBoolean.glGetQueryivEXT(n, n2, intBuffer);
    }

    @NativeType(value="void")
    public static int glGetQueryiEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2) {
        return EXTOcclusionQueryBoolean.glGetQueryiEXT(n, n2);
    }

    public static void nglGetQueryObjectuivEXT(int n, int n2, long l) {
        EXTOcclusionQueryBoolean.nglGetQueryObjectuivEXT(n, n2, l);
    }

    public static void glGetQueryObjectuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        EXTOcclusionQueryBoolean.glGetQueryObjectuivEXT(n, n2, intBuffer);
    }

    @NativeType(value="void")
    public static int glGetQueryObjectuiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        return EXTOcclusionQueryBoolean.glGetQueryObjectuiEXT(n, n2);
    }

    public static native void glQueryCounterEXT(@NativeType(value="GLuint") int var0, @NativeType(value="GLenum") int var1);

    public static native void nglGetQueryObjectivEXT(int var0, int var1, long var2);

    public static void glGetQueryObjectivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTDisjointTimerQuery.nglGetQueryObjectivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetQueryObjectiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n3 = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n3);
            throw throwable;
        }
        EXTDisjointTimerQuery.nglGetQueryObjectivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetQueryObjecti64vEXT(int var0, int var1, long var2);

    public static void glGetQueryObjecti64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        long l = MemoryUtil.memAddress(longBuffer);
        EXTDisjointTimerQuery.nglGetQueryObjecti64vEXT(n, n2, l);
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
        EXTDisjointTimerQuery.nglGetQueryObjecti64vEXT(n, n2, MemoryUtil.memAddress(longBuffer));
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
        EXTDisjointTimerQuery.nglGetQueryObjectui64vEXT(n, n2, l);
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
        EXTDisjointTimerQuery.nglGetQueryObjectui64vEXT(n, n2, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n3);
        return l;
    }

    public static native void nglGetInteger64vEXT(int var0, long var1);

    public static void glGetInteger64vEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLint64 *") LongBuffer longBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)longBuffer, 1);
        }
        EXTDisjointTimerQuery.nglGetInteger64vEXT(n, MemoryUtil.memAddress(longBuffer));
    }

    @NativeType(value="void")
    public static long glGetInteger64EXT(@NativeType(value="GLenum") int n) {
        LongBuffer longBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = memoryStack.getPointer();
        try {
            longBuffer = memoryStack.callocLong(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n2);
            throw throwable;
        }
        EXTDisjointTimerQuery.nglGetInteger64vEXT(n, MemoryUtil.memAddress(longBuffer));
        long l = longBuffer.get(0);
        memoryStack.setPointer(n2);
        return l;
    }

    public static void glGenQueriesEXT(@NativeType(value="GLuint *") int[] nArray) {
        EXTOcclusionQueryBoolean.glGenQueriesEXT(nArray);
    }

    public static void glDeleteQueriesEXT(@NativeType(value="GLuint const *") int[] nArray) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(nArray);
    }

    public static void glGetQueryivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        EXTOcclusionQueryBoolean.glGetQueryivEXT(n, n2, nArray);
    }

    public static void glGetQueryObjectuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        EXTOcclusionQueryBoolean.glGetQueryObjectuivEXT(n, n2, nArray);
    }

    public static void glGetQueryObjectivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetQueryObjectivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetQueryObjecti64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint64 *") long[] lArray) {
        long l = GLES.getICD().glGetQueryObjecti64vEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glGetQueryObjectui64vEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint64 *") long[] lArray) {
        long l = GLES.getICD().glGetQueryObjectui64vEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, n2, lArray, l);
    }

    public static void glGetInteger64vEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLint64 *") long[] lArray) {
        long l = GLES.getICD().glGetInteger64vEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(lArray, 1);
        }
        JNI.callPV(n, lArray, l);
    }

    static {
        GLES.initialize();
    }
}

