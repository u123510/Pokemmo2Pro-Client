/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.opengles;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.opengles.GLES;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class EXTOcclusionQueryBoolean {
    public static final int GL_ANY_SAMPLES_PASSED_EXT = 35887;
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE_EXT = 36202;
    public static final int GL_CURRENT_QUERY_EXT = 34917;
    public static final int GL_QUERY_RESULT_EXT = 34918;
    public static final int GL_QUERY_RESULT_AVAILABLE_EXT = 34919;

    public EXTOcclusionQueryBoolean() {
        throw new UnsupportedOperationException();
    }

    public static native void nglGenQueriesEXT(int var0, long var1);

    public static void glGenQueriesEXT(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        EXTOcclusionQueryBoolean.nglGenQueriesEXT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenQueriesEXT() {
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
        EXTOcclusionQueryBoolean.nglGenQueriesEXT(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    public static native void nglDeleteQueriesEXT(int var0, long var1);

    public static void glDeleteQueriesEXT(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        EXTOcclusionQueryBoolean.nglDeleteQueriesEXT(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteQueriesEXT(@NativeType(value="GLuint const *") int n) {
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
        EXTOcclusionQueryBoolean.nglDeleteQueriesEXT(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsQueryEXT(@NativeType(value="GLuint") int var0);

    public static native void glBeginQueryEXT(@NativeType(value="GLenum") int var0, @NativeType(value="GLuint") int var1);

    public static native void glEndQueryEXT(@NativeType(value="GLenum") int var0);

    public static native void nglGetQueryivEXT(int var0, int var1, long var2);

    public static void glGetQueryivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTOcclusionQueryBoolean.nglGetQueryivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetQueryiEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2) {
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
        EXTOcclusionQueryBoolean.nglGetQueryivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static native void nglGetQueryObjectuivEXT(int var0, int var1, long var2);

    public static void glGetQueryObjectuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        long l = MemoryUtil.memAddress(intBuffer);
        EXTOcclusionQueryBoolean.nglGetQueryObjectuivEXT(n, n2, l);
    }

    @NativeType(value="void")
    public static int glGetQueryObjectuiEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2) {
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
        EXTOcclusionQueryBoolean.nglGetQueryObjectuivEXT(n, n2, MemoryUtil.memAddress(intBuffer));
        int n4 = intBuffer.get(0);
        memoryStack.setPointer(n3);
        return n4;
    }

    public static void glGenQueriesEXT(@NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGenQueriesEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glDeleteQueriesEXT(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glDeleteQueriesEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glGetQueryivEXT(@NativeType(value="GLenum") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLint *") int[] nArray) {
        long l = GLES.getICD().glGetQueryivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    public static void glGetQueryObjectuivEXT(@NativeType(value="GLuint") int n, @NativeType(value="GLenum") int n2, @NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGetQueryObjectuivEXT;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(n, n2, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

