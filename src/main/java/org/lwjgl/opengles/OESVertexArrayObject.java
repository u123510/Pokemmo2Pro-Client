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

public class OESVertexArrayObject {
    public static final int GL_VERTEX_ARRAY_BINDING_OES = 34229;

    public OESVertexArrayObject() {
        throw new UnsupportedOperationException();
    }

    public static native void glBindVertexArrayOES(@NativeType(value="GLuint") int var0);

    public static native void nglDeleteVertexArraysOES(int var0, long var1);

    public static void glDeleteVertexArraysOES(@NativeType(value="GLuint const *") IntBuffer intBuffer) {
        OESVertexArrayObject.nglDeleteVertexArraysOES(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    public static void glDeleteVertexArraysOES(@NativeType(value="GLuint const *") int n) {
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
        OESVertexArrayObject.nglDeleteVertexArraysOES(1, MemoryUtil.memAddress(intBuffer));
        memoryStack.setPointer(n);
    }

    public static native void nglGenVertexArraysOES(int var0, long var1);

    public static void glGenVertexArraysOES(@NativeType(value="GLuint *") IntBuffer intBuffer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)intBuffer, 1);
        }
        OESVertexArrayObject.nglGenVertexArraysOES(intBuffer.remaining(), MemoryUtil.memAddress(intBuffer));
    }

    @NativeType(value="void")
    public static int glGenVertexArraysOES() {
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
        OESVertexArrayObject.nglGenVertexArraysOES(1, MemoryUtil.memAddress(intBuffer));
        int n2 = intBuffer.get(0);
        memoryStack.setPointer(n);
        return n2;
    }

    @NativeType(value="GLboolean")
    public static native boolean glIsVertexArrayOES(@NativeType(value="GLuint") int var0);

    public static void glDeleteVertexArraysOES(@NativeType(value="GLuint const *") int[] nArray) {
        long l = GLES.getICD().glDeleteVertexArraysOES;
        if (Checks.CHECKS) {
            Checks.check(l);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    public static void glGenVertexArraysOES(@NativeType(value="GLuint *") int[] nArray) {
        long l = GLES.getICD().glGenVertexArraysOES;
        if (Checks.CHECKS) {
            Checks.check(l);
            Checks.check(nArray, 1);
        }
        JNI.callPV(nArray.length, nArray, l);
    }

    static {
        GLES.initialize();
    }
}

