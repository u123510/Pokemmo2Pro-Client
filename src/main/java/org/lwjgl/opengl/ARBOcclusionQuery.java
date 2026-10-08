/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class ARBOcclusionQuery {
    public static final int GL_SAMPLES_PASSED_ARB = 35092;
    public static final int GL_QUERY_COUNTER_BITS_ARB = 34916;
    public static final int GL_CURRENT_QUERY_ARB = 34917;
    public static final int GL_QUERY_RESULT_ARB = 34918;
    public static final int GL_QUERY_RESULT_AVAILABLE_ARB = 34919;

    public ARBOcclusionQuery() {
        throw new UnsupportedOperationException();
    }

    public static native void nglGenQueriesARB(int var0, long var1);

    public static void glGenQueriesARB(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        ARBOcclusionQuery.nglGenQueriesARB(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenQueriesARB() {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.callocInt(1);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        ARBOcclusionQuery.nglGenQueriesARB(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglDeleteQueriesARB(int var0, long var1);

    public static void glDeleteQueriesARB(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        ARBOcclusionQuery.nglDeleteQueriesARB(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteQueriesARB(@NativeType(value="GLuint const *") int n) {
        IntBuffer intBuffer;
        MemoryStack memoryStack = MemoryStack.stackGet();
        int n2 = n;
        n = memoryStack.getPointer();
        try {
            intBuffer = memoryStack.ints(n2);
        }
        catch (Throwable throwable) {
            memoryStack.setPointer(n);
            throw throwable;
        }
        ARBOcclusionQuery.nglDeleteQueriesARB(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsQueryARB(@NativeType(value="GLuint") int var0);

    public static native void glBeginQueryARB(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glEndQueryARB(@NativeType(value="GLenum") int var0);

    public static native void nglGetQueryivARB(int var0, int var1, long var2);

    public static void glGetQueryivARB(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        ARBOcclusionQuery.nglGetQueryivARB(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetQueryiARB(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2) {
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
        ARBOcclusionQuery.nglGetQueryivARB(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetQueryObjectivARB(int var0, int var1, long var2);

    public static void glGetQueryObjectivARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        ARBOcclusionQuery.nglGetQueryObjectivARB(n, n2, l);
    }

    public static void glGetQueryObjectivARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") long l) {
        ARBOcclusionQuery.nglGetQueryObjectivARB(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetQueryObjectiARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        ARBOcclusionQuery.nglGetQueryObjectivARB(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetQueryObjectuivARB(int var0, int var1, long var2);

    public static void glGetQueryObjectuivARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        ARBOcclusionQuery.nglGetQueryObjectuivARB(n, n2, l);
    }

    public static void glGetQueryObjectuivARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") long l) {
        ARBOcclusionQuery.nglGetQueryObjectuivARB(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetQueryObjectuiARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        ARBOcclusionQuery.nglGetQueryObjectuivARB(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static void glGenQueriesARB(@NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGenQueriesARB;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDeleteQueriesARB(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GL.getICD().glDeleteQueriesARB;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glGetQueryivARB(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetQueryivARB;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetQueryObjectivARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GL.getICD().glGetQueryObjectivARB;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetQueryObjectuivARB(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GL.getICD().glGetQueryObjectuivARB;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    static {
        GL.initialize();
    }
}

